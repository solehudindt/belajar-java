public class Cat extends Animal {
    String color;

    public Cat(String name, int age, String color) {
        super(name,age);
        this.color = color;
    }

    @Override
    public void hello(){
        System.out.println("This cat is" +name);
    }

    public void meow() {
        System.out.println("Meow.... " +this.name);
    }
}