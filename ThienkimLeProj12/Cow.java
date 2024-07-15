public class Cow implements Animal {
    @Override
    public String speak() {
        return "I am a cow.\nMy name is Bessie.\nBessie:Moo";
    }

    @Override
    public void sleep(String data) {
        System.out.print(data + ":Yawn");
    }

    @Override
    public int run() {
        return 0; // Not used in the provided output
    }

    @Override
    public String toString() {
        return "Bessie";
    }
}
