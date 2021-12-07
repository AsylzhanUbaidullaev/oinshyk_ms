package com.example.payment.enums;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public enum PaymentType {
  Subscription,
  Toys;
  String value;

}
