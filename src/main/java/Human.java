/**
 * Created by danzygmund-felt on 5/1/17.
 *
 * Create a 'Human' class that has fields for: name, age, gender, occupation, and address.
 * Also create methods for retrieving and outputting this data to screen.Then create a
 * SuperHuman class that subclasses the first with fields for good or bad, hero name, super
 * ability. As before, create methods for retrieving field data and printing to screen.
 */

public class Human {
     private String name;
     private int age;
     private String gender;
     private String occupation;
     private String address;


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Name: " + this.name + "\n"
                + "Age: " + this.age + "\n"
                + "Gender: " + this.gender + "\n"
                + "Occupation : " + this.occupation + "\n"
                + "Address: " + this.address + "\n";
    }

}
