package top.ygy.chapter5.initialization;

import top.ygy.chapter5.initialization.Exercise21.Money;

/**
 * @ClassName: Exercise22 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author yangguangyuan
 * @date 2017年2月22日 上午7:57:45 
 *
 */
public class Exercise22 {
	public static void main(String[] args) {
		AAA one = new AAA(top.ygy.chapter5.initialization.AAA.Money.ONE);
		one.describ();
		AAA two = new AAA(top.ygy.chapter5.initialization.AAA.Money.TWO);
		two.describ();
	}
	
}

class AAA{
	public Money money;
	enum Money{
		ONE,TWO,THREE
	}
	public AAA(Money money){
		this.money = money;
	}
	
	public void describ(){
		switch(money){
		case ONE : System.out.println("1");break;
		case TWO : System.out.println("2");break;
		case THREE : System.out.println("3");break;
		default : System.out.println("齐活");break;
		}
	}
}

