// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlResourceSqlRoleAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlResourceSqlRoleAssignmentArgs Empty = new GetSqlResourceSqlRoleAssignmentArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Cosmos DB database account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The GUID for the Role Assignment.
     * 
     */
    @Import(name="roleAssignmentId", required=true)
    private Output<String> roleAssignmentId;

    /**
     * @return The GUID for the Role Assignment.
     * 
     */
    public Output<String> roleAssignmentId() {
        return this.roleAssignmentId;
    }

    private GetSqlResourceSqlRoleAssignmentArgs() {}

    private GetSqlResourceSqlRoleAssignmentArgs(GetSqlResourceSqlRoleAssignmentArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.roleAssignmentId = $.roleAssignmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlResourceSqlRoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlResourceSqlRoleAssignmentArgs $;

        public Builder() {
            $ = new GetSqlResourceSqlRoleAssignmentArgs();
        }

        public Builder(GetSqlResourceSqlRoleAssignmentArgs defaults) {
            $ = new GetSqlResourceSqlRoleAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param roleAssignmentId The GUID for the Role Assignment.
         * 
         * @return builder
         * 
         */
        public Builder roleAssignmentId(Output<String> roleAssignmentId) {
            $.roleAssignmentId = roleAssignmentId;
            return this;
        }

        /**
         * @param roleAssignmentId The GUID for the Role Assignment.
         * 
         * @return builder
         * 
         */
        public Builder roleAssignmentId(String roleAssignmentId) {
            return roleAssignmentId(Output.of(roleAssignmentId));
        }

        public GetSqlResourceSqlRoleAssignmentArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.roleAssignmentId = Objects.requireNonNull($.roleAssignmentId, "expected parameter 'roleAssignmentId' to be non-null");
            return $;
        }
    }

}
