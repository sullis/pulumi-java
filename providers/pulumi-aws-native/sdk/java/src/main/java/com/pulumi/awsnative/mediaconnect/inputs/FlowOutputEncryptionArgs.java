// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediaconnect.inputs;

import com.pulumi.awsnative.mediaconnect.enums.FlowOutputEncryptionAlgorithm;
import com.pulumi.awsnative.mediaconnect.enums.FlowOutputEncryptionKeyType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the encryption of the flow.
 * 
 */
public final class FlowOutputEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowOutputEncryptionArgs Empty = new FlowOutputEncryptionArgs();

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<FlowOutputEncryptionAlgorithm> algorithm;

    /**
     * @return The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    public Optional<Output<FlowOutputEncryptionAlgorithm>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    @Import(name="keyType")
    private @Nullable Output<FlowOutputEncryptionKeyType> keyType;

    /**
     * @return The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    public Optional<Output<FlowOutputEncryptionKeyType>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     *  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    @Import(name="secretArn", required=true)
    private Output<String> secretArn;

    /**
     * @return  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    public Output<String> secretArn() {
        return this.secretArn;
    }

    private FlowOutputEncryptionArgs() {}

    private FlowOutputEncryptionArgs(FlowOutputEncryptionArgs $) {
        this.algorithm = $.algorithm;
        this.keyType = $.keyType;
        this.roleArn = $.roleArn;
        this.secretArn = $.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowOutputEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowOutputEncryptionArgs $;

        public Builder() {
            $ = new FlowOutputEncryptionArgs();
        }

        public Builder(FlowOutputEncryptionArgs defaults) {
            $ = new FlowOutputEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable Output<FlowOutputEncryptionAlgorithm> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
         * 
         * @return builder
         * 
         */
        public Builder algorithm(FlowOutputEncryptionAlgorithm algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param keyType The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
         * 
         * @return builder
         * 
         */
        public Builder keyType(@Nullable Output<FlowOutputEncryptionKeyType> keyType) {
            $.keyType = keyType;
            return this;
        }

        /**
         * @param keyType The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
         * 
         * @return builder
         * 
         */
        public Builder keyType(FlowOutputEncryptionKeyType keyType) {
            return keyType(Output.of(keyType));
        }

        /**
         * @param roleArn The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param secretArn  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(Output<String> secretArn) {
            $.secretArn = secretArn;
            return this;
        }

        /**
         * @param secretArn  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(String secretArn) {
            return secretArn(Output.of(secretArn));
        }

        public FlowOutputEncryptionArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.secretArn = Objects.requireNonNull($.secretArn, "expected parameter 'secretArn' to be non-null");
            return $;
        }
    }

}
