// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The field parity for de-interlacing, defaults to Auto.
     * 
     */
    @EnumType
    public enum DeinterlaceParity {
        /**
         * Automatically detect the order of fields
         * 
         */
        Auto("Auto"),
        /**
         * Apply top field first processing of input video.
         * 
         */
        TopFieldFirst("TopFieldFirst"),
        /**
         * Apply bottom field first processing of input video.
         * 
         */
        BottomFieldFirst("BottomFieldFirst");

        private final String value;

        DeinterlaceParity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DeinterlaceParity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }