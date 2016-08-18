import com.daoimpl.PersonDaoImpl;
import com.entities.Person;

import java.util.List;

/**
 * Created by kotu on 8/16/16.
 */
public class PersonApp {
    public static void main(String[] args) {
        PersonDaoImpl pdi = new PersonDaoImpl();
        //pdi.createPersonTable();
        //Person person = new Person("maria", "J");
        //pdi.insert(person);
        //Person person = pdi.selectById(2);
        //System.out.println(person.getId()+", "+person.getFirstName()+ ", "+ person.getLastName());
        List<Person> persons = pdi.selectAll();
        for(Person person : persons) {
            System.out.println(person.getId()+", "+person.getFirstName()+ ", "+ person.getLastName());
        }
        //pdi.delete(1);
        Person newPerson  = new Person("Maria", "Kotu");
        pdi.update(newPerson, 3);
        List<Person> persons1 = pdi.selectAll();
        for(Person person : persons1) {
            System.out.println(person.getId()+", "+person.getFirstName()+ ", "+ person.getLastName());
        }
    }
}
