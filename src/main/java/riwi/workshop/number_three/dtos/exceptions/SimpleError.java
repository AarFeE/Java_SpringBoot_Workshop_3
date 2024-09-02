package riwi.workshop.number_three.dtos.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class SimpleError {
    private Integer code;
    private String status;
}
