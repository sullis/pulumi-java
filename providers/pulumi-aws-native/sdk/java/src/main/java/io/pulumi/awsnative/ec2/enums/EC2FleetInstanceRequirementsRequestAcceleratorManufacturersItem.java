// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem {
        Nvidia("nvidia"),
        Amd("amd"),
        AmazonWebServices("amazon-web-services"),
        Xilinx("xilinx");

        private final String value;

        EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EC2FleetInstanceRequirementsRequestAcceleratorManufacturersItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
