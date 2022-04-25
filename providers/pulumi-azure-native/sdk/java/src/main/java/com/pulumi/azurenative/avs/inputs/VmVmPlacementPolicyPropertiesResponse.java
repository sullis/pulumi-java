// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VM-VM placement policy properties
 * 
 */
public final class VmVmPlacementPolicyPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final VmVmPlacementPolicyPropertiesResponse Empty = new VmVmPlacementPolicyPropertiesResponse();

    /**
     * placement policy affinity type
     * 
     */
    @Import(name="affinityType", required=true)
    private String affinityType;

    /**
     * @return placement policy affinity type
     * 
     */
    public String affinityType() {
        return this.affinityType;
    }

    /**
     * Display name of the placement policy
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Display name of the placement policy
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The provisioning state
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Whether the placement policy is enabled or disabled
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return Whether the placement policy is enabled or disabled
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * placement policy type
     * Expected value is &#39;VmVm&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return placement policy type
     * Expected value is &#39;VmVm&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Virtual machine members list
     * 
     */
    @Import(name="vmMembers", required=true)
    private List<String> vmMembers;

    /**
     * @return Virtual machine members list
     * 
     */
    public List<String> vmMembers() {
        return this.vmMembers;
    }

    private VmVmPlacementPolicyPropertiesResponse() {}

    private VmVmPlacementPolicyPropertiesResponse(VmVmPlacementPolicyPropertiesResponse $) {
        this.affinityType = $.affinityType;
        this.displayName = $.displayName;
        this.provisioningState = $.provisioningState;
        this.state = $.state;
        this.type = $.type;
        this.vmMembers = $.vmMembers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmVmPlacementPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmVmPlacementPolicyPropertiesResponse $;

        public Builder() {
            $ = new VmVmPlacementPolicyPropertiesResponse();
        }

        public Builder(VmVmPlacementPolicyPropertiesResponse defaults) {
            $ = new VmVmPlacementPolicyPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param affinityType placement policy affinity type
         * 
         * @return builder
         * 
         */
        public Builder affinityType(String affinityType) {
            $.affinityType = affinityType;
            return this;
        }

        /**
         * @param displayName Display name of the placement policy
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param provisioningState The provisioning state
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param state Whether the placement policy is enabled or disabled
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param type placement policy type
         * Expected value is &#39;VmVm&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param vmMembers Virtual machine members list
         * 
         * @return builder
         * 
         */
        public Builder vmMembers(List<String> vmMembers) {
            $.vmMembers = vmMembers;
            return this;
        }

        /**
         * @param vmMembers Virtual machine members list
         * 
         * @return builder
         * 
         */
        public Builder vmMembers(String... vmMembers) {
            return vmMembers(List.of(vmMembers));
        }

        public VmVmPlacementPolicyPropertiesResponse build() {
            $.affinityType = Objects.requireNonNull($.affinityType, "expected parameter 'affinityType' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            $.vmMembers = Objects.requireNonNull($.vmMembers, "expected parameter 'vmMembers' to be non-null");
            return $;
        }
    }

}
