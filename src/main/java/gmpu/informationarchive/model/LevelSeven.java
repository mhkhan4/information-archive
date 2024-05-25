package gmpu.informationarchive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LevelSeven {

    @Id
    private UUID id;

    @NonNull
    private String name;

    private UUID parentId;

    private Note note;
}
