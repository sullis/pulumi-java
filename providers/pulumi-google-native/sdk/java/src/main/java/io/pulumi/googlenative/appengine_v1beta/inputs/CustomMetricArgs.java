// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Allows autoscaling based on Stackdriver metrics.
 * 
 */
public final class CustomMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomMetricArgs Empty = new CustomMetricArgs();

    /**
     * Allows filtering on the metric's fields.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The name of the metric.
     * 
     */
    @InputImport(name="metricName")
      private final @Nullable Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName == null ? Input.empty() : this.metricName;
    }

    /**
     * May be used instead of target_utilization when an instance can handle a specific amount of work/resources and the metric value is equal to the current amount of work remaining. The autoscaler will try to keep the number of instances equal to the metric value divided by single_instance_assignment.
     * 
     */
    @InputImport(name="singleInstanceAssignment")
      private final @Nullable Input<Double> singleInstanceAssignment;

    public Input<Double> getSingleInstanceAssignment() {
        return this.singleInstanceAssignment == null ? Input.empty() : this.singleInstanceAssignment;
    }

    /**
     * The type of the metric. Must be a string representing a Stackdriver metric type e.g. GAGUE, DELTA_PER_SECOND, etc.
     * 
     */
    @InputImport(name="targetType")
      private final @Nullable Input<String> targetType;

    public Input<String> getTargetType() {
        return this.targetType == null ? Input.empty() : this.targetType;
    }

    /**
     * The target value for the metric.
     * 
     */
    @InputImport(name="targetUtilization")
      private final @Nullable Input<Double> targetUtilization;

    public Input<Double> getTargetUtilization() {
        return this.targetUtilization == null ? Input.empty() : this.targetUtilization;
    }

    public CustomMetricArgs(
        @Nullable Input<String> filter,
        @Nullable Input<String> metricName,
        @Nullable Input<Double> singleInstanceAssignment,
        @Nullable Input<String> targetType,
        @Nullable Input<Double> targetUtilization) {
        this.filter = filter;
        this.metricName = metricName;
        this.singleInstanceAssignment = singleInstanceAssignment;
        this.targetType = targetType;
        this.targetUtilization = targetUtilization;
    }

    private CustomMetricArgs() {
        this.filter = Input.empty();
        this.metricName = Input.empty();
        this.singleInstanceAssignment = Input.empty();
        this.targetType = Input.empty();
        this.targetUtilization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> filter;
        private @Nullable Input<String> metricName;
        private @Nullable Input<Double> singleInstanceAssignment;
        private @Nullable Input<String> targetType;
        private @Nullable Input<Double> targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.metricName = defaults.metricName;
    	      this.singleInstanceAssignment = defaults.singleInstanceAssignment;
    	      this.targetType = defaults.targetType;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder setFilter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setMetricName(@Nullable Input<String> metricName) {
            this.metricName = metricName;
            return this;
        }

        public Builder setMetricName(@Nullable String metricName) {
            this.metricName = Input.ofNullable(metricName);
            return this;
        }

        public Builder setSingleInstanceAssignment(@Nullable Input<Double> singleInstanceAssignment) {
            this.singleInstanceAssignment = singleInstanceAssignment;
            return this;
        }

        public Builder setSingleInstanceAssignment(@Nullable Double singleInstanceAssignment) {
            this.singleInstanceAssignment = Input.ofNullable(singleInstanceAssignment);
            return this;
        }

        public Builder setTargetType(@Nullable Input<String> targetType) {
            this.targetType = targetType;
            return this;
        }

        public Builder setTargetType(@Nullable String targetType) {
            this.targetType = Input.ofNullable(targetType);
            return this;
        }

        public Builder setTargetUtilization(@Nullable Input<Double> targetUtilization) {
            this.targetUtilization = targetUtilization;
            return this;
        }

        public Builder setTargetUtilization(@Nullable Double targetUtilization) {
            this.targetUtilization = Input.ofNullable(targetUtilization);
            return this;
        }
        public CustomMetricArgs build() {
            return new CustomMetricArgs(filter, metricName, singleInstanceAssignment, targetType, targetUtilization);
        }
    }
}