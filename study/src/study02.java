
public class study02 {
//对象和类
//	类可以看成创建java对象大的模板
	/*
	 * 一个类可以包含以下类型变量：
	 * 局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
	 * 成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
	 * 类变量：类变量也声明在类中，方法体之外，但必须声明为static类型。
	 * 一个类可以拥有多个方法，在上面的例子中：barking()、hungry()和sleeping()都是Dog类的方法。
	 */
	
//	构造方法
	/*
	 * 每个类都有构造方法。如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认构造方法。
	 * 在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
	 */
	
//创建对象
//	对象是根据类创建的。在Java中，使用关键字new来创建一个新的对象。创建对象需要以下三步：
	
/*	声明：声明一个对象，包括对象名称和对象类型。
	实例化：使用关键字new来创建一个对象。
	初始化：使用new创建对象时，会调用构造方法初始化对象。*/
//	例子：
//	public class Puppy{
	public static class Puppy1{
		   public Puppy1(String name){
		      //这个构造器仅有一个参数：name
		      System.out.println("小狗的名字是 : " + name ); 
		   }
		   public static void main(String[] args){
		      // 下面的语句将创建一个Puppy对象
		      Puppy1 myPuppy = new Puppy1( "tommy" );
		   }
		}
	
	/*
	 * 访问实例变量和方法 通过已创建的对象来访问成员变量和成员方法，如下所示：
	 */
	/* 实例化对象 */
//	Object referenceVariable = new Constructor();
	/* 访问类中的变量 */
//	referenceVariable.variableName;
	/* 访问类中的方法 */
//	referenceVariable.methodName();
	
//	例子：
	
	public static class Puppy{
		   int puppyAge;
		   public Puppy(String name){
		      // 这个构造器仅有一个参数：name
		      System.out.println("小狗的名字是 : " + name ); 
		   }
		 
		   public void setAge( int age ){
		       puppyAge = age;
		   }
		 
		   public int getAge( ){
		       System.out.println("小狗的年龄为 : " + puppyAge ); 
		       return puppyAge;
		   }
		 
		   public static void main(String[] args){
		      /* 创建对象 */
		      Puppy myPuppy = new Puppy( "tommy" );
		      /* 通过方法来设定age */
		      myPuppy.setAge( 2 );
		      /* 调用另一个方法获取age */
		      myPuppy.getAge( );
		      /*你也可以像下面这样访问成员变量 */
		      System.out.println("变量值 : " + myPuppy.puppyAge ); 
		   }
		}
	
	
//	源文件声明规则
	/*
	 * 在本节的最后部分，我们将学习源文件的声明规则。当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。
	 * 
	 * 一个源文件中只能有一个public类 一个源文件可以有多个非public类
	 * 源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
	 * 如果一个类定义在某个包中，那么package语句应该在源文件的首行。
	 * 如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句应该在源文件中最前面。
	 * import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
	 * 类有若干种访问级别，并且类也分不同的类型：抽象类和final类等。这些将在访问控制章节介绍。
	 * 
	 * 除了上面提到的几种类型，Java还有一些特殊的类，如：内部类、匿名类。
	 */
	
//	Java包
	
//	包主要用来对类和接口进行分类。当开发Java程序时，可能编写成百上千的类，因此很有必要对类和接口进行分类。
	
//	Import语句
	/*
	 * 在Java中，如果给出一个完整的限定名，包括包名、类名，那么Java编译器就可以很容易地定位到源代码或者类。Import语句就是用来提供一个合理的路径，
	 * 使得编译器可以找到某个类。
	 * 
	 * 例如，下面的命令行将会命令编译器载入java_installation/java/io路径下的所有类
	 * 
	 * import java.io.*;
	 */

	
}
