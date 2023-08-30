package com.example.receipt.Repo;

import com.example.receipt.Entity.Receipt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class ReceiptRepo {

    List<Receipt> receiptList = new ArrayList<>();

    public void saveReceipt(Receipt newReceipt){
        receiptList.add(newReceipt);
    }

    public Receipt findId(String id){
        log.info("List: " + receiptList);
        for(Receipt receipt: receiptList){
            if(receipt.getId().equals(id)){
                return receipt;
            }
        }
        return null;
    }
}
