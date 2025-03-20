package org.all;

//--multilevelInheritance i.e from grandparent - parent - child

//child
public class LanguageClass extends org.telugu.Telugu {
	public void allLanguage() {
		System.out.println("All Languages");	
	}
public static void main(String[] args) {
	LanguageClass lan = new LanguageClass();
			lan.allLanguage();
			lan.tamilLanguage();
			lan.englishLanguage();
			lan.teluguLanguage();
}
}
