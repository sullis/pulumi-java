// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The track property condition operation.
     * 
     */
    @EnumType
    public enum FilterTrackPropertyCompareOperation {
        /**
         * The equal operation.
         * 
         */
        Equal("Equal"),
        /**
         * The not equal operation.
         * 
         */
        NotEqual("NotEqual");

        private final String value;

        FilterTrackPropertyCompareOperation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FilterTrackPropertyCompareOperation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }