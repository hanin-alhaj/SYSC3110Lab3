public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }









    public BuddyInfo() {
        BuddyInfo buddy = new BuddyInfo("Jackie", "1 Majestic Dr", "123-456-7890");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    static void main() {

        BuddyInfo buddy1 = new BuddyInfo("Homer", "5 Woodroffe Dr", "123-456-7890");

        System.out.println("Hello " + buddy1.getName());
    }
}

