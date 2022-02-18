// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    @EnumType
    public enum ResourceProvisioningState {
        Creating("Creating"),
        Updating("Updating"),
        Deleting("Deleting"),
        Succeeded("Succeeded"),
        Canceled("Canceled"),
        Failed("Failed");

        private final String value;

        ResourceProvisioningState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResourceProvisioningState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
