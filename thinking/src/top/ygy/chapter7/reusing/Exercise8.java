package top.ygy.chapter7.reusing;

/**
 * @ClassName: Exercise8 
 * @Description: TODO(创建一个基类，它仅有一个非默认构造器；再创建一个导出类，
 * 它带有默认构造器和非默认构造器。在导出类的构造器中调用基类的构造器。) 
 * @author yangguangyuan
 * @date 2017年3月3日 上午9:03:14 
 *
 */
public class Exercise8 {
	public static void main(String[] args) {
		new BBB(1);
	}
}


class AAA{  
    
    /** 非默认构造器 **/  
    AAA(int i){  
        System.out.println("基类");  
    }  
}  
class BBB extends AAA{  
      
    BBB(){  
        super(1);/** 调用基类构造函数  **/  
    }  
    BBB(int i){  
        super(i);/** 调用基类构造函数  **/  
        System.out.println("导出类");  
    }  
}  
