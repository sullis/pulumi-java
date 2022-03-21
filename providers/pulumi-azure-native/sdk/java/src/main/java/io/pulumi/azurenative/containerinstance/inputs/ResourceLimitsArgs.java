// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.GpuResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The resource limits.
 * 
 */
public final class ResourceLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceLimitsArgs Empty = new ResourceLimitsArgs();

    /**
     * The CPU limit of this container instance.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<Double> cpu;

    public Output<Double> getCpu() {
        return this.cpu == null ? Output.empty() : this.cpu;
    }

    /**
     * The GPU limit of this container instance.
     * 
     */
    @Import(name="gpu")
      private final @Nullable Output<GpuResourceArgs> gpu;

    public Output<GpuResourceArgs> getGpu() {
        return this.gpu == null ? Output.empty() : this.gpu;
    }

    /**
     * The memory limit in GB of this container instance.
     * 
     */
    @Import(name="memoryInGB")
      private final @Nullable Output<Double> memoryInGB;

    public Output<Double> getMemoryInGB() {
        return this.memoryInGB == null ? Output.empty() : this.memoryInGB;
    }

    public ResourceLimitsArgs(
        @Nullable Output<Double> cpu,
        @Nullable Output<GpuResourceArgs> gpu,
        @Nullable Output<Double> memoryInGB) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memoryInGB = memoryInGB;
    }

    private ResourceLimitsArgs() {
        this.cpu = Output.empty();
        this.gpu = Output.empty();
        this.memoryInGB = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cpu;
        private @Nullable Output<GpuResourceArgs> gpu;
        private @Nullable Output<Double> memoryInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.gpu = defaults.gpu;
    	      this.memoryInGB = defaults.memoryInGB;
        }

        public Builder cpu(@Nullable Output<Double> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Output.ofNullable(cpu);
            return this;
        }
        public Builder gpu(@Nullable Output<GpuResourceArgs> gpu) {
            this.gpu = gpu;
            return this;
        }
        public Builder gpu(@Nullable GpuResourceArgs gpu) {
            this.gpu = Output.ofNullable(gpu);
            return this;
        }
        public Builder memoryInGB(@Nullable Output<Double> memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }
        public Builder memoryInGB(@Nullable Double memoryInGB) {
            this.memoryInGB = Output.ofNullable(memoryInGB);
            return this;
        }        public ResourceLimitsArgs build() {
            return new ResourceLimitsArgs(cpu, gpu, memoryInGB);
        }
    }
}
