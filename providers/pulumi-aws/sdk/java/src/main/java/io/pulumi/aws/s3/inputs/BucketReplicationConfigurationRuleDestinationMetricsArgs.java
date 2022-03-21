// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigurationRuleDestinationMetricsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleDestinationMetricsArgs Empty = new BucketReplicationConfigurationRuleDestinationMetricsArgs();

    /**
     * Threshold within which objects are to be replicated. The only valid value is `15`.
     * 
     */
    @Import(name="minutes")
      private final @Nullable Output<Integer> minutes;

    public Output<Integer> getMinutes() {
        return this.minutes == null ? Output.empty() : this.minutes;
    }

    /**
     * The status of replication metrics. Either `Enabled` or `Disabled`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public BucketReplicationConfigurationRuleDestinationMetricsArgs(
        @Nullable Output<Integer> minutes,
        @Nullable Output<String> status) {
        this.minutes = minutes;
        this.status = status;
    }

    private BucketReplicationConfigurationRuleDestinationMetricsArgs() {
        this.minutes = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleDestinationMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minutes;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleDestinationMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
    	      this.status = defaults.status;
        }

        public Builder minutes(@Nullable Output<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }
        public Builder minutes(@Nullable Integer minutes) {
            this.minutes = Output.ofNullable(minutes);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public BucketReplicationConfigurationRuleDestinationMetricsArgs build() {
            return new BucketReplicationConfigurationRuleDestinationMetricsArgs(minutes, status);
        }
    }
}
