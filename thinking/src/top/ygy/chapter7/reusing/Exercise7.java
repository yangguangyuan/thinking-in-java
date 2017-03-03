package top.ygy.chapter7.reusing;

/**
 * @ClassName: Exercise7 
 * @Description: TODO(修改练习（5），使A和B以带参数的构造器取代默认的构造器。
 * 为C写一个构造器并在其中执行所有的初始化。) 
 * @author yangguangyuan
 * @date 2017年3月2日 下午5:18:49 
 */
public class Exercise7 {
	 public static void main(String[] args){
	        CC c = new CC(10);
	    }
}

class AA{
    public AA(int i){
        System.out.println(i + "A is construct");
    }
}
class BB{
    public BB(int i){
        System.out.println(i + "B is construct");
    }
}
class CC extends AA{
    BB b;
    public CC(int i) {
        super(i);
        b = new BB(i);
    }
}