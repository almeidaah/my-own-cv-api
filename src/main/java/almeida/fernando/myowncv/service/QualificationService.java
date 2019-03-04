package almeida.fernando.myowncv.service;

import almeida.fernando.myowncv.model.Qualification;
import almeida.fernando.myowncv.repository.QualificationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QualificationService {

    QualificationRepository qualificationRepository;

    public QualificationService(QualificationRepository qualificationRepository){
        this.qualificationRepository = qualificationRepository;
    }

    public List<Qualification> findAllQualifications(Qualification qualification) {
        return this.qualificationRepository.findAllByFullName(qualification.getFullName()).get();
    }
}
