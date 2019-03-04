package love.programming;

 public class MyMainClass {
     public static void main(String[] args) {
         Person personobject1 = new Person();
         Person personobject2 = new Person();
         personobject1.setFirstName("narmada");
         personobject2.setFirstName("nishita");
         personobject1.setLastName("mikkilineni");
         personobject2.setLastName("kalapala");
         System.out.println("My name is " + personobject1.getFirstName()+personobject1.getLastName());
     }
 }
