// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerDnsAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerDnsAliasArgs Empty = new GetServerDnsAliasArgs();

    /**
     * The name of the server dns alias.
     * 
     */
    @Import(name="dnsAliasName", required=true)
    private String dnsAliasName;

    /**
     * @return The name of the server dns alias.
     * 
     */
    public String dnsAliasName() {
        return this.dnsAliasName;
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
     * The name of the server that the alias is pointing to.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    /**
     * @return The name of the server that the alias is pointing to.
     * 
     */
    public String serverName() {
        return this.serverName;
    }

    private GetServerDnsAliasArgs() {}

    private GetServerDnsAliasArgs(GetServerDnsAliasArgs $) {
        this.dnsAliasName = $.dnsAliasName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerDnsAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerDnsAliasArgs $;

        public Builder() {
            $ = new GetServerDnsAliasArgs();
        }

        public Builder(GetServerDnsAliasArgs defaults) {
            $ = new GetServerDnsAliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsAliasName The name of the server dns alias.
         * 
         * @return builder
         * 
         */
        public Builder dnsAliasName(String dnsAliasName) {
            $.dnsAliasName = dnsAliasName;
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
         * @param serverName The name of the server that the alias is pointing to.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        public GetServerDnsAliasArgs build() {
            $.dnsAliasName = Objects.requireNonNull($.dnsAliasName, "expected parameter 'dnsAliasName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
