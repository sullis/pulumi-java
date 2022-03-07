// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRoleAssignmentArgs Empty = new GetRoleAssignmentArgs();

    /**
     * The name of the role assignment. It can be any valid GUID.
     * 
     */
    @InputImport(name="roleAssignmentName", required=true)
      private final String roleAssignmentName;

    public String getRoleAssignmentName() {
        return this.roleAssignmentName;
    }

    /**
     * The scope of the operation or resource. Valid scopes are: subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
     * 
     */
    @InputImport(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    /**
     * Tenant ID for cross-tenant request
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public GetRoleAssignmentArgs(
        String roleAssignmentName,
        String scope,
        @Nullable String tenantId) {
        this.roleAssignmentName = Objects.requireNonNull(roleAssignmentName, "expected parameter 'roleAssignmentName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tenantId = tenantId;
    }

    private GetRoleAssignmentArgs() {
        this.roleAssignmentName = null;
        this.scope = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleAssignmentName;
        private String scope;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleAssignmentName = defaults.roleAssignmentName;
    	      this.scope = defaults.scope;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setRoleAssignmentName(String roleAssignmentName) {
            this.roleAssignmentName = Objects.requireNonNull(roleAssignmentName);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public GetRoleAssignmentArgs build() {
            return new GetRoleAssignmentArgs(roleAssignmentName, scope, tenantId);
        }
    }
}