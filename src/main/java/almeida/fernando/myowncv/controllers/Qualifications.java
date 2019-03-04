package almeida.fernando.myowncv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Qualifications {

    @GetMapping("/my/qualifications")
    public String getQualifications(){
        return null;
    }
}
