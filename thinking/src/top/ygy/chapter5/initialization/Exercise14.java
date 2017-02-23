package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise14 
 * @Description: TODO(写一个类，拥有两个静态字符串域，其中一个在定义处初始化，另一个在静态块中初始化。  
 *现在，加入一个静态方法用以打印出两个字段值。请证明它们都会在被使用之前完成初始化动作) 
 * @author yangguangyuan
 * @date 2017年2月17日 上午8:02:17 
 *
 */
public class Exercise14 {
	private static String name= "张三";
	private static Integer age;
	
	static{
		age = 23;
	}
	
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(age);
		System.out.println("测试");
	}
}
