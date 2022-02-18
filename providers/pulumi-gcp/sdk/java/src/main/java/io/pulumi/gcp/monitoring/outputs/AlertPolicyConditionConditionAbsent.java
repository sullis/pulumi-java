// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionAbsentAggregation;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionAbsentTrigger;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AlertPolicyConditionConditionAbsent {
    /**
     * Specifies the alignment of data points in
     * individual time series as well as how to
     * combine the retrieved time series together
     * (such as when aggregating multiple streams
     * on each resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).
     * Multiple aggregations are applied in the
     * order specified.This field is similar to the
     * one in the MetricService.ListTimeSeries
     * request. It is advisable to use the
     * ListTimeSeries method when debugging this
     * field.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<AlertPolicyConditionConditionAbsentAggregation> aggregations;
    /**
     * The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    private final String duration;
    /**
     * A logs-based filter.
     * 
     */
    private final @Nullable String filter;
    /**
     * The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    private final @Nullable AlertPolicyConditionConditionAbsentTrigger trigger;

    @OutputCustomType.Constructor({"aggregations","duration","filter","trigger"})
    private AlertPolicyConditionConditionAbsent(
        @Nullable List<AlertPolicyConditionConditionAbsentAggregation> aggregations,
        String duration,
        @Nullable String filter,
        @Nullable AlertPolicyConditionConditionAbsentTrigger trigger) {
        this.aggregations = aggregations;
        this.duration = Objects.requireNonNull(duration);
        this.filter = filter;
        this.trigger = trigger;
    }

    /**
     * Specifies the alignment of data points in
     * individual time series as well as how to
     * combine the retrieved time series together
     * (such as when aggregating multiple streams
     * on each resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).
     * Multiple aggregations are applied in the
     * order specified.This field is similar to the
     * one in the MetricService.ListTimeSeries
     * request. It is advisable to use the
     * ListTimeSeries method when debugging this
     * field.
     * Structure is documented below.
     * 
     */
    public List<AlertPolicyConditionConditionAbsentAggregation> getAggregations() {
        return this.aggregations == null ? List.of() : this.aggregations;
    }
    /**
     * The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    public String getDuration() {
        return this.duration;
    }
    /**
     * A logs-based filter.
     * 
     */
    public Optional<String> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    public Optional<AlertPolicyConditionConditionAbsentTrigger> getTrigger() {
        return Optional.ofNullable(this.trigger);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionAbsent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AlertPolicyConditionConditionAbsentAggregation> aggregations;
        private String duration;
        private @Nullable String filter;
        private @Nullable AlertPolicyConditionConditionAbsentTrigger trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionAbsent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.duration = defaults.duration;
    	      this.filter = defaults.filter;
    	      this.trigger = defaults.trigger;
        }

        public Builder setAggregations(@Nullable List<AlertPolicyConditionConditionAbsentAggregation> aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder setTrigger(@Nullable AlertPolicyConditionConditionAbsentTrigger trigger) {
            this.trigger = trigger;
            return this;
        }

        public AlertPolicyConditionConditionAbsent build() {
            return new AlertPolicyConditionConditionAbsent(aggregations, duration, filter, trigger);
        }
    }
}
