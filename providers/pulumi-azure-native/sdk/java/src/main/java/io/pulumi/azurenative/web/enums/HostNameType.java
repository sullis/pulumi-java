// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Hostname type.
     * 
     */
    @EnumType
    public enum HostNameType {
        Verified("Verified"),
        Managed("Managed");

        private final String value;

        HostNameType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "HostNameType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
