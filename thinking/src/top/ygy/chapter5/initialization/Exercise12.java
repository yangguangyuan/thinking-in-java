package top.ygy.chapter5.initialization;

/**
 * @ClassName: Exercise12 
 * @Description: TODO(编写名为Tank的类，此类的状态可以是“满的”或“空的”。其终结条件是：
 * 对象被清理时必须处于空状态。请编写finalize（）以检验终结条件是否成立，在main（）
 * 中测试Tank可能发生的几种使用方式) 
 * @author yangguangyuan
 * @date 2017年2月14日 下午6:10:22 
 */
public class Exercise12 {
	public boolean state=false;

	public void changeState(boolean state){
		this.state=state;
	}

	protected void finalize() throws Throwable{
		if(state){
			System.out.println("----满的，有问题---------");
		}else{
			System.out.println("----空的，没问题---------");
			super.finalize();
		}
	}

	public static void main(String[] args) {
	new Exercise12();
	System.gc();
	System.runFinalization();
	 
	new Exercise12().changeState(true);
	System.gc();
	System.runFinalization();
	}
}
