// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.logging.inputs.MetricBucketOptionsExplicitBucketsGetArgs;
import io.pulumi.gcp.logging.inputs.MetricBucketOptionsExponentialBucketsGetArgs;
import io.pulumi.gcp.logging.inputs.MetricBucketOptionsLinearBucketsGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricBucketOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricBucketOptionsGetArgs Empty = new MetricBucketOptionsGetArgs();

    /**
     * Specifies a set of buckets with arbitrary widths.
     * Structure is documented below.
     * 
     */
    @InputImport(name="explicitBuckets")
      private final @Nullable Input<MetricBucketOptionsExplicitBucketsGetArgs> explicitBuckets;

    public Input<MetricBucketOptionsExplicitBucketsGetArgs> getExplicitBuckets() {
        return this.explicitBuckets == null ? Input.empty() : this.explicitBuckets;
    }

    /**
     * Specifies an exponential sequence of buckets that have a width that is proportional to the value of
     * the lower bound. Each bucket represents a constant relative uncertainty on a specific value in the bucket.
     * Structure is documented below.
     * 
     */
    @InputImport(name="exponentialBuckets")
      private final @Nullable Input<MetricBucketOptionsExponentialBucketsGetArgs> exponentialBuckets;

    public Input<MetricBucketOptionsExponentialBucketsGetArgs> getExponentialBuckets() {
        return this.exponentialBuckets == null ? Input.empty() : this.exponentialBuckets;
    }

    /**
     * Specifies a linear sequence of buckets that all have the same width (except overflow and underflow).
     * Each bucket represents a constant absolute uncertainty on the specific value in the bucket.
     * Structure is documented below.
     * 
     */
    @InputImport(name="linearBuckets")
      private final @Nullable Input<MetricBucketOptionsLinearBucketsGetArgs> linearBuckets;

    public Input<MetricBucketOptionsLinearBucketsGetArgs> getLinearBuckets() {
        return this.linearBuckets == null ? Input.empty() : this.linearBuckets;
    }

    public MetricBucketOptionsGetArgs(
        @Nullable Input<MetricBucketOptionsExplicitBucketsGetArgs> explicitBuckets,
        @Nullable Input<MetricBucketOptionsExponentialBucketsGetArgs> exponentialBuckets,
        @Nullable Input<MetricBucketOptionsLinearBucketsGetArgs> linearBuckets) {
        this.explicitBuckets = explicitBuckets;
        this.exponentialBuckets = exponentialBuckets;
        this.linearBuckets = linearBuckets;
    }

    private MetricBucketOptionsGetArgs() {
        this.explicitBuckets = Input.empty();
        this.exponentialBuckets = Input.empty();
        this.linearBuckets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MetricBucketOptionsExplicitBucketsGetArgs> explicitBuckets;
        private @Nullable Input<MetricBucketOptionsExponentialBucketsGetArgs> exponentialBuckets;
        private @Nullable Input<MetricBucketOptionsLinearBucketsGetArgs> linearBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.explicitBuckets = defaults.explicitBuckets;
    	      this.exponentialBuckets = defaults.exponentialBuckets;
    	      this.linearBuckets = defaults.linearBuckets;
        }

        public Builder setExplicitBuckets(@Nullable Input<MetricBucketOptionsExplicitBucketsGetArgs> explicitBuckets) {
            this.explicitBuckets = explicitBuckets;
            return this;
        }

        public Builder setExplicitBuckets(@Nullable MetricBucketOptionsExplicitBucketsGetArgs explicitBuckets) {
            this.explicitBuckets = Input.ofNullable(explicitBuckets);
            return this;
        }

        public Builder setExponentialBuckets(@Nullable Input<MetricBucketOptionsExponentialBucketsGetArgs> exponentialBuckets) {
            this.exponentialBuckets = exponentialBuckets;
            return this;
        }

        public Builder setExponentialBuckets(@Nullable MetricBucketOptionsExponentialBucketsGetArgs exponentialBuckets) {
            this.exponentialBuckets = Input.ofNullable(exponentialBuckets);
            return this;
        }

        public Builder setLinearBuckets(@Nullable Input<MetricBucketOptionsLinearBucketsGetArgs> linearBuckets) {
            this.linearBuckets = linearBuckets;
            return this;
        }

        public Builder setLinearBuckets(@Nullable MetricBucketOptionsLinearBucketsGetArgs linearBuckets) {
            this.linearBuckets = Input.ofNullable(linearBuckets);
            return this;
        }
        public MetricBucketOptionsGetArgs build() {
            return new MetricBucketOptionsGetArgs(explicitBuckets, exponentialBuckets, linearBuckets);
        }
    }
}