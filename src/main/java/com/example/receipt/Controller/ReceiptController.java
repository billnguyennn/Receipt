package com.example.receipt.Controller;

import com.example.receipt.Entity.Receipt;
import com.example.receipt.Service.ReceiptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/receipt")
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;


    // This will return an ID of a receipt.
    @PostMapping("/process")
    public String processReceipt(@RequestBody Receipt newReceipt){
        log.info("Receipt: " + newReceipt);
        return receiptService.saveReceipt(newReceipt);
    }

    @GetMapping("/{id}/points")
    public Receipt getPointsOfAReceipt(@PathVariable String id){
        log.info("id: " + id);
        return receiptService.findReceiptById(id);

    }
}
