<<<<<<< HEAD
package eventregfor;
import java.awt.*;
import java.awt.event.*;
 
class MyApp extends Frame {
	Label lblTitle,lblName,lblPassword,lblAge,lblGender,lblAddress;
	TextField txtName,txtFather,txtAge;
	TextField txtAddress;
	Checkbox checkMale, checkFemale;
	CheckboxGroup cbg;
	Button btnSave,btnClear;
 
	public MyApp() {
		super("User Registration Form");
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);
		
 
		
 
		lblTitle=new Label("Registration Form");  
		lblTitle.setBounds(250,40,300,50);
	
		add(lblTitle);
 
		lblName=new Label("User Name");  
		lblName.setBounds(250,100,150,30);
	
		add(lblName);
 
		txtName=new TextField();
		txtName.setBounds(400,100,400,30);
	
		add(txtName);
 
		lblPassword=new Label("Password");  
		lblPassword.setBounds(250,150,150,30);
		
		add(lblPassword);
 
		txtFather=new TextField();
		txtFather.setBounds(400,150,400,30);
	
		add(txtFather);
 
		lblAge=new Label("Age");  
		lblAge.setBounds(250,200,150,30);
		add(lblAge);
 
		txtAge=new TextField();
		txtAge.setBounds(400,200,400,30);
		
		add(txtAge);
 
 
		
 
		
 
		
 
		lblAddress=new Label("Address");  
		lblAddress.setBounds(250,250,150,30);
		
		add(lblAddress);
		
		txtAddress=new TextField();
		txtAddress.setBounds(400,250,400,100);
		
		add(txtAddress);
		lblGender=new Label("Gender");  
		lblGender.setBounds(250,350,150,30);
	
		add(lblGender);
 
		cbg = new CheckboxGroup();
 
		checkMale = new Checkbox("Male",cbg,true);
		checkMale.setBounds(450,350, 100, 30);
		
		add(checkMale);
 
		checkFemale = new Checkbox("Female",cbg,false);
		checkFemale.setBounds(550,350, 100, 30);
		
		add(checkFemale);
		
 
		
 
 
		btnSave=new Button("Save Details");
		btnSave.setBounds(400,530,150,30);
		
		
		add(btnSave);
		
		

 
		btnClear=new Button("Clear All");
		btnClear.setBounds(560,530,150,30);
	
		add(btnClear);
 
 

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
 
}

public class eventregfor {

	public static void main(String[] args) {
		MyApp frm = new MyApp();

	}

}
=======
package eventregfor;
import java.awt.*;
import java.awt.event.*;
 
class MyApp extends Frame {
	Label lblTitle,lblName,lblPassword,lblAge,lblGender,lblAddress;
	TextField txtName,txtFather,txtAge;
	TextField txtAddress;
	Checkbox checkMale, checkFemale;
	CheckboxGroup cbg;
	Button btnSave,btnClear;
 
	public MyApp() {
		super("User Registration Form");
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);
		
 
		
 
		lblTitle=new Label("Registration Form");  
		lblTitle.setBounds(250,40,300,50);
	
		add(lblTitle);
 
		lblName=new Label("User Name");  
		lblName.setBounds(250,100,150,30);
	
		add(lblName);
 
		txtName=new TextField();
		txtName.setBounds(400,100,400,30);
	
		add(txtName);
 
		lblPassword=new Label("Password");  
		lblPassword.setBounds(250,150,150,30);
		
		add(lblPassword);
 
		txtFather=new TextField();
		txtFather.setBounds(400,150,400,30);
	
		add(txtFather);
 
		lblAge=new Label("Age");  
		lblAge.setBounds(250,200,150,30);
		add(lblAge);
 
		txtAge=new TextField();
		txtAge.setBounds(400,200,400,30);
		
		add(txtAge);
 
 
		
 
		
 
		
 
		lblAddress=new Label("Address");  
		lblAddress.setBounds(250,250,150,30);
		
		add(lblAddress);
		
		txtAddress=new TextField();
		txtAddress.setBounds(400,250,400,100);
		
		add(txtAddress);
		lblGender=new Label("Gender");  
		lblGender.setBounds(250,350,150,30);
	
		add(lblGender);
 
		cbg = new CheckboxGroup();
 
		checkMale = new Checkbox("Male",cbg,true);
		checkMale.setBounds(450,350, 100, 30);
		
		add(checkMale);
 
		checkFemale = new Checkbox("Female",cbg,false);
		checkFemale.setBounds(550,350, 100, 30);
		
		add(checkFemale);
		
 
		
 
 
		btnSave=new Button("Save Details");
		btnSave.setBounds(400,530,150,30);
		
		
		add(btnSave);
		
		

 
		btnClear=new Button("Clear All");
		btnClear.setBounds(560,530,150,30);
	
		add(btnClear);
 
 

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
 
}

public class eventregfor {

	public static void main(String[] args) {
		MyApp frm = new MyApp();

	}

}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
