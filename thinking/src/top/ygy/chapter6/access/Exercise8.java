package top.ygy.chapter6.access;

import java.util.Arrays;

import top.ygy.chapter6.access.test.Connection;

/**
 * @ClassName: Exercise8 
 * @Description: TODO(效仿实例Lunch.java的形式，创建一个名为ConnectionManager的类，
 * 该类管理一个元素为Connection对象的固定数组。客户端程序员不能直接创建Connection对象，
 * 而只能通过ConnectionManager中的某个static方法来获取他们。当ConnectionManager
 * 之中不再有对象时，它会返回null引用。在main（）之中检测这些类。 ) 
 * @author yangguangyuan
 * @date 2017年3月2日 下午3:12:20 
 *
 */
public class Exercise8 {
	private static Connection[] cons = new Connection[5];
	
	static{
		System.out.println("初始化Connection对象");
		 for(int i=0;i<5;i++){  
	            cons[i]=Connection.makeConnection();  
	        }  
	}
	
	public static  Connection getConnection(){  
        int l=cons.length;  
        if(l>0){  
            Connection con=cons[--l];  
            cons=Arrays.copyOf(cons, l);  
            return con;  
        }else{  
            return null;  
        }  
    } 
	
	 public static void main(String args[]){  
	        try {  
	            for(int i=0;i<7;i++){      
	                Connection con=Exercise8.getConnection();  
	                System.out.println(i+"、"+con);  
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  
}
