// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.NatGatewaySkuResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NatGatewayResponse {
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The idle timeout of the nat gateway.
     * 
     */
    private final @Nullable Integer idleTimeoutInMinutes;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The provisioning state of the NAT gateway resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return An array of public ip addresses associated with the nat gateway resource.
     * 
     */
    private final @Nullable List<SubResourceResponse> publicIpAddresses;
    /**
     * @return An array of public ip prefixes associated with the nat gateway resource.
     * 
     */
    private final @Nullable List<SubResourceResponse> publicIpPrefixes;
    /**
     * @return The resource GUID property of the NAT gateway resource.
     * 
     */
    private final String resourceGuid;
    /**
     * @return The nat gateway SKU.
     * 
     */
    private final @Nullable NatGatewaySkuResponse sku;
    /**
     * @return An array of references to the subnets using this nat gateway resource.
     * 
     */
    private final List<SubResourceResponse> subnets;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     */
    private final @Nullable List<String> zones;

    @CustomType.Constructor
    private NatGatewayResponse(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("idleTimeoutInMinutes") @Nullable Integer idleTimeoutInMinutes,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicIpAddresses") @Nullable List<SubResourceResponse> publicIpAddresses,
        @CustomType.Parameter("publicIpPrefixes") @Nullable List<SubResourceResponse> publicIpPrefixes,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("sku") @Nullable NatGatewaySkuResponse sku,
        @CustomType.Parameter("subnets") List<SubResourceResponse> subnets,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.etag = etag;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publicIpAddresses = publicIpAddresses;
        this.publicIpPrefixes = publicIpPrefixes;
        this.resourceGuid = resourceGuid;
        this.sku = sku;
        this.subnets = subnets;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The idle timeout of the nat gateway.
     * 
     */
    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning state of the NAT gateway resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return An array of public ip addresses associated with the nat gateway resource.
     * 
     */
    public List<SubResourceResponse> publicIpAddresses() {
        return this.publicIpAddresses == null ? List.of() : this.publicIpAddresses;
    }
    /**
     * @return An array of public ip prefixes associated with the nat gateway resource.
     * 
     */
    public List<SubResourceResponse> publicIpPrefixes() {
        return this.publicIpPrefixes == null ? List.of() : this.publicIpPrefixes;
    }
    /**
     * @return The resource GUID property of the NAT gateway resource.
     * 
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return The nat gateway SKU.
     * 
     */
    public Optional<NatGatewaySkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return An array of references to the subnets using this nat gateway resource.
     * 
     */
    public List<SubResourceResponse> subnets() {
        return this.subnets;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatGatewayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable List<SubResourceResponse> publicIpAddresses;
        private @Nullable List<SubResourceResponse> publicIpPrefixes;
        private String resourceGuid;
        private @Nullable NatGatewaySkuResponse sku;
        private List<SubResourceResponse> subnets;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(NatGatewayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIpAddresses = defaults.publicIpAddresses;
    	      this.publicIpPrefixes = defaults.publicIpPrefixes;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.sku = defaults.sku;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicIpAddresses(@Nullable List<SubResourceResponse> publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public Builder publicIpAddresses(SubResourceResponse... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }
        public Builder publicIpPrefixes(@Nullable List<SubResourceResponse> publicIpPrefixes) {
            this.publicIpPrefixes = publicIpPrefixes;
            return this;
        }
        public Builder publicIpPrefixes(SubResourceResponse... publicIpPrefixes) {
            return publicIpPrefixes(List.of(publicIpPrefixes));
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder sku(@Nullable NatGatewaySkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder subnets(List<SubResourceResponse> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(SubResourceResponse... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public NatGatewayResponse build() {
            return new NatGatewayResponse(etag, id, idleTimeoutInMinutes, location, name, provisioningState, publicIpAddresses, publicIpPrefixes, resourceGuid, sku, subnets, tags, type, zones);
        }
    }
}
