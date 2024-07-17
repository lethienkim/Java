public class Dog implements Animal {
    @Override
    public String speak() {
        return "I am a dog.\nMy name is Fido.";
    }

    @Override
    public void sleep(String data) {
        System.out.print(data + ":Snooze - ");
    }

    @Override
    public int run() {
        return 1024;
    }

    @Override
    public String toString() {
        return "Fido";
    }
}
