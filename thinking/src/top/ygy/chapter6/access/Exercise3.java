package top.ygy.chapter6.access;

//
import top.ygy.chapter6.access.debug.*;

public class Exercise3 {
	public void test1(){
		DebugTest debugTest = new DebugTest();
		top.ygy.chapter6.access.debugoff.DebugTest debugTest2 = new top.ygy.chapter6.access.debugoff.DebugTest();
		debugTest.debug("aa");
		debugTest2.debug("bb");
		
		
	}
	public static void main(String[] args) {
		Exercise3 exercise3 = new Exercise3();
		exercise3.test1();
	}
}
