package com.EazyBytes.eazyschool.controller;

import com.EazyBytes.eazyschool.model.Contact;
import com.EazyBytes.eazyschool.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
public class ContactController {

    Logger logger = Logger.getLogger(ContactController.class.toString());

    ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String contact(Model model){
        model.addAttribute("contact",new Contact());
        return "contact.html";
    }

    /*@RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
    public ModelAndView saveMessage(@RequestParam String name,
                                    @RequestParam String mobileNum,
                                    @RequestParam String email,
                                    @RequestParam String subject,
                                    @RequestParam String message){

        logger.info( " name ::"+name);
        logger.info( " Mobile Number ::"+mobileNum);
        logger.info( " Email ::"+email);
        logger.info( " subject ::"+subject);
        logger.info( " Message ::"+message);

        return new ModelAndView("redirect:/contact");

    }*/

    @RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors ){

        if(errors.hasErrors()){
            logger.info(" Errors are ::"+errors.toString());
            return "contact.html";
        }


        boolean result = contactService.saveMessageDetails(contact);
        contactService.setCounter(contactService.getCounter()+1);
        System.out.println(" Number of times contacxt form is submmmited :::"+contactService.getCounter());

        return "redirect:/contact";

    }

}
