// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketCorsRule;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class BucketCorsConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketCorsConfiguration Empty = new BucketCorsConfiguration();

    @InputImport(name="corsRules", required=true)
    private final List<BucketCorsRule> corsRules;

    public List<BucketCorsRule> getCorsRules() {
        return this.corsRules;
    }

    public BucketCorsConfiguration(List<BucketCorsRule> corsRules) {
        this.corsRules = Objects.requireNonNull(corsRules, "expected parameter 'corsRules' to be non-null");
    }

    private BucketCorsConfiguration() {
        this.corsRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketCorsRule> corsRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsRules = defaults.corsRules;
        }

        public Builder setCorsRules(List<BucketCorsRule> corsRules) {
            this.corsRules = Objects.requireNonNull(corsRules);
            return this;
        }

        public BucketCorsConfiguration build() {
            return new BucketCorsConfiguration(corsRules);
        }
    }
}
