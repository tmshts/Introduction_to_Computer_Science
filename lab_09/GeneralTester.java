public class GeneralTester {
    
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        Tiger tiger1 = new Tiger("omnivore", "purr");

        Horse horse1 = new Horse("herbivore", "neigh", 40);

        dog1.printDetails();

        dog1.setAnimalSound("woof");
        dog1.eatDogBiscuits();

        dog1.printDetails();
        System.out.println(dog1.getBiscuitsEaten());

        horse1.printDetails();

        horse1.setSpeed(48);
        System.out.println(horse1.getSpeed());

        tiger1.setAnimalDiet("carnivore");
        tiger1.printDetails();

    }
}
