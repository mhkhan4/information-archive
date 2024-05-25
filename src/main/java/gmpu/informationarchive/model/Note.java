package gmpu.informationarchive.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Note {

    @Id
    private Long id;

    private String content;

    // if one of them is present others should be null

    private UUID levelFourId;

    private UUID levelFiveId;

    private UUID levelSixId;

    private UUID levelSevenId;
}
