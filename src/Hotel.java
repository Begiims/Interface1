public class Hotel implements Family {
    private  int people;
    private  String addresses;

    public Hotel(int people, String addresses) {
        this.people = people;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "people=" + people +
                ", addresses='" + addresses + '\'' +
                '}';
    }

    @Override
    public void Pay() {

    }
}

