package org.computer;

public class Desktop implements Hardware , Software {

	// Desktop class implements both HardWare and Software interfaces

	// Implementing method from HardWare interface
	@Override
	public void hardwareResources() {
		System.out.println("Hardware: Intel Core i7, 16GB RAM, 512GB SSD");
	}

	// Implementing method from Software interface
	@Override
	public void softwareResources() {
		System.out.println("Software: Windows 11, Microsoft Office, Adobe Photoshop");
	}

	// Additional method specific to Desktop class
	public void desktopModel() {
		System.out.println("Desktop Model: Dell XPS 8940");
	}

	public static void main(String[] args) {
		Desktop myDesktop = new Desktop();
		myDesktop.hardwareResources(); // Calls method from HardWare
		myDesktop.softwareResources(); // Calls method from Software
		myDesktop.desktopModel(); // Calls Desktop-specific method
	}
}
