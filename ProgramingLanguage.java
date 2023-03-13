package FirstPackage;

public class ProgramingLanguage implements Language {

	public static void main(String[] args) {
		ProgramingLanguage j=new ProgramingLanguage();
		j.getName("Java");
		ProgramingLanguage j1=new ProgramingLanguage();
		j1.getData("Selenium");

	}

	@Override
	public void getName(String name) {
		System.out.println("ProgramingLanguage :" + name);
		
	}

	@Override
	public void getData(String name) {
	System.out.println("Automation Tool is :"+ name);
		
	}
}