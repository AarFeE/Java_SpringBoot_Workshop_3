package riwi.workshop.number_three.services.interfaces;

import riwi.workshop.number_three.entities.StudentEntity;
import riwi.workshop.number_three.services.CRUD.Delete;
import riwi.workshop.number_three.services.CRUD.ReadAll;
import riwi.workshop.number_three.services.CRUD.ReadById;
import riwi.workshop.number_three.services.CRUD.Save;

public interface IStudentService extends
        Save<StudentEntity>,
        ReadAll<StudentEntity>,
        ReadById<StudentEntity, Long> {
}
