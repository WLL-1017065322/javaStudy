package _02查找字符串最后一次出现的位置;
//以下实例中我们通过字符串函数 strOrig.lastIndexOf(Stringname) 
//来查找子字符串 Stringname 在 strOrig 出现的位置：
public class SearchlastString {
	public static void main(String[] args) {
		String strOrig = "Hello world ,Hello Runoob";
		int lastIndex = strOrig.lastIndexOf("Runoob");
		if(lastIndex == -1) {
			System.out.println("未找到");
		}else {
		System.out.println("最后出现的位置:"+ lastIndex);
		}
	}
}
