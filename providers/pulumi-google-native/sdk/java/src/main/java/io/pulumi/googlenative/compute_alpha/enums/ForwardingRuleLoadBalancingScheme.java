// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the forwarding rule type. For more information about forwarding rules, refer to Forwarding rule concepts.
     * 
     */
    @EnumType
    public enum ForwardingRuleLoadBalancingScheme {
        External("EXTERNAL"),
        ExternalManaged("EXTERNAL_MANAGED"),
        Internal("INTERNAL"),
        InternalManaged("INTERNAL_MANAGED"),
        InternalSelfManaged("INTERNAL_SELF_MANAGED"),
        Invalid("INVALID");

        private final String value;

        ForwardingRuleLoadBalancingScheme(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ForwardingRuleLoadBalancingScheme[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }