
class Student1 {

    String name;
    int age;
    double height;

    Student1(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void dis() {
        System.out.println(name + " - " + age + " - " + height);
    }
}

class egthis {

    public static void main(String[] args) {
        Student1 std = new Student1("Raju", 18, 5.5);
        std.dis();
    }
}
