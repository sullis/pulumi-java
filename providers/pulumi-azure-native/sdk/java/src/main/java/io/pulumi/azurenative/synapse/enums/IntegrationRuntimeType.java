// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of integration runtime.
     * 
     */
    @EnumType
    public enum IntegrationRuntimeType {
        Managed("Managed"),
        SelfHosted("SelfHosted");

        private final String value;

        IntegrationRuntimeType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IntegrationRuntimeType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
