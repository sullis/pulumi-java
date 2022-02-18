// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.StorageLensActivityMetricsArgs;
import io.pulumi.awsnative.s3.inputs.StorageLensBucketLevelArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Account-level metrics configurations.
 * 
 */
public final class StorageLensAccountLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensAccountLevelArgs Empty = new StorageLensAccountLevelArgs();

    @InputImport(name="activityMetrics")
    private final @Nullable Input<StorageLensActivityMetricsArgs> activityMetrics;

    public Input<StorageLensActivityMetricsArgs> getActivityMetrics() {
        return this.activityMetrics == null ? Input.empty() : this.activityMetrics;
    }

    @InputImport(name="bucketLevel", required=true)
    private final Input<StorageLensBucketLevelArgs> bucketLevel;

    public Input<StorageLensBucketLevelArgs> getBucketLevel() {
        return this.bucketLevel;
    }

    public StorageLensAccountLevelArgs(
        @Nullable Input<StorageLensActivityMetricsArgs> activityMetrics,
        Input<StorageLensBucketLevelArgs> bucketLevel) {
        this.activityMetrics = activityMetrics;
        this.bucketLevel = Objects.requireNonNull(bucketLevel, "expected parameter 'bucketLevel' to be non-null");
    }

    private StorageLensAccountLevelArgs() {
        this.activityMetrics = Input.empty();
        this.bucketLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensAccountLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StorageLensActivityMetricsArgs> activityMetrics;
        private Input<StorageLensBucketLevelArgs> bucketLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensAccountLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activityMetrics = defaults.activityMetrics;
    	      this.bucketLevel = defaults.bucketLevel;
        }

        public Builder setActivityMetrics(@Nullable Input<StorageLensActivityMetricsArgs> activityMetrics) {
            this.activityMetrics = activityMetrics;
            return this;
        }

        public Builder setActivityMetrics(@Nullable StorageLensActivityMetricsArgs activityMetrics) {
            this.activityMetrics = Input.ofNullable(activityMetrics);
            return this;
        }

        public Builder setBucketLevel(Input<StorageLensBucketLevelArgs> bucketLevel) {
            this.bucketLevel = Objects.requireNonNull(bucketLevel);
            return this;
        }

        public Builder setBucketLevel(StorageLensBucketLevelArgs bucketLevel) {
            this.bucketLevel = Input.of(Objects.requireNonNull(bucketLevel));
            return this;
        }

        public StorageLensAccountLevelArgs build() {
            return new StorageLensAccountLevelArgs(activityMetrics, bucketLevel);
        }
    }
}
