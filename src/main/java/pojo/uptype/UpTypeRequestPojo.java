package pojo.uptype;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UpTypeRequestPojo {
    private int maxKudos;
    private String name;
    private String resetUnit;
    private int __v;
    private Boolean canBeDeleted;
}