package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise9 
 * @Description: TODO(练习9:编写两个（重载）构造器的类，并在第一个构造器中,通过this调用第二个构造器) 
 * @author yangguangyuan
 * @date 2017年2月14日 上午7:59:00 
 *
 */
public class Exercise9 {
	
	Exercise9(String s){
		System.out.println("第一个构造器");
	}
	
	Exercise9(int i){
		this("i="+i);
		System.out.println("第二个构造器");
		
	}
	
	
	public static void main(String[] args) {
		new Exercise9("hello");
		new Exercise9(2);
	}
}
