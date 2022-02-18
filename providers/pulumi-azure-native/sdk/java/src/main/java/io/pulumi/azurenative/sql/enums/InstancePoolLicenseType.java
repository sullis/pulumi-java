// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The license type. Possible values are 'LicenseIncluded' (price for SQL license is included) and 'BasePrice' (without SQL license price).
     * 
     */
    @EnumType
    public enum InstancePoolLicenseType {
        LicenseIncluded("LicenseIncluded"),
        BasePrice("BasePrice");

        private final String value;

        InstancePoolLicenseType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstancePoolLicenseType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
