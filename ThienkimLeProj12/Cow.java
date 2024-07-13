// Cow.java
class Cow implements Animal {
    public String speak() {
        return "Bessie:Moo";
    }
    public void sleep(String data) {
        System.out.println(data + ":Yawn");
    }
    public int run() {
        return 0; // Not specified, returning 0
    }
    public String toString() {
        return "cow:Yawn";
    }
}
