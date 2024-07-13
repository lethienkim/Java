// Dog.java
class Dog implements Animal {
    public String speak() {
        return "Fido:Woof";
    }
    public void sleep(String data) {
        System.out.println(data + ":Snooze");
    }
    public int run() {
        return 1024;
    }
    public String toString() {
        return "dog:Snooze";
    }
}
