// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.PrivateDnsZoneConfigResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrivateDnsZoneGroupResult {
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
     * @return Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * @return A collection of private dns zone configurations of the private dns zone group.
     * 
     */
    private final @Nullable List<PrivateDnsZoneConfigResponse> privateDnsZoneConfigs;
    /**
     * @return The provisioning state of the private dns zone group resource.
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private GetPrivateDnsZoneGroupResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("privateDnsZoneConfigs") @Nullable List<PrivateDnsZoneConfigResponse> privateDnsZoneConfigs,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.privateDnsZoneConfigs = privateDnsZoneConfigs;
        this.provisioningState = provisioningState;
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
     * @return Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return A collection of private dns zone configurations of the private dns zone group.
     * 
     */
    public List<PrivateDnsZoneConfigResponse> privateDnsZoneConfigs() {
        return this.privateDnsZoneConfigs == null ? List.of() : this.privateDnsZoneConfigs;
    }
    /**
     * @return The provisioning state of the private dns zone group resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateDnsZoneGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<PrivateDnsZoneConfigResponse> privateDnsZoneConfigs;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateDnsZoneGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateDnsZoneConfigs = defaults.privateDnsZoneConfigs;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder privateDnsZoneConfigs(@Nullable List<PrivateDnsZoneConfigResponse> privateDnsZoneConfigs) {
            this.privateDnsZoneConfigs = privateDnsZoneConfigs;
            return this;
        }
        public Builder privateDnsZoneConfigs(PrivateDnsZoneConfigResponse... privateDnsZoneConfigs) {
            return privateDnsZoneConfigs(List.of(privateDnsZoneConfigs));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public GetPrivateDnsZoneGroupResult build() {
            return new GetPrivateDnsZoneGroupResult(etag, id, name, privateDnsZoneConfigs, provisioningState);
        }
    }
}
