
class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name + " - " + age + " - " + height);

    }
}

class StudentApp {

    public static void main(String[] args) {
        Student std = new Student();
        std.input("AKN", 22, 5.6);
        std.display();
    }
}
