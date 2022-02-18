// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The version of the output schema to use when exporting Amazon S3 Storage Lens metrics.
     * 
     */
    @EnumType
    public enum StorageLensS3BucketDestinationOutputSchemaVersion {
        V1("V_1");

        private final String value;

        StorageLensS3BucketDestinationOutputSchemaVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StorageLensS3BucketDestinationOutputSchemaVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
