// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties {
    private final String bucketName;
    private final String encryptionOption;
    private final @Nullable String kmsKeyId;
    private final @Nullable String objectKeyPrefix;

    @OutputCustomType.Constructor({"bucketName","encryptionOption","kmsKeyId","objectKeyPrefix"})
    private MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties(
        String bucketName,
        String encryptionOption,
        @Nullable String kmsKeyId,
        @Nullable String objectKeyPrefix) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.encryptionOption = Objects.requireNonNull(encryptionOption);
        this.kmsKeyId = kmsKeyId;
        this.objectKeyPrefix = objectKeyPrefix;
    }

    public String getBucketName() {
        return this.bucketName;
    }
    public String getEncryptionOption() {
        return this.encryptionOption;
    }
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    public Optional<String> getObjectKeyPrefix() {
        return Optional.ofNullable(this.objectKeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private String encryptionOption;
        private @Nullable String kmsKeyId;
        private @Nullable String objectKeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.encryptionOption = defaults.encryptionOption;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.objectKeyPrefix = defaults.objectKeyPrefix;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setEncryptionOption(String encryptionOption) {
            this.encryptionOption = Objects.requireNonNull(encryptionOption);
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setObjectKeyPrefix(@Nullable String objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }

        public MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties build() {
            return new MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties(bucketName, encryptionOption, kmsKeyId, objectKeyPrefix);
        }
    }
}
