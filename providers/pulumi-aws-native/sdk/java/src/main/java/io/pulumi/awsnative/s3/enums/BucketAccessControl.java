// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum BucketAccessControl {
        AuthenticatedRead("AuthenticatedRead"),
        AwsExecRead("AwsExecRead"),
        BucketOwnerFullControl("BucketOwnerFullControl"),
        BucketOwnerRead("BucketOwnerRead"),
        LogDeliveryWrite("LogDeliveryWrite"),
        Private("Private"),
        PublicRead("PublicRead"),
        PublicReadWrite("PublicReadWrite");

        private final String value;

        BucketAccessControl(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BucketAccessControl[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
