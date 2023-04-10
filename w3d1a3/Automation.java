
/*Assignment 3
===========
Interface :Language
     Methods   :Java()
     Interface :TestTool
     Methods   :Selenium()
     AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class*/

package w3d1a3;

public class Automation extends MultipleLanguage implements TestTool,Language {

	
	public void Java() {
		System.out.println("Learning Java");
		
	}

	public void Selenium() {
	    System.out.println("learning selenium");
		
	}

	@Override
	public void ruby() {
	    System.out.println("learn ruby");
		
	}
	
	public static void main(String[] args) {
		Automation auto= new Automation();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();

      
	}
}
