class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello there");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}