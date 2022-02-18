// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CapacityProviderManagedScalingStatus {
        Disabled("DISABLED"),
        Enabled("ENABLED");

        private final String value;

        CapacityProviderManagedScalingStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CapacityProviderManagedScalingStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
