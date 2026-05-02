class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Fox extends Animal {
    void sound() {
        System.out.println("Fox barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Fox();         a.sound();             
}