// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enable or Disable apply network policies on private end point in the subnet.
     * 
     */
    @EnumType
    public enum VirtualNetworkPrivateEndpointNetworkPolicies {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        VirtualNetworkPrivateEndpointNetworkPolicies(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VirtualNetworkPrivateEndpointNetworkPolicies[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
