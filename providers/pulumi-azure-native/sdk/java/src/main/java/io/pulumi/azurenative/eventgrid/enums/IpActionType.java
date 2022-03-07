// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Action to perform based on the match or no match of the IpMask.
     * 
     */
    @EnumType
    public enum IpActionType {
        Allow("Allow");

        private final String value;

        IpActionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IpActionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }