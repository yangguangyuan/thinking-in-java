package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise8 
 * @Description: TODO(练习8:编写具有两个方法的类，在第一个方法内调用第二个方法两次：
 * 第一次调用时不使用this关键字，第二次调用时使用this关键字--这里只是为了验证它是起作用的，
 * 你不应该在实践中使用这种方法。) 
 * @author yangguangyuan
 * @date 2017年2月14日 上午7:50:49 
 *
 */
public class Exercise8 {
	void test1(){  
        System.out.println("调用了test1（）方法");  
    }  
    void test2(){  
        System.out.print("执行test1（）方法：");  
        test1();  
        System.out.print("执行test2（）方法：");  
        this.test1();  
    }  
    public static void main (String args[]){  
    	Exercise8 main = new Exercise8();  
        main.test2();  
    }  
}
