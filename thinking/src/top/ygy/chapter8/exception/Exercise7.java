package top.ygy.chapter8.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
* @ClassName: Exercise7 
* @Description: TODO(修改练习3) 
* @author yangguangyuan
* @date 2017年6月17日 下午10:11:12 
*
 */
public class Exercise7 {
	private static int[] ia = new int[2];	
	private static Logger logger = Logger.getLogger("Ex7 Exceptions");
	static void logException(Exception e) { // Exception e argument
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString()); 	
	}
	public static void main(String[] args) {
		try {
			ia[2] = 3;	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(
				"Caught ArrayIndexOutOfBoundsException");
			e.printStackTrace();
			logException(e);
		} 
	}	
}
