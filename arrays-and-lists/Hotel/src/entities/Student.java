package entities;

public class Student {

    public String name;
    public String email;

    public Student(){
    }

    public Student(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString(){
        return name + ", " + email;
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
}
