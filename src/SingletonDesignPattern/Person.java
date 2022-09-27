package SingletonDesignPattern;

public class Person {
    private int pid;
    private String name;
    private String email;
    private String address;
    //Step: 01
    private static Person person;

    private Person() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    static Person getInstance(){
        if (null==person) person = new Person();
        return person;
    }

    @Override
    public String toString() {
        return person.getPid()+" "+person.getName()+" "+person.getAddress()+" "+person.getEmail();
    }
}
