// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.DedicatedHostAvailableCapacityResponse;
import com.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DedicatedHostInstanceViewWithNameResponse {
    /**
     * @return Specifies the unique id of the dedicated physical machine on which the dedicated host resides.
     * 
     */
    private final String assetId;
    /**
     * @return Unutilized capacity of the dedicated host.
     * 
     */
    private final @Nullable DedicatedHostAvailableCapacityResponse availableCapacity;
    /**
     * @return The name of the dedicated host.
     * 
     */
    private final String name;
    /**
     * @return The resource status information.
     * 
     */
    private final @Nullable List<InstanceViewStatusResponse> statuses;

    @CustomType.Constructor
    private DedicatedHostInstanceViewWithNameResponse(
        @CustomType.Parameter("assetId") String assetId,
        @CustomType.Parameter("availableCapacity") @Nullable DedicatedHostAvailableCapacityResponse availableCapacity,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("statuses") @Nullable List<InstanceViewStatusResponse> statuses) {
        this.assetId = assetId;
        this.availableCapacity = availableCapacity;
        this.name = name;
        this.statuses = statuses;
    }

    /**
     * @return Specifies the unique id of the dedicated physical machine on which the dedicated host resides.
     * 
     */
    public String assetId() {
        return this.assetId;
    }
    /**
     * @return Unutilized capacity of the dedicated host.
     * 
     */
    public Optional<DedicatedHostAvailableCapacityResponse> availableCapacity() {
        return Optional.ofNullable(this.availableCapacity);
    }
    /**
     * @return The name of the dedicated host.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource status information.
     * 
     */
    public List<InstanceViewStatusResponse> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostInstanceViewWithNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetId;
        private @Nullable DedicatedHostAvailableCapacityResponse availableCapacity;
        private String name;
        private @Nullable List<InstanceViewStatusResponse> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostInstanceViewWithNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.availableCapacity = defaults.availableCapacity;
    	      this.name = defaults.name;
    	      this.statuses = defaults.statuses;
        }

        public Builder assetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }
        public Builder availableCapacity(@Nullable DedicatedHostAvailableCapacityResponse availableCapacity) {
            this.availableCapacity = availableCapacity;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(InstanceViewStatusResponse... statuses) {
            return statuses(List.of(statuses));
        }        public DedicatedHostInstanceViewWithNameResponse build() {
            return new DedicatedHostInstanceViewWithNameResponse(assetId, availableCapacity, name, statuses);
        }
    }
}
