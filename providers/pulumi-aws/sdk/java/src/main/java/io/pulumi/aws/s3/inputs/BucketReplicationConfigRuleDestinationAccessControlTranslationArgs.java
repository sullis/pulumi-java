// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigRuleDestinationAccessControlTranslationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationAccessControlTranslationArgs Empty = new BucketReplicationConfigRuleDestinationAccessControlTranslationArgs();

    /**
     * Specifies the replica ownership. For default and valid values, see [PUT bucket replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html) in the Amazon S3 API Reference. Valid values: `Destination`.
     * 
     */
    @Import(name="owner", required=true)
      private final Output<String> owner;

    public Output<String> owner() {
        return this.owner;
    }

    public BucketReplicationConfigRuleDestinationAccessControlTranslationArgs(Output<String> owner) {
        this.owner = Objects.requireNonNull(owner, "expected parameter 'owner' to be non-null");
    }

    private BucketReplicationConfigRuleDestinationAccessControlTranslationArgs() {
        this.owner = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationAccessControlTranslationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> owner;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationAccessControlTranslationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.owner = defaults.owner;
        }

        public Builder owner(Output<String> owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder owner(String owner) {
            this.owner = Output.of(Objects.requireNonNull(owner));
            return this;
        }        public BucketReplicationConfigRuleDestinationAccessControlTranslationArgs build() {
            return new BucketReplicationConfigRuleDestinationAccessControlTranslationArgs(owner);
        }
    }
}
