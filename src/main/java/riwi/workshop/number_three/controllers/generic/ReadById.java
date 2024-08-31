package riwi.workshop.number_three.controllers.generic;

import org.springframework.http.ResponseEntity;

public interface ReadById<Entity, ID>{
    public ResponseEntity<Entity> readById(ID id);
}
