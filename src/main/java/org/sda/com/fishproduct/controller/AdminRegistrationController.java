package org.sda.com.fishproduct.controller;

import jakarta.validation.Valid;
import org.sda.com.fishproduct.controller.dto.UserRegistrationDTO;
import org.sda.com.fishproduct.model.User;
import org.sda.com.fishproduct.model.enums.UserRole;
import org.sda.com.fishproduct.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AdminRegistrationController {
    private final UserService userService;

    public AdminRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin-register")
    public String showAdminRegisterPage() {
        return "admin-register";
    }
    @ModelAttribute("user")
    public UserRegistrationDTO userRegistrationDTO(){
        return new UserRegistrationDTO();
    }
    @PostMapping("/admin-register")
    public String registerClientAccount(@ModelAttribute("user")
                                        @Valid UserRegistrationDTO userRegistrationDTO,
                                        BindingResult bindingResult
    ) {
        Optional<User> userOptional = userService.findByEmail(userRegistrationDTO.getEmail());
        if (userOptional.isPresent()) {
            bindingResult.rejectValue("email", null, "Email already exist");
        }
        if (bindingResult.hasErrors()) {
            return "admin-register";
        }
        userService.createUser(
                userRegistrationDTO.getEmail(),
                userRegistrationDTO.getPassword(),
                UserRole.ADMIN,
                userRegistrationDTO.getName()

        );
        return "redirect:/admin-register?success";
    }

}
