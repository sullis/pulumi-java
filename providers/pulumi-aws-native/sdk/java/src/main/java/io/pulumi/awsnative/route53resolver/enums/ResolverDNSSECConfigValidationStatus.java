// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * ResolverDNSSECValidationStatus, possible values are ENABLING, ENABLED, DISABLING AND DISABLED.
     * 
     */
    @EnumType
    public enum ResolverDNSSECConfigValidationStatus {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        Disabled("DISABLED");

        private final String value;

        ResolverDNSSECConfigValidationStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResolverDNSSECConfigValidationStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }