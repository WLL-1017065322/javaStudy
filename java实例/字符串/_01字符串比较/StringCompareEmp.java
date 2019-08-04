package _01字符串比较;
//以下实例中我们通过字符串函数
//compareTo (string) ，compareToIgnoreCase(String) 及 compareTo(object string) 
//来比较两个字符串，并返回字符串中第一个字母ASCII的差值。
public class StringCompareEmp {
	public static void main (String args[]) {
		String str = "hello world";
		String anotherStr = "Hello World";
		Object objStr = str;
		
		System.out.println( str.compareTo(anotherStr));
		System.out.println( str.compareToIgnoreCase(anotherStr));
		System.out.println( str.compareTo(objStr.toString()));
		
//		compareTo() 方法的实现思路：两个字符数组依次从前开始比较，如果对象位置出现字符不同则返回两个字符的编码之差，后面的字符不再比较；如果两个字符数组的长度不一样，并且较短的数组和较长数组所有对应位置的字符都相同，则返回两个数组的长度之差。
//
//		 Java Number compareTo() 方法
//		 Java String compareTo() 方法
		
	}

}


//public static void main(String[] args)
//
//这绝对不是凭空想出来的，也不是没有道理的死规定，而是java程序执行的需要。
//
//jvm在试图运行一个类之前，先检查该类是否包含一个特殊方法。这个方法必须是公有的，以便在任何位置都能访问得到。
//这个方法必须是static的，因为这个方法不能依赖任何该类的实例即可运行，而非static的方法，在运行之前要先创建该类的实例对象。
//
//这个方法没有返回值。和C/C++程序不一样，java的程序默认都以常态结束，所以main不返回int。
//如果要以非常态结束程序，可以用System.exit(1)。
//
//这个方法必须可以接受数目不定的String类型的参数，因为运行者可能要附加运行参数。
//如java HelloWorld jack 100，这里的jack和100就是运行参数。
//
//为什么是String呢？因为String具有普遍性。任何字面形式都可以解释成String，
//而其他类型则不然（如jack就不能解释成整数或浮点数），所以用String来存储参数最合适。
//而因为参数数目不限一个，所以用了数组，即String[]。在Java 1.5以后，还可以写成String...，表示数目不定。
//
//至于参数的变量名可以任意，只要保证在方法内部按该变量名来获得参数就行了，从变量的作用角度来说，
//叫arguments或args当然是最合适的。
//
//至于这个方法的名字为什么一定是main，有历史原因，因为最早的C以main函数作为程序入口，java沿用了这个历史传统。


//“static方法就是没有this的方法。在static方法内部不能调用非静态方法，反过来是可以的。
//而且可以在没有创建任何对象的前提下，仅仅通过类本身来调用static方法。这实际上正是static方法的主要用途。”