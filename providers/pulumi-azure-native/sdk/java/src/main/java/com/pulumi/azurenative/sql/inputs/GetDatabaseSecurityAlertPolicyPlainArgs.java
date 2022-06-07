// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseSecurityAlertPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseSecurityAlertPolicyPlainArgs Empty = new GetDatabaseSecurityAlertPolicyPlainArgs();

    /**
     * The name of the  database for which the security alert policy is defined.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return The name of the  database for which the security alert policy is defined.
     * 
     */
    public String databaseName() {
        return this.databaseName;
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
     * The name of the  server.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    /**
     * @return The name of the  server.
     * 
     */
    public String serverName() {
        return this.serverName;
    }

    private GetDatabaseSecurityAlertPolicyPlainArgs() {}

    private GetDatabaseSecurityAlertPolicyPlainArgs(GetDatabaseSecurityAlertPolicyPlainArgs $) {
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.securityAlertPolicyName = $.securityAlertPolicyName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseSecurityAlertPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseSecurityAlertPolicyPlainArgs $;

        public Builder() {
            $ = new GetDatabaseSecurityAlertPolicyPlainArgs();
        }

        public Builder(GetDatabaseSecurityAlertPolicyPlainArgs defaults) {
            $ = new GetDatabaseSecurityAlertPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the  database for which the security alert policy is defined.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
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
         * @param serverName The name of the  server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        public GetDatabaseSecurityAlertPolicyPlainArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.securityAlertPolicyName = Objects.requireNonNull($.securityAlertPolicyName, "expected parameter 'securityAlertPolicyName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
