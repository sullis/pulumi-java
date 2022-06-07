// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyArgs Empty = new GetFirewallPolicyArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
    private @Nullable Output<String> expand;

    /**
     * @return Expands referenced resources.
     * 
     */
    public Optional<Output<String>> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the Firewall Policy.
     * 
     */
    @Import(name="firewallPolicyName", required=true)
    private Output<String> firewallPolicyName;

    /**
     * @return The name of the Firewall Policy.
     * 
     */
    public Output<String> firewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFirewallPolicyArgs() {}

    private GetFirewallPolicyArgs(GetFirewallPolicyArgs $) {
        this.expand = $.expand;
        this.firewallPolicyName = $.firewallPolicyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyArgs $;

        public Builder() {
            $ = new GetFirewallPolicyArgs();
        }

        public Builder(GetFirewallPolicyArgs defaults) {
            $ = new GetFirewallPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Expands referenced resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable Output<String> expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param expand Expands referenced resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(String expand) {
            return expand(Output.of(expand));
        }

        /**
         * @param firewallPolicyName The name of the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyName(Output<String> firewallPolicyName) {
            $.firewallPolicyName = firewallPolicyName;
            return this;
        }

        /**
         * @param firewallPolicyName The name of the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyName(String firewallPolicyName) {
            return firewallPolicyName(Output.of(firewallPolicyName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetFirewallPolicyArgs build() {
            $.firewallPolicyName = Objects.requireNonNull($.firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
