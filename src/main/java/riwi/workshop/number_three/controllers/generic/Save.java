package riwi.workshop.number_three.controllers.generic;

import org.springframework.http.ResponseEntity;

public interface Save<EntityRequest, Entity>{
    public ResponseEntity<Entity> create(EntityRequest entity);
}
