// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowEncryptionAlgorithm;
import io.pulumi.awsnative.mediaconnect.enums.FlowEncryptionKeyType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the encryption of the flow.
 * 
 */
public final class FlowEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowEncryptionArgs Empty = new FlowEncryptionArgs();

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    @Import(name="algorithm")
      private final @Nullable Output<FlowEncryptionAlgorithm> algorithm;

    public Output<FlowEncryptionAlgorithm> algorithm() {
        return this.algorithm == null ? Codegen.empty() : this.algorithm;
    }

    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
     * 
     */
    @Import(name="constantInitializationVector")
      private final @Nullable Output<String> constantInitializationVector;

    public Output<String> constantInitializationVector() {
        return this.constantInitializationVector == null ? Codegen.empty() : this.constantInitializationVector;
    }

    /**
     * The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @Import(name="deviceId")
      private final @Nullable Output<String> deviceId;

    public Output<String> deviceId() {
        return this.deviceId == null ? Codegen.empty() : this.deviceId;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    @Import(name="keyType")
      private final @Nullable Output<FlowEncryptionKeyType> keyType;

    public Output<FlowEncryptionKeyType> keyType() {
        return this.keyType == null ? Codegen.empty() : this.keyType;
    }

    /**
     * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     *  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    @Import(name="secretArn")
      private final @Nullable Output<String> secretArn;

    public Output<String> secretArn() {
        return this.secretArn == null ? Codegen.empty() : this.secretArn;
    }

    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public FlowEncryptionArgs(
        @Nullable Output<FlowEncryptionAlgorithm> algorithm,
        @Nullable Output<String> constantInitializationVector,
        @Nullable Output<String> deviceId,
        @Nullable Output<FlowEncryptionKeyType> keyType,
        @Nullable Output<String> region,
        @Nullable Output<String> resourceId,
        Output<String> roleArn,
        @Nullable Output<String> secretArn,
        @Nullable Output<String> url) {
        this.algorithm = algorithm;
        this.constantInitializationVector = constantInitializationVector;
        this.deviceId = deviceId;
        this.keyType = keyType;
        this.region = region;
        this.resourceId = resourceId;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.secretArn = secretArn;
        this.url = url;
    }

    private FlowEncryptionArgs() {
        this.algorithm = Codegen.empty();
        this.constantInitializationVector = Codegen.empty();
        this.deviceId = Codegen.empty();
        this.keyType = Codegen.empty();
        this.region = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.secretArn = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowEncryptionAlgorithm> algorithm;
        private @Nullable Output<String> constantInitializationVector;
        private @Nullable Output<String> deviceId;
        private @Nullable Output<FlowEncryptionKeyType> keyType;
        private @Nullable Output<String> region;
        private @Nullable Output<String> resourceId;
        private Output<String> roleArn;
        private @Nullable Output<String> secretArn;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEncryptionArgs defaults) {
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

        public Builder algorithm(@Nullable Output<FlowEncryptionAlgorithm> algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Builder algorithm(@Nullable FlowEncryptionAlgorithm algorithm) {
            this.algorithm = Codegen.ofNullable(algorithm);
            return this;
        }
        public Builder constantInitializationVector(@Nullable Output<String> constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }
        public Builder constantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = Codegen.ofNullable(constantInitializationVector);
            return this;
        }
        public Builder deviceId(@Nullable Output<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public Builder deviceId(@Nullable String deviceId) {
            this.deviceId = Codegen.ofNullable(deviceId);
            return this;
        }
        public Builder keyType(@Nullable Output<FlowEncryptionKeyType> keyType) {
            this.keyType = keyType;
            return this;
        }
        public Builder keyType(@Nullable FlowEncryptionKeyType keyType) {
            this.keyType = Codegen.ofNullable(keyType);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder secretArn(@Nullable Output<String> secretArn) {
            this.secretArn = secretArn;
            return this;
        }
        public Builder secretArn(@Nullable String secretArn) {
            this.secretArn = Codegen.ofNullable(secretArn);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public FlowEncryptionArgs build() {
            return new FlowEncryptionArgs(algorithm, constantInitializationVector, deviceId, keyType, region, resourceId, roleArn, secretArn, url);
        }
    }
}
