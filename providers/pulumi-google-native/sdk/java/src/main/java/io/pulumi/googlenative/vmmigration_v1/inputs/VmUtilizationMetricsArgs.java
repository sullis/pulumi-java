// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Utilization metrics values for a single VM.
 * 
 */
public final class VmUtilizationMetricsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmUtilizationMetricsArgs Empty = new VmUtilizationMetricsArgs();

    /**
     * Average CPU usage, percent.
     * 
     */
    @InputImport(name="cpuAveragePercent")
      private final @Nullable Input<Integer> cpuAveragePercent;

    public Input<Integer> getCpuAveragePercent() {
        return this.cpuAveragePercent == null ? Input.empty() : this.cpuAveragePercent;
    }

    /**
     * Max CPU usage, percent.
     * 
     */
    @InputImport(name="cpuMaxPercent")
      private final @Nullable Input<Integer> cpuMaxPercent;

    public Input<Integer> getCpuMaxPercent() {
        return this.cpuMaxPercent == null ? Input.empty() : this.cpuMaxPercent;
    }

    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    @InputImport(name="diskIoRateAverageKbps")
      private final @Nullable Input<String> diskIoRateAverageKbps;

    public Input<String> getDiskIoRateAverageKbps() {
        return this.diskIoRateAverageKbps == null ? Input.empty() : this.diskIoRateAverageKbps;
    }

    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    @InputImport(name="diskIoRateMaxKbps")
      private final @Nullable Input<String> diskIoRateMaxKbps;

    public Input<String> getDiskIoRateMaxKbps() {
        return this.diskIoRateMaxKbps == null ? Input.empty() : this.diskIoRateMaxKbps;
    }

    /**
     * Average memory usage, percent.
     * 
     */
    @InputImport(name="memoryAveragePercent")
      private final @Nullable Input<Integer> memoryAveragePercent;

    public Input<Integer> getMemoryAveragePercent() {
        return this.memoryAveragePercent == null ? Input.empty() : this.memoryAveragePercent;
    }

    /**
     * Max memory usage, percent.
     * 
     */
    @InputImport(name="memoryMaxPercent")
      private final @Nullable Input<Integer> memoryMaxPercent;

    public Input<Integer> getMemoryMaxPercent() {
        return this.memoryMaxPercent == null ? Input.empty() : this.memoryMaxPercent;
    }

    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @InputImport(name="networkThroughputAverageKbps")
      private final @Nullable Input<String> networkThroughputAverageKbps;

    public Input<String> getNetworkThroughputAverageKbps() {
        return this.networkThroughputAverageKbps == null ? Input.empty() : this.networkThroughputAverageKbps;
    }

    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @InputImport(name="networkThroughputMaxKbps")
      private final @Nullable Input<String> networkThroughputMaxKbps;

    public Input<String> getNetworkThroughputMaxKbps() {
        return this.networkThroughputMaxKbps == null ? Input.empty() : this.networkThroughputMaxKbps;
    }

    public VmUtilizationMetricsArgs(
        @Nullable Input<Integer> cpuAveragePercent,
        @Nullable Input<Integer> cpuMaxPercent,
        @Nullable Input<String> diskIoRateAverageKbps,
        @Nullable Input<String> diskIoRateMaxKbps,
        @Nullable Input<Integer> memoryAveragePercent,
        @Nullable Input<Integer> memoryMaxPercent,
        @Nullable Input<String> networkThroughputAverageKbps,
        @Nullable Input<String> networkThroughputMaxKbps) {
        this.cpuAveragePercent = cpuAveragePercent;
        this.cpuMaxPercent = cpuMaxPercent;
        this.diskIoRateAverageKbps = diskIoRateAverageKbps;
        this.diskIoRateMaxKbps = diskIoRateMaxKbps;
        this.memoryAveragePercent = memoryAveragePercent;
        this.memoryMaxPercent = memoryMaxPercent;
        this.networkThroughputAverageKbps = networkThroughputAverageKbps;
        this.networkThroughputMaxKbps = networkThroughputMaxKbps;
    }

    private VmUtilizationMetricsArgs() {
        this.cpuAveragePercent = Input.empty();
        this.cpuMaxPercent = Input.empty();
        this.diskIoRateAverageKbps = Input.empty();
        this.diskIoRateMaxKbps = Input.empty();
        this.memoryAveragePercent = Input.empty();
        this.memoryMaxPercent = Input.empty();
        this.networkThroughputAverageKbps = Input.empty();
        this.networkThroughputMaxKbps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUtilizationMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cpuAveragePercent;
        private @Nullable Input<Integer> cpuMaxPercent;
        private @Nullable Input<String> diskIoRateAverageKbps;
        private @Nullable Input<String> diskIoRateMaxKbps;
        private @Nullable Input<Integer> memoryAveragePercent;
        private @Nullable Input<Integer> memoryMaxPercent;
        private @Nullable Input<String> networkThroughputAverageKbps;
        private @Nullable Input<String> networkThroughputMaxKbps;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUtilizationMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuAveragePercent = defaults.cpuAveragePercent;
    	      this.cpuMaxPercent = defaults.cpuMaxPercent;
    	      this.diskIoRateAverageKbps = defaults.diskIoRateAverageKbps;
    	      this.diskIoRateMaxKbps = defaults.diskIoRateMaxKbps;
    	      this.memoryAveragePercent = defaults.memoryAveragePercent;
    	      this.memoryMaxPercent = defaults.memoryMaxPercent;
    	      this.networkThroughputAverageKbps = defaults.networkThroughputAverageKbps;
    	      this.networkThroughputMaxKbps = defaults.networkThroughputMaxKbps;
        }

        public Builder setCpuAveragePercent(@Nullable Input<Integer> cpuAveragePercent) {
            this.cpuAveragePercent = cpuAveragePercent;
            return this;
        }

        public Builder setCpuAveragePercent(@Nullable Integer cpuAveragePercent) {
            this.cpuAveragePercent = Input.ofNullable(cpuAveragePercent);
            return this;
        }

        public Builder setCpuMaxPercent(@Nullable Input<Integer> cpuMaxPercent) {
            this.cpuMaxPercent = cpuMaxPercent;
            return this;
        }

        public Builder setCpuMaxPercent(@Nullable Integer cpuMaxPercent) {
            this.cpuMaxPercent = Input.ofNullable(cpuMaxPercent);
            return this;
        }

        public Builder setDiskIoRateAverageKbps(@Nullable Input<String> diskIoRateAverageKbps) {
            this.diskIoRateAverageKbps = diskIoRateAverageKbps;
            return this;
        }

        public Builder setDiskIoRateAverageKbps(@Nullable String diskIoRateAverageKbps) {
            this.diskIoRateAverageKbps = Input.ofNullable(diskIoRateAverageKbps);
            return this;
        }

        public Builder setDiskIoRateMaxKbps(@Nullable Input<String> diskIoRateMaxKbps) {
            this.diskIoRateMaxKbps = diskIoRateMaxKbps;
            return this;
        }

        public Builder setDiskIoRateMaxKbps(@Nullable String diskIoRateMaxKbps) {
            this.diskIoRateMaxKbps = Input.ofNullable(diskIoRateMaxKbps);
            return this;
        }

        public Builder setMemoryAveragePercent(@Nullable Input<Integer> memoryAveragePercent) {
            this.memoryAveragePercent = memoryAveragePercent;
            return this;
        }

        public Builder setMemoryAveragePercent(@Nullable Integer memoryAveragePercent) {
            this.memoryAveragePercent = Input.ofNullable(memoryAveragePercent);
            return this;
        }

        public Builder setMemoryMaxPercent(@Nullable Input<Integer> memoryMaxPercent) {
            this.memoryMaxPercent = memoryMaxPercent;
            return this;
        }

        public Builder setMemoryMaxPercent(@Nullable Integer memoryMaxPercent) {
            this.memoryMaxPercent = Input.ofNullable(memoryMaxPercent);
            return this;
        }

        public Builder setNetworkThroughputAverageKbps(@Nullable Input<String> networkThroughputAverageKbps) {
            this.networkThroughputAverageKbps = networkThroughputAverageKbps;
            return this;
        }

        public Builder setNetworkThroughputAverageKbps(@Nullable String networkThroughputAverageKbps) {
            this.networkThroughputAverageKbps = Input.ofNullable(networkThroughputAverageKbps);
            return this;
        }

        public Builder setNetworkThroughputMaxKbps(@Nullable Input<String> networkThroughputMaxKbps) {
            this.networkThroughputMaxKbps = networkThroughputMaxKbps;
            return this;
        }

        public Builder setNetworkThroughputMaxKbps(@Nullable String networkThroughputMaxKbps) {
            this.networkThroughputMaxKbps = Input.ofNullable(networkThroughputMaxKbps);
            return this;
        }
        public VmUtilizationMetricsArgs build() {
            return new VmUtilizationMetricsArgs(cpuAveragePercent, cpuMaxPercent, diskIoRateAverageKbps, diskIoRateMaxKbps, memoryAveragePercent, memoryMaxPercent, networkThroughputAverageKbps, networkThroughputMaxKbps);
        }
    }
}