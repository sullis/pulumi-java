// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs Empty = new PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs();

    /**
     * The dimensions of the metric.
     * 
     */
    @Import(name="metricDimensions")
      private final @Nullable Output<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs>> metricDimensions;

    public Output<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs>> metricDimensions() {
        return this.metricDimensions == null ? Codegen.empty() : this.metricDimensions;
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * The namespace of the metric.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * The statistic of the metric.
     * 
     */
    @Import(name="statistic", required=true)
      private final Output<String> statistic;

    public Output<String> statistic() {
        return this.statistic;
    }

    /**
     * The unit of the metric.
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> unit() {
        return this.unit == null ? Codegen.empty() : this.unit;
    }

    public PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs(
        @Nullable Output<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs>> metricDimensions,
        Output<String> metricName,
        Output<String> namespace,
        Output<String> statistic,
        @Nullable Output<String> unit) {
        this.metricDimensions = metricDimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.statistic = Objects.requireNonNull(statistic, "expected parameter 'statistic' to be non-null");
        this.unit = unit;
    }

    private PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs() {
        this.metricDimensions = Codegen.empty();
        this.metricName = Codegen.empty();
        this.namespace = Codegen.empty();
        this.statistic = Codegen.empty();
        this.unit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs>> metricDimensions;
        private Output<String> metricName;
        private Output<String> namespace;
        private Output<String> statistic;
        private @Nullable Output<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricDimensions = defaults.metricDimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        public Builder metricDimensions(@Nullable Output<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs>> metricDimensions) {
            this.metricDimensions = metricDimensions;
            return this;
        }
        public Builder metricDimensions(@Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs> metricDimensions) {
            this.metricDimensions = Codegen.ofNullable(metricDimensions);
            return this;
        }
        public Builder metricDimensions(PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs... metricDimensions) {
            return metricDimensions(List.of(metricDimensions));
        }
        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }
        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }
        public Builder statistic(Output<String> statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }
        public Builder statistic(String statistic) {
            this.statistic = Output.of(Objects.requireNonNull(statistic));
            return this;
        }
        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = Codegen.ofNullable(unit);
            return this;
        }        public PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs build() {
            return new PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs(metricDimensions, metricName, namespace, statistic, unit);
        }
    }
}
