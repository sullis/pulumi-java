// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Resiliency Policy Tier.
     * 
     */
    @EnumType
    public enum ResiliencyPolicyTier {
        MissionCritical("MissionCritical"),
        Critical("Critical"),
        Important("Important"),
        CoreServices("CoreServices"),
        NonCritical("NonCritical");

        private final String value;

        ResiliencyPolicyTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResiliencyPolicyTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }