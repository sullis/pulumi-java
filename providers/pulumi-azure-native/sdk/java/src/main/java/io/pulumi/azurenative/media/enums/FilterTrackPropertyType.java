// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The track property type.
     * 
     */
    @EnumType
    public enum FilterTrackPropertyType {
        /**
         * The unknown track property type.
         * 
         */
        Unknown("Unknown"),
        /**
         * The type.
         * 
         */
        Type("Type"),
        /**
         * The name.
         * 
         */
        Name("Name"),
        /**
         * The language.
         * 
         */
        Language("Language"),
        /**
         * The fourCC.
         * 
         */
        FourCC("FourCC"),
        /**
         * The bitrate.
         * 
         */
        Bitrate("Bitrate");

        private final String value;

        FilterTrackPropertyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FilterTrackPropertyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }