// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets the status
     * 
     */
    @EnumType
    public enum PrivateEndpointConnectionStatus {
        Pending("Pending"),
        Approved("Approved"),
        Rejected("Rejected"),
        Disconnected("Disconnected");

        private final String value;

        PrivateEndpointConnectionStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PrivateEndpointConnectionStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }