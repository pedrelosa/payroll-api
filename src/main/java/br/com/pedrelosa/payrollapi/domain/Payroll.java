package br.com.pedrelosa.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Payroll {
    private String workerName;
    private String descriprion;
    private Double hourlyPrice;
    private Double workedHours;
    private Double totalPayment;
}
