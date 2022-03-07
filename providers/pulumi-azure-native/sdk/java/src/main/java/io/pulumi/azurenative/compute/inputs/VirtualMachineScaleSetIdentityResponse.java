// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetIdentityResponseUserAssignedIdentities;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity for the virtual machine scale set.
 * 
 */
public final class VirtualMachineScaleSetIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetIdentityResponse Empty = new VirtualMachineScaleSetIdentityResponse();

    /**
     * The principal id of virtual machine scale set identity. This property will only be provided for a system assigned identity.
     * 
     */
    @InputImport(name="principalId", required=true)
      private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The tenant id associated with the virtual machine scale set. This property will only be provided for a system assigned identity.
     * 
     */
    @InputImport(name="tenantId", required=true)
      private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * The type of identity used for the virtual machine scale set. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the virtual machine scale set.
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The list of user identities associated with the virtual machine scale set. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @InputImport(name="userAssignedIdentities")
      private final @Nullable Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    public Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public VirtualMachineScaleSetIdentityResponse(
        String principalId,
        String tenantId,
        @Nullable String type,
        @Nullable Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private VirtualMachineScaleSetIdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public VirtualMachineScaleSetIdentityResponse build() {
            return new VirtualMachineScaleSetIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}