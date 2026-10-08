
class Developer {

    void work() {
        System.out.println("Developing projects");
    }

    void project() {
        System.out.println("Developer doing project");
    }
}

public class JavaDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("Java Developer doing work");
    }

    void project() {
        System.out.println("Java Developer doing project");
    }
}

public class PythonDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("Python Developer doing work");
    }

    void project() {
        System.out.println("Python Developer doing project");
    }
}

public class Paup {

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);

        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}
