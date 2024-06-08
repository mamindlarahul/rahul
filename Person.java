package task2;

public class Person {

	private String name;
	private int age;
	private int hight;


	public Person(String name, int age, int hight) {
		this.name = name;
		this.age = age;
		this.hight = hight; 
	}

	public void getdetails() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("hight: "+ hight+"feets");
	}

	public static void main(String[] args) {

		Person p1 = new Person ("yudhishthra" , 28 , 6 );
		Person p2 = new Person ("bhima" , 26 , 6 );
		Person p3 = new Person ("arjuna" , 24 , 6 );
		Person p4 = new Person ("nakula" , 22 , 6 );
		Person p5 = new Person ("sahadev" , 26 , 6 );

		p1.getdetails();
		System.out.println("");
		
		p2.getdetails();
		System.out.println("");
		
		p3.getdetails();
		System.out.println("");
		
		p4.getdetails();
		System.out.println("");
		
		p5.getdetails();
		System.out.println("");
	}


}

