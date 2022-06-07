// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIPv6FirewallRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIPv6FirewallRulePlainArgs Empty = new GetIPv6FirewallRulePlainArgs();

    /**
     * The name of the firewall rule.
     * 
     */
    @Import(name="firewallRuleName", required=true)
    private String firewallRuleName;

    /**
     * @return The name of the firewall rule.
     * 
     */
    public String firewallRuleName() {
        return this.firewallRuleName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    /**
     * @return The name of the server.
     * 
     */
    public String serverName() {
        return this.serverName;
    }

    private GetIPv6FirewallRulePlainArgs() {}

    private GetIPv6FirewallRulePlainArgs(GetIPv6FirewallRulePlainArgs $) {
        this.firewallRuleName = $.firewallRuleName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIPv6FirewallRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIPv6FirewallRulePlainArgs $;

        public Builder() {
            $ = new GetIPv6FirewallRulePlainArgs();
        }

        public Builder(GetIPv6FirewallRulePlainArgs defaults) {
            $ = new GetIPv6FirewallRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param firewallRuleName The name of the firewall rule.
         * 
         * @return builder
         * 
         */
        public Builder firewallRuleName(String firewallRuleName) {
            $.firewallRuleName = firewallRuleName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        public GetIPv6FirewallRulePlainArgs build() {
            $.firewallRuleName = Objects.requireNonNull($.firewallRuleName, "expected parameter 'firewallRuleName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
