// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Name of Ssl predefined policy.
     * 
     */
    @EnumType
    public enum ApplicationGatewaySslPolicyName {
        AppGwSslPolicy20150501("AppGwSslPolicy20150501"),
        AppGwSslPolicy20170401("AppGwSslPolicy20170401"),
        AppGwSslPolicy20170401S("AppGwSslPolicy20170401S");

        private final String value;

        ApplicationGatewaySslPolicyName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ApplicationGatewaySslPolicyName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
