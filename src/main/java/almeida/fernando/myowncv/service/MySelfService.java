package almeida.fernando.myowncv.service;

import almeida.fernando.myowncv.model.MySelf;
import almeida.fernando.myowncv.repository.MyselfRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MySelfService {

    MyselfRepository myselfRepository;


    public MySelfService(MyselfRepository myselfRepository){
        this.myselfRepository = myselfRepository;
    }

    public MySelf findAbout(MySelf mySelf){
        return this.myselfRepository.findByFullName(mySelf.getFullName()).get();
    }


}
