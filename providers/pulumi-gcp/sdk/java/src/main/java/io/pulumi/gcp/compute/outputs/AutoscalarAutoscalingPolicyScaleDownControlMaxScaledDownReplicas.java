// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas {
    /**
     * Specifies a fixed number of VM instances. This must be a positive
     * integer.
     * 
     */
    private final @Nullable Integer fixed;
    /**
     * Specifies a percentage of instances between 0 to 100%, inclusive.
     * For example, specify 80 for 80%.
     * 
     */
    private final @Nullable Integer percent;

    @OutputCustomType.Constructor({"fixed","percent"})
    private AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas(
        @Nullable Integer fixed,
        @Nullable Integer percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    /**
     * Specifies a fixed number of VM instances. This must be a positive
     * integer.
     * 
     */
    public Optional<Integer> getFixed() {
        return Optional.ofNullable(this.fixed);
    }
    /**
     * Specifies a percentage of instances between 0 to 100%, inclusive.
     * For example, specify 80 for 80%.
     * 
     */
    public Optional<Integer> getPercent() {
        return Optional.ofNullable(this.percent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fixed;
        private @Nullable Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder setFixed(@Nullable Integer fixed) {
            this.fixed = fixed;
            return this;
        }

        public Builder setPercent(@Nullable Integer percent) {
            this.percent = percent;
            return this;
        }

        public AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas build() {
            return new AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas(fixed, percent);
        }
    }
}
