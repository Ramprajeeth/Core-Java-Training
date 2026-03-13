package test;



record Student5(int id, String name, int marks) {
}



public class DemoRecord1 {
	public static void main(String[] args) {
		Student5 s = new Student5(1, "Ram", 90);
		System.out.println(s.id());
		System.out.println(s.name());
		System.out.println(s.marks());
	}
}
