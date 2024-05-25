package gmpu.informationarchive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class LevelFive extends TreeNode<LevelSix> {

    private Note note;

    @Builder
    public LevelFive(UUID id, @NonNull String name, List<LevelSix> children, UUID parentId, Note note) {
        super(id, name, children, parentId);
        this.note = note;
    }
}
