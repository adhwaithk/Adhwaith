package staticuse;
class Student{  
    int rollno;  
    String name;  
    static String college = "Cusat";   
    static void change(){  
    college = "Fisat";  
    }   
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }   
    void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
public class staticuse {

	public static void main(String[] args) {
		 Student.change();
		 Student s1 = new Student(3,"Adhwaith K");  
		 Student s2 = new Student(8,"Akshay N"); 
		 Student s3 = new Student(14,"krishnapriya");
		 s1.display();  
		 s2.display(); 
		 s3.display();
		

	}

}
