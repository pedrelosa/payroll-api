package br.com.pedrelosa.payrollapi.resources;

import br.com.pedrelosa.payrollapi.domain.Payroll;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    @GetMapping(value = "/{workerid}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerid, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(
                new Payroll(
                        "Saulo",
                        payment.getDescription(),
                        payment.getHourlyPrice(),
                        160.0,
                        payment.getHourlyPrice() * payment.getWorkedHours())
        );
    }

}
