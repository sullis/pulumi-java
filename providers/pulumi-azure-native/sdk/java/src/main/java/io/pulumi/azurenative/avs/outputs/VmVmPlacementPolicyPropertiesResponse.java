// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VmVmPlacementPolicyPropertiesResponse {
    /**
     * placement policy affinity type
     * 
     */
    private final String affinityType;
    /**
     * Display name of the placement policy
     * 
     */
    private final @Nullable String displayName;
    /**
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * Whether the placement policy is enabled or disabled
     * 
     */
    private final @Nullable String state;
    /**
     * placement policy type
     * Expected value is 'VmVm'.
     * 
     */
    private final String type;
    /**
     * Virtual machine members list
     * 
     */
    private final List<String> vmMembers;

    @OutputCustomType.Constructor({"affinityType","displayName","provisioningState","state","type","vmMembers"})
    private VmVmPlacementPolicyPropertiesResponse(
        String affinityType,
        @Nullable String displayName,
        String provisioningState,
        @Nullable String state,
        String type,
        List<String> vmMembers) {
        this.affinityType = Objects.requireNonNull(affinityType);
        this.displayName = displayName;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.state = state;
        this.type = Objects.requireNonNull(type);
        this.vmMembers = Objects.requireNonNull(vmMembers);
    }

    /**
     * placement policy affinity type
     * 
     */
    public String getAffinityType() {
        return this.affinityType;
    }
    /**
     * Display name of the placement policy
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The provisioning state
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether the placement policy is enabled or disabled
     * 
     */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * placement policy type
     * Expected value is 'VmVm'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Virtual machine members list
     * 
     */
    public List<String> getVmMembers() {
        return this.vmMembers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmVmPlacementPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String affinityType;
        private @Nullable String displayName;
        private String provisioningState;
        private @Nullable String state;
        private String type;
        private List<String> vmMembers;

        public Builder() {
    	      // Empty
        }

        public Builder(VmVmPlacementPolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityType = defaults.affinityType;
    	      this.displayName = defaults.displayName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.vmMembers = defaults.vmMembers;
        }

        public Builder setAffinityType(String affinityType) {
            this.affinityType = Objects.requireNonNull(affinityType);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVmMembers(List<String> vmMembers) {
            this.vmMembers = Objects.requireNonNull(vmMembers);
            return this;
        }

        public VmVmPlacementPolicyPropertiesResponse build() {
            return new VmVmPlacementPolicyPropertiesResponse(affinityType, displayName, provisioningState, state, type, vmMembers);
        }
    }
}
