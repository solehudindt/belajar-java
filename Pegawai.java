class Pegawai extends Employee{
    double salary;

    public Pegawai(String name, String email, double salary) {
        super(name,email);
        this.salary = salary;
    }

    public void sayHi() {
        System.out.println("Hell there, i'm " +this.getname());
    }

    @Override
    public void payment(){
        System.out.println("Hell there, i'm " +this.salary);
    }
}