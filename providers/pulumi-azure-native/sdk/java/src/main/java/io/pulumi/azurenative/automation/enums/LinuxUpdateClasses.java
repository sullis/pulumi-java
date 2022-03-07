// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Update classifications included in the software update configuration.
     * 
     */
    @EnumType
    public enum LinuxUpdateClasses {
        Unclassified("Unclassified"),
        Critical("Critical"),
        Security("Security"),
        Other("Other");

        private final String value;

        LinuxUpdateClasses(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LinuxUpdateClasses[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }