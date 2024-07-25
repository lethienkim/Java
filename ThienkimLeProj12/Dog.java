public class Dog implements Animal {
    @Override
    public String speak() {
        return "I am a dog.\nMy name is Fido.\nFido:Woof";
    }

    @Override
    public void sleep(String data) {
        System.out.print(data + ":Snooze - ");
    }

    @Override
    public int run() {
        System.out.println("Fido: 1024");
        return 0;  // Return 1024 as specified
    }
}
