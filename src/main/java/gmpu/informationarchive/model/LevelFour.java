package gmpu.informationarchive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class LevelFour extends TreeNode<LevelFive>{

    private Note note;

    @Builder
    public LevelFour(UUID id, @NonNull String name, List<LevelFive> children, UUID parentId, Note note) {
        super(id, name, children, parentId);
        this.note = note;
    }
}
