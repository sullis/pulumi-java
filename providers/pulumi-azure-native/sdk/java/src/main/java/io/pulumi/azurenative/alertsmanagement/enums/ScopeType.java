// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * type of target scope
     * 
     */
    @EnumType
    public enum ScopeType {
        ResourceGroup("ResourceGroup"),
        Resource("Resource"),
        Subscription("Subscription");

        private final String value;

        ScopeType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ScopeType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
