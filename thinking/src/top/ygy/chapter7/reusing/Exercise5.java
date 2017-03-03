package top.ygy.chapter7.reusing;

/**
 * @ClassName: Exercise5 
 * @Description: TODO(创建两个带有默认构造器（空参数列表）的类A和类B。从A中继承产生一个名为C的新，
 * 并在C内创建一个B类的成员。不要给C编写构造器。创建一个C类的对象并观察其结果。) 
 * @author yangguangyuan
 * @date 2017年3月2日 下午5:06:33 
 *
 */
public class Exercise5 {
	public static void main(String args[]){  
        new C();  
    }  
}


class A{  
    A(){  
        new print("A()……");  
    }  
}  
class B{  
    B(){  
        new print("B()……");  
    }  
      
}  
class C extends A{  
    private B b=new B();  
}  

