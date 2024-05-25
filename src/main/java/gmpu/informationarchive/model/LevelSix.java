package gmpu.informationarchive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class LevelSix extends TreeNode<LevelSeven> {

    private Note note;

    @Builder
    public LevelSix(UUID id, @NonNull String name, List<LevelSeven> children, UUID parentId, Note note) {
        super(id, name, children, parentId);
        this.note = note;
    }
}
