// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerSecurityAlertPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerSecurityAlertPolicyArgs Empty = new GetServerSecurityAlertPolicyArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the security alert policy.
     * 
     */
    @Import(name="securityAlertPolicyName", required=true)
    private String securityAlertPolicyName;

    /**
     * @return The name of the security alert policy.
     * 
     */
    public String securityAlertPolicyName() {
        return this.securityAlertPolicyName;
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

    private GetServerSecurityAlertPolicyArgs() {}

    private GetServerSecurityAlertPolicyArgs(GetServerSecurityAlertPolicyArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.securityAlertPolicyName = $.securityAlertPolicyName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerSecurityAlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerSecurityAlertPolicyArgs $;

        public Builder() {
            $ = new GetServerSecurityAlertPolicyArgs();
        }

        public Builder(GetServerSecurityAlertPolicyArgs defaults) {
            $ = new GetServerSecurityAlertPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param securityAlertPolicyName The name of the security alert policy.
         * 
         * @return builder
         * 
         */
        public Builder securityAlertPolicyName(String securityAlertPolicyName) {
            $.securityAlertPolicyName = securityAlertPolicyName;
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

        public GetServerSecurityAlertPolicyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.securityAlertPolicyName = Objects.requireNonNull($.securityAlertPolicyName, "expected parameter 'securityAlertPolicyName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
