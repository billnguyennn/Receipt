package com.example.receipt.Entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Items implements Serializable {
    private String shortDescription;
    private String price;
}
