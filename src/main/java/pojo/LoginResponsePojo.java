package pojo;

import lombok.Data;

@Data
public class LoginResponsePojo {
    private String accessToken;
    private String accessTokenExpiresAt;
}
