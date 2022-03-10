// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.HPAScalingPolicy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HPAScalingRules {
    /**
     * policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
     * 
     */
    private final @Nullable List<HPAScalingPolicy> policies;
    /**
     * selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.
     * 
     */
    private final @Nullable String selectPolicy;
    /**
     * StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
     * 
     */
    private final @Nullable Integer stabilizationWindowSeconds;

    @OutputCustomType.Constructor
    private HPAScalingRules(
        @OutputCustomType.Parameter("policies") @Nullable List<HPAScalingPolicy> policies,
        @OutputCustomType.Parameter("selectPolicy") @Nullable String selectPolicy,
        @OutputCustomType.Parameter("stabilizationWindowSeconds") @Nullable Integer stabilizationWindowSeconds) {
        this.policies = policies;
        this.selectPolicy = selectPolicy;
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    }

    /**
     * policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
     * 
    */
    public List<HPAScalingPolicy> getPolicies() {
        return this.policies == null ? List.of() : this.policies;
    }
    /**
     * selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.
     * 
    */
    public Optional<String> getSelectPolicy() {
        return Optional.ofNullable(this.selectPolicy);
    }
    /**
     * StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
     * 
    */
    public Optional<Integer> getStabilizationWindowSeconds() {
        return Optional.ofNullable(this.stabilizationWindowSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HPAScalingRules defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HPAScalingPolicy> policies;
        private @Nullable String selectPolicy;
        private @Nullable Integer stabilizationWindowSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(HPAScalingRules defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policies = defaults.policies;
    	      this.selectPolicy = defaults.selectPolicy;
    	      this.stabilizationWindowSeconds = defaults.stabilizationWindowSeconds;
        }

        public Builder setPolicies(@Nullable List<HPAScalingPolicy> policies) {
            this.policies = policies;
            return this;
        }

        public Builder setSelectPolicy(@Nullable String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }

        public Builder setStabilizationWindowSeconds(@Nullable Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public HPAScalingRules build() {
            return new HPAScalingRules(policies, selectPolicy, stabilizationWindowSeconds);
        }
    }
}
