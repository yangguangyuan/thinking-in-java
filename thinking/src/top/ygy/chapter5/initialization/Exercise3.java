package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise3 
 * @Description: TODO(练习3:创建一个带默认构造器（即无参构造器）的类，在构造器中打印一条消息。为这个类创建一对象
 * 练习4:为前一个练习中的类添加一个重载构造器，令其接受一个字符参数，并在构造器中把你自己的信息和接受的参数一起打印出来) 
 * @author yangguangyuan
 * @date 2017年2月13日 下午7:03:53 
 *
 */
public class Exercise3 {
	public Exercise3() {
		System.out.println("无参构造");
	}
	
	public Exercise3(String aa) {
		System.out.println("有参构造");
	}
	
	public static void main(String[] args) {
		new Exercise3();
		new Exercise3("哈哈");
	}
}
