// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Minimum version of Ssl protocol to be supported on application gateway.
     * 
     */
    @EnumType
    public enum ApplicationGatewaySslProtocol {
        TLSv1_0("TLSv1_0"),
        TLSv1_1("TLSv1_1"),
        TLSv1_2("TLSv1_2");

        private final String value;

        ApplicationGatewaySslProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ApplicationGatewaySslProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
