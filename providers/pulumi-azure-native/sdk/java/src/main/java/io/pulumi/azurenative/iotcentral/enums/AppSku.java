// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotcentral.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The name of the SKU.
     * 
     */
    @EnumType
    public enum AppSku {
        F1("F1"),
        S1("S1"),
        ST0("ST0"),
        ST1("ST1"),
        ST2("ST2");

        private final String value;

        AppSku(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AppSku[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
