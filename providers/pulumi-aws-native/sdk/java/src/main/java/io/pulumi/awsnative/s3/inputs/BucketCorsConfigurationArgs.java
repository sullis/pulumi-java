// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketCorsRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class BucketCorsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketCorsConfigurationArgs Empty = new BucketCorsConfigurationArgs();

    @Import(name="corsRules", required=true)
      private final Output<List<BucketCorsRuleArgs>> corsRules;

    public Output<List<BucketCorsRuleArgs>> corsRules() {
        return this.corsRules;
    }

    public BucketCorsConfigurationArgs(Output<List<BucketCorsRuleArgs>> corsRules) {
        this.corsRules = Objects.requireNonNull(corsRules, "expected parameter 'corsRules' to be non-null");
    }

    private BucketCorsConfigurationArgs() {
        this.corsRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<BucketCorsRuleArgs>> corsRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsRules = defaults.corsRules;
        }

        public Builder corsRules(Output<List<BucketCorsRuleArgs>> corsRules) {
            this.corsRules = Objects.requireNonNull(corsRules);
            return this;
        }
        public Builder corsRules(List<BucketCorsRuleArgs> corsRules) {
            this.corsRules = Output.of(Objects.requireNonNull(corsRules));
            return this;
        }
        public Builder corsRules(BucketCorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }        public BucketCorsConfigurationArgs build() {
            return new BucketCorsConfigurationArgs(corsRules);
        }
    }
}
