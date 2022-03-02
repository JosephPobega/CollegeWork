public class App {
    public static void main(String[] args){
        Dog dog = new Dog();
        Bat bat = new Bat();
        Hawk hawk = new Hawk();
        Penguin penguin = new Penguin();
        dog.walk();
        bat.fly();
        hawk.walk();
        hawk.fly();
        penguin.walk();
        penguin.swim();

    }
}
