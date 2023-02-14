package drive.domain;

import drive.domain.*;
import drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private Long size;
    private String name;
}


