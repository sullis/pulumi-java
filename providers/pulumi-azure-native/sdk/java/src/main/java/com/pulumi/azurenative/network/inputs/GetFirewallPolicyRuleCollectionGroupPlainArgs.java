// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyRuleCollectionGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyRuleCollectionGroupPlainArgs Empty = new GetFirewallPolicyRuleCollectionGroupPlainArgs();

    /**
     * The name of the Firewall Policy.
     * 
     */
    @Import(name="firewallPolicyName", required=true)
    private String firewallPolicyName;

    /**
     * @return The name of the Firewall Policy.
     * 
     */
    public String firewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the FirewallPolicyRuleCollectionGroup.
     * 
     */
    @Import(name="ruleCollectionGroupName", required=true)
    private String ruleCollectionGroupName;

    /**
     * @return The name of the FirewallPolicyRuleCollectionGroup.
     * 
     */
    public String ruleCollectionGroupName() {
        return this.ruleCollectionGroupName;
    }

    private GetFirewallPolicyRuleCollectionGroupPlainArgs() {}

    private GetFirewallPolicyRuleCollectionGroupPlainArgs(GetFirewallPolicyRuleCollectionGroupPlainArgs $) {
        this.firewallPolicyName = $.firewallPolicyName;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleCollectionGroupName = $.ruleCollectionGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyRuleCollectionGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyRuleCollectionGroupPlainArgs $;

        public Builder() {
            $ = new GetFirewallPolicyRuleCollectionGroupPlainArgs();
        }

        public Builder(GetFirewallPolicyRuleCollectionGroupPlainArgs defaults) {
            $ = new GetFirewallPolicyRuleCollectionGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param firewallPolicyName The name of the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyName(String firewallPolicyName) {
            $.firewallPolicyName = firewallPolicyName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
         * 
         * @return builder
         * 
         */
        public Builder ruleCollectionGroupName(String ruleCollectionGroupName) {
            $.ruleCollectionGroupName = ruleCollectionGroupName;
            return this;
        }

        public GetFirewallPolicyRuleCollectionGroupPlainArgs build() {
            $.firewallPolicyName = Objects.requireNonNull($.firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.ruleCollectionGroupName = Objects.requireNonNull($.ruleCollectionGroupName, "expected parameter 'ruleCollectionGroupName' to be non-null");
            return $;
        }
    }

}
