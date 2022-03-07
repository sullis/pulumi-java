// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRouteResult {
    /**
     * The destination CIDR to which the route applies.
     * 
     */
    private final @Nullable String addressPrefix;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * A value indicating whether this route overrides overlapping BGP routes regardless of LPM.
     * 
     */
    private final @Nullable Boolean hasBgpOverride;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
     * 
     */
    private final @Nullable String nextHopIpAddress;
    /**
     * The type of Azure hop the packet should be sent to.
     * 
     */
    private final String nextHopType;
    /**
     * The provisioning state of the route resource.
     * 
     */
    private final String provisioningState;
    /**
     * The type of the resource.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"addressPrefix","etag","hasBgpOverride","id","name","nextHopIpAddress","nextHopType","provisioningState","type"})
    private GetRouteResult(
        @Nullable String addressPrefix,
        String etag,
        @Nullable Boolean hasBgpOverride,
        @Nullable String id,
        @Nullable String name,
        @Nullable String nextHopIpAddress,
        String nextHopType,
        String provisioningState,
        @Nullable String type) {
        this.addressPrefix = addressPrefix;
        this.etag = Objects.requireNonNull(etag);
        this.hasBgpOverride = hasBgpOverride;
        this.id = id;
        this.name = name;
        this.nextHopIpAddress = nextHopIpAddress;
        this.nextHopType = Objects.requireNonNull(nextHopType);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = type;
    }

    /**
     * The destination CIDR to which the route applies.
     * 
    */
    public Optional<String> getAddressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * A value indicating whether this route overrides overlapping BGP routes regardless of LPM.
     * 
    */
    public Optional<Boolean> getHasBgpOverride() {
        return Optional.ofNullable(this.hasBgpOverride);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
     * 
    */
    public Optional<String> getNextHopIpAddress() {
        return Optional.ofNullable(this.nextHopIpAddress);
    }
    /**
     * The type of Azure hop the packet should be sent to.
     * 
    */
    public String getNextHopType() {
        return this.nextHopType;
    }
    /**
     * The provisioning state of the route resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The type of the resource.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private String etag;
        private @Nullable Boolean hasBgpOverride;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String nextHopIpAddress;
        private String nextHopType;
        private String provisioningState;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.etag = defaults.etag;
    	      this.hasBgpOverride = defaults.hasBgpOverride;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
    	      this.nextHopType = defaults.nextHopType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHasBgpOverride(@Nullable Boolean hasBgpOverride) {
            this.hasBgpOverride = hasBgpOverride;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }

        public Builder setNextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GetRouteResult build() {
            return new GetRouteResult(addressPrefix, etag, hasBgpOverride, id, name, nextHopIpAddress, nextHopType, provisioningState, type);
        }
    }
}