// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The multi cloud resource's cloud name.
     * 
     */
    @EnumType
    public enum CloudName {
        Azure("Azure"),
        AWS("AWS"),
        GCP("GCP");

        private final String value;

        CloudName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CloudName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }