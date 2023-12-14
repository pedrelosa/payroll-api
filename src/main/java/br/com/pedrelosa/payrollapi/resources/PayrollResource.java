package br.com.pedrelosa.payrollapi.resources;

import br.com.pedrelosa.payrollapi.domain.Payroll;
import br.com.pedrelosa.payrollapi.domain.User;
import br.com.pedrelosa.payrollapi.feignClients.UserFeign;
import br.com.pedrelosa.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/payments")
@RequiredArgsConstructor
public class PayrollResource {

    private final PayrollService service;

    @GetMapping(value = "/{workerid}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerid, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(service.getPayment(workerid, payment));
    }

}
