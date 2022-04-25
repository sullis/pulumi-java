// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.aws.msk.outputs.ClusterEncryptionInfoEncryptionInTransit;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterEncryptionInfo {
    /**
     * @return You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS (&#39;aws/msk&#39; managed service) key will be used for encrypting the data at rest.
     * 
     */
    private final @Nullable String encryptionAtRestKmsKeyArn;
    /**
     * @return Configuration block to specify encryption in transit. See below.
     * 
     */
    private final @Nullable ClusterEncryptionInfoEncryptionInTransit encryptionInTransit;

    @CustomType.Constructor
    private ClusterEncryptionInfo(
        @CustomType.Parameter("encryptionAtRestKmsKeyArn") @Nullable String encryptionAtRestKmsKeyArn,
        @CustomType.Parameter("encryptionInTransit") @Nullable ClusterEncryptionInfoEncryptionInTransit encryptionInTransit) {
        this.encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn;
        this.encryptionInTransit = encryptionInTransit;
    }

    /**
     * @return You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS (&#39;aws/msk&#39; managed service) key will be used for encrypting the data at rest.
     * 
     */
    public Optional<String> encryptionAtRestKmsKeyArn() {
        return Optional.ofNullable(this.encryptionAtRestKmsKeyArn);
    }
    /**
     * @return Configuration block to specify encryption in transit. See below.
     * 
     */
    public Optional<ClusterEncryptionInfoEncryptionInTransit> encryptionInTransit() {
        return Optional.ofNullable(this.encryptionInTransit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encryptionAtRestKmsKeyArn;
        private @Nullable ClusterEncryptionInfoEncryptionInTransit encryptionInTransit;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAtRestKmsKeyArn = defaults.encryptionAtRestKmsKeyArn;
    	      this.encryptionInTransit = defaults.encryptionInTransit;
        }

        public Builder encryptionAtRestKmsKeyArn(@Nullable String encryptionAtRestKmsKeyArn) {
            this.encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn;
            return this;
        }
        public Builder encryptionInTransit(@Nullable ClusterEncryptionInfoEncryptionInTransit encryptionInTransit) {
            this.encryptionInTransit = encryptionInTransit;
            return this;
        }        public ClusterEncryptionInfo build() {
            return new ClusterEncryptionInfo(encryptionAtRestKmsKeyArn, encryptionInTransit);
        }
    }
}
