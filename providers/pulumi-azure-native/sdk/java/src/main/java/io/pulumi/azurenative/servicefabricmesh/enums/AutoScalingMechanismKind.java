// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of auto scaling mechanism.
     * 
     */
    @EnumType
    public enum AutoScalingMechanismKind {
        /**
         * Indicates that scaling should be performed by adding or removing replicas.
         * 
         */
        AddRemoveReplica("AddRemoveReplica");

        private final String value;

        AutoScalingMechanismKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AutoScalingMechanismKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }