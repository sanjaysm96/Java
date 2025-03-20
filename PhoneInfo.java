package org.phone;

public class PhoneInfo {

 public void phoneName() {
     System.out.println("Phone Name: iPhone 15 Pro");
 }

 public void phoneMieiNum() {
     System.out.println("IMEI Number: 123456789012345");
 }

 public void camera() {
     System.out.println("Camera: 48 MP Triple Camera");
 }

 public void storage() {
     System.out.println("Storage: 256GB");
 }

 public void osName() {
     System.out.println("Operating System: iOS 17");
 }

 public static void main(String[] args) {
     // Creating an object for PhoneInfo class
     PhoneInfo phoneInfo = new PhoneInfo();

     // Calling all the methods
     phoneInfo.phoneName();
     phoneInfo.phoneMieiNum();
     phoneInfo.camera();
     phoneInfo.storage();
     phoneInfo.osName();
 }
}
