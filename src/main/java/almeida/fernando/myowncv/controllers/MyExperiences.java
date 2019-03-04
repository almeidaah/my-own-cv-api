package almeida.fernando.myowncv.controllers;

import almeida.fernando.myowncv.MyOwnCvApplication;
import almeida.fernando.myowncv.model.Experience;
import almeida.fernando.myowncv.model.MySelf;
import almeida.fernando.myowncv.service.MyExperienceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/about")
public class MyExperiences {

    MyExperienceService myExperienceService;

    public MyExperiences(MyExperienceService myExperienceService){
        this.myExperienceService = myExperienceService;
    }

    @GetMapping("/my/experiences")
    public List<Experience> myExperience(){
        return this.myExperienceService.findAllExperiences(new MySelf().builder().fullName(MyOwnCvApplication.MYSELF_NAME).build());
    }
}
