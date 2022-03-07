// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [TrustedTester] [Required] Defines the ranges for range partitioning.
 * 
 */
public final class RangePartitioningRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RangePartitioningRangeArgs Empty = new RangePartitioningRangeArgs();

    /**
     * [TrustedTester] [Required] The end of range partitioning, exclusive.
     * 
     */
    @InputImport(name="end")
      private final @Nullable Input<String> end;

    public Input<String> getEnd() {
        return this.end == null ? Input.empty() : this.end;
    }

    /**
     * [TrustedTester] [Required] The width of each interval.
     * 
     */
    @InputImport(name="interval")
      private final @Nullable Input<String> interval;

    public Input<String> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    /**
     * [TrustedTester] [Required] The start of range partitioning, inclusive.
     * 
     */
    @InputImport(name="start")
      private final @Nullable Input<String> start;

    public Input<String> getStart() {
        return this.start == null ? Input.empty() : this.start;
    }

    public RangePartitioningRangeArgs(
        @Nullable Input<String> end,
        @Nullable Input<String> interval,
        @Nullable Input<String> start) {
        this.end = end;
        this.interval = interval;
        this.start = start;
    }

    private RangePartitioningRangeArgs() {
        this.end = Input.empty();
        this.interval = Input.empty();
        this.start = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RangePartitioningRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> end;
        private @Nullable Input<String> interval;
        private @Nullable Input<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(RangePartitioningRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.interval = defaults.interval;
    	      this.start = defaults.start;
        }

        public Builder setEnd(@Nullable Input<String> end) {
            this.end = end;
            return this;
        }

        public Builder setEnd(@Nullable String end) {
            this.end = Input.ofNullable(end);
            return this;
        }

        public Builder setInterval(@Nullable Input<String> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable String interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setStart(@Nullable Input<String> start) {
            this.start = start;
            return this;
        }

        public Builder setStart(@Nullable String start) {
            this.start = Input.ofNullable(start);
            return this;
        }
        public RangePartitioningRangeArgs build() {
            return new RangePartitioningRangeArgs(end, interval, start);
        }
    }
}