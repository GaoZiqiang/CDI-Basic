package cn.edu.sdut.softlab;

@Second
public class SecondGreentingImpl implements Greeting {

	public String greet(String name) {
		System.out.println("Second Greeting Implement!" + name);
		return "Second Greeting Implement: welcome:" + name;
	}

}
