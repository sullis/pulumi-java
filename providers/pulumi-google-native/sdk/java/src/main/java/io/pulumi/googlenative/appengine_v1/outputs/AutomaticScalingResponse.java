// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.appengine_v1.outputs.CpuUtilizationResponse;
import io.pulumi.googlenative.appengine_v1.outputs.DiskUtilizationResponse;
import io.pulumi.googlenative.appengine_v1.outputs.NetworkUtilizationResponse;
import io.pulumi.googlenative.appengine_v1.outputs.RequestUtilizationResponse;
import io.pulumi.googlenative.appengine_v1.outputs.StandardSchedulerSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AutomaticScalingResponse {
    /**
     * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
     * 
     */
    private final String coolDownPeriod;
    /**
     * Target scaling by CPU usage.
     * 
     */
    private final CpuUtilizationResponse cpuUtilization;
    /**
     * Target scaling by disk usage.
     * 
     */
    private final DiskUtilizationResponse diskUtilization;
    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
     * 
     */
    private final Integer maxConcurrentRequests;
    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    private final Integer maxIdleInstances;
    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    private final String maxPendingLatency;
    /**
     * Maximum number of instances that should be started to handle requests for this version.
     * 
     */
    private final Integer maxTotalInstances;
    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    private final Integer minIdleInstances;
    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    private final String minPendingLatency;
    /**
     * Minimum number of running instances that should be maintained for this version.
     * 
     */
    private final Integer minTotalInstances;
    /**
     * Target scaling by network usage.
     * 
     */
    private final NetworkUtilizationResponse networkUtilization;
    /**
     * Target scaling by request utilization.
     * 
     */
    private final RequestUtilizationResponse requestUtilization;
    /**
     * Scheduler settings for standard environment.
     * 
     */
    private final StandardSchedulerSettingsResponse standardSchedulerSettings;

    @OutputCustomType.Constructor({"coolDownPeriod","cpuUtilization","diskUtilization","maxConcurrentRequests","maxIdleInstances","maxPendingLatency","maxTotalInstances","minIdleInstances","minPendingLatency","minTotalInstances","networkUtilization","requestUtilization","standardSchedulerSettings"})
    private AutomaticScalingResponse(
        String coolDownPeriod,
        CpuUtilizationResponse cpuUtilization,
        DiskUtilizationResponse diskUtilization,
        Integer maxConcurrentRequests,
        Integer maxIdleInstances,
        String maxPendingLatency,
        Integer maxTotalInstances,
        Integer minIdleInstances,
        String minPendingLatency,
        Integer minTotalInstances,
        NetworkUtilizationResponse networkUtilization,
        RequestUtilizationResponse requestUtilization,
        StandardSchedulerSettingsResponse standardSchedulerSettings) {
        this.coolDownPeriod = Objects.requireNonNull(coolDownPeriod);
        this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
        this.diskUtilization = Objects.requireNonNull(diskUtilization);
        this.maxConcurrentRequests = Objects.requireNonNull(maxConcurrentRequests);
        this.maxIdleInstances = Objects.requireNonNull(maxIdleInstances);
        this.maxPendingLatency = Objects.requireNonNull(maxPendingLatency);
        this.maxTotalInstances = Objects.requireNonNull(maxTotalInstances);
        this.minIdleInstances = Objects.requireNonNull(minIdleInstances);
        this.minPendingLatency = Objects.requireNonNull(minPendingLatency);
        this.minTotalInstances = Objects.requireNonNull(minTotalInstances);
        this.networkUtilization = Objects.requireNonNull(networkUtilization);
        this.requestUtilization = Objects.requireNonNull(requestUtilization);
        this.standardSchedulerSettings = Objects.requireNonNull(standardSchedulerSettings);
    }

    /**
     * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
     * 
    */
    public String getCoolDownPeriod() {
        return this.coolDownPeriod;
    }
    /**
     * Target scaling by CPU usage.
     * 
    */
    public CpuUtilizationResponse getCpuUtilization() {
        return this.cpuUtilization;
    }
    /**
     * Target scaling by disk usage.
     * 
    */
    public DiskUtilizationResponse getDiskUtilization() {
        return this.diskUtilization;
    }
    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
     * 
    */
    public Integer getMaxConcurrentRequests() {
        return this.maxConcurrentRequests;
    }
    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
    */
    public Integer getMaxIdleInstances() {
        return this.maxIdleInstances;
    }
    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
    */
    public String getMaxPendingLatency() {
        return this.maxPendingLatency;
    }
    /**
     * Maximum number of instances that should be started to handle requests for this version.
     * 
    */
    public Integer getMaxTotalInstances() {
        return this.maxTotalInstances;
    }
    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
    */
    public Integer getMinIdleInstances() {
        return this.minIdleInstances;
    }
    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
    */
    public String getMinPendingLatency() {
        return this.minPendingLatency;
    }
    /**
     * Minimum number of running instances that should be maintained for this version.
     * 
    */
    public Integer getMinTotalInstances() {
        return this.minTotalInstances;
    }
    /**
     * Target scaling by network usage.
     * 
    */
    public NetworkUtilizationResponse getNetworkUtilization() {
        return this.networkUtilization;
    }
    /**
     * Target scaling by request utilization.
     * 
    */
    public RequestUtilizationResponse getRequestUtilization() {
        return this.requestUtilization;
    }
    /**
     * Scheduler settings for standard environment.
     * 
    */
    public StandardSchedulerSettingsResponse getStandardSchedulerSettings() {
        return this.standardSchedulerSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String coolDownPeriod;
        private CpuUtilizationResponse cpuUtilization;
        private DiskUtilizationResponse diskUtilization;
        private Integer maxConcurrentRequests;
        private Integer maxIdleInstances;
        private String maxPendingLatency;
        private Integer maxTotalInstances;
        private Integer minIdleInstances;
        private String minPendingLatency;
        private Integer minTotalInstances;
        private NetworkUtilizationResponse networkUtilization;
        private RequestUtilizationResponse requestUtilization;
        private StandardSchedulerSettingsResponse standardSchedulerSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriod = defaults.coolDownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.diskUtilization = defaults.diskUtilization;
    	      this.maxConcurrentRequests = defaults.maxConcurrentRequests;
    	      this.maxIdleInstances = defaults.maxIdleInstances;
    	      this.maxPendingLatency = defaults.maxPendingLatency;
    	      this.maxTotalInstances = defaults.maxTotalInstances;
    	      this.minIdleInstances = defaults.minIdleInstances;
    	      this.minPendingLatency = defaults.minPendingLatency;
    	      this.minTotalInstances = defaults.minTotalInstances;
    	      this.networkUtilization = defaults.networkUtilization;
    	      this.requestUtilization = defaults.requestUtilization;
    	      this.standardSchedulerSettings = defaults.standardSchedulerSettings;
        }

        public Builder setCoolDownPeriod(String coolDownPeriod) {
            this.coolDownPeriod = Objects.requireNonNull(coolDownPeriod);
            return this;
        }

        public Builder setCpuUtilization(CpuUtilizationResponse cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }

        public Builder setDiskUtilization(DiskUtilizationResponse diskUtilization) {
            this.diskUtilization = Objects.requireNonNull(diskUtilization);
            return this;
        }

        public Builder setMaxConcurrentRequests(Integer maxConcurrentRequests) {
            this.maxConcurrentRequests = Objects.requireNonNull(maxConcurrentRequests);
            return this;
        }

        public Builder setMaxIdleInstances(Integer maxIdleInstances) {
            this.maxIdleInstances = Objects.requireNonNull(maxIdleInstances);
            return this;
        }

        public Builder setMaxPendingLatency(String maxPendingLatency) {
            this.maxPendingLatency = Objects.requireNonNull(maxPendingLatency);
            return this;
        }

        public Builder setMaxTotalInstances(Integer maxTotalInstances) {
            this.maxTotalInstances = Objects.requireNonNull(maxTotalInstances);
            return this;
        }

        public Builder setMinIdleInstances(Integer minIdleInstances) {
            this.minIdleInstances = Objects.requireNonNull(minIdleInstances);
            return this;
        }

        public Builder setMinPendingLatency(String minPendingLatency) {
            this.minPendingLatency = Objects.requireNonNull(minPendingLatency);
            return this;
        }

        public Builder setMinTotalInstances(Integer minTotalInstances) {
            this.minTotalInstances = Objects.requireNonNull(minTotalInstances);
            return this;
        }

        public Builder setNetworkUtilization(NetworkUtilizationResponse networkUtilization) {
            this.networkUtilization = Objects.requireNonNull(networkUtilization);
            return this;
        }

        public Builder setRequestUtilization(RequestUtilizationResponse requestUtilization) {
            this.requestUtilization = Objects.requireNonNull(requestUtilization);
            return this;
        }

        public Builder setStandardSchedulerSettings(StandardSchedulerSettingsResponse standardSchedulerSettings) {
            this.standardSchedulerSettings = Objects.requireNonNull(standardSchedulerSettings);
            return this;
        }
        public AutomaticScalingResponse build() {
            return new AutomaticScalingResponse(coolDownPeriod, cpuUtilization, diskUtilization, maxConcurrentRequests, maxIdleInstances, maxPendingLatency, maxTotalInstances, minIdleInstances, minPendingLatency, minTotalInstances, networkUtilization, requestUtilization, standardSchedulerSettings);
        }
    }
}