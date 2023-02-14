package drive.domain;

import drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private String fileKey;
}
