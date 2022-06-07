// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleAssignmentArgs Empty = new GetRoleAssignmentArgs();

    /**
     * The name of the role assignment. It can be any valid GUID.
     * 
     */
    @Import(name="roleAssignmentName", required=true)
    private Output<String> roleAssignmentName;

    /**
     * @return The name of the role assignment. It can be any valid GUID.
     * 
     */
    public Output<String> roleAssignmentName() {
        return this.roleAssignmentName;
    }

    /**
     * The scope of the operation or resource. Valid scopes are: subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of the operation or resource. Valid scopes are: subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * Tenant ID for cross-tenant request
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return Tenant ID for cross-tenant request
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private GetRoleAssignmentArgs() {}

    private GetRoleAssignmentArgs(GetRoleAssignmentArgs $) {
        this.roleAssignmentName = $.roleAssignmentName;
        this.scope = $.scope;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleAssignmentArgs $;

        public Builder() {
            $ = new GetRoleAssignmentArgs();
        }

        public Builder(GetRoleAssignmentArgs defaults) {
            $ = new GetRoleAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param roleAssignmentName The name of the role assignment. It can be any valid GUID.
         * 
         * @return builder
         * 
         */
        public Builder roleAssignmentName(Output<String> roleAssignmentName) {
            $.roleAssignmentName = roleAssignmentName;
            return this;
        }

        /**
         * @param roleAssignmentName The name of the role assignment. It can be any valid GUID.
         * 
         * @return builder
         * 
         */
        public Builder roleAssignmentName(String roleAssignmentName) {
            return roleAssignmentName(Output.of(roleAssignmentName));
        }

        /**
         * @param scope The scope of the operation or resource. Valid scopes are: subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the operation or resource. Valid scopes are: subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param tenantId Tenant ID for cross-tenant request
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Tenant ID for cross-tenant request
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public GetRoleAssignmentArgs build() {
            $.roleAssignmentName = Objects.requireNonNull($.roleAssignmentName, "expected parameter 'roleAssignmentName' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
