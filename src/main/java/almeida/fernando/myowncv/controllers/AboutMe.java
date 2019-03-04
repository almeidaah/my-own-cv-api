package almeida.fernando.myowncv.controllers;

import almeida.fernando.myowncv.MyOwnCvApplication;
import almeida.fernando.myowncv.model.MySelf;
import almeida.fernando.myowncv.service.MySelfService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutMe {

    MySelfService mySelfService;

    public AboutMe(MySelfService myselfService){
        this.mySelfService = myselfService;
    }

    @GetMapping("/me")
    public MySelf aboutMe(){
        return this.mySelfService.findAbout(new MySelf().builder().fullName(MyOwnCvApplication.MYSELF_NAME).build()) ;
    }

}
