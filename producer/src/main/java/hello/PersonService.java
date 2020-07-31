package hello;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PersonService {
    private HashMap<Long, Person> personHashMap;

    public PersonService() {
        personHashMap = new HashMap<>();
        personHashMap.put(1L, new Person(1L, "Richard", "Gere"));
        personHashMap.put(2L, new Person(2L, "Emma", "Choplin"));
        personHashMap.put(3L, new Person(3L, "Anna", "Carolina"));
    }

    public Person findPersonById(Long id) {
        return personHashMap.get(id);
    }
}
