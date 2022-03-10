// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketMetricsStatus;
import io.pulumi.awsnative.s3.outputs.BucketReplicationTimeValue;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketMetrics {
    private final @Nullable BucketReplicationTimeValue eventThreshold;
    private final BucketMetricsStatus status;

    @OutputCustomType.Constructor
    private BucketMetrics(
        @OutputCustomType.Parameter("eventThreshold") @Nullable BucketReplicationTimeValue eventThreshold,
        @OutputCustomType.Parameter("status") BucketMetricsStatus status) {
        this.eventThreshold = eventThreshold;
        this.status = status;
    }

    public Optional<BucketReplicationTimeValue> getEventThreshold() {
        return Optional.ofNullable(this.eventThreshold);
    }
    public BucketMetricsStatus getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationTimeValue eventThreshold;
        private BucketMetricsStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventThreshold = defaults.eventThreshold;
    	      this.status = defaults.status;
        }

        public Builder setEventThreshold(@Nullable BucketReplicationTimeValue eventThreshold) {
            this.eventThreshold = eventThreshold;
            return this;
        }

        public Builder setStatus(BucketMetricsStatus status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public BucketMetrics build() {
            return new BucketMetrics(eventThreshold, status);
        }
    }
}
