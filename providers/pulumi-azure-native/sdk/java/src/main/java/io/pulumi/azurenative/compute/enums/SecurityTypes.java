// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the SecurityType of the virtual machine. It is set as TrustedLaunch to enable UefiSettings. <br><br> Default: UefiSettings will not be enabled unless this property is set as TrustedLaunch.
     * 
     */
    @EnumType
    public enum SecurityTypes {
        TrustedLaunch("TrustedLaunch");

        private final String value;

        SecurityTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecurityTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }