package almeida.fernando.myowncv.model;

import almeida.fernando.myowncv.MyOwnCvApplication;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Document
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Qualification implements Serializable {

    @Id
    @JsonIgnore
    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    LocalDate startDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    LocalDate endDate;

    String description;

    @JsonIgnore
    String fullName = MyOwnCvApplication.MYSELF_NAME;

}
