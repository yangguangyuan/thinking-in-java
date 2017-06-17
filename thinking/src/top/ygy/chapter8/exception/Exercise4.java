package top.ygy.chapter8.exception;

/**
* @ClassName: Exercise4 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yangguangyuan
* @date 2017年6月17日 下午5:46:55 
*
 */
public class Exercise4 {
	public static void f() throws Exr4{
		throw new Exr4("天王盖地虎!");
	}
	public static void main(String[] args) {
		try {
			f();
		} catch (Exr4 e) {
			e.printStackTrace();
			e.showS();
		}
	}
}

class Exr4 extends Exception{
	private String str;
	Exr4(String str){
		this.str=str;
		System.out.println("str="+str);
	}
	
	protected void showS() { 
		System.out.println("Message from Exception4: " + str);
	}
}