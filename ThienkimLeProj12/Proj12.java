/*File Proj12.java
The purpose of this assignment is to assess the student's
ability to write programs involving runtime polymorphism
based on interface inheritance.
***********************************************************/

// Student must not modify the code in this file. //
class Proj12{
  public static void main(String[] args){
  	System.out.println(""+
  	  "Your instructor will rearrange the\n"+
  	  "order of some of the following statements\n"+
  	  "when your assignment is graded.\n");

    Proj12Runner var = new Proj12Runner();
    System.out.println("=====This line is required=====");
    Animal cat = new Cat();
    Animal dog = new Dog();
    Animal cow = new Cow();
    System.out.println(cat.speak());
    System.out.println(dog.speak());
    System.out.println(cow.speak());
    System.out.println(dog.run());
    cat.sleep("cat");
    dog.sleep("dog");
    cow.sleep("cow");
  }//end main
}//end class Proj12
//===============================================//
