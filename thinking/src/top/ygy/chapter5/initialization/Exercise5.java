package top.ygy.chapter5.initialization;

/**
 * 
 * @ClassName: Exercise5 
 * @Description: TODO(练习5:创建一个名为Dog的类，它具有重载的bark（）方法。
 * 此方法应根据不同的基本数据类型进行重载，并根据被调用的版本,打印出不同类型的狗吠（barking）
 * 、咆哮（howling）等信息，编写main（）来调用所有不同版本的方法。) 
 * @author yangguangyuan
 * @date 2017年2月14日 上午7:33:39 
 *
 */
public class Exercise5 {
	public void name() {
		
	} void bark(int i,String aa){
		System.out.println("barking");
	}
	private void bark(String aa,int i){
		System.out.println(aa);
	}
	
	public static void main(String[] args) {
		Exercise5 exercise5 = new Exercise5();
		exercise5.bark(1,"howling");
		exercise5.bark("howling",1);
	}
}
