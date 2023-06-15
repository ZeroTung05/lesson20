public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();

    }
}
class Human{
    private String name;
    private int age;


    public  Human() {
        this.name="Имя по умолчанию";
        this.age=0;
    }

    public Human(String name){
        System.out.println("Privet is 2 konstyktora");
        this.name=name;
    }
    public Human(String name, int age){
        System.out.println("Privet is 3 konstyktora");
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age){this.age=age;}
}