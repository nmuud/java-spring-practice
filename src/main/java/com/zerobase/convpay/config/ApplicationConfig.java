package com.zerobase.convpay.config;

import com.zerobase.convpay.service.CardAdapter;
import com.zerobase.convpay.service.ConveniencePayService;
import com.zerobase.convpay.service.DiscountByPayMethod;
import com.zerobase.convpay.service.MoneyAdapter;

import java.util.Arrays;
import java.util.HashSet;

public class ApplicationConfig {

    public ConveniencePayService conveniencePayServiceDiscountConvenience() {
        return new ConveniencePayService(
                new HashSet<>(
                        Arrays.asList(new MoneyAdapter(), new CardAdapter())
                ),
                new DiscountByPayMethod()
        );
    }

    public ConveniencePayService conveniencePayServiceDiscountPayMethod() {
        return new ConveniencePayService(
                new HashSet<>(
                        Arrays.asList(new MoneyAdapter(), new CardAdapter())
                ),
                new DiscountByPayMethod()
        );
    }

}
