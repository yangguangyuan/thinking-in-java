package top.ygy.chapter8.exception;

/**
* @ClassName: Exercise8 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yangguangyuan
* @date 2017年6月17日 下午10:16:56 
*
 */
public class Exercise8 {
	public static void main(String[] args) {
		try {
			Test8 t = new Test8();
			t.f();	
		} catch(Exception4 e) {
			System.err.println("Caught Exception4");
			e.printStackTrace();
			e.showS();
		} 
	}	
}

class Exception4 extends Exception {
	private String msg;
	Exception4(String msg) {
		super(msg);
		System.out.println("Exception4()");
		this.msg = msg;
	}
	protected void showS() { 
		System.out.println("Message from Exception4: " + msg);
	}
}

class Test8 {
	public static void f() throws Exception4 {
		System.out.println("f()");
		throw new Exception4("Ouch from f()");
	}
}