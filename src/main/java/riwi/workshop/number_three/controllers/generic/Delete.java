package riwi.workshop.number_three.controllers.generic;

import org.springframework.http.ResponseEntity;

public interface Delete<Entity, ID> {
    public ResponseEntity<Entity> deleteById(ID id);
}
