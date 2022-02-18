// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Underlying RTSP transport. This can be used to enable or disable HTTP tunneling.
     * 
     */
    @EnumType
    public enum MediaGraphRtspTransport {
        /**
         * HTTP/HTTPS transport. This should be used when HTTP tunneling is desired.
         * 
         */
        Http("Http"),
        /**
         * TCP transport. This should be used when HTTP tunneling is not desired.
         * 
         */
        Tcp("Tcp");

        private final String value;

        MediaGraphRtspTransport(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MediaGraphRtspTransport[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
