// Cat.java
class Cat implements Animal {
    public String speak() {
        return "Cleo:Meow";
    }
    public void sleep(String data) {
        System.out.println(data + ":Snore");
    }
    public int run() {
        return 0; // Not specified, returning 0
    }
    public String toString() {
        return "cat:Snore";
    }
}
