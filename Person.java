/**
 * Created by saxenaaa on 7/21/2017.
 */
public class Person {
    String name;
    String Gender;

    public Person(String name, String gender) {
        this.name = name;
        Gender = gender;
    }

    public String getGender() {

        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Person p = (Person) o;
        if(o == null){
            return false;
        }
        if(this.getName().equalsIgnoreCase(p.getName())){
            return true;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        int i = 0;
        i = this.getGender().hashCode()+this.getName().hashCode();
        return i;
    }



}
