// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyRuleGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyRuleGroupPlainArgs Empty = new GetFirewallPolicyRuleGroupPlainArgs();

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
     * The name of the FirewallPolicyRuleGroup.
     * 
     */
    @Import(name="ruleGroupName", required=true)
    private String ruleGroupName;

    /**
     * @return The name of the FirewallPolicyRuleGroup.
     * 
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    private GetFirewallPolicyRuleGroupPlainArgs() {}

    private GetFirewallPolicyRuleGroupPlainArgs(GetFirewallPolicyRuleGroupPlainArgs $) {
        this.firewallPolicyName = $.firewallPolicyName;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleGroupName = $.ruleGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyRuleGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyRuleGroupPlainArgs $;

        public Builder() {
            $ = new GetFirewallPolicyRuleGroupPlainArgs();
        }

        public Builder(GetFirewallPolicyRuleGroupPlainArgs defaults) {
            $ = new GetFirewallPolicyRuleGroupPlainArgs(Objects.requireNonNull(defaults));
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
         * @param ruleGroupName The name of the FirewallPolicyRuleGroup.
         * 
         * @return builder
         * 
         */
        public Builder ruleGroupName(String ruleGroupName) {
            $.ruleGroupName = ruleGroupName;
            return this;
        }

        public GetFirewallPolicyRuleGroupPlainArgs build() {
            $.firewallPolicyName = Objects.requireNonNull($.firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.ruleGroupName = Objects.requireNonNull($.ruleGroupName, "expected parameter 'ruleGroupName' to be non-null");
            return $;
        }
    }

}
