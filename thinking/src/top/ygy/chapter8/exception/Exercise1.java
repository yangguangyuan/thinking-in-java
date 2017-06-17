package top.ygy.chapter8.exception;

/**
* @ClassName: Exercise1 
* @Description: TODO() 
* @author yangguangyuan
* @date 2017年6月17日 下午4:28:15 
*
 */
public class Exercise1 {
	public static void f() throws Test11{
		throw new Test11("aaaaaaaaaaaaaaaa");
	}
	
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("执行了");
		}
	}
}


class Test11 extends Exception{
	public Test11(String str){
		super(str);
		System.out.println("Test11");
	}
}