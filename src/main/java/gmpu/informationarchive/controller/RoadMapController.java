package gmpu.informationarchive.controller;

import gmpu.informationarchive.model.LevelOne;
import gmpu.informationarchive.model.LevelThree;
import gmpu.informationarchive.model.LevelTwo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class RoadMapController {

    @GetMapping("/roadmap/{name}")
    public Mono<LevelOne> getRoadMap(@PathVariable String name) {
        UUID levelOneId = UUID.randomUUID();

        return Mono.just(LevelOne.builder()
                .id(levelOneId)
                .name("Computer Science")
                .children(
                        List.of(LevelTwo.builder()
                                        .id(UUID.randomUUID())
                                        .name("Spring Boot")
                                        .parentId(levelOneId)
                                        .children(Collections.emptyList())
                                        .build(),
                                LevelTwo.builder()
                                        .id(UUID.randomUUID())
                                        .name("NLP")
                                        .parentId(levelOneId)
                                        .children(Collections.emptyList())
                                        .build()))
                .build());
    }

}
