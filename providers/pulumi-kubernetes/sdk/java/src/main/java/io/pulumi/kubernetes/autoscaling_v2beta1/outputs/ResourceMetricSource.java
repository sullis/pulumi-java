// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceMetricSource {
    /**
     * name is the name of the resource in question.
     * 
     */
    private final String name;
    /**
     * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    private final @Nullable Integer targetAverageUtilization;
    /**
     * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
     * 
     */
    private final @Nullable String targetAverageValue;

    @OutputCustomType.Constructor
    private ResourceMetricSource(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("targetAverageUtilization") @Nullable Integer targetAverageUtilization,
        @OutputCustomType.Parameter("targetAverageValue") @Nullable String targetAverageValue) {
        this.name = name;
        this.targetAverageUtilization = targetAverageUtilization;
        this.targetAverageValue = targetAverageValue;
    }

    /**
     * name is the name of the resource in question.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
    */
    public Optional<Integer> getTargetAverageUtilization() {
        return Optional.ofNullable(this.targetAverageUtilization);
    }
    /**
     * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
     * 
    */
    public Optional<String> getTargetAverageValue() {
        return Optional.ofNullable(this.targetAverageValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable Integer targetAverageUtilization;
        private @Nullable String targetAverageValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.targetAverageUtilization = defaults.targetAverageUtilization;
    	      this.targetAverageValue = defaults.targetAverageValue;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTargetAverageUtilization(@Nullable Integer targetAverageUtilization) {
            this.targetAverageUtilization = targetAverageUtilization;
            return this;
        }

        public Builder setTargetAverageValue(@Nullable String targetAverageValue) {
            this.targetAverageValue = targetAverageValue;
            return this;
        }
        public ResourceMetricSource build() {
            return new ResourceMetricSource(name, targetAverageUtilization, targetAverageValue);
        }
    }
}
