package drive.domain;

import drive.domain.*;
import drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private Long size;
    private String name;

    public FileUploaded(File aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
}
