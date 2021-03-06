package almeida.fernando.myowncv.model;

import almeida.fernando.myowncv.MyOwnCvApplication;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private String id;

    @JsonIgnore
    String fullName = MyOwnCvApplication.MYSELF_NAME;

    LocalDate startDate;
    LocalDate endDate;

    String companyName;
    String role;

    String whatIDidThere;


}
