package assignment3;
public class Animal {
	    public void sound() 
	    {
	        System.out.println("This animal makes a sound");
	    }
	}
	class Dog extends Animal 
	{
	    @Override
	    public void sound() {
	        System.out.println("The dog barks");
	    }
	}
	class MethodOverridingExample {
	    public static void main(String[] args) {
	        Animal myAnimal = new Animal(); 
	        myAnimal.sound();
	        Animal myDog = new Dog(); 
	        myDog.sound(); 
	    }
}
