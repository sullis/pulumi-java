// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Utilization metrics values for a single VM.
 * 
 */
public final class VmUtilizationMetricsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmUtilizationMetricsArgs Empty = new VmUtilizationMetricsArgs();

    /**
     * Average CPU usage, percent.
     * 
     */
    @Import(name="cpuAveragePercent")
    private @Nullable Output<Integer> cpuAveragePercent;

    /**
     * @return Average CPU usage, percent.
     * 
     */
    public Optional<Output<Integer>> cpuAveragePercent() {
        return Optional.ofNullable(this.cpuAveragePercent);
    }

    /**
     * Max CPU usage, percent.
     * 
     */
    @Import(name="cpuMaxPercent")
    private @Nullable Output<Integer> cpuMaxPercent;

    /**
     * @return Max CPU usage, percent.
     * 
     */
    public Optional<Output<Integer>> cpuMaxPercent() {
        return Optional.ofNullable(this.cpuMaxPercent);
    }

    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateAverageKbps")
    private @Nullable Output<String> diskIoRateAverageKbps;

    /**
     * @return Average disk IO rate, in kilobytes per second.
     * 
     */
    public Optional<Output<String>> diskIoRateAverageKbps() {
        return Optional.ofNullable(this.diskIoRateAverageKbps);
    }

    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateMaxKbps")
    private @Nullable Output<String> diskIoRateMaxKbps;

    /**
     * @return Max disk IO rate, in kilobytes per second.
     * 
     */
    public Optional<Output<String>> diskIoRateMaxKbps() {
        return Optional.ofNullable(this.diskIoRateMaxKbps);
    }

    /**
     * Average memory usage, percent.
     * 
     */
    @Import(name="memoryAveragePercent")
    private @Nullable Output<Integer> memoryAveragePercent;

    /**
     * @return Average memory usage, percent.
     * 
     */
    public Optional<Output<Integer>> memoryAveragePercent() {
        return Optional.ofNullable(this.memoryAveragePercent);
    }

    /**
     * Max memory usage, percent.
     * 
     */
    @Import(name="memoryMaxPercent")
    private @Nullable Output<Integer> memoryMaxPercent;

    /**
     * @return Max memory usage, percent.
     * 
     */
    public Optional<Output<Integer>> memoryMaxPercent() {
        return Optional.ofNullable(this.memoryMaxPercent);
    }

    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputAverageKbps")
    private @Nullable Output<String> networkThroughputAverageKbps;

    /**
     * @return Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    public Optional<Output<String>> networkThroughputAverageKbps() {
        return Optional.ofNullable(this.networkThroughputAverageKbps);
    }

    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputMaxKbps")
    private @Nullable Output<String> networkThroughputMaxKbps;

    /**
     * @return Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    public Optional<Output<String>> networkThroughputMaxKbps() {
        return Optional.ofNullable(this.networkThroughputMaxKbps);
    }

    private VmUtilizationMetricsArgs() {}

    private VmUtilizationMetricsArgs(VmUtilizationMetricsArgs $) {
        this.cpuAveragePercent = $.cpuAveragePercent;
        this.cpuMaxPercent = $.cpuMaxPercent;
        this.diskIoRateAverageKbps = $.diskIoRateAverageKbps;
        this.diskIoRateMaxKbps = $.diskIoRateMaxKbps;
        this.memoryAveragePercent = $.memoryAveragePercent;
        this.memoryMaxPercent = $.memoryMaxPercent;
        this.networkThroughputAverageKbps = $.networkThroughputAverageKbps;
        this.networkThroughputMaxKbps = $.networkThroughputMaxKbps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmUtilizationMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmUtilizationMetricsArgs $;

        public Builder() {
            $ = new VmUtilizationMetricsArgs();
        }

        public Builder(VmUtilizationMetricsArgs defaults) {
            $ = new VmUtilizationMetricsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuAveragePercent Average CPU usage, percent.
         * 
         * @return builder
         * 
         */
        public Builder cpuAveragePercent(@Nullable Output<Integer> cpuAveragePercent) {
            $.cpuAveragePercent = cpuAveragePercent;
            return this;
        }

        /**
         * @param cpuAveragePercent Average CPU usage, percent.
         * 
         * @return builder
         * 
         */
        public Builder cpuAveragePercent(Integer cpuAveragePercent) {
            return cpuAveragePercent(Output.of(cpuAveragePercent));
        }

        /**
         * @param cpuMaxPercent Max CPU usage, percent.
         * 
         * @return builder
         * 
         */
        public Builder cpuMaxPercent(@Nullable Output<Integer> cpuMaxPercent) {
            $.cpuMaxPercent = cpuMaxPercent;
            return this;
        }

        /**
         * @param cpuMaxPercent Max CPU usage, percent.
         * 
         * @return builder
         * 
         */
        public Builder cpuMaxPercent(Integer cpuMaxPercent) {
            return cpuMaxPercent(Output.of(cpuMaxPercent));
        }

        /**
         * @param diskIoRateAverageKbps Average disk IO rate, in kilobytes per second.
         * 
         * @return builder
         * 
         */
        public Builder diskIoRateAverageKbps(@Nullable Output<String> diskIoRateAverageKbps) {
            $.diskIoRateAverageKbps = diskIoRateAverageKbps;
            return this;
        }

        /**
         * @param diskIoRateAverageKbps Average disk IO rate, in kilobytes per second.
         * 
         * @return builder
         * 
         */
        public Builder diskIoRateAverageKbps(String diskIoRateAverageKbps) {
            return diskIoRateAverageKbps(Output.of(diskIoRateAverageKbps));
        }

        /**
         * @param diskIoRateMaxKbps Max disk IO rate, in kilobytes per second.
         * 
         * @return builder
         * 
         */
        public Builder diskIoRateMaxKbps(@Nullable Output<String> diskIoRateMaxKbps) {
            $.diskIoRateMaxKbps = diskIoRateMaxKbps;
            return this;
        }

        /**
         * @param diskIoRateMaxKbps Max disk IO rate, in kilobytes per second.
         * 
         * @return builder
         * 
         */
        public Builder diskIoRateMaxKbps(String diskIoRateMaxKbps) {
            return diskIoRateMaxKbps(Output.of(diskIoRateMaxKbps));
        }

        /**
         * @param memoryAveragePercent Average memory usage, percent.
         * 
         * @return builder
         * 
         */
        public Builder memoryAveragePercent(@Nullable Output<Integer> memoryAveragePercent) {
            $.memoryAveragePercent = memoryAveragePercent;
            return this;
        }

        /**
         * @param memoryAveragePercent Average memory usage, percent.
         * 
         * @return builder
         * 
         */
        public Builder memoryAveragePercent(Integer memoryAveragePercent) {
            return memoryAveragePercent(Output.of(memoryAveragePercent));
        }

        /**
         * @param memoryMaxPercent Max memory usage, percent.
         * 
         * @return builder
         * 
         */
        public Builder memoryMaxPercent(@Nullable Output<Integer> memoryMaxPercent) {
            $.memoryMaxPercent = memoryMaxPercent;
            return this;
        }

        /**
         * @param memoryMaxPercent Max memory usage, percent.
         * 
         * @return builder
         * 
         */
        public Builder memoryMaxPercent(Integer memoryMaxPercent) {
            return memoryMaxPercent(Output.of(memoryMaxPercent));
        }

        /**
         * @param networkThroughputAverageKbps Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
         * 
         * @return builder
         * 
         */
        public Builder networkThroughputAverageKbps(@Nullable Output<String> networkThroughputAverageKbps) {
            $.networkThroughputAverageKbps = networkThroughputAverageKbps;
            return this;
        }

        /**
         * @param networkThroughputAverageKbps Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
         * 
         * @return builder
         * 
         */
        public Builder networkThroughputAverageKbps(String networkThroughputAverageKbps) {
            return networkThroughputAverageKbps(Output.of(networkThroughputAverageKbps));
        }

        /**
         * @param networkThroughputMaxKbps Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
         * 
         * @return builder
         * 
         */
        public Builder networkThroughputMaxKbps(@Nullable Output<String> networkThroughputMaxKbps) {
            $.networkThroughputMaxKbps = networkThroughputMaxKbps;
            return this;
        }

        /**
         * @param networkThroughputMaxKbps Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
         * 
         * @return builder
         * 
         */
        public Builder networkThroughputMaxKbps(String networkThroughputMaxKbps) {
            return networkThroughputMaxKbps(Output.of(networkThroughputMaxKbps));
        }

        public VmUtilizationMetricsArgs build() {
            return $;
        }
    }

}
