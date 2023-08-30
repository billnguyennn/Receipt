package com.example.receipt.Entity;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class Receipt implements Serializable {
    private String id;
    private String retailer;
    private Double total;
    private List<Items> items;
    private int points;


    public void addPoints(int points){
        this.points += points;
    }

}
