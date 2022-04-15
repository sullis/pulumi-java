// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketFilterRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


/**
 * A container for object key name prefix and suffix filtering rules.
 * 
 */
public final class BucketS3KeyFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketS3KeyFilterArgs Empty = new BucketS3KeyFilterArgs();

    @Import(name="rules", required=true)
      private final Output<List<BucketFilterRuleArgs>> rules;

    public Output<List<BucketFilterRuleArgs>> rules() {
        return this.rules;
    }

    public BucketS3KeyFilterArgs(Output<List<BucketFilterRuleArgs>> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketS3KeyFilterArgs() {
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketS3KeyFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<BucketFilterRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketS3KeyFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(Output<List<BucketFilterRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(List<BucketFilterRuleArgs> rules) {
            this.rules = Output.of(Objects.requireNonNull(rules));
            return this;
        }
        public Builder rules(BucketFilterRuleArgs... rules) {
            return rules(List.of(rules));
        }        public BucketS3KeyFilterArgs build() {
            return new BucketS3KeyFilterArgs(rules);
        }
    }
}
