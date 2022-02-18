// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    @EnumType
    public enum PolicyType {
        NotSpecified("NotSpecified"),
        BuiltIn("BuiltIn"),
        Custom("Custom"),
        Static("Static");

        private final String value;

        PolicyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PolicyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
