package polymorphism;/* 
 @author: Javohir
  Date: 5/10/2022
  Time: 5:03 PM*/

public class PolyMorphism {
    interface Wild{
         static String car(){
            return "I am a car";
        }
        void eat();
    }
     static class Animal implements Wild{
         static {

             System.out.println("Animal class");
         }
         {
             System.out.println("Animal object");
         }
        public String name;
        public int age;

        public Animal() {
            System.out.println("Animal constructor");
        }

        public void eat() {

            System.out.println("Animal is eating");
        }

        public String toString() {
            return "Animal [name=" + name + ", age=" + age + "]";
        }
    }
    static class Dog extends Animal{
        static {
            System.out.println("Dog class");
        }
        {
            System.out.println("Dog object");
        }
        public Dog() {
            System.out.println("Dog constructor");
        }
        public void eat() {
            System.out.println("Dog is eating");
        }
    }
    static class Cat extends Dog{

        public Cat() {
            System.out.println("Cat constructor");
        }

        public void eat() {
            System.out.println("Cat is eating");
        }
    }

    public static void main(String[] args) {
      // new Dog().eat();
       Wild animal = new Cat();
        System.out.println(Wild.car());

        animal.eat();
        Animal dog = new Animal();
        dog.age = 10;
        dog.name= "Javohir";
        System.out.println(dog.toString());
    }

}
