// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enumerates the possible values for the encoding format of capture description. Note: 'AvroDeflate' will be deprecated in New API Version
     * 
     */
    @EnumType
    public enum EncodingCaptureDescription {
        Avro("Avro"),
        AvroDeflate("AvroDeflate");

        private final String value;

        EncodingCaptureDescription(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EncodingCaptureDescription[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
