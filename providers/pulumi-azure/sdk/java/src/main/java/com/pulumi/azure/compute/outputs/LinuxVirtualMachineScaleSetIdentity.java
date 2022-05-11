// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxVirtualMachineScaleSetIdentity {
    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Linux Virtual Machine Scale Set.
     * 
     */
    private final @Nullable List<String> identityIds;
    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    private final @Nullable String principalId;
    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Linux Virtual Machine Scale Set. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    private final String type;

    @CustomType.Constructor
    private LinuxVirtualMachineScaleSetIdentity(
        @CustomType.Parameter("identityIds") @Nullable List<String> identityIds,
        @CustomType.Parameter("principalId") @Nullable String principalId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("type") String type) {
        this.identityIds = identityIds;
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Linux Virtual Machine Scale Set.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds == null ? List.of() : this.identityIds;
    }
    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Linux Virtual Machine Scale Set. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxVirtualMachineScaleSetIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> identityIds;
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxVirtualMachineScaleSetIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder identityIds(@Nullable List<String> identityIds) {
            this.identityIds = identityIds;
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public LinuxVirtualMachineScaleSetIdentity build() {
            return new LinuxVirtualMachineScaleSetIdentity(identityIds, principalId, tenantId, type);
        }
    }
}
