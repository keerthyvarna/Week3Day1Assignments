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

public abstract class MultipleLanguage {
	public abstract void ruby();
	public void python() {
		System.out.println("Learning python");
	}

}
