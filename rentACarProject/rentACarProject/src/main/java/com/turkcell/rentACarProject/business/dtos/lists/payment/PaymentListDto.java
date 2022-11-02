package com.turkcell.rentACarProject.business.dtos.lists.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentListDto {

    private int paymentId;
    private double totalPrice;
    private int rentalCarId;
    private int invoiceId;

}
