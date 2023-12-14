package br.com.pedrelosa.payrollapi.resources;

import br.com.pedrelosa.payrollapi.domain.Payroll;
import br.com.pedrelosa.payrollapi.domain.User;
import br.com.pedrelosa.payrollapi.feignClients.UserFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/payments")
@RequiredArgsConstructor
public class PayrollResource {

    private final UserFeign userFeign;

    @GetMapping(value = "/{workerid}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerid, @RequestBody Payroll payment){

        User user = userFeign.findById(workerid).getBody();

        return ResponseEntity.ok().body(
                new Payroll(
                        user.getName(),
                        payment.getDescription(),
                        user.getHourlyPrice(),
                        payment.getWorkedHours(),
                        user.getHourlyPrice() * payment.getWorkedHours())
        );
    }

}
