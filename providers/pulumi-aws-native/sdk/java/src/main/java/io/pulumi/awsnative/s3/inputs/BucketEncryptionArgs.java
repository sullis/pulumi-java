// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketServerSideEncryptionRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Specifies default encryption for a bucket using server-side encryption with either Amazon S3-managed keys (SSE-S3) or AWS KMS-managed keys (SSE-KMS).
 * 
 */
public final class BucketEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketEncryptionArgs Empty = new BucketEncryptionArgs();

    /**
     * Specifies the default server-side-encryption configuration.
     * 
     */
    @InputImport(name="serverSideEncryptionConfiguration", required=true)
    private final Input<List<BucketServerSideEncryptionRuleArgs>> serverSideEncryptionConfiguration;

    public Input<List<BucketServerSideEncryptionRuleArgs>> getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    public BucketEncryptionArgs(Input<List<BucketServerSideEncryptionRuleArgs>> serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = Objects.requireNonNull(serverSideEncryptionConfiguration, "expected parameter 'serverSideEncryptionConfiguration' to be non-null");
    }

    private BucketEncryptionArgs() {
        this.serverSideEncryptionConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<BucketServerSideEncryptionRuleArgs>> serverSideEncryptionConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverSideEncryptionConfiguration = defaults.serverSideEncryptionConfiguration;
        }

        public Builder setServerSideEncryptionConfiguration(Input<List<BucketServerSideEncryptionRuleArgs>> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = Objects.requireNonNull(serverSideEncryptionConfiguration);
            return this;
        }

        public Builder setServerSideEncryptionConfiguration(List<BucketServerSideEncryptionRuleArgs> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = Input.of(Objects.requireNonNull(serverSideEncryptionConfiguration));
            return this;
        }

        public BucketEncryptionArgs build() {
            return new BucketEncryptionArgs(serverSideEncryptionConfiguration);
        }
    }
}
