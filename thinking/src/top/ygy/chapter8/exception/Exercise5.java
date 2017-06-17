package top.ygy.chapter8.exception;

/**
* @ClassName: Exercise5 
* @Description: TODO(恢复模型) 
* @author yangguangyuan
* @date 2017年6月17日 下午9:32:45 
*/
public class Exercise5 {
	private static int[] ia = new int[2];
	static int x = 5;	
	public static void main(String[] args) {
		while(true) {
			try {
				ia[x] = 1;
				System.out.println(ia[x]);
				break;	
			} catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(
					"Caught ArrayIndexOutOfBoundsException");
					e.printStackTrace();
				x--;
			} finally {
				System.out.println("Are we done yet?");		
			}
		}
		System.out.println("Now, we're done.");
	}	
}

