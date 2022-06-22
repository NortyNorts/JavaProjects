public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
//        int bankBalance = 10000;
//        String name = "Eric";
        System.out.println();
        String returnedValue = cat.meow();
        String returnedDogValue = dog.woof();
        System.out.println(returnedValue);
        System.out.println(returnedDogValue);

    }
}
