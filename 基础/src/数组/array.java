package 数组;

public class array {
	public static void main(String[] args) {
//		注意数组是引用类型，并且数组大小不可变。我们观察下面的代码：
//		数组变量初始化必须使用new int[5]表示创建一个可容纳5个int元素的数组。
//		Java的数组有几个特点：
//		数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
//		数组一旦创建后，大小就不可改变。
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        System.out.println(ns.length); // 5
//        System.out.println(ns[n]); // 索引n不能超出范围
//        也可以在定义数组时直接指定初始化的元素，这样就不必写出数组大小，而是由编译器自动推算数组大小。例如：
        int[] ns1 = new int[] { 68, 79, 91, 85, 62 };
        int[] ns2 = { 68, 79, 91, 85, 62 };
        
//        和字符串一样,赋值只改变指向
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
        
        
//        小结
//        数组是同一数据类型的集合，数组一旦创建后，大小就不可变；
//
//        可以通过索引访问数组元素，但索引超出范围将报错；
//
//        数组元素可以是值类型（如int）或引用类型（如String），但数组本身是引用类型；
	}
}
