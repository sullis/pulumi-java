// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.authorization.inputs.PermissionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleDefinitionArgs Empty = new RoleDefinitionArgs();

    /**
     * Role definition assignable scopes.
     * 
     */
    @Import(name="assignableScopes")
    private @Nullable Output<List<String>> assignableScopes;

    /**
     * @return Role definition assignable scopes.
     * 
     */
    public Optional<Output<List<String>>> assignableScopes() {
        return Optional.ofNullable(this.assignableScopes);
    }

    /**
     * The role definition description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The role definition description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Role definition permissions.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<PermissionArgs>> permissions;

    /**
     * @return Role definition permissions.
     * 
     */
    public Optional<Output<List<PermissionArgs>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * The ID of the role definition.
     * 
     */
    @Import(name="roleDefinitionId")
    private @Nullable Output<String> roleDefinitionId;

    /**
     * @return The ID of the role definition.
     * 
     */
    public Optional<Output<String>> roleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }

    /**
     * The role name.
     * 
     */
    @Import(name="roleName")
    private @Nullable Output<String> roleName;

    /**
     * @return The role name.
     * 
     */
    public Optional<Output<String>> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    /**
     * The role type.
     * 
     */
    @Import(name="roleType")
    private @Nullable Output<String> roleType;

    /**
     * @return The role type.
     * 
     */
    public Optional<Output<String>> roleType() {
        return Optional.ofNullable(this.roleType);
    }

    /**
     * The scope of the role definition.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of the role definition.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private RoleDefinitionArgs() {}

    private RoleDefinitionArgs(RoleDefinitionArgs $) {
        this.assignableScopes = $.assignableScopes;
        this.description = $.description;
        this.permissions = $.permissions;
        this.roleDefinitionId = $.roleDefinitionId;
        this.roleName = $.roleName;
        this.roleType = $.roleType;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleDefinitionArgs $;

        public Builder() {
            $ = new RoleDefinitionArgs();
        }

        public Builder(RoleDefinitionArgs defaults) {
            $ = new RoleDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignableScopes Role definition assignable scopes.
         * 
         * @return builder
         * 
         */
        public Builder assignableScopes(@Nullable Output<List<String>> assignableScopes) {
            $.assignableScopes = assignableScopes;
            return this;
        }

        /**
         * @param assignableScopes Role definition assignable scopes.
         * 
         * @return builder
         * 
         */
        public Builder assignableScopes(List<String> assignableScopes) {
            return assignableScopes(Output.of(assignableScopes));
        }

        /**
         * @param assignableScopes Role definition assignable scopes.
         * 
         * @return builder
         * 
         */
        public Builder assignableScopes(String... assignableScopes) {
            return assignableScopes(List.of(assignableScopes));
        }

        /**
         * @param description The role definition description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The role definition description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param permissions Role definition permissions.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<List<PermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Role definition permissions.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<PermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions Role definition permissions.
         * 
         * @return builder
         * 
         */
        public Builder permissions(PermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        /**
         * @param roleDefinitionId The ID of the role definition.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(@Nullable Output<String> roleDefinitionId) {
            $.roleDefinitionId = roleDefinitionId;
            return this;
        }

        /**
         * @param roleDefinitionId The ID of the role definition.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(String roleDefinitionId) {
            return roleDefinitionId(Output.of(roleDefinitionId));
        }

        /**
         * @param roleName The role name.
         * 
         * @return builder
         * 
         */
        public Builder roleName(@Nullable Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName The role name.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        /**
         * @param roleType The role type.
         * 
         * @return builder
         * 
         */
        public Builder roleType(@Nullable Output<String> roleType) {
            $.roleType = roleType;
            return this;
        }

        /**
         * @param roleType The role type.
         * 
         * @return builder
         * 
         */
        public Builder roleType(String roleType) {
            return roleType(Output.of(roleType));
        }

        /**
         * @param scope The scope of the role definition.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the role definition.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public RoleDefinitionArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
