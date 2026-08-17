public class Student {
    private String firtsName, lastName, email;
    private int age;
    public Student(String firtsName, String lastName, String email, int age) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
    public String getFirtsName() {
        return this.firtsName;
    }
    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}