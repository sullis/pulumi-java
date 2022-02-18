// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.GpuResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceRequestsResponse {
    /**
     * The CPU request of this container instance.
     * 
     */
    private final Double cpu;
    /**
     * The GPU request of this container instance.
     * 
     */
    private final @Nullable GpuResourceResponse gpu;
    /**
     * The memory request in GB of this container instance.
     * 
     */
    private final Double memoryInGB;

    @OutputCustomType.Constructor({"cpu","gpu","memoryInGB"})
    private ResourceRequestsResponse(
        Double cpu,
        @Nullable GpuResourceResponse gpu,
        Double memoryInGB) {
        this.cpu = Objects.requireNonNull(cpu);
        this.gpu = gpu;
        this.memoryInGB = Objects.requireNonNull(memoryInGB);
    }

    /**
     * The CPU request of this container instance.
     * 
     */
    public Double getCpu() {
        return this.cpu;
    }
    /**
     * The GPU request of this container instance.
     * 
     */
    public Optional<GpuResourceResponse> getGpu() {
        return Optional.ofNullable(this.gpu);
    }
    /**
     * The memory request in GB of this container instance.
     * 
     */
    public Double getMemoryInGB() {
        return this.memoryInGB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private @Nullable GpuResourceResponse gpu;
        private Double memoryInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.gpu = defaults.gpu;
    	      this.memoryInGB = defaults.memoryInGB;
        }

        public Builder setCpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setGpu(@Nullable GpuResourceResponse gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setMemoryInGB(Double memoryInGB) {
            this.memoryInGB = Objects.requireNonNull(memoryInGB);
            return this;
        }

        public ResourceRequestsResponse build() {
            return new ResourceRequestsResponse(cpu, gpu, memoryInGB);
        }
    }
}
