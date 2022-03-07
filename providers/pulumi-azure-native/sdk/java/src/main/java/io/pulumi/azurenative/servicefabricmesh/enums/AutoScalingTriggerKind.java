// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of auto scaling trigger
     * 
     */
    @EnumType
    public enum AutoScalingTriggerKind {
        /**
         * Indicates that scaling should be performed based on average load of all replicas in the service.
         * 
         */
        AverageLoad("AverageLoad");

        private final String value;

        AutoScalingTriggerKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AutoScalingTriggerKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }