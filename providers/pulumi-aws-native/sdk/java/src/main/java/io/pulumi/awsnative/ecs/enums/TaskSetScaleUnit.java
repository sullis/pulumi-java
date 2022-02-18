// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The unit of measure for the scale value.
     * 
     */
    @EnumType
    public enum TaskSetScaleUnit {
        Percent("PERCENT");

        private final String value;

        TaskSetScaleUnit(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TaskSetScaleUnit[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
