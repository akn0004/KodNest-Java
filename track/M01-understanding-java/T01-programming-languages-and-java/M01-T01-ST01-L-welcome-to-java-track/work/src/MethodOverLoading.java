
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class MethodOverLoading {

    public static void main(String[] args) {
        Addition ad = new Addition();
        System.out.println(ad.add(5.2, 5.8, 5.0));
        System.out.println(ad.add(8.8, 7));
    }
}
