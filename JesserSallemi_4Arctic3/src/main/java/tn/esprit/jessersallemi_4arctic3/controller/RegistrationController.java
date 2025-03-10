package tn.esprit.jessersallemi_4arctic3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.jessersallemi_4arctic3.entity.Registration;
import tn.esprit.jessersallemi_4arctic3.services.IRegistrationServices;

@RestController
@RequestMapping("registration")
@RequiredArgsConstructor
public class RegistrationController {

    private final IRegistrationServices registrationService;

    @PostMapping("add-registration/{numSkier}")
    public Registration addRegistrationAndAssignToSkier(
            @RequestBody Registration registration,
            @PathVariable(name = "numSkier") Long numSkier
    ) {
        return registrationService.addRegistrationAndAssignToSkier(registration, numSkier);
    }
}