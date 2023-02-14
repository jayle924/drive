package drive.domain;

import drive.domain.*;
import drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private String fileKey;
}


