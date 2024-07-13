// Proj12Runner.java
class Proj12Runner {
    public void run() {
        System.out.println("Your instructor will rearrange the\n" +
                           "order of some of the following statements\n" +
                           "when your assignment is graded.\n");

        System.out.println("I certify that this program is my own work\n" +
                           "and is not the work of others. I agree not\n" +
                           "to share my solution with others.\n" +
                           "Thienkim Le\n" +
                           "=====This line is required=====");

        Animal[] animals = new Animal[3];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cow();

        for (Animal animal : animals) {
            System.out.println("I am a " + animal.getClass().getSimpleName().toLowerCase() + ".");
            System.out.println("My name is " + animal.toString().split(":")[0]);
            System.out.println(animal.speak());
        }

        System.out.println("Fido: 1024");

        for (Animal animal : animals) {
            System.out.print(animal.toString() + " - ");
        }
        System.out.println();
    }
}

