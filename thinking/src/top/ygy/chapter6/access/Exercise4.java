package top.ygy.chapter6.access;

/**
 * @ClassName: Exercise4 
 * @Description: TODO(展示protected方法具有包访问权限,但是它仍旧不是public) 
 * @author yangguangyuan
 * @date 2017年2月24日 上午7:40:45 
 *
 */
public class Exercise4 extends Test641 {
	public static void main(String[] args) {
		Exercise4 exercise4 = new Exercise4();
		exercise4.getString();
		//exercise4.getString2();//不可以调用private
	}
}

class Test641{
	protected void getString() {
		System.out.println("天王盖地虎!!!");
	}
	
	private void getString2(){
		System.out.println("小鸡炖蘑菇!!!");
	}
}
