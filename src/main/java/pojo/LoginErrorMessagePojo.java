package pojo;

import lombok.Data;

@Data
public class LoginErrorMessagePojo {
    private int statusCode;
    private int status;
    private int code;
    private String message;
    private String name;
}
