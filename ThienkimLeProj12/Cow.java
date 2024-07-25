public class Cow implements Animal {
    @Override
    public String speak() {
        return "I am a cow.\nMy name is Bessie.";
    }

    @Override
    public void sleep(String data) {
        System.out.print(data + ":Yawn");
    }

    @Override
    public int run() {
        System.out.println("Bessie:Moo");
        return 0;  // Return 0 as a placeholder
    }
}
