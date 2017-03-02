package top.ygy.chapter7.reusing;

/**
 * @ClassName: Exercise3 
 * @Description: TODO(练习3（2)证明前面两句话（即使你不为Cartoon创建构造器，
 * 编译器也为会你合成一个默认的构造器，该构造器将调用基类的构造器）) 
 * @author yangguangyuan
 * @date 2017年3月2日 下午4:11:52 
 *
 */
public class Exercise3 {
	public static void main(String args[]){  
        new Cartoon();  
    }  
}

class Art{  
    Art(){  
        new print("Art constructor ");  
    }  
}  
class Drawing extends Art{  
    Drawing(){  
        new print("Drawing constructor ");  
    }         
}  
class Cartoon extends Drawing{  
}  