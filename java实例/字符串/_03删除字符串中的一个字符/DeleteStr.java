package _03删除字符串中的一个字符;

public class DeleteStr {
	public static void main(String arg[]) {
		String str = "this is Java";
		System.out.println(removeCharAt(str,3));
	}
	public static String removeCharAt(String s,int pos) {
//		类似于 python的切片
		return s.substring(0,pos) + s.substring(pos + 1);
	}
	

}
