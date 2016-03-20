package publicproperty;

/**
 * Created by hanks on 16/3/20.
 */
public class Classroom {

    private Person person;
    public void setName(Person person1){

        this.person = person1;
        person.name = "hhh";
        person = new Person();
    }
}
