package example.FirstSecurityApp.services;

import example.FirstSecurityApp.models.Person;
import example.FirstSecurityApp.repositories.PeopleRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistrationService {
    private final PeopleRepositories peopleRepositories;

    @Autowired
    public RegistrationService(PeopleRepositories peopleRepositories) {
        this.peopleRepositories = peopleRepositories;
    }

    @Transactional
    public void register(Person person) {
        peopleRepositories.save(person);
    }
}
