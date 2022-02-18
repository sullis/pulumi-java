// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.GpuResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The resource requests.
 * 
 */
public final class ResourceRequestsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceRequestsArgs Empty = new ResourceRequestsArgs();

    /**
     * The CPU request of this container instance.
     * 
     */
    @InputImport(name="cpu", required=true)
    private final Input<Double> cpu;

    public Input<Double> getCpu() {
        return this.cpu;
    }

    /**
     * The GPU request of this container instance.
     * 
     */
    @InputImport(name="gpu")
    private final @Nullable Input<GpuResourceArgs> gpu;

    public Input<GpuResourceArgs> getGpu() {
        return this.gpu == null ? Input.empty() : this.gpu;
    }

    /**
     * The memory request in GB of this container instance.
     * 
     */
    @InputImport(name="memoryInGB", required=true)
    private final Input<Double> memoryInGB;

    public Input<Double> getMemoryInGB() {
        return this.memoryInGB;
    }

    public ResourceRequestsArgs(
        Input<Double> cpu,
        @Nullable Input<GpuResourceArgs> gpu,
        Input<Double> memoryInGB) {
        this.cpu = Objects.requireNonNull(cpu, "expected parameter 'cpu' to be non-null");
        this.gpu = gpu;
        this.memoryInGB = Objects.requireNonNull(memoryInGB, "expected parameter 'memoryInGB' to be non-null");
    }

    private ResourceRequestsArgs() {
        this.cpu = Input.empty();
        this.gpu = Input.empty();
        this.memoryInGB = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequestsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Double> cpu;
        private @Nullable Input<GpuResourceArgs> gpu;
        private Input<Double> memoryInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequestsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.gpu = defaults.gpu;
    	      this.memoryInGB = defaults.memoryInGB;
        }

        public Builder setCpu(Input<Double> cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setCpu(Double cpu) {
            this.cpu = Input.of(Objects.requireNonNull(cpu));
            return this;
        }

        public Builder setGpu(@Nullable Input<GpuResourceArgs> gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setGpu(@Nullable GpuResourceArgs gpu) {
            this.gpu = Input.ofNullable(gpu);
            return this;
        }

        public Builder setMemoryInGB(Input<Double> memoryInGB) {
            this.memoryInGB = Objects.requireNonNull(memoryInGB);
            return this;
        }

        public Builder setMemoryInGB(Double memoryInGB) {
            this.memoryInGB = Input.of(Objects.requireNonNull(memoryInGB));
            return this;
        }

        public ResourceRequestsArgs build() {
            return new ResourceRequestsArgs(cpu, gpu, memoryInGB);
        }
    }
}
