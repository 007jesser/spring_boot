package tn.esprit.jessersallemi_4arctic3.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.jessersallemi_4arctic3.entity.Registration;
import tn.esprit.jessersallemi_4arctic3.repository.RegistrationRepository;

@Service
@AllArgsConstructor
public class RegistrationServices implements IRegistrationServices {

    // Inject the repository correctly.
    private final RegistrationRepository registrationRepository;

    @Override
    public Registration assignToSkier(String skierName) {

        Registration registration = new Registration();
        registration.setNumRegistration(1L);
        registration.setNumWeek(1);
        return registrationRepository.save(registration);
    }
}
