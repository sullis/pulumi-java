// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat {
        Uncompressed("UNCOMPRESSED"),
        Gzip("GZIP"),
        Zip("ZIP"),
        Snappy("Snappy"),
        HadoopSnappy("HADOOP_SNAPPY");

        private final String value;

        DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }