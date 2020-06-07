package pojo.uptype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UpTypeErrorMessagePojo {
    private int maxKudos;
    private String name;
    private String resetUnit;
    private int __v;
    private Boolean canBeDeleted;

    List<String> errors = new ArrayList<String>();
}
