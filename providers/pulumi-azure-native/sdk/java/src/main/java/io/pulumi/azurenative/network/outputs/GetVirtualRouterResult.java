// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualRouterResult {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The Gateway on which VirtualRouter is hosted.
     * 
     */
    private final @Nullable SubResourceResponse hostedGateway;
    /**
     * The Subnet on which VirtualRouter is hosted.
     * 
     */
    private final @Nullable SubResourceResponse hostedSubnet;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * List of references to VirtualRouterPeerings.
     * 
     */
    private final List<SubResourceResponse> peerings;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * VirtualRouter ASN.
     * 
     */
    private final @Nullable Double virtualRouterAsn;
    /**
     * VirtualRouter IPs.
     * 
     */
    private final @Nullable List<String> virtualRouterIps;

    @OutputCustomType.Constructor({"etag","hostedGateway","hostedSubnet","id","location","name","peerings","provisioningState","tags","type","virtualRouterAsn","virtualRouterIps"})
    private GetVirtualRouterResult(
        String etag,
        @Nullable SubResourceResponse hostedGateway,
        @Nullable SubResourceResponse hostedSubnet,
        @Nullable String id,
        @Nullable String location,
        String name,
        List<SubResourceResponse> peerings,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable Double virtualRouterAsn,
        @Nullable List<String> virtualRouterIps) {
        this.etag = Objects.requireNonNull(etag);
        this.hostedGateway = hostedGateway;
        this.hostedSubnet = hostedSubnet;
        this.id = id;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.peerings = Objects.requireNonNull(peerings);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualRouterAsn = virtualRouterAsn;
        this.virtualRouterIps = virtualRouterIps;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The Gateway on which VirtualRouter is hosted.
     * 
     */
    public Optional<SubResourceResponse> getHostedGateway() {
        return Optional.ofNullable(this.hostedGateway);
    }
    /**
     * The Subnet on which VirtualRouter is hosted.
     * 
     */
    public Optional<SubResourceResponse> getHostedSubnet() {
        return Optional.ofNullable(this.hostedSubnet);
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of references to VirtualRouterPeerings.
     * 
     */
    public List<SubResourceResponse> getPeerings() {
        return this.peerings;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * VirtualRouter ASN.
     * 
     */
    public Optional<Double> getVirtualRouterAsn() {
        return Optional.ofNullable(this.virtualRouterAsn);
    }
    /**
     * VirtualRouter IPs.
     * 
     */
    public List<String> getVirtualRouterIps() {
        return this.virtualRouterIps == null ? List.of() : this.virtualRouterIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualRouterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable SubResourceResponse hostedGateway;
        private @Nullable SubResourceResponse hostedSubnet;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private List<SubResourceResponse> peerings;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Double virtualRouterAsn;
        private @Nullable List<String> virtualRouterIps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualRouterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.hostedGateway = defaults.hostedGateway;
    	      this.hostedSubnet = defaults.hostedSubnet;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peerings = defaults.peerings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualRouterAsn = defaults.virtualRouterAsn;
    	      this.virtualRouterIps = defaults.virtualRouterIps;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHostedGateway(@Nullable SubResourceResponse hostedGateway) {
            this.hostedGateway = hostedGateway;
            return this;
        }

        public Builder setHostedSubnet(@Nullable SubResourceResponse hostedSubnet) {
            this.hostedSubnet = hostedSubnet;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPeerings(List<SubResourceResponse> peerings) {
            this.peerings = Objects.requireNonNull(peerings);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualRouterAsn(@Nullable Double virtualRouterAsn) {
            this.virtualRouterAsn = virtualRouterAsn;
            return this;
        }

        public Builder setVirtualRouterIps(@Nullable List<String> virtualRouterIps) {
            this.virtualRouterIps = virtualRouterIps;
            return this;
        }

        public GetVirtualRouterResult build() {
            return new GetVirtualRouterResult(etag, hostedGateway, hostedSubnet, id, location, name, peerings, provisioningState, tags, type, virtualRouterAsn, virtualRouterIps);
        }
    }
}
