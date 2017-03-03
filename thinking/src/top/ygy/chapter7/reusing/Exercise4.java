package top.ygy.chapter7.reusing;

import top.ygy.chapter7.reusing.test.print;

/**
 * @ClassName: Exercise4 
 * @Description: TODO(证明基类构造器总是会被调用，在导出类构造器之前被调用。) 
 * @author yangguangyuan
 * @date 2017年3月2日 下午5:00:44 
 *
 */
public class Exercise4 {
	public static void main(String args[]){  
        new Child();  
    }  
}

class Parent{  
    Parent(){  
        new print("基类构造器输出");  
    }  
}  
class Child extends Parent{  
    Child(){  
        new print("子类构造器输出");  
    }         
}  

