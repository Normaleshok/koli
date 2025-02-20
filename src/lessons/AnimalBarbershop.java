package lessons;
// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

public class AnimalBarbershop {


    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        AnimalBarbershop barbershop = new AnimalBarbershop();
        barbershop.shear(cat);
        barbershop.shear(dog);
    }

    public void shear(Animal8 animal) {
        System.out.println("Стрижка готова!");
    }
}