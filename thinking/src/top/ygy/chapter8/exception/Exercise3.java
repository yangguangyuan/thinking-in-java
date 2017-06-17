package top.ygy.chapter8.exception;

/**
* @ClassName: Exercise3 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yangguangyuan
* @date 2017年6月17日 下午5:44:54 
*
 */
public class Exercise3 {
	private static int[] ia = new int[2];	
	public static void main(String[] args) {
		try {
			ia[2] = 3;	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(
				"Caught ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} 
	}	
}
