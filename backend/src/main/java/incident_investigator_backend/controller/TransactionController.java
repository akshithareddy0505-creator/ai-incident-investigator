package incident_investigator_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @GetMapping("/api/transactions")
    public String transactions(){
        return "Transaction is working";
    }
}
