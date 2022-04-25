// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VmUtilizationMetricsResponse {
    /**
     * @return Average CPU usage, percent.
     * 
     */
    private final Integer cpuAverage;
    /**
     * @return Average CPU usage, percent.
     * 
     */
    private final Integer cpuAveragePercent;
    /**
     * @return Max CPU usage, percent.
     * 
     */
    private final Integer cpuMax;
    /**
     * @return Max CPU usage, percent.
     * 
     */
    private final Integer cpuMaxPercent;
    /**
     * @return Average disk IO rate, in kilobytes per second.
     * 
     */
    private final String diskIoRateAverage;
    /**
     * @return Average disk IO rate, in kilobytes per second.
     * 
     */
    private final String diskIoRateAverageKbps;
    /**
     * @return Max disk IO rate, in kilobytes per second.
     * 
     */
    private final String diskIoRateMax;
    /**
     * @return Max disk IO rate, in kilobytes per second.
     * 
     */
    private final String diskIoRateMaxKbps;
    /**
     * @return Average memory usage, percent.
     * 
     */
    private final Integer memoryAverage;
    /**
     * @return Average memory usage, percent.
     * 
     */
    private final Integer memoryAveragePercent;
    /**
     * @return Max memory usage, percent.
     * 
     */
    private final Integer memoryMax;
    /**
     * @return Max memory usage, percent.
     * 
     */
    private final Integer memoryMaxPercent;
    /**
     * @return Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    private final String networkThroughputAverage;
    /**
     * @return Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    private final String networkThroughputAverageKbps;
    /**
     * @return Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    private final String networkThroughputMax;
    /**
     * @return Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    private final String networkThroughputMaxKbps;

    @CustomType.Constructor
    private VmUtilizationMetricsResponse(
        @CustomType.Parameter("cpuAverage") Integer cpuAverage,
        @CustomType.Parameter("cpuAveragePercent") Integer cpuAveragePercent,
        @CustomType.Parameter("cpuMax") Integer cpuMax,
        @CustomType.Parameter("cpuMaxPercent") Integer cpuMaxPercent,
        @CustomType.Parameter("diskIoRateAverage") String diskIoRateAverage,
        @CustomType.Parameter("diskIoRateAverageKbps") String diskIoRateAverageKbps,
        @CustomType.Parameter("diskIoRateMax") String diskIoRateMax,
        @CustomType.Parameter("diskIoRateMaxKbps") String diskIoRateMaxKbps,
        @CustomType.Parameter("memoryAverage") Integer memoryAverage,
        @CustomType.Parameter("memoryAveragePercent") Integer memoryAveragePercent,
        @CustomType.Parameter("memoryMax") Integer memoryMax,
        @CustomType.Parameter("memoryMaxPercent") Integer memoryMaxPercent,
        @CustomType.Parameter("networkThroughputAverage") String networkThroughputAverage,
        @CustomType.Parameter("networkThroughputAverageKbps") String networkThroughputAverageKbps,
        @CustomType.Parameter("networkThroughputMax") String networkThroughputMax,
        @CustomType.Parameter("networkThroughputMaxKbps") String networkThroughputMaxKbps) {
        this.cpuAverage = cpuAverage;
        this.cpuAveragePercent = cpuAveragePercent;
        this.cpuMax = cpuMax;
        this.cpuMaxPercent = cpuMaxPercent;
        this.diskIoRateAverage = diskIoRateAverage;
        this.diskIoRateAverageKbps = diskIoRateAverageKbps;
        this.diskIoRateMax = diskIoRateMax;
        this.diskIoRateMaxKbps = diskIoRateMaxKbps;
        this.memoryAverage = memoryAverage;
        this.memoryAveragePercent = memoryAveragePercent;
        this.memoryMax = memoryMax;
        this.memoryMaxPercent = memoryMaxPercent;
        this.networkThroughputAverage = networkThroughputAverage;
        this.networkThroughputAverageKbps = networkThroughputAverageKbps;
        this.networkThroughputMax = networkThroughputMax;
        this.networkThroughputMaxKbps = networkThroughputMaxKbps;
    }

    /**
     * @return Average CPU usage, percent.
     * 
     */
    public Integer cpuAverage() {
        return this.cpuAverage;
    }
    /**
     * @return Average CPU usage, percent.
     * 
     */
    public Integer cpuAveragePercent() {
        return this.cpuAveragePercent;
    }
    /**
     * @return Max CPU usage, percent.
     * 
     */
    public Integer cpuMax() {
        return this.cpuMax;
    }
    /**
     * @return Max CPU usage, percent.
     * 
     */
    public Integer cpuMaxPercent() {
        return this.cpuMaxPercent;
    }
    /**
     * @return Average disk IO rate, in kilobytes per second.
     * 
     */
    public String diskIoRateAverage() {
        return this.diskIoRateAverage;
    }
    /**
     * @return Average disk IO rate, in kilobytes per second.
     * 
     */
    public String diskIoRateAverageKbps() {
        return this.diskIoRateAverageKbps;
    }
    /**
     * @return Max disk IO rate, in kilobytes per second.
     * 
     */
    public String diskIoRateMax() {
        return this.diskIoRateMax;
    }
    /**
     * @return Max disk IO rate, in kilobytes per second.
     * 
     */
    public String diskIoRateMaxKbps() {
        return this.diskIoRateMaxKbps;
    }
    /**
     * @return Average memory usage, percent.
     * 
     */
    public Integer memoryAverage() {
        return this.memoryAverage;
    }
    /**
     * @return Average memory usage, percent.
     * 
     */
    public Integer memoryAveragePercent() {
        return this.memoryAveragePercent;
    }
    /**
     * @return Max memory usage, percent.
     * 
     */
    public Integer memoryMax() {
        return this.memoryMax;
    }
    /**
     * @return Max memory usage, percent.
     * 
     */
    public Integer memoryMaxPercent() {
        return this.memoryMaxPercent;
    }
    /**
     * @return Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    public String networkThroughputAverage() {
        return this.networkThroughputAverage;
    }
    /**
     * @return Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    public String networkThroughputAverageKbps() {
        return this.networkThroughputAverageKbps;
    }
    /**
     * @return Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    public String networkThroughputMax() {
        return this.networkThroughputMax;
    }
    /**
     * @return Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    public String networkThroughputMaxKbps() {
        return this.networkThroughputMaxKbps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUtilizationMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuAverage;
        private Integer cpuAveragePercent;
        private Integer cpuMax;
        private Integer cpuMaxPercent;
        private String diskIoRateAverage;
        private String diskIoRateAverageKbps;
        private String diskIoRateMax;
        private String diskIoRateMaxKbps;
        private Integer memoryAverage;
        private Integer memoryAveragePercent;
        private Integer memoryMax;
        private Integer memoryMaxPercent;
        private String networkThroughputAverage;
        private String networkThroughputAverageKbps;
        private String networkThroughputMax;
        private String networkThroughputMaxKbps;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUtilizationMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuAverage = defaults.cpuAverage;
    	      this.cpuAveragePercent = defaults.cpuAveragePercent;
    	      this.cpuMax = defaults.cpuMax;
    	      this.cpuMaxPercent = defaults.cpuMaxPercent;
    	      this.diskIoRateAverage = defaults.diskIoRateAverage;
    	      this.diskIoRateAverageKbps = defaults.diskIoRateAverageKbps;
    	      this.diskIoRateMax = defaults.diskIoRateMax;
    	      this.diskIoRateMaxKbps = defaults.diskIoRateMaxKbps;
    	      this.memoryAverage = defaults.memoryAverage;
    	      this.memoryAveragePercent = defaults.memoryAveragePercent;
    	      this.memoryMax = defaults.memoryMax;
    	      this.memoryMaxPercent = defaults.memoryMaxPercent;
    	      this.networkThroughputAverage = defaults.networkThroughputAverage;
    	      this.networkThroughputAverageKbps = defaults.networkThroughputAverageKbps;
    	      this.networkThroughputMax = defaults.networkThroughputMax;
    	      this.networkThroughputMaxKbps = defaults.networkThroughputMaxKbps;
        }

        public Builder cpuAverage(Integer cpuAverage) {
            this.cpuAverage = Objects.requireNonNull(cpuAverage);
            return this;
        }
        public Builder cpuAveragePercent(Integer cpuAveragePercent) {
            this.cpuAveragePercent = Objects.requireNonNull(cpuAveragePercent);
            return this;
        }
        public Builder cpuMax(Integer cpuMax) {
            this.cpuMax = Objects.requireNonNull(cpuMax);
            return this;
        }
        public Builder cpuMaxPercent(Integer cpuMaxPercent) {
            this.cpuMaxPercent = Objects.requireNonNull(cpuMaxPercent);
            return this;
        }
        public Builder diskIoRateAverage(String diskIoRateAverage) {
            this.diskIoRateAverage = Objects.requireNonNull(diskIoRateAverage);
            return this;
        }
        public Builder diskIoRateAverageKbps(String diskIoRateAverageKbps) {
            this.diskIoRateAverageKbps = Objects.requireNonNull(diskIoRateAverageKbps);
            return this;
        }
        public Builder diskIoRateMax(String diskIoRateMax) {
            this.diskIoRateMax = Objects.requireNonNull(diskIoRateMax);
            return this;
        }
        public Builder diskIoRateMaxKbps(String diskIoRateMaxKbps) {
            this.diskIoRateMaxKbps = Objects.requireNonNull(diskIoRateMaxKbps);
            return this;
        }
        public Builder memoryAverage(Integer memoryAverage) {
            this.memoryAverage = Objects.requireNonNull(memoryAverage);
            return this;
        }
        public Builder memoryAveragePercent(Integer memoryAveragePercent) {
            this.memoryAveragePercent = Objects.requireNonNull(memoryAveragePercent);
            return this;
        }
        public Builder memoryMax(Integer memoryMax) {
            this.memoryMax = Objects.requireNonNull(memoryMax);
            return this;
        }
        public Builder memoryMaxPercent(Integer memoryMaxPercent) {
            this.memoryMaxPercent = Objects.requireNonNull(memoryMaxPercent);
            return this;
        }
        public Builder networkThroughputAverage(String networkThroughputAverage) {
            this.networkThroughputAverage = Objects.requireNonNull(networkThroughputAverage);
            return this;
        }
        public Builder networkThroughputAverageKbps(String networkThroughputAverageKbps) {
            this.networkThroughputAverageKbps = Objects.requireNonNull(networkThroughputAverageKbps);
            return this;
        }
        public Builder networkThroughputMax(String networkThroughputMax) {
            this.networkThroughputMax = Objects.requireNonNull(networkThroughputMax);
            return this;
        }
        public Builder networkThroughputMaxKbps(String networkThroughputMaxKbps) {
            this.networkThroughputMaxKbps = Objects.requireNonNull(networkThroughputMaxKbps);
            return this;
        }        public VmUtilizationMetricsResponse build() {
            return new VmUtilizationMetricsResponse(cpuAverage, cpuAveragePercent, cpuMax, cpuMaxPercent, diskIoRateAverage, diskIoRateAverageKbps, diskIoRateMax, diskIoRateMaxKbps, memoryAverage, memoryAveragePercent, memoryMax, memoryMaxPercent, networkThroughputAverage, networkThroughputAverageKbps, networkThroughputMax, networkThroughputMaxKbps);
        }
    }
}
