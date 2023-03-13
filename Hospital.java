package FirstPackage;

public class Hospital implements Patients {

	public static void main(String[] args) {
		Hospital p=new Hospital();
		p.getName("Irfan");
		p.getAge(45);
	

	}

	@Override
	public void getName(String name) {
		System.out.println("Patient name is:"+ name);
		
	}

	@Override
	public void getAge(int age) {
		System.out.println("Patients age is:"+ age);
		
	}

}
