// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum EventTypeEventVariableVariableType {
        AuthCode("AUTH_CODE"),
        Avs("AVS"),
        BillingAddressL1("BILLING_ADDRESS_L1"),
        BillingAddressL2("BILLING_ADDRESS_L2"),
        BillingCity("BILLING_CITY"),
        BillingCountry("BILLING_COUNTRY"),
        BillingName("BILLING_NAME"),
        BillingPhone("BILLING_PHONE"),
        BillingState("BILLING_STATE"),
        BillingZip("BILLING_ZIP"),
        CardBin("CARD_BIN"),
        Categorical("CATEGORICAL"),
        CurrencyCode("CURRENCY_CODE"),
        EmailAddress("EMAIL_ADDRESS"),
        Fingerprint("FINGERPRINT"),
        FraudLabel("FRAUD_LABEL"),
        FreeFormText("FREE_FORM_TEXT"),
        IpAddress("IP_ADDRESS"),
        Numeric("NUMERIC"),
        OrderId("ORDER_ID"),
        PaymentType("PAYMENT_TYPE"),
        PhoneNumber("PHONE_NUMBER"),
        Price("PRICE"),
        ProductCategory("PRODUCT_CATEGORY"),
        ShippingAddressL1("SHIPPING_ADDRESS_L1"),
        ShippingAddressL2("SHIPPING_ADDRESS_L2"),
        ShippingCity("SHIPPING_CITY"),
        ShippingCountry("SHIPPING_COUNTRY"),
        ShippingName("SHIPPING_NAME"),
        ShippingPhone("SHIPPING_PHONE"),
        ShippingState("SHIPPING_STATE"),
        ShippingZip("SHIPPING_ZIP"),
        Useragent("USERAGENT");

        private final String value;

        EventTypeEventVariableVariableType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EventTypeEventVariableVariableType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
