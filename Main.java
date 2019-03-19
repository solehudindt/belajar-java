class Main {
    public static void main(String[] args){
        Cat persia = new Cat("Lulu", 2, "hitam");
        persia.meow();
        persia.hello();

        Pegawai udin = new Pegawai("udin", "udin@makan.com", 82.12);
        System.out.println("Hell there, i'm " +udin.getname());
    }
}