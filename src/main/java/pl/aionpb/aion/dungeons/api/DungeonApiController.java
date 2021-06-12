package pl.aionpb.aion.dungeons.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.aionpb.aion.dungeons.entity.DungeonEntity;
import pl.aionpb.aion.dungeons.repository.DungeonRepository;

import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@RestController
public class DungeonApiController {

    @Autowired
    DungeonRepository dungeonRepository;

    @GetMapping("/api/dungeons")
    public List<DungeonEntity> getAllDungeons() {
        return dungeonRepository.findAll();
    }
}
