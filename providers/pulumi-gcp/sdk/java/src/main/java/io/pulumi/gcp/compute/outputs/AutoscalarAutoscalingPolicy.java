// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.AutoscalarAutoscalingPolicyCpuUtilization;
import io.pulumi.gcp.compute.outputs.AutoscalarAutoscalingPolicyLoadBalancingUtilization;
import io.pulumi.gcp.compute.outputs.AutoscalarAutoscalingPolicyMetric;
import io.pulumi.gcp.compute.outputs.AutoscalarAutoscalingPolicyScaleDownControl;
import io.pulumi.gcp.compute.outputs.AutoscalarAutoscalingPolicyScaleInControl;
import io.pulumi.gcp.compute.outputs.AutoscalarAutoscalingPolicyScalingSchedule;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscalarAutoscalingPolicy {
    /**
     * The number of seconds that the autoscaler should wait before it
     * starts collecting information from a new instance. This prevents
     * the autoscaler from collecting information when the instance is
     * initializing, during which the collected usage would not be
     * reliable. The default time autoscaler waits is 60 seconds.
     * Virtual machine initialization times might vary because of
     * numerous factors. We recommend that you test how long an
     * instance may take to initialize. To do this, create an instance
     * and time the startup process.
     * 
     */
    private final @Nullable Integer cooldownPeriod;
    /**
     * Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * 
     */
    private final @Nullable AutoscalarAutoscalingPolicyCpuUtilization cpuUtilization;
    /**
     * Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * 
     */
    private final @Nullable AutoscalarAutoscalingPolicyLoadBalancingUtilization loadBalancingUtilization;
    /**
     * The maximum number of instances that the autoscaler can scale up
     * to. This is required when creating or updating an autoscaler. The
     * maximum number of replicas should not be lower than minimal number
     * of replicas.
     * 
     */
    private final Integer maxReplicas;
    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<AutoscalarAutoscalingPolicyMetric> metrics;
    /**
     * The minimum number of replicas that the autoscaler can scale down
     * to. This cannot be less than 0. If not provided, autoscaler will
     * choose a default value depending on maximum number of instances
     * allowed.
     * 
     */
    private final Integer minReplicas;
    /**
     * Defines operating mode for this policy.
     * Default value is `ON`.
     * Possible values are `OFF`, `ONLY_UP`, and `ON`.
     * 
     */
    private final @Nullable String mode;
    /**
     * Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    private final @Nullable AutoscalarAutoscalingPolicyScaleDownControl scaleDownControl;
    /**
     * Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    private final @Nullable AutoscalarAutoscalingPolicyScaleInControl scaleInControl;
    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<AutoscalarAutoscalingPolicyScalingSchedule> scalingSchedules;

    @OutputCustomType.Constructor({"cooldownPeriod","cpuUtilization","loadBalancingUtilization","maxReplicas","metrics","minReplicas","mode","scaleDownControl","scaleInControl","scalingSchedules"})
    private AutoscalarAutoscalingPolicy(
        @Nullable Integer cooldownPeriod,
        @Nullable AutoscalarAutoscalingPolicyCpuUtilization cpuUtilization,
        @Nullable AutoscalarAutoscalingPolicyLoadBalancingUtilization loadBalancingUtilization,
        Integer maxReplicas,
        @Nullable List<AutoscalarAutoscalingPolicyMetric> metrics,
        Integer minReplicas,
        @Nullable String mode,
        @Nullable AutoscalarAutoscalingPolicyScaleDownControl scaleDownControl,
        @Nullable AutoscalarAutoscalingPolicyScaleInControl scaleInControl,
        @Nullable List<AutoscalarAutoscalingPolicyScalingSchedule> scalingSchedules) {
        this.cooldownPeriod = cooldownPeriod;
        this.cpuUtilization = cpuUtilization;
        this.loadBalancingUtilization = loadBalancingUtilization;
        this.maxReplicas = Objects.requireNonNull(maxReplicas);
        this.metrics = metrics;
        this.minReplicas = Objects.requireNonNull(minReplicas);
        this.mode = mode;
        this.scaleDownControl = scaleDownControl;
        this.scaleInControl = scaleInControl;
        this.scalingSchedules = scalingSchedules;
    }

    /**
     * The number of seconds that the autoscaler should wait before it
     * starts collecting information from a new instance. This prevents
     * the autoscaler from collecting information when the instance is
     * initializing, during which the collected usage would not be
     * reliable. The default time autoscaler waits is 60 seconds.
     * Virtual machine initialization times might vary because of
     * numerous factors. We recommend that you test how long an
     * instance may take to initialize. To do this, create an instance
     * and time the startup process.
     * 
     */
    public Optional<Integer> getCooldownPeriod() {
        return Optional.ofNullable(this.cooldownPeriod);
    }
    /**
     * Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * 
     */
    public Optional<AutoscalarAutoscalingPolicyCpuUtilization> getCpuUtilization() {
        return Optional.ofNullable(this.cpuUtilization);
    }
    /**
     * Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * 
     */
    public Optional<AutoscalarAutoscalingPolicyLoadBalancingUtilization> getLoadBalancingUtilization() {
        return Optional.ofNullable(this.loadBalancingUtilization);
    }
    /**
     * The maximum number of instances that the autoscaler can scale up
     * to. This is required when creating or updating an autoscaler. The
     * maximum number of replicas should not be lower than minimal number
     * of replicas.
     * 
     */
    public Integer getMaxReplicas() {
        return this.maxReplicas;
    }
    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * 
     */
    public List<AutoscalarAutoscalingPolicyMetric> getMetrics() {
        return this.metrics == null ? List.of() : this.metrics;
    }
    /**
     * The minimum number of replicas that the autoscaler can scale down
     * to. This cannot be less than 0. If not provided, autoscaler will
     * choose a default value depending on maximum number of instances
     * allowed.
     * 
     */
    public Integer getMinReplicas() {
        return this.minReplicas;
    }
    /**
     * Defines operating mode for this policy.
     * Default value is `ON`.
     * Possible values are `OFF`, `ONLY_UP`, and `ON`.
     * 
     */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    public Optional<AutoscalarAutoscalingPolicyScaleDownControl> getScaleDownControl() {
        return Optional.ofNullable(this.scaleDownControl);
    }
    /**
     * Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    public Optional<AutoscalarAutoscalingPolicyScaleInControl> getScaleInControl() {
        return Optional.ofNullable(this.scaleInControl);
    }
    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * 
     */
    public List<AutoscalarAutoscalingPolicyScalingSchedule> getScalingSchedules() {
        return this.scalingSchedules == null ? List.of() : this.scalingSchedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cooldownPeriod;
        private @Nullable AutoscalarAutoscalingPolicyCpuUtilization cpuUtilization;
        private @Nullable AutoscalarAutoscalingPolicyLoadBalancingUtilization loadBalancingUtilization;
        private Integer maxReplicas;
        private @Nullable List<AutoscalarAutoscalingPolicyMetric> metrics;
        private Integer minReplicas;
        private @Nullable String mode;
        private @Nullable AutoscalarAutoscalingPolicyScaleDownControl scaleDownControl;
        private @Nullable AutoscalarAutoscalingPolicyScaleInControl scaleInControl;
        private @Nullable List<AutoscalarAutoscalingPolicyScalingSchedule> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleDownControl = defaults.scaleDownControl;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder setCooldownPeriod(@Nullable Integer cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }

        public Builder setCpuUtilization(@Nullable AutoscalarAutoscalingPolicyCpuUtilization cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        public Builder setLoadBalancingUtilization(@Nullable AutoscalarAutoscalingPolicyLoadBalancingUtilization loadBalancingUtilization) {
            this.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }

        public Builder setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }

        public Builder setMetrics(@Nullable List<AutoscalarAutoscalingPolicyMetric> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMinReplicas(Integer minReplicas) {
            this.minReplicas = Objects.requireNonNull(minReplicas);
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setScaleDownControl(@Nullable AutoscalarAutoscalingPolicyScaleDownControl scaleDownControl) {
            this.scaleDownControl = scaleDownControl;
            return this;
        }

        public Builder setScaleInControl(@Nullable AutoscalarAutoscalingPolicyScaleInControl scaleInControl) {
            this.scaleInControl = scaleInControl;
            return this;
        }

        public Builder setScalingSchedules(@Nullable List<AutoscalarAutoscalingPolicyScalingSchedule> scalingSchedules) {
            this.scalingSchedules = scalingSchedules;
            return this;
        }

        public AutoscalarAutoscalingPolicy build() {
            return new AutoscalarAutoscalingPolicy(cooldownPeriod, cpuUtilization, loadBalancingUtilization, maxReplicas, metrics, minReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
