package none.qoqoevi.dto.task;

import lombok.Data;

import java.util.Date;

@Data
public class GetTaskOutput {
    private String title;
    private String description;
    private Date createDate;
    private int rate;
}