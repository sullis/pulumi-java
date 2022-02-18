// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Configuration for Data Transfer Protection.
     * 
     */
    @EnumType
    public enum LocationHDFSQopConfigurationDataTransferProtection {
        Authentication("AUTHENTICATION"),
        Integrity("INTEGRITY"),
        Privacy("PRIVACY"),
        Disabled("DISABLED");

        private final String value;

        LocationHDFSQopConfigurationDataTransferProtection(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LocationHDFSQopConfigurationDataTransferProtection[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
