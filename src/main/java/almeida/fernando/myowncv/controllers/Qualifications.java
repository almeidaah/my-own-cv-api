package almeida.fernando.myowncv.controllers;

import almeida.fernando.myowncv.MyOwnCvApplication;
import almeida.fernando.myowncv.model.Qualification;
import almeida.fernando.myowncv.service.QualificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Qualifications {

    QualificationService qualificationService;

    public Qualifications(QualificationService qualificationService) {
        this.qualificationService = qualificationService;
    }

    @GetMapping("/my/qualifications")
    public List<Qualification> getQualifications(){
        return qualificationService.findAllQualifications(new Qualification().builder().fullName(MyOwnCvApplication.MYSELF_NAME).build());
    }
}
