package almeida.fernando.myowncv.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class MySelf implements Serializable {

    @Id
    @JsonIgnore
    private String id;

    @JsonIgnore
    String fullName;

    String phoneNumber;
    String email;
    String linkedinProfile;
    String twitterProfile;

}
