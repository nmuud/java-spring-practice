package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.ConvenienceType;

public class PayRequest {
    // 편의점 종류
    ConvenienceType convenienceType;

    // 결제 금액
    Integer payAmount;

    public PayRequest(ConvenienceType convenienceType, Integer payAmount) {
        this.convenienceType = convenienceType;
        this.payAmount = payAmount;
    }

    public ConvenienceType getConvenienceType() {
        return convenienceType;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setConvenienceType(ConvenienceType convenienceType) {
        this.convenienceType = convenienceType;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }
}
