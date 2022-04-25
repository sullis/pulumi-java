// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediaconnect.outputs;

import com.pulumi.awsnative.mediaconnect.enums.FlowSourceEncryptionAlgorithm;
import com.pulumi.awsnative.mediaconnect.enums.FlowSourceEncryptionKeyType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSourceEncryption {
    /**
     * @return The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    private final FlowSourceEncryptionAlgorithm algorithm;
    /**
     * @return A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
     * 
     */
    private final @Nullable String constantInitializationVector;
    /**
     * @return The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    private final @Nullable String deviceId;
    /**
     * @return The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    private final @Nullable FlowSourceEncryptionKeyType keyType;
    /**
     * @return The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    private final @Nullable String region;
    /**
     * @return An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * @return The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    private final String roleArn;
    /**
     * @return  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    private final @Nullable String secretArn;
    /**
     * @return The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private FlowSourceEncryption(
        @CustomType.Parameter("algorithm") FlowSourceEncryptionAlgorithm algorithm,
        @CustomType.Parameter("constantInitializationVector") @Nullable String constantInitializationVector,
        @CustomType.Parameter("deviceId") @Nullable String deviceId,
        @CustomType.Parameter("keyType") @Nullable FlowSourceEncryptionKeyType keyType,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("secretArn") @Nullable String secretArn,
        @CustomType.Parameter("url") @Nullable String url) {
        this.algorithm = algorithm;
        this.constantInitializationVector = constantInitializationVector;
        this.deviceId = deviceId;
        this.keyType = keyType;
        this.region = region;
        this.resourceId = resourceId;
        this.roleArn = roleArn;
        this.secretArn = secretArn;
        this.url = url;
    }

    /**
     * @return The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    public FlowSourceEncryptionAlgorithm algorithm() {
        return this.algorithm;
    }
    /**
     * @return A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
     * 
     */
    public Optional<String> constantInitializationVector() {
        return Optional.ofNullable(this.constantInitializationVector);
    }
    /**
     * @return The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    public Optional<String> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }
    /**
     * @return The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    public Optional<FlowSourceEncryptionKeyType> keyType() {
        return Optional.ofNullable(this.keyType);
    }
    /**
     * @return The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    public Optional<String> secretArn() {
        return Optional.ofNullable(this.secretArn);
    }
    /**
     * @return The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSourceEncryptionAlgorithm algorithm;
        private @Nullable String constantInitializationVector;
        private @Nullable String deviceId;
        private @Nullable FlowSourceEncryptionKeyType keyType;
        private @Nullable String region;
        private @Nullable String resourceId;
        private String roleArn;
        private @Nullable String secretArn;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.constantInitializationVector = defaults.constantInitializationVector;
    	      this.deviceId = defaults.deviceId;
    	      this.keyType = defaults.keyType;
    	      this.region = defaults.region;
    	      this.resourceId = defaults.resourceId;
    	      this.roleArn = defaults.roleArn;
    	      this.secretArn = defaults.secretArn;
    	      this.url = defaults.url;
        }

        public Builder algorithm(FlowSourceEncryptionAlgorithm algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder constantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }
        public Builder deviceId(@Nullable String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public Builder keyType(@Nullable FlowSourceEncryptionKeyType keyType) {
            this.keyType = keyType;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder secretArn(@Nullable String secretArn) {
            this.secretArn = secretArn;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public FlowSourceEncryption build() {
            return new FlowSourceEncryption(algorithm, constantInitializationVector, deviceId, keyType, region, resourceId, roleArn, secretArn, url);
        }
    }
}
