package exercice4;

public class Person {
	 private String firstName;
	    private String lastName;
	    private int age;

	    public Person(String firstName, String lastName, int age) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String introduce() {
	        return "Hello, my name is " + firstName + " " + lastName + " and I am " + age + " years old.";
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( new Person("Yasmine", "Kamate", 14).introduce());

	}

}
