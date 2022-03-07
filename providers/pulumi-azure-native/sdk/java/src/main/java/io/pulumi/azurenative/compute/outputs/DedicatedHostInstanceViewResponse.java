// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DedicatedHostAvailableCapacityResponse;
import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DedicatedHostInstanceViewResponse {
    /**
     * Specifies the unique id of the dedicated physical machine on which the dedicated host resides.
     * 
     */
    private final String assetId;
    /**
     * Unutilized capacity of the dedicated host.
     * 
     */
    private final @Nullable DedicatedHostAvailableCapacityResponse availableCapacity;
    /**
     * The resource status information.
     * 
     */
    private final @Nullable List<InstanceViewStatusResponse> statuses;

    @OutputCustomType.Constructor({"assetId","availableCapacity","statuses"})
    private DedicatedHostInstanceViewResponse(
        String assetId,
        @Nullable DedicatedHostAvailableCapacityResponse availableCapacity,
        @Nullable List<InstanceViewStatusResponse> statuses) {
        this.assetId = Objects.requireNonNull(assetId);
        this.availableCapacity = availableCapacity;
        this.statuses = statuses;
    }

    /**
     * Specifies the unique id of the dedicated physical machine on which the dedicated host resides.
     * 
    */
    public String getAssetId() {
        return this.assetId;
    }
    /**
     * Unutilized capacity of the dedicated host.
     * 
    */
    public Optional<DedicatedHostAvailableCapacityResponse> getAvailableCapacity() {
        return Optional.ofNullable(this.availableCapacity);
    }
    /**
     * The resource status information.
     * 
    */
    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetId;
        private @Nullable DedicatedHostAvailableCapacityResponse availableCapacity;
        private @Nullable List<InstanceViewStatusResponse> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.availableCapacity = defaults.availableCapacity;
    	      this.statuses = defaults.statuses;
        }

        public Builder setAssetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }

        public Builder setAvailableCapacity(@Nullable DedicatedHostAvailableCapacityResponse availableCapacity) {
            this.availableCapacity = availableCapacity;
            return this;
        }

        public Builder setStatuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public DedicatedHostInstanceViewResponse build() {
            return new DedicatedHostInstanceViewResponse(assetId, availableCapacity, statuses);
        }
    }
}