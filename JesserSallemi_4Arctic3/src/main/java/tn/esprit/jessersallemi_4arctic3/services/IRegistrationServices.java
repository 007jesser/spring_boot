package tn.esprit.jessersallemi_4arctic3.services;

import tn.esprit.jessersallemi_4arctic3.entity.Registration;

public interface IRegistrationServices {
    Registration assignToSkier(String skierName);

    Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier);
}
