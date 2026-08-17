public class Customer2 {
    int age;
    boolean isVIP;

    public Customer2() {}

    public Customer2(int age) {
        this.age = age;
        this.isVIP = false;
    }

    public int getAge() {
        return age;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }
}
