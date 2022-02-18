// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The protocol associated with the port.
     * 
     */
    @EnumType
    public enum ContainerGroupNetworkProtocol {
        TCP("TCP"),
        UDP("UDP");

        private final String value;

        ContainerGroupNetworkProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ContainerGroupNetworkProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
