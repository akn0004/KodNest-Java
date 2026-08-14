
public class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class ThisEg {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.input("Arjun", 18, 5.8);
        st1.display();
    }
}
