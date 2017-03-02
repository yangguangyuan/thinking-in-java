package top.ygy.chapter7.reusing;

/**
 * @ClassName: Exercise1 
 * @Description: TODO(练习1:(2)创建一个简单的类。第二个类中，将一个引用定义为第一个类的对象。
 * 运用惰性初始化来实例化这个对象。) 
 * @author yangguangyuan
 * @date 2017年3月2日 下午3:54:05 
 *
 */
public class Exercise1 {
	 public static void main(String args[]){  
	        Second s=new Second();  
	        s.getFirst();  
	 }
}

class First{      
}  

class Second{  
      
    First f;  
      
    Second(){  
        System.out.println("Creating Second");        
    }  
      
    First lazy(){  
        if(f==null){  
             System.out.println("Creating First");  
            f=new First();  
        }  
        return f;  
    }  
      
    public First getFirst(){  
        return lazy();  
    }  
}  

