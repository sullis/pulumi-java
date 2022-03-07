// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * lockbox configuration
     * 
     */
    @EnumType
    public enum State {
        Enabled("Enabled"),
        Disabled("Disabled"),
        NotConfigured("NotConfigured");

        private final String value;

        State(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "State[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }