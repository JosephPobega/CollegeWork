public class Dog extends Animal implements Walkable{
     private double walkSpeed = 1.0;

     public Dog(){
         super("the dog");
     }
     @Override
     public void walk(){
         System.out.println(name + " walks at " + walkSpeed + " meters per second.");
     }
    }