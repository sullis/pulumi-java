// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketServerSideEncryptionRule;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class BucketEncryption extends io.pulumi.resources.InvokeArgs {

    public static final BucketEncryption Empty = new BucketEncryption();

    @InputImport(name="serverSideEncryptionConfiguration", required=true)
    private final List<BucketServerSideEncryptionRule> serverSideEncryptionConfiguration;

    public List<BucketServerSideEncryptionRule> getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    public BucketEncryption(List<BucketServerSideEncryptionRule> serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = Objects.requireNonNull(serverSideEncryptionConfiguration, "expected parameter 'serverSideEncryptionConfiguration' to be non-null");
    }

    private BucketEncryption() {
        this.serverSideEncryptionConfiguration = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketServerSideEncryptionRule> serverSideEncryptionConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverSideEncryptionConfiguration = defaults.serverSideEncryptionConfiguration;
        }

        public Builder setServerSideEncryptionConfiguration(List<BucketServerSideEncryptionRule> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = Objects.requireNonNull(serverSideEncryptionConfiguration);
            return this;
        }

        public BucketEncryption build() {
            return new BucketEncryption(serverSideEncryptionConfiguration);
        }
    }
}
