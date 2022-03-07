// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The current state of the trusted identity provider feature for this Data Lake Store account.
     * 
     */
    @EnumType
    public enum TrustedIdProviderState {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        TrustedIdProviderState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TrustedIdProviderState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }