// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorLastObservedAtDateRangeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InsightFiltersThreatIntelIndicatorLastObservedAtArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersThreatIntelIndicatorLastObservedAtArgs Empty = new InsightFiltersThreatIntelIndicatorLastObservedAtArgs();

    /**
     * A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    @Import(name="dateRange")
      private final @Nullable Output<InsightFiltersThreatIntelIndicatorLastObservedAtDateRangeArgs> dateRange;

    public Output<InsightFiltersThreatIntelIndicatorLastObservedAtDateRangeArgs> getDateRange() {
        return this.dateRange == null ? Output.empty() : this.dateRange;
    }

    /**
     * An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    @Import(name="end")
      private final @Nullable Output<String> end;

    public Output<String> getEnd() {
        return this.end == null ? Output.empty() : this.end;
    }

    /**
     * A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    @Import(name="start")
      private final @Nullable Output<String> start;

    public Output<String> getStart() {
        return this.start == null ? Output.empty() : this.start;
    }

    public InsightFiltersThreatIntelIndicatorLastObservedAtArgs(
        @Nullable Output<InsightFiltersThreatIntelIndicatorLastObservedAtDateRangeArgs> dateRange,
        @Nullable Output<String> end,
        @Nullable Output<String> start) {
        this.dateRange = dateRange;
        this.end = end;
        this.start = start;
    }

    private InsightFiltersThreatIntelIndicatorLastObservedAtArgs() {
        this.dateRange = Output.empty();
        this.end = Output.empty();
        this.start = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersThreatIntelIndicatorLastObservedAtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InsightFiltersThreatIntelIndicatorLastObservedAtDateRangeArgs> dateRange;
        private @Nullable Output<String> end;
        private @Nullable Output<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersThreatIntelIndicatorLastObservedAtArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateRange = defaults.dateRange;
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder dateRange(@Nullable Output<InsightFiltersThreatIntelIndicatorLastObservedAtDateRangeArgs> dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public Builder dateRange(@Nullable InsightFiltersThreatIntelIndicatorLastObservedAtDateRangeArgs dateRange) {
            this.dateRange = Output.ofNullable(dateRange);
            return this;
        }
        public Builder end(@Nullable Output<String> end) {
            this.end = end;
            return this;
        }
        public Builder end(@Nullable String end) {
            this.end = Output.ofNullable(end);
            return this;
        }
        public Builder start(@Nullable Output<String> start) {
            this.start = start;
            return this;
        }
        public Builder start(@Nullable String start) {
            this.start = Output.ofNullable(start);
            return this;
        }        public InsightFiltersThreatIntelIndicatorLastObservedAtArgs build() {
            return new InsightFiltersThreatIntelIndicatorLastObservedAtArgs(dateRange, end, start);
        }
    }
}
