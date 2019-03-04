package almeida.fernando.myowncv.model;

import almeida.fernando.myowncv.MyOwnCvApplication;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Document
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Experience implements Serializable {

    @Id
    private String id;

    String fullName = MyOwnCvApplication.MYSELF_NAME;

    LocalDate startDate;
    LocalDate endDate;

    String companyName;
    String role;

    String whatIDidThere;


}
