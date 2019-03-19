class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void hello() {
        System.out.println("Hello my name is" + this.name);
    }
}