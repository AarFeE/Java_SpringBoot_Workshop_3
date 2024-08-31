package riwi.workshop.number_three.controllers.generic;

import org.springframework.http.ResponseEntity;
import java.util.List;

public interface ReadAll<Entity> {
    ResponseEntity<List<Entity>> readAll();
}
