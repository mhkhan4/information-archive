package gmpu.informationarchive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
public class LevelThree extends TreeNode<LevelFour> {

    @Builder
    public LevelThree(UUID id, @NonNull String name, List<LevelFour> children, UUID parentId) {
        super(id, name, children, parentId);
    }
}
