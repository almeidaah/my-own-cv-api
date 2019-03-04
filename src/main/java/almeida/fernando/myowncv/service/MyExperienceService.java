package almeida.fernando.myowncv.service;

import almeida.fernando.myowncv.model.Experience;
import almeida.fernando.myowncv.model.MySelf;
import almeida.fernando.myowncv.repository.MyExperienceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MyExperienceService {

    MyExperienceRepository myExperienceRepository;

    public MyExperienceService(MyExperienceRepository myExperienceRepository){
        this.myExperienceRepository = myExperienceRepository;
    }

    public List<Experience> findAllExperiences(MySelf mySelf){
        return this.myExperienceRepository.findAllByFullName(mySelf.getFullName()).get();
    }
}
