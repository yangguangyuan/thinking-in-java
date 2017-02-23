package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise13 
 * @Description: TODO(验证前面段落中的语句 ) 
 * @author yangguangyuan
 * @date 2017年2月17日 上午7:53:46 
 *
 */
public class Exercise13 {
	public static void main(String[] args) {
	    System.out.println("Inside main()");
	   // Cups.c1.f(99);  // (1)
	  }
	  static Cups x = new Cups();  // (2)
//	  static Cups y = new Cups();  // (2) 

}

class Cup {
  Cup(int marker) {
    System.out.println("Cup(" + marker + ")");
  }
  void f(int marker) {
    System.out.println("f(" + marker + ")");
  }
}

class Cups {
  static Cup c1;
  static Cup c2;
  static {
    c1 = new Cup(1);
    c2 = new Cup(2);
  }
  Cups() {
    System.out.println("Cups()");
  }
}

