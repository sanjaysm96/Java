package org.univ;

public class College extends University {


	// Child class overriding ug() and pg() methods

	// Overriding ug() method
	@Override
	void ug() {
		System.out.println("College: Offers UG programs like B.Tech, B.Sc, BBA");
	}

	// Overriding pg() method
	@Override
	void pg() {
		System.out.println("College: Offers PG programs like M.Tech, M.Sc, MBA");
	}

	public static void main(String[] args) {
		College college = new College();

		// Calls the overridden methods in College class
		college.ug();
		college.pg();
	}
}
