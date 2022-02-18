// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum BucketInventoryConfigurationOptionalFieldsItem {
        Size("Size"),
        LastModifiedDate("LastModifiedDate"),
        StorageClass("StorageClass"),
        ETag("ETag"),
        IsMultipartUploaded("IsMultipartUploaded"),
        ReplicationStatus("ReplicationStatus"),
        EncryptionStatus("EncryptionStatus"),
        ObjectLockRetainUntilDate("ObjectLockRetainUntilDate"),
        ObjectLockMode("ObjectLockMode"),
        ObjectLockLegalHoldStatus("ObjectLockLegalHoldStatus"),
        IntelligentTieringAccessTier("IntelligentTieringAccessTier"),
        BucketKeyStatus("BucketKeyStatus");

        private final String value;

        BucketInventoryConfigurationOptionalFieldsItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BucketInventoryConfigurationOptionalFieldsItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
