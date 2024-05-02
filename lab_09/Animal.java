public class Animal {
    
    private String animalDiet;
    private String animalSound;

    public Animal() {
        animalDiet = "undefined";
        animalSound = "undefined";
    }

    public Animal(String animalDiet, String animalSound) {
        this.animalDiet = animalDiet;
        this.animalSound = animalSound;
    }

    public String getAnimalDiet() {
        return animalDiet;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public void setAnimalDiet(String animalDiet) {
        this.animalDiet = animalDiet;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    public void printDetails() {
        System.out.println("Diet: " + animalDiet);
        System.out.println("Animal Sound: " + animalSound);
    }
}
