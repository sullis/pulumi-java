// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterNodePoolNodeConfigGuestAccelerator {
    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    private final Integer count;
    /**
     * Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig [user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    private final @Nullable String gpuPartitionSize;
    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"count","gpuPartitionSize","type"})
    private ClusterNodePoolNodeConfigGuestAccelerator(
        Integer count,
        @Nullable String gpuPartitionSize,
        String type) {
        this.count = Objects.requireNonNull(count);
        this.gpuPartitionSize = gpuPartitionSize;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    public Integer getCount() {
        return this.count;
    }
    /**
     * Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig [user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    public Optional<String> getGpuPartitionSize() {
        return Optional.ofNullable(this.gpuPartitionSize);
    }
    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigGuestAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private @Nullable String gpuPartitionSize;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
    	      this.type = defaults.type;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setGpuPartitionSize(@Nullable String gpuPartitionSize) {
            this.gpuPartitionSize = gpuPartitionSize;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ClusterNodePoolNodeConfigGuestAccelerator build() {
            return new ClusterNodePoolNodeConfigGuestAccelerator(count, gpuPartitionSize, type);
        }
    }
}
