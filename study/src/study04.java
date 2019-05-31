
public class study04 {
//变量类型
	/*
	 * 在Java语言中，所有的变量在使用前必须声明。声明变量的基本格式如下：
	 * 
	 * type identifier [ = value][, identifier [= value] ...] ; 
	 * int a, b, c; //声明三个int型整数
	 */
	
//	Java语言支持的变量类型有：
//
//	类变量（静态变量）：独立于方法之外的变量，用 static 修饰。
	public static class Employee1 {
	    //salary是静态的私有变量
	    private static double salary;
	    // DEPARTMENT是一个常量
	    public static final String DEPARTMENT = "开发人员";
	    public static void main(String[] args){
	    salary = 10000;
	        System.out.println(DEPARTMENT+"平均工资:"+salary);
	    }
	}
	
	
	
//	实例变量：独立于方法之外的变量，不过没有 static 修饰。
	public static class Employee2{
		   // 这个实例变量对子类可见
		   public String name;
		   // 私有变量，仅在该类可见
		   private double salary;
		   //在构造器中对name赋值
		   public Employee2 (String empName){
		      name = empName;
		   }
		   //设定salary的值
		   public void setSalary(double empSal){
		      salary = empSal;
		   }  
		   // 打印信息
		   public void printEmp(){
		      System.out.println("名字 : " + name );
		      System.out.println("薪水 : " + salary);
		   }
		 
		   public static void main(String[] args){
		      Employee2 empOne = new Employee2("RUNOOB");
		      empOne.setSalary(1000);
		      empOne.printEmp();
		   }
		}
	
	
	
//	局部变量：类的方法中的变量。在以下实例中age是一个局部变量。定义在pupAge()方法中，它的作用域就限制在这个方法中。
	public static class Test{ 
		   public void pupAge(){
		      int age = 0;
		      age = age + 7;
		      System.out.println("小狗的年龄是: " + age);
		   }
		   public static void main(String[] args){
		      Test test = new Test();
		      test.pupAge();
		   }
		}
	
	
}
