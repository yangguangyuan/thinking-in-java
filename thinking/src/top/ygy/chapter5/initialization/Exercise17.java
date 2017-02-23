package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise17 
 * @Description: TODO(创建一个类，他有一个接受一个String参数的构造器。在构造阶段，打印该参数。
 * 创建一个该类的对象引用数组,但是不实际去创建对象赋值给该数组。当运行程序时，请注意来自对该构造器的
 * 调用中的初始化消息是否打印了出来) 
 * @author yangguangyuan
 * @date 2017年2月21日 上午7:41:35 
 *
 */
public class Exercise17 {
	public static void main(String[] args) {
		Test1[] arrays = new Test1[5];
		for(int i=0;i<arrays.length;i++){
			arrays[i] = new Test1(Integer.toString(i));
			
		}
	}
}

class Test1 {  
    Test1(String s){  
        System.out.println("s="+s);  
    }  
}  
