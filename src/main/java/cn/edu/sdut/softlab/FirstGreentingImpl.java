package cn.edu.sdut.softlab;

@First
public class FirstGreentingImpl implements Greeting {

	public String greet(String name) {
		System.out.println("欢迎: " + name);
		return "First Greeting Implement:hello " + name;
	}

}
