package com.Microservices.OrderService.dto;



import java.util.List;
import com.Microservices.OrderService.model.OrderLineItems;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
