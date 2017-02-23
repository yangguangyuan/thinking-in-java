package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise15 
 * @Description: TODO(编写一个含有字符串域的类，并采用实例初始化方式进行初始化) 
 * @author yangguangyuan
 * @date 2017年2月21日 上午7:33:53 
 *
 */
public class Exercise15 {
	String s ;  
    {  
        s = "young for you";  
    }  
    public Exercise15(){  
        System.out.println("s="+s);  
    }  
    public static void main (String args[]){  
        new Exercise15();  
    }  
}
