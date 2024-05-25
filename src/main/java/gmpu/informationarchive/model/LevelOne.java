package gmpu.informationarchive.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;


public class LevelOne extends TreeNode<LevelTwo>{

    @Builder
    public LevelOne(UUID id, @NonNull String name, List<LevelTwo> children) {
        super(id, name, children, null);
    }

}
