// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The service level of the file system
     * 
     */
    @EnumType
    public enum ServiceLevel {
        /**
         * Standard service level
         * 
         */
        Standard("Standard"),
        /**
         * Premium service level
         * 
         */
        Premium("Premium"),
        /**
         * Ultra service level
         * 
         */
        Ultra("Ultra");

        private final String value;

        ServiceLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }