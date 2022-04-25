// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceFleetOutputConfig {
    /**
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume after compilation job. If you don&#39;t provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role&#39;s account.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * @return The Amazon Simple Storage (S3) bucker URI.
     * 
     */
    private final String s3OutputLocation;

    @CustomType.Constructor
    private DeviceFleetOutputConfig(
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("s3OutputLocation") String s3OutputLocation) {
        this.kmsKeyId = kmsKeyId;
        this.s3OutputLocation = s3OutputLocation;
    }

    /**
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume after compilation job. If you don&#39;t provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role&#39;s account.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return The Amazon Simple Storage (S3) bucker URI.
     * 
     */
    public String s3OutputLocation() {
        return this.s3OutputLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceFleetOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private String s3OutputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceFleetOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3OutputLocation = defaults.s3OutputLocation;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder s3OutputLocation(String s3OutputLocation) {
            this.s3OutputLocation = Objects.requireNonNull(s3OutputLocation);
            return this;
        }        public DeviceFleetOutputConfig build() {
            return new DeviceFleetOutputConfig(kmsKeyId, s3OutputLocation);
        }
    }
}
