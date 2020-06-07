package pojo;
import lombok.*;

@AllArgsConstructor
@Data
public class LoginRequestPojo {
    private String username;
    private String password;
    private Boolean keepSignedIn;
}
