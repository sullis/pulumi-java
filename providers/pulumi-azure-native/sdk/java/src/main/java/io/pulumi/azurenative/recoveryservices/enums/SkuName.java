// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The Sku name.
     * 
     */
    @EnumType
    public enum SkuName {
        Standard("Standard"),
        RS0("RS0");

        private final String value;

        SkuName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SkuName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
