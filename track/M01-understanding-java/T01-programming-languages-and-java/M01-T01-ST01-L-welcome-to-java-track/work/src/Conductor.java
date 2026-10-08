
class Conductor {

    void collect(Money m) {
        System.out.println("Money collected by Conductor");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket Issued");
        return t;
    }
}
