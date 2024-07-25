public class Cat implements Animal {
    @Override
    public String speak() {
        return "I am a cat.\nMy name is Cleo.";
    }

    @Override
    public void sleep(String data) {
        System.out.print(data + ":Snore - ");
    }

    @Override
    public int run() {
        System.out.println("Cleo:Meow");
        return 0;  // Return 0 as a placeholder
    }
}
