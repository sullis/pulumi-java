// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs Empty = new BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs();

    /**
     * Time in minutes. Valid values: `15`.
     * 
     */
    @Import(name="minutes", required=true)
      private final Output<Integer> minutes;

    public Output<Integer> minutes() {
        return this.minutes;
    }

    public BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs(Output<Integer> minutes) {
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
    }

    private BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs() {
        this.minutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
        }

        public Builder minutes(Output<Integer> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public Builder minutes(Integer minutes) {
            this.minutes = Output.of(Objects.requireNonNull(minutes));
            return this;
        }        public BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs build() {
            return new BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs(minutes);
        }
    }
}
