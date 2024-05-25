package gmpu.informationarchive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class LevelTwo extends TreeNode<LevelThree> {

    @Builder
    public LevelTwo(UUID id, @NonNull String name, List<LevelThree> children, UUID parentId) {
        super(id, name, children, parentId);
    }
}