package com.Microservices.InventoryService.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
@Data
@Entity
@Table(name="t_inventory")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode; // product
    private Integer quantity;

}
