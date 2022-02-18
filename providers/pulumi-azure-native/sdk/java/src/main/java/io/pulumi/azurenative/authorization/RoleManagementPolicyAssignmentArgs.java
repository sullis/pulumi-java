// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleManagementPolicyAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleManagementPolicyAssignmentArgs Empty = new RoleManagementPolicyAssignmentArgs();

    /**
     * The policy id role management policy assignment.
     * 
     */
    @InputImport(name="policyId")
    private final @Nullable Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId == null ? Input.empty() : this.policyId;
    }

    /**
     * The role definition of management policy assignment.
     * 
     */
    @InputImport(name="roleDefinitionId")
    private final @Nullable Input<String> roleDefinitionId;

    public Input<String> getRoleDefinitionId() {
        return this.roleDefinitionId == null ? Input.empty() : this.roleDefinitionId;
    }

    /**
     * The name of format {guid_guid} the role management policy assignment to upsert.
     * 
     */
    @InputImport(name="roleManagementPolicyAssignmentName")
    private final @Nullable Input<String> roleManagementPolicyAssignmentName;

    public Input<String> getRoleManagementPolicyAssignmentName() {
        return this.roleManagementPolicyAssignmentName == null ? Input.empty() : this.roleManagementPolicyAssignmentName;
    }

    /**
     * The role management policy scope.
     * 
     */
    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    public RoleManagementPolicyAssignmentArgs(
        @Nullable Input<String> policyId,
        @Nullable Input<String> roleDefinitionId,
        @Nullable Input<String> roleManagementPolicyAssignmentName,
        Input<String> scope) {
        this.policyId = policyId;
        this.roleDefinitionId = roleDefinitionId;
        this.roleManagementPolicyAssignmentName = roleManagementPolicyAssignmentName;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private RoleManagementPolicyAssignmentArgs() {
        this.policyId = Input.empty();
        this.roleDefinitionId = Input.empty();
        this.roleManagementPolicyAssignmentName = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleManagementPolicyAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> policyId;
        private @Nullable Input<String> roleDefinitionId;
        private @Nullable Input<String> roleManagementPolicyAssignmentName;
        private Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleManagementPolicyAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyId = defaults.policyId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.roleManagementPolicyAssignmentName = defaults.roleManagementPolicyAssignmentName;
    	      this.scope = defaults.scope;
        }

        public Builder setPolicyId(@Nullable Input<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = Input.ofNullable(policyId);
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

        public Builder setRoleManagementPolicyAssignmentName(@Nullable Input<String> roleManagementPolicyAssignmentName) {
            this.roleManagementPolicyAssignmentName = roleManagementPolicyAssignmentName;
            return this;
        }

        public Builder setRoleManagementPolicyAssignmentName(@Nullable String roleManagementPolicyAssignmentName) {
            this.roleManagementPolicyAssignmentName = Input.ofNullable(roleManagementPolicyAssignmentName);
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

        public RoleManagementPolicyAssignmentArgs build() {
            return new RoleManagementPolicyAssignmentArgs(policyId, roleDefinitionId, roleManagementPolicyAssignmentName, scope);
        }
    }
}
