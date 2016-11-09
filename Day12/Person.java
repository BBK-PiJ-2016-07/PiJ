public class Person{
	public static void main(String[] args){
		System.out.println("Get Initials of Person's name: ");
		System.out.println("Bilal Ahmad");
		String name = "Bilal  Ahmad";
		Person aPerson = new Person();
		System.out.println(aPerson.getInitials(name));



	}

public String getInitials(String fullName) { 

String result = "";
String[] words = fullName.split(" "); 
	for (int i = 0; i < words.length; i++) {
		String nextInitial = "" + words[i].charAt(0);
		result = result + nextInitial.toUpperCase(); 
	}
    return result;
  }
}