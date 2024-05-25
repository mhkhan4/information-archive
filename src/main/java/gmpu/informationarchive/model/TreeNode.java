package gmpu.informationarchive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public abstract class TreeNode<T> {
    @Id
    private UUID id;

    @NonNull
    private String name;

    private List<T> children;

    private UUID parentId;
}
