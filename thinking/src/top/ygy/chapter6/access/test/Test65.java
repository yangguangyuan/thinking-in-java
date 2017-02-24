package top.ygy.chapter6.access.test;

public class Test65 {
	private String username = "a";
	public Integer age = 1;
	protected String address = "b";
	
	private void getString(){
		System.out.println("aaa");
	}
	
	public void getInt(){
		System.out.println(1);
	}
	
	protected void getString2(){
		System.out.println("bbb");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
