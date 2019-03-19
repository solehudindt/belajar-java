abstract class Employee {
    private String name;
    private String email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void payment();

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getName(String name){
        return this.name;
    }

    public void getEmail(String email) {
        return this.email;
    }
}