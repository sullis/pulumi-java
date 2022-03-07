// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlResourceSqlRoleAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlResourceSqlRoleAssignmentArgs Empty = new SqlResourceSqlRoleAssignmentArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The unique identifier for the associated AAD principal in the AAD graph to which access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant associated with the subscription.
     * 
     */
    @InputImport(name="principalId")
      private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The GUID for the Role Assignment.
     * 
     */
    @InputImport(name="roleAssignmentId")
      private final @Nullable Input<String> roleAssignmentId;

    public Input<String> getRoleAssignmentId() {
        return this.roleAssignmentId == null ? Input.empty() : this.roleAssignmentId;
    }

    /**
     * The unique identifier for the associated Role Definition.
     * 
     */
    @InputImport(name="roleDefinitionId")
      private final @Nullable Input<String> roleDefinitionId;

    public Input<String> getRoleDefinitionId() {
        return this.roleDefinitionId == null ? Input.empty() : this.roleDefinitionId;
    }

    /**
     * The data plane resource path for which access is being granted through this Role Assignment.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    public SqlResourceSqlRoleAssignmentArgs(
        Input<String> accountName,
        @Nullable Input<String> principalId,
        Input<String> resourceGroupName,
        @Nullable Input<String> roleAssignmentId,
        @Nullable Input<String> roleDefinitionId,
        @Nullable Input<String> scope) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.principalId = principalId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleAssignmentId = roleAssignmentId;
        this.roleDefinitionId = roleDefinitionId;
        this.scope = scope;
    }

    private SqlResourceSqlRoleAssignmentArgs() {
        this.accountName = Input.empty();
        this.principalId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.roleAssignmentId = Input.empty();
        this.roleDefinitionId = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlResourceSqlRoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> principalId;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> roleAssignmentId;
        private @Nullable Input<String> roleDefinitionId;
        private @Nullable Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlResourceSqlRoleAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.principalId = defaults.principalId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleAssignmentId = defaults.roleAssignmentId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setPrincipalId(@Nullable Input<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = Input.ofNullable(principalId);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRoleAssignmentId(@Nullable Input<String> roleAssignmentId) {
            this.roleAssignmentId = roleAssignmentId;
            return this;
        }

        public Builder setRoleAssignmentId(@Nullable String roleAssignmentId) {
            this.roleAssignmentId = Input.ofNullable(roleAssignmentId);
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable Input<String> roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = Input.ofNullable(roleDefinitionId);
            return this;
        }

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }
        public SqlResourceSqlRoleAssignmentArgs build() {
            return new SqlResourceSqlRoleAssignmentArgs(accountName, principalId, resourceGroupName, roleAssignmentId, roleDefinitionId, scope);
        }
    }
}