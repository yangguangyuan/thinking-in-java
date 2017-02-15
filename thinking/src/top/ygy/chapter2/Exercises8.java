package top.ygy.chapter2;

/**
 * @ClassName: Exercises8 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author yangguangyuan
 * @date 2017年2月15日 上午9:07:16 
 */
public class Exercises8 {
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		System.out.println(animal1.dog1);
		System.out.println(animal2.dog1);
		
		if(animal1.dog1 == animal2.dog1){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		System.out.println(animal1.dog2);
		System.out.println(animal2.dog2);
		
		if(animal2.dog2 == animal2.dog2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}

class Dog{
	
}

class Animal{
	Dog dog1 = new Dog();
	static Dog dog2 = new Dog();
}