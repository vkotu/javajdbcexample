import com.daoimpl.PersonDaoImpl;
import com.entities.Person;

import java.util.List;

/**
 * Created by kotu on 8/16/16.
 */
public class CreatePerson {
    public static void main(String[] args) {
        PersonDaoImpl pdi = new PersonDaoImpl();
        //pdi.createPersonTable();
        //Person person = new Person("venkat", "kotu");
        //pdi.insert(person);
        //Person person = pdi.selectById(2);
        //System.out.println(person.getId()+", "+person.getFirstName()+ ", "+ person.getLastName());
        List<Person> persons = pdi.selectAll();
        for(Person person : persons) {
            System.out.println(person.getId()+", "+person.getFirstName()+ ", "+ person.getLastName());
        }
    }
}
