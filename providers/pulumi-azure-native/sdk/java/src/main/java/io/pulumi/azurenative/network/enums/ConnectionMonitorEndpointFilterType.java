// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The behavior of the endpoint filter. Currently only 'Include' is supported.
     * 
     */
    @EnumType
    public enum ConnectionMonitorEndpointFilterType {
        Include("Include");

        private final String value;

        ConnectionMonitorEndpointFilterType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConnectionMonitorEndpointFilterType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
