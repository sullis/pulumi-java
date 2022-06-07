// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerBlobAuditingPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerBlobAuditingPolicyArgs Empty = new GetServerBlobAuditingPolicyArgs();

    /**
     * The name of the blob auditing policy.
     * 
     */
    @Import(name="blobAuditingPolicyName", required=true)
    private Output<String> blobAuditingPolicyName;

    /**
     * @return The name of the blob auditing policy.
     * 
     */
    public Output<String> blobAuditingPolicyName() {
        return this.blobAuditingPolicyName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    private GetServerBlobAuditingPolicyArgs() {}

    private GetServerBlobAuditingPolicyArgs(GetServerBlobAuditingPolicyArgs $) {
        this.blobAuditingPolicyName = $.blobAuditingPolicyName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerBlobAuditingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerBlobAuditingPolicyArgs $;

        public Builder() {
            $ = new GetServerBlobAuditingPolicyArgs();
        }

        public Builder(GetServerBlobAuditingPolicyArgs defaults) {
            $ = new GetServerBlobAuditingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blobAuditingPolicyName The name of the blob auditing policy.
         * 
         * @return builder
         * 
         */
        public Builder blobAuditingPolicyName(Output<String> blobAuditingPolicyName) {
            $.blobAuditingPolicyName = blobAuditingPolicyName;
            return this;
        }

        /**
         * @param blobAuditingPolicyName The name of the blob auditing policy.
         * 
         * @return builder
         * 
         */
        public Builder blobAuditingPolicyName(String blobAuditingPolicyName) {
            return blobAuditingPolicyName(Output.of(blobAuditingPolicyName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public GetServerBlobAuditingPolicyArgs build() {
            $.blobAuditingPolicyName = Objects.requireNonNull($.blobAuditingPolicyName, "expected parameter 'blobAuditingPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
