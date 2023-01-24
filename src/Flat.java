public class Flat implements  Family{
    private int  comService;
    private  String address;


    public Flat(int comService, String address) {
        this.comService = comService;
        this.address = address;
    }



    @Override
    public String toString() {
        return "Flat{" +
                "comService=" + comService +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void Pay() {
        System.out.println("They must pay");

    }
}
