package br.com.pedrelosa.payrollapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
public class StandartError {

    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;

}
