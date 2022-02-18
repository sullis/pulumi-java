// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of Digital Twins endpoint
     * 
     */
    @EnumType
    public enum EndpointType {
        EventHub("EventHub"),
        EventGrid("EventGrid"),
        ServiceBus("ServiceBus");

        private final String value;

        EndpointType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EndpointType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
