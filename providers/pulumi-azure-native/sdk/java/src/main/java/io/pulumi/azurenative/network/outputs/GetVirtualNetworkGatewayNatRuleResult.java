// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.VpnNatRuleMappingResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualNetworkGatewayNatRuleResult {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The private IP address external mapping for NAT.
     * 
     */
    private final @Nullable List<VpnNatRuleMappingResponse> externalMappings;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The private IP address internal mapping for NAT.
     * 
     */
    private final @Nullable List<VpnNatRuleMappingResponse> internalMappings;
    /**
     * The IP Configuration ID this NAT rule applies to.
     * 
     */
    private final @Nullable String ipConfigurationId;
    /**
     * The Source NAT direction of a VPN NAT.
     * 
     */
    private final @Nullable String mode;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the NAT Rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","externalMappings","id","internalMappings","ipConfigurationId","mode","name","provisioningState","type"})
    private GetVirtualNetworkGatewayNatRuleResult(
        String etag,
        @Nullable List<VpnNatRuleMappingResponse> externalMappings,
        @Nullable String id,
        @Nullable List<VpnNatRuleMappingResponse> internalMappings,
        @Nullable String ipConfigurationId,
        @Nullable String mode,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.externalMappings = externalMappings;
        this.id = id;
        this.internalMappings = internalMappings;
        this.ipConfigurationId = ipConfigurationId;
        this.mode = mode;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The private IP address external mapping for NAT.
     * 
     */
    public List<VpnNatRuleMappingResponse> getExternalMappings() {
        return this.externalMappings == null ? List.of() : this.externalMappings;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The private IP address internal mapping for NAT.
     * 
     */
    public List<VpnNatRuleMappingResponse> getInternalMappings() {
        return this.internalMappings == null ? List.of() : this.internalMappings;
    }
    /**
     * The IP Configuration ID this NAT rule applies to.
     * 
     */
    public Optional<String> getIpConfigurationId() {
        return Optional.ofNullable(this.ipConfigurationId);
    }
    /**
     * The Source NAT direction of a VPN NAT.
     * 
     */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the NAT Rule resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayNatRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable List<VpnNatRuleMappingResponse> externalMappings;
        private @Nullable String id;
        private @Nullable List<VpnNatRuleMappingResponse> internalMappings;
        private @Nullable String ipConfigurationId;
        private @Nullable String mode;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayNatRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.externalMappings = defaults.externalMappings;
    	      this.id = defaults.id;
    	      this.internalMappings = defaults.internalMappings;
    	      this.ipConfigurationId = defaults.ipConfigurationId;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExternalMappings(@Nullable List<VpnNatRuleMappingResponse> externalMappings) {
            this.externalMappings = externalMappings;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInternalMappings(@Nullable List<VpnNatRuleMappingResponse> internalMappings) {
            this.internalMappings = internalMappings;
            return this;
        }

        public Builder setIpConfigurationId(@Nullable String ipConfigurationId) {
            this.ipConfigurationId = ipConfigurationId;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetVirtualNetworkGatewayNatRuleResult build() {
            return new GetVirtualNetworkGatewayNatRuleResult(etag, externalMappings, id, internalMappings, ipConfigurationId, mode, name, provisioningState, type);
        }
    }
}
