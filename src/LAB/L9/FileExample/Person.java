package LAB.L9.FileExample;

public class Person {
    private String name;
    private int age;
    private String mobile;
    private String address;

    public Person(String name, int age, String mobile, String address) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", age=" + age +
                ", mobile='" + mobile +
                ", address='" + address;
    }
}
