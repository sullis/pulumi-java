// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates whether the connection has been approved, rejected or removed by the key vault owner.
     * 
     */
    @EnumType
    public enum PrivateEndpointServiceConnectionStatus {
        Pending("Pending"),
        Approved("Approved"),
        Rejected("Rejected"),
        Disconnected("Disconnected");

        private final String value;

        PrivateEndpointServiceConnectionStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PrivateEndpointServiceConnectionStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
