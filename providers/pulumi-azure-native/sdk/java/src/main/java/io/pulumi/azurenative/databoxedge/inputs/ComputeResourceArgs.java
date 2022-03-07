// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Compute infrastructure Resource
 * 
 */
public final class ComputeResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeResourceArgs Empty = new ComputeResourceArgs();

    /**
     * Memory in GB
     * 
     */
    @InputImport(name="memoryInGB", required=true)
      private final Input<Double> memoryInGB;

    public Input<Double> getMemoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Processor count
     * 
     */
    @InputImport(name="processorCount", required=true)
      private final Input<Integer> processorCount;

    public Input<Integer> getProcessorCount() {
        return this.processorCount;
    }

    public ComputeResourceArgs(
        Input<Double> memoryInGB,
        Input<Integer> processorCount) {
        this.memoryInGB = Objects.requireNonNull(memoryInGB, "expected parameter 'memoryInGB' to be non-null");
        this.processorCount = Objects.requireNonNull(processorCount, "expected parameter 'processorCount' to be non-null");
    }

    private ComputeResourceArgs() {
        this.memoryInGB = Input.empty();
        this.processorCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Double> memoryInGB;
        private Input<Integer> processorCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.processorCount = defaults.processorCount;
        }

        public Builder setMemoryInGB(Input<Double> memoryInGB) {
            this.memoryInGB = Objects.requireNonNull(memoryInGB);
            return this;
        }

        public Builder setMemoryInGB(Double memoryInGB) {
            this.memoryInGB = Input.of(Objects.requireNonNull(memoryInGB));
            return this;
        }

        public Builder setProcessorCount(Input<Integer> processorCount) {
            this.processorCount = Objects.requireNonNull(processorCount);
            return this;
        }

        public Builder setProcessorCount(Integer processorCount) {
            this.processorCount = Input.of(Objects.requireNonNull(processorCount));
            return this;
        }
        public ComputeResourceArgs build() {
            return new ComputeResourceArgs(memoryInGB, processorCount);
        }
    }
}