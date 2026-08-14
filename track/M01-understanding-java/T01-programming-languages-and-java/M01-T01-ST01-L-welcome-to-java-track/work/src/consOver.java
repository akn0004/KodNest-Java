
public class Student {

    String name;
    int age;
    double height;

    Student(String name) {
        System.out.println(name);
    }

    Student(String name, int age) {
        System.out.println(name + "-" + age);
    }

    Student(String name, int age, double height) {
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

public class consOver {

    public static void main(String[] args) {
        Student st1 = new Student("Arjun", 18, 5.8);
        Student st3 = new Student("Jin");
        Student st2 = new Student("Appu", 18);
        st1.display();
    }
}
