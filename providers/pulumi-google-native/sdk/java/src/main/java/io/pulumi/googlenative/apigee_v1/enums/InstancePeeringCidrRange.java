// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Size of the CIDR block range that will be reserved by the instance. PAID organizations support `SLASH_16` to `SLASH_20` and defaults to `SLASH_16`. Evaluation organizations support only `SLASH_23`.
     * 
     */
    @EnumType
    public enum InstancePeeringCidrRange {
        /**
         * Range not specified.
         * 
         */
        CidrRangeUnspecified("CIDR_RANGE_UNSPECIFIED"),
        /**
         * `/16` CIDR range.
         * 
         */
        Slash16("SLASH_16"),
        /**
         * `/17` CIDR range.
         * 
         */
        Slash17("SLASH_17"),
        /**
         * `/18` CIDR range.
         * 
         */
        Slash18("SLASH_18"),
        /**
         * `/19` CIDR range.
         * 
         */
        Slash19("SLASH_19"),
        /**
         * `/20` CIDR range.
         * 
         */
        Slash20("SLASH_20"),
        /**
         * `/22` CIDR range. Supported for evaluation only.
         * 
         */
        Slash22("SLASH_22"),
        /**
         * `/23` CIDR range. Supported for evaluation only.
         * 
         */
        Slash23("SLASH_23");

        private final String value;

        InstancePeeringCidrRange(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstancePeeringCidrRange[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }