// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSqlResourceSqlRoleAssignmentResult {
    /**
     * @return The unique resource identifier of the database account.
     * 
     */
    private final String id;
    /**
     * @return The name of the database account.
     * 
     */
    private final String name;
    /**
     * @return The unique identifier for the associated AAD principal in the AAD graph to which access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant associated with the subscription.
     * 
     */
    private final @Nullable String principalId;
    /**
     * @return The unique identifier for the associated Role Definition.
     * 
     */
    private final @Nullable String roleDefinitionId;
    /**
     * @return The data plane resource path for which access is being granted through this Role Assignment.
     * 
     */
    private final @Nullable String scope;
    /**
     * @return The type of Azure resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSqlResourceSqlRoleAssignmentResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("principalId") @Nullable String principalId,
        @CustomType.Parameter("roleDefinitionId") @Nullable String roleDefinitionId,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.principalId = principalId;
        this.roleDefinitionId = roleDefinitionId;
        this.scope = scope;
        this.type = type;
    }

    /**
     * @return The unique resource identifier of the database account.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the database account.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The unique identifier for the associated AAD principal in the AAD graph to which access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant associated with the subscription.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return The unique identifier for the associated Role Definition.
     * 
     */
    public Optional<String> roleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }
    /**
     * @return The data plane resource path for which access is being granted through this Role Assignment.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return The type of Azure resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlResourceSqlRoleAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String principalId;
        private @Nullable String roleDefinitionId;
        private @Nullable String scope;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlResourceSqlRoleAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder roleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSqlResourceSqlRoleAssignmentResult build() {
            return new GetSqlResourceSqlRoleAssignmentResult(id, name, principalId, roleDefinitionId, scope, type);
        }
    }
}
