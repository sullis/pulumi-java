// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.inputs;

import io.pulumi.awsnative.s3outposts.inputs.BucketRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class BucketLifecycleConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleConfigurationArgs Empty = new BucketLifecycleConfigurationArgs();

    /**
     * A list of lifecycle rules for individual objects in an Amazon S3Outposts bucket.
     * 
     */
    @InputImport(name="rules", required=true)
    private final Input<List<BucketRuleArgs>> rules;

    public Input<List<BucketRuleArgs>> getRules() {
        return this.rules;
    }

    public BucketLifecycleConfigurationArgs(Input<List<BucketRuleArgs>> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketLifecycleConfigurationArgs() {
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<BucketRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(Input<List<BucketRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<BucketRuleArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }

        public BucketLifecycleConfigurationArgs build() {
            return new BucketLifecycleConfigurationArgs(rules);
        }
    }
}
