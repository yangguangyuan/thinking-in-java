package top.ygy.chapter6.access;

import java.io.Console;

/**
 * @ClassName: Exercise6 
 * @Description: TODO(创建一个带有protected数据的类，运用在第一个类中处理protected
 * 数据的方法在相同的文件中创建第二个类。) 
 * @author yangguangyuan
 * @date 2017年2月24日 上午8:12:38 
 *
 */
public class Exercise6 {
	public static void main(String[] args) {
		Test66 t=new Test66();  
        System.out.println(t.str2);  
	}
}

class Test66  {  
	protected String str2="value2";  
} 