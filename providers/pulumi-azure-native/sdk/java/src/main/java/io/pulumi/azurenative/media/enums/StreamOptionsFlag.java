// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum StreamOptionsFlag {
        /**
         * Live streaming with no special latency optimizations.
         * 
         */
        Default("Default"),
        /**
         * The live event provides lower end to end latency by reducing its internal buffers. This could result in more client buffering during playback if network bandwidth is low.
         * 
         */
        LowLatency("LowLatency");

        private final String value;

        StreamOptionsFlag(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StreamOptionsFlag[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
