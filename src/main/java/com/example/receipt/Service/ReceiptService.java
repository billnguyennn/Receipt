package com.example.receipt.Service;

import com.example.receipt.Entity.Receipt;
import com.example.receipt.Repo.ReceiptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ReceiptService {

    @Autowired
    private ReceiptRepo repo;

    public String saveReceipt(Receipt newReceipt){
        repo.saveReceipt(newReceipt);
        return newReceipt.getId();
    }

    public Receipt findReceiptById(String id){
        return repo.findId(id);
    }


}
