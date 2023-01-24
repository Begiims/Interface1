public class Main {
    public static void main(String[] args) {
       Flat flat = new Flat(3,"Bishkek");
       flat.Pay();
        System.out.println(flat);
        Hostel hostel = new Hostel(6,"Barpy");
        hostel.Pay();
        System.out.println(hostel);
        Hotel hotel = new Hotel(12,"Paris");
        System.out.println(hotel);

    }
}