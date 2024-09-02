package riwi.workshop.number_three.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import riwi.workshop.number_three.entities.ClassEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentReq {
    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Is Active is required")
    private boolean isActive;

    @NotBlank(message = "Class is required")
    private ClassEntity classEntity;
}
