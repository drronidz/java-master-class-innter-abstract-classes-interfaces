public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

//        Bird bird = new Bird("Parrot");
//        bird.breath();
//        bird.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breath();
        parrot.fly();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
