// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualMachineIdentityResponseUserAssignedIdentities {
    /**
     * @return The client id of user assigned identity.
     * 
     */
    private final String clientId;
    /**
     * @return The principal id of user assigned identity.
     * 
     */
    private final String principalId;

    @CustomType.Constructor
    private VirtualMachineIdentityResponseUserAssignedIdentities(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("principalId") String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    /**
     * @return The client id of user assigned identity.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The principal id of user assigned identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineIdentityResponseUserAssignedIdentities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineIdentityResponseUserAssignedIdentities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }        public VirtualMachineIdentityResponseUserAssignedIdentities build() {
            return new VirtualMachineIdentityResponseUserAssignedIdentities(clientId, principalId);
        }
    }
}
