public class TestDog {
    
    public static void main(String[] args) {
        Dog dog_1 = new Dog("Lady", "Poodle", 2, false);
        Dog dog_2 = new Dog("Rocky", "Pitt Bull", 4, true);
        Dog dog_3 = new Dog();

        dog_3.setName("Spot");
        dog_3.setBreed("Dalmatian");
        dog_3.setAge(3);
        dog_3.setIsDangerous(false);

        int number = dog_3.getLicenceNo() % 10;

        System.out.println("Dog " + number + " is called " + dog_3.getName());
        System.out.println("It is a " + dog_3.getBreed());
        System.out.println("They are " + dog_3.getAge() + " years old");
        System.out.println("Their Licence Number is " + dog_3.getLicenceNo());
        System.out.println("They " + (dog_3.getIsDangerous()?"are Dangerous":"are NOT Dangerous"));

        dog_1.bark();
        dog_2.bark();
        dog_3.bark();

        System.out.println(dog_1.getName() + (dog_1.getIsDangerous()?" is Dangerous":" is NOT Dangerous"));
        System.out.println(dog_2.getName() + (dog_2.getIsDangerous()?" is Dangerous":" is NOT Dangerous"));
        System.out.println(dog_3.getName() + (dog_3.getIsDangerous()?" is Dangerous":" is NOT Dangerous"));
    }
}
