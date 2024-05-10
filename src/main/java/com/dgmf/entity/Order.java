package com.dgmf.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Order {
    @JsonProperty("c-name")
    private String customerName;
    @JsonProperty("p-name")
    private String productName;
    @JsonProperty("qty")
    private int quantity;
}
