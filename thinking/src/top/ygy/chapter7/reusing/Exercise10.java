package top.ygy.chapter7.reusing;

public class Exercise10 {
	public static void main(String[] args) {
		new Stem1(1);
	}
}



class Root1{  
    
  private Component11 component1=new Component11(1);  
    
  private Component21 component2=new Component21(2);  
    
  private Component31 component3=new Component31(3);  
    
  Root1(int i){  
      System.out.println("Root constructor");  
  }  
}  
class Stem1 extends Root1{  
    
  private Component11 component1=new Component11(1);  
    
  private Component21 component2=new Component21(2);  
    
  private Component31 component3=new Component31(3);  
    
  Stem1(int i){  
      super(i);  
      System.out.println("Stem constructor");  
  }  
}  
class Component11{  

  Component11(int i){  
      System.out.println("Component1 constructor "+i);  
  }  
}  
class Component21{  

  Component21(int i){  
      System.out.println("Component2 constructor "+i);  
  }  
}  
class Component31{  

  Component31(int i){  
      System.out.println("Component3 constructor"+i);  
  }  
} 