// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The direction for the current threshold. Direction is not allowed in a XyChart.
     * 
     */
    @EnumType
    public enum ThresholdDirection {
        /**
         * Not allowed in well-formed requests.
         * 
         */
        DirectionUnspecified("DIRECTION_UNSPECIFIED"),
        /**
         * The threshold will be considered crossed if the actual value is above the threshold value.
         * 
         */
        Above("ABOVE"),
        /**
         * The threshold will be considered crossed if the actual value is below the threshold value.
         * 
         */
        Below("BELOW");

        private final String value;

        ThresholdDirection(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ThresholdDirection[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }