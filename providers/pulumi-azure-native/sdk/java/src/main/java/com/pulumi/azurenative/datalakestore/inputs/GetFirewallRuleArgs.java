// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallRuleArgs Empty = new GetFirewallRuleArgs();

    /**
     * The name of the Data Lake Store account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the Data Lake Store account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the firewall rule to retrieve.
     * 
     */
    @Import(name="firewallRuleName", required=true)
    private String firewallRuleName;

    /**
     * @return The name of the firewall rule to retrieve.
     * 
     */
    public String firewallRuleName() {
        return this.firewallRuleName;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Azure resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFirewallRuleArgs() {}

    private GetFirewallRuleArgs(GetFirewallRuleArgs $) {
        this.accountName = $.accountName;
        this.firewallRuleName = $.firewallRuleName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallRuleArgs $;

        public Builder() {
            $ = new GetFirewallRuleArgs();
        }

        public Builder(GetFirewallRuleArgs defaults) {
            $ = new GetFirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Data Lake Store account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param firewallRuleName The name of the firewall rule to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder firewallRuleName(String firewallRuleName) {
            $.firewallRuleName = firewallRuleName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetFirewallRuleArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.firewallRuleName = Objects.requireNonNull($.firewallRuleName, "expected parameter 'firewallRuleName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
