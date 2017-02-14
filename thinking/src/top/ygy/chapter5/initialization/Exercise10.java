package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise10 
 * @Description: TODO(编写具有finalize（）方法的类，并在方法中打印消息，
 * 在main（）中为该类创建一个对象，试解释这个程序的行为。) 
 * @author yangguangyuan
 * @date 2017年2月14日 下午6:05:08 
 *
 */
public class Exercise10 {
	protected void finalize(){  
        System.out.println("finalize()called");  
    }  
    public static void main (String args[]){  
        new Exercise10();  
        System.gc();  
        System.runFinalization();  
    }  
}
