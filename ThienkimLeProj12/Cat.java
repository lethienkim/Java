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
        return 0; // Not used in the provided output
    }

    @Override
    public String toString() {
        return "Cleo:Meow";
    }
}
