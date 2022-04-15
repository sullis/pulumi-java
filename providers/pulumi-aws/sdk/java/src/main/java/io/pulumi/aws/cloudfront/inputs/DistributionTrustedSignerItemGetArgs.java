// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionTrustedSignerItemGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionTrustedSignerItemGetArgs Empty = new DistributionTrustedSignerItemGetArgs();

    /**
     * AWS account ID or `self`
     * 
     */
    @Import(name="awsAccountNumber")
      private final @Nullable Output<String> awsAccountNumber;

    public Output<String> awsAccountNumber() {
        return this.awsAccountNumber == null ? Codegen.empty() : this.awsAccountNumber;
    }

    /**
     * Set of active CloudFront key pairs associated with the signer account
     * 
     */
    @Import(name="keyPairIds")
      private final @Nullable Output<List<String>> keyPairIds;

    public Output<List<String>> keyPairIds() {
        return this.keyPairIds == null ? Codegen.empty() : this.keyPairIds;
    }

    public DistributionTrustedSignerItemGetArgs(
        @Nullable Output<String> awsAccountNumber,
        @Nullable Output<List<String>> keyPairIds) {
        this.awsAccountNumber = awsAccountNumber;
        this.keyPairIds = keyPairIds;
    }

    private DistributionTrustedSignerItemGetArgs() {
        this.awsAccountNumber = Codegen.empty();
        this.keyPairIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionTrustedSignerItemGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> awsAccountNumber;
        private @Nullable Output<List<String>> keyPairIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionTrustedSignerItemGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountNumber = defaults.awsAccountNumber;
    	      this.keyPairIds = defaults.keyPairIds;
        }

        public Builder awsAccountNumber(@Nullable Output<String> awsAccountNumber) {
            this.awsAccountNumber = awsAccountNumber;
            return this;
        }
        public Builder awsAccountNumber(@Nullable String awsAccountNumber) {
            this.awsAccountNumber = Codegen.ofNullable(awsAccountNumber);
            return this;
        }
        public Builder keyPairIds(@Nullable Output<List<String>> keyPairIds) {
            this.keyPairIds = keyPairIds;
            return this;
        }
        public Builder keyPairIds(@Nullable List<String> keyPairIds) {
            this.keyPairIds = Codegen.ofNullable(keyPairIds);
            return this;
        }
        public Builder keyPairIds(String... keyPairIds) {
            return keyPairIds(List.of(keyPairIds));
        }        public DistributionTrustedSignerItemGetArgs build() {
            return new DistributionTrustedSignerItemGetArgs(awsAccountNumber, keyPairIds);
        }
    }
}
