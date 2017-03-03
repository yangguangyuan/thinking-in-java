package top.ygy.chapter7.reusing;

/**
 * @ClassName: Exercise9 
 * @Description: TODO(创建一个Root类，令其含有名为Component1、Component 2、Component3
 * 的类的各一个实例（这些也由你写）。从Root中派生一个类Stem，也含有上述各“组成部分”。所有的类都应带有
 * 可打印出类的相关信息的默认构造器。) 
 * @author yangguangyuan
 * @date 2017年3月3日 上午9:07:03 
 *
 */
public class Exercise9 {
	public static void main(String[] args) {
		 new Stem();
	}
}

class Root{  
    
    private Component1 component1=new Component1();  
      
    private Component2 component2=new Component2();  
      
    private Component3 component3=new Component3();  
      
    Root(){  
        System.out.println("Root constructor");  
    }  
}  
class Stem extends Root{  
      
    private Component1 component1=new Component1();  
      
    private Component2 component2=new Component2();  
      
    private Component3 component3=new Component3();  
      
    Stem(){  
        System.out.println("Stem constructor");  
    }  
}  
class Component1{  
  
    Component1(){  
        System.out.println("Component1 constructor");  
    }  
}  
class Component2{  
  
    Component2(){  
        System.out.println("Component2 constructor");  
    }  
}  
class Component3{  
  
    Component3(){  
        System.out.println("Component3 constructor");  
    }  
}  