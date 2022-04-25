// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedVirtualNetworkSettingsResponse {
    /**
     * @return Allowed Aad Tenant Ids For Linking
     * 
     */
    private final @Nullable List<String> allowedAadTenantIdsForLinking;
    /**
     * @return Linked Access Check On Target Resource
     * 
     */
    private final @Nullable Boolean linkedAccessCheckOnTargetResource;
    /**
     * @return Prevent Data Exfiltration
     * 
     */
    private final @Nullable Boolean preventDataExfiltration;

    @CustomType.Constructor
    private ManagedVirtualNetworkSettingsResponse(
        @CustomType.Parameter("allowedAadTenantIdsForLinking") @Nullable List<String> allowedAadTenantIdsForLinking,
        @CustomType.Parameter("linkedAccessCheckOnTargetResource") @Nullable Boolean linkedAccessCheckOnTargetResource,
        @CustomType.Parameter("preventDataExfiltration") @Nullable Boolean preventDataExfiltration) {
        this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
        this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
        this.preventDataExfiltration = preventDataExfiltration;
    }

    /**
     * @return Allowed Aad Tenant Ids For Linking
     * 
     */
    public List<String> allowedAadTenantIdsForLinking() {
        return this.allowedAadTenantIdsForLinking == null ? List.of() : this.allowedAadTenantIdsForLinking;
    }
    /**
     * @return Linked Access Check On Target Resource
     * 
     */
    public Optional<Boolean> linkedAccessCheckOnTargetResource() {
        return Optional.ofNullable(this.linkedAccessCheckOnTargetResource);
    }
    /**
     * @return Prevent Data Exfiltration
     * 
     */
    public Optional<Boolean> preventDataExfiltration() {
        return Optional.ofNullable(this.preventDataExfiltration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedVirtualNetworkSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedAadTenantIdsForLinking;
        private @Nullable Boolean linkedAccessCheckOnTargetResource;
        private @Nullable Boolean preventDataExfiltration;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedVirtualNetworkSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAadTenantIdsForLinking = defaults.allowedAadTenantIdsForLinking;
    	      this.linkedAccessCheckOnTargetResource = defaults.linkedAccessCheckOnTargetResource;
    	      this.preventDataExfiltration = defaults.preventDataExfiltration;
        }

        public Builder allowedAadTenantIdsForLinking(@Nullable List<String> allowedAadTenantIdsForLinking) {
            this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
            return this;
        }
        public Builder allowedAadTenantIdsForLinking(String... allowedAadTenantIdsForLinking) {
            return allowedAadTenantIdsForLinking(List.of(allowedAadTenantIdsForLinking));
        }
        public Builder linkedAccessCheckOnTargetResource(@Nullable Boolean linkedAccessCheckOnTargetResource) {
            this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
            return this;
        }
        public Builder preventDataExfiltration(@Nullable Boolean preventDataExfiltration) {
            this.preventDataExfiltration = preventDataExfiltration;
            return this;
        }        public ManagedVirtualNetworkSettingsResponse build() {
            return new ManagedVirtualNetworkSettingsResponse(allowedAadTenantIdsForLinking, linkedAccessCheckOnTargetResource, preventDataExfiltration);
        }
    }
}
