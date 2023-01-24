public class Hostel implements Family {
    private  int people;
    private  String addresses;

    public Hostel(int people, String addresses) {
        this.people = people;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "people=" + people +
                ", addresses='" + addresses + '\'' +
                '}';
    }

    @Override
    public void Pay() {

    }
}

