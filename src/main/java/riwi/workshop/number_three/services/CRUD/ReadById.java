package riwi.workshop.number_three.services.CRUD;

public interface ReadById<Entity, ID>{
    public Entity readById(ID id);
}
