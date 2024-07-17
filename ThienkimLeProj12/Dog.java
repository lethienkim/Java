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
    public String run() {
        System.out.println("Cleo:Meow\n"+
                            "Fido: 1024\n"+
                            "Bessie:Moo\n");
        return "";
    }

    
}
