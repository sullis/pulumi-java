// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.authorization.enums.PrincipalType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleAssignmentArgs Empty = new RoleAssignmentArgs();

    /**
     * The conditions on the role assignment. This limits the resources it can be assigned to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase 'foo_storage_container'
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<String> condition;

    public Input<String> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Version of the condition. Currently accepted value is '2.0'
     * 
     */
    @InputImport(name="conditionVersion")
    private final @Nullable Input<String> conditionVersion;

    public Input<String> getConditionVersion() {
        return this.conditionVersion == null ? Input.empty() : this.conditionVersion;
    }

    /**
     * Id of the delegated managed identity resource
     * 
     */
    @InputImport(name="delegatedManagedIdentityResourceId")
    private final @Nullable Input<String> delegatedManagedIdentityResourceId;

    public Input<String> getDelegatedManagedIdentityResourceId() {
        return this.delegatedManagedIdentityResourceId == null ? Input.empty() : this.delegatedManagedIdentityResourceId;
    }

    /**
     * Description of role assignment
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The principal ID.
     * 
     */
    @InputImport(name="principalId", required=true)
    private final Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId;
    }

    /**
     * The principal type of the assigned principal ID.
     * 
     */
    @InputImport(name="principalType")
    private final @Nullable Input<Either<String,PrincipalType>> principalType;

    public Input<Either<String,PrincipalType>> getPrincipalType() {
        return this.principalType == null ? Input.empty() : this.principalType;
    }

    /**
     * The name of the role assignment. It can be any valid GUID.
     * 
     */
    @InputImport(name="roleAssignmentName")
    private final @Nullable Input<String> roleAssignmentName;

    public Input<String> getRoleAssignmentName() {
        return this.roleAssignmentName == null ? Input.empty() : this.roleAssignmentName;
    }

    /**
     * The role definition ID.
     * 
     */
    @InputImport(name="roleDefinitionId", required=true)
    private final Input<String> roleDefinitionId;

    public Input<String> getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * The scope of the operation or resource. Valid scopes are: subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
     * 
     */
    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    public RoleAssignmentArgs(
        @Nullable Input<String> condition,
        @Nullable Input<String> conditionVersion,
        @Nullable Input<String> delegatedManagedIdentityResourceId,
        @Nullable Input<String> description,
        Input<String> principalId,
        @Nullable Input<Either<String,PrincipalType>> principalType,
        @Nullable Input<String> roleAssignmentName,
        Input<String> roleDefinitionId,
        Input<String> scope) {
        this.condition = condition;
        this.conditionVersion = conditionVersion;
        this.delegatedManagedIdentityResourceId = delegatedManagedIdentityResourceId;
        this.description = description;
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalType = principalType == null ? Input.ofLeft("User") : principalType;
        this.roleAssignmentName = roleAssignmentName;
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private RoleAssignmentArgs() {
        this.condition = Input.empty();
        this.conditionVersion = Input.empty();
        this.delegatedManagedIdentityResourceId = Input.empty();
        this.description = Input.empty();
        this.principalId = Input.empty();
        this.principalType = Input.empty();
        this.roleAssignmentName = Input.empty();
        this.roleDefinitionId = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> condition;
        private @Nullable Input<String> conditionVersion;
        private @Nullable Input<String> delegatedManagedIdentityResourceId;
        private @Nullable Input<String> description;
        private Input<String> principalId;
        private @Nullable Input<Either<String,PrincipalType>> principalType;
        private @Nullable Input<String> roleAssignmentName;
        private Input<String> roleDefinitionId;
        private Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.conditionVersion = defaults.conditionVersion;
    	      this.delegatedManagedIdentityResourceId = defaults.delegatedManagedIdentityResourceId;
    	      this.description = defaults.description;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.roleAssignmentName = defaults.roleAssignmentName;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
        }

        public Builder setCondition(@Nullable Input<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setConditionVersion(@Nullable Input<String> conditionVersion) {
            this.conditionVersion = conditionVersion;
            return this;
        }

        public Builder setConditionVersion(@Nullable String conditionVersion) {
            this.conditionVersion = Input.ofNullable(conditionVersion);
            return this;
        }

        public Builder setDelegatedManagedIdentityResourceId(@Nullable Input<String> delegatedManagedIdentityResourceId) {
            this.delegatedManagedIdentityResourceId = delegatedManagedIdentityResourceId;
            return this;
        }

        public Builder setDelegatedManagedIdentityResourceId(@Nullable String delegatedManagedIdentityResourceId) {
            this.delegatedManagedIdentityResourceId = Input.ofNullable(delegatedManagedIdentityResourceId);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setPrincipalId(Input<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Input.of(Objects.requireNonNull(principalId));
            return this;
        }

        public Builder setPrincipalType(@Nullable Input<Either<String,PrincipalType>> principalType) {
            this.principalType = principalType;
            return this;
        }

        public Builder setPrincipalType(@Nullable Either<String,PrincipalType> principalType) {
            this.principalType = Input.ofNullable(principalType);
            return this;
        }

        public Builder setRoleAssignmentName(@Nullable Input<String> roleAssignmentName) {
            this.roleAssignmentName = roleAssignmentName;
            return this;
        }

        public Builder setRoleAssignmentName(@Nullable String roleAssignmentName) {
            this.roleAssignmentName = Input.ofNullable(roleAssignmentName);
            return this;
        }

        public Builder setRoleDefinitionId(Input<String> roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Input.of(Objects.requireNonNull(roleDefinitionId));
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public RoleAssignmentArgs build() {
            return new RoleAssignmentArgs(condition, conditionVersion, delegatedManagedIdentityResourceId, description, principalId, principalType, roleAssignmentName, roleDefinitionId, scope);
        }
    }
}
