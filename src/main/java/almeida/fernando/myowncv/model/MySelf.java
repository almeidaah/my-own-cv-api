package almeida.fernando.myowncv.model;

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
    private String id;

    String fullName;
    String phoneNumber;
    String email;
    String linkedinProfile;
    String twitterProfile;

}
