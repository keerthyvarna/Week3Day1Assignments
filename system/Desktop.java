package org.system;
//Assignment1
//=============
//     Package   :org.system
//     Class        :Computer
//     Methods   :computerModel()
//
//     Class        :Desktop
//     Methods   :desktopSize()
//
//Description:
//create above 2 class and call all your class methods into the Desktop using single inheritance.


public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Dimensions: 15.54 x 30.3 x 33.74 cm");
	}
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}

}
