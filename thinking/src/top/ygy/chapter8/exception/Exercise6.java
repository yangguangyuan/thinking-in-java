package top.ygy.chapter8.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
* @ClassName: Exercise6 
* @Description: TODO(创建两个异常类) 
* @author yangguangyuan
* @date 2017年6月17日 下午10:06:58 
*
 */
public class Exercise6 {
	static void f() throws Oops1, Oops2 {
		throw new Oops1();
	}
	static void g() throws Oops2 {
		throw new Oops2();
	}
	public static void main(String[] args) {
		try {
			f();
		} catch(Exception Oops1) {}
		try {
			g();
		} catch(Exception Oops2) {}
	}
}

@SuppressWarnings("serial")
class Oops1 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public Oops1() { 
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString()); 		
	}
}

@SuppressWarnings("serial")
class Oops2 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public Oops2() {
	StringWriter trace = new StringWriter();
	printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
	} 
}