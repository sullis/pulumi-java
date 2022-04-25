// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.AutoscalingPolicyCpuUtilizationResponse;
import com.pulumi.googlenative.compute_alpha.outputs.AutoscalingPolicyCustomMetricUtilizationResponse;
import com.pulumi.googlenative.compute_alpha.outputs.AutoscalingPolicyLoadBalancingUtilizationResponse;
import com.pulumi.googlenative.compute_alpha.outputs.AutoscalingPolicyScaleDownControlResponse;
import com.pulumi.googlenative.compute_alpha.outputs.AutoscalingPolicyScaleInControlResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class AutoscalingPolicyResponse {
    /**
     * @return The number of seconds that the autoscaler waits before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is 60 seconds. Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To do this, create an instance and time the startup process.
     * 
     */
    private final Integer coolDownPeriodSec;
    /**
     * @return Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
     * 
     */
    private final AutoscalingPolicyCpuUtilizationResponse cpuUtilization;
    /**
     * @return Configuration parameters of autoscaling based on a custom metric.
     * 
     */
    private final List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations;
    /**
     * @return Configuration parameters of autoscaling based on load balancer.
     * 
     */
    private final AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization;
    /**
     * @return The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
     * 
     */
    private final Integer maxNumReplicas;
    /**
     * @return The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
     * 
     */
    private final Integer minNumReplicas;
    /**
     * @return Defines operating mode for this policy.
     * 
     */
    private final String mode;
    private final AutoscalingPolicyScaleDownControlResponse scaleDownControl;
    private final AutoscalingPolicyScaleInControlResponse scaleInControl;
    /**
     * @return Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
     * 
     */
    private final Map<String,String> scalingSchedules;

    @CustomType.Constructor
    private AutoscalingPolicyResponse(
        @CustomType.Parameter("coolDownPeriodSec") Integer coolDownPeriodSec,
        @CustomType.Parameter("cpuUtilization") AutoscalingPolicyCpuUtilizationResponse cpuUtilization,
        @CustomType.Parameter("customMetricUtilizations") List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations,
        @CustomType.Parameter("loadBalancingUtilization") AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization,
        @CustomType.Parameter("maxNumReplicas") Integer maxNumReplicas,
        @CustomType.Parameter("minNumReplicas") Integer minNumReplicas,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("scaleDownControl") AutoscalingPolicyScaleDownControlResponse scaleDownControl,
        @CustomType.Parameter("scaleInControl") AutoscalingPolicyScaleInControlResponse scaleInControl,
        @CustomType.Parameter("scalingSchedules") Map<String,String> scalingSchedules) {
        this.coolDownPeriodSec = coolDownPeriodSec;
        this.cpuUtilization = cpuUtilization;
        this.customMetricUtilizations = customMetricUtilizations;
        this.loadBalancingUtilization = loadBalancingUtilization;
        this.maxNumReplicas = maxNumReplicas;
        this.minNumReplicas = minNumReplicas;
        this.mode = mode;
        this.scaleDownControl = scaleDownControl;
        this.scaleInControl = scaleInControl;
        this.scalingSchedules = scalingSchedules;
    }

    /**
     * @return The number of seconds that the autoscaler waits before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is 60 seconds. Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To do this, create an instance and time the startup process.
     * 
     */
    public Integer coolDownPeriodSec() {
        return this.coolDownPeriodSec;
    }
    /**
     * @return Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
     * 
     */
    public AutoscalingPolicyCpuUtilizationResponse cpuUtilization() {
        return this.cpuUtilization;
    }
    /**
     * @return Configuration parameters of autoscaling based on a custom metric.
     * 
     */
    public List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations() {
        return this.customMetricUtilizations;
    }
    /**
     * @return Configuration parameters of autoscaling based on load balancer.
     * 
     */
    public AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization() {
        return this.loadBalancingUtilization;
    }
    /**
     * @return The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
     * 
     */
    public Integer maxNumReplicas() {
        return this.maxNumReplicas;
    }
    /**
     * @return The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
     * 
     */
    public Integer minNumReplicas() {
        return this.minNumReplicas;
    }
    /**
     * @return Defines operating mode for this policy.
     * 
     */
    public String mode() {
        return this.mode;
    }
    public AutoscalingPolicyScaleDownControlResponse scaleDownControl() {
        return this.scaleDownControl;
    }
    public AutoscalingPolicyScaleInControlResponse scaleInControl() {
        return this.scaleInControl;
    }
    /**
     * @return Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
     * 
     */
    public Map<String,String> scalingSchedules() {
        return this.scalingSchedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer coolDownPeriodSec;
        private AutoscalingPolicyCpuUtilizationResponse cpuUtilization;
        private List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations;
        private AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization;
        private Integer maxNumReplicas;
        private Integer minNumReplicas;
        private String mode;
        private AutoscalingPolicyScaleDownControlResponse scaleDownControl;
        private AutoscalingPolicyScaleInControlResponse scaleInControl;
        private Map<String,String> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriodSec = defaults.coolDownPeriodSec;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.customMetricUtilizations = defaults.customMetricUtilizations;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxNumReplicas = defaults.maxNumReplicas;
    	      this.minNumReplicas = defaults.minNumReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleDownControl = defaults.scaleDownControl;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder coolDownPeriodSec(Integer coolDownPeriodSec) {
            this.coolDownPeriodSec = Objects.requireNonNull(coolDownPeriodSec);
            return this;
        }
        public Builder cpuUtilization(AutoscalingPolicyCpuUtilizationResponse cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }
        public Builder customMetricUtilizations(List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations) {
            this.customMetricUtilizations = Objects.requireNonNull(customMetricUtilizations);
            return this;
        }
        public Builder customMetricUtilizations(AutoscalingPolicyCustomMetricUtilizationResponse... customMetricUtilizations) {
            return customMetricUtilizations(List.of(customMetricUtilizations));
        }
        public Builder loadBalancingUtilization(AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization) {
            this.loadBalancingUtilization = Objects.requireNonNull(loadBalancingUtilization);
            return this;
        }
        public Builder maxNumReplicas(Integer maxNumReplicas) {
            this.maxNumReplicas = Objects.requireNonNull(maxNumReplicas);
            return this;
        }
        public Builder minNumReplicas(Integer minNumReplicas) {
            this.minNumReplicas = Objects.requireNonNull(minNumReplicas);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder scaleDownControl(AutoscalingPolicyScaleDownControlResponse scaleDownControl) {
            this.scaleDownControl = Objects.requireNonNull(scaleDownControl);
            return this;
        }
        public Builder scaleInControl(AutoscalingPolicyScaleInControlResponse scaleInControl) {
            this.scaleInControl = Objects.requireNonNull(scaleInControl);
            return this;
        }
        public Builder scalingSchedules(Map<String,String> scalingSchedules) {
            this.scalingSchedules = Objects.requireNonNull(scalingSchedules);
            return this;
        }        public AutoscalingPolicyResponse build() {
            return new AutoscalingPolicyResponse(coolDownPeriodSec, cpuUtilization, customMetricUtilizations, loadBalancingUtilization, maxNumReplicas, minNumReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
