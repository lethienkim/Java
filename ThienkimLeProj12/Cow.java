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
    public String run() {
        return " "; // Not used in the provided output
    }

}
