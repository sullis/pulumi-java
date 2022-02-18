// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBillingRoleAssignmentByEnrollmentAccountResult {
    /**
     * The principal Id of the user who created the role assignment.
     * 
     */
    private final String createdByPrincipalId;
    /**
     * The tenant Id of the user who created the role assignment.
     * 
     */
    private final String createdByPrincipalTenantId;
    /**
     * The email address of the user who created the role assignment. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    private final String createdByUserEmailAddress;
    /**
     * The date the role assignment was created.
     * 
     */
    private final String createdOn;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The principal id of the user to whom the role was assigned.
     * 
     */
    private final @Nullable String principalId;
    /**
     * The principal tenant id of the user to whom the role was assigned.
     * 
     */
    private final @Nullable String principalTenantId;
    /**
     * The ID of the role definition.
     * 
     */
    private final @Nullable String roleDefinitionId;
    /**
     * The scope at which the role was assigned.
     * 
     */
    private final String scope;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    private final @Nullable String userAuthenticationType;
    /**
     * The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    private final @Nullable String userEmailAddress;

    @OutputCustomType.Constructor({"createdByPrincipalId","createdByPrincipalTenantId","createdByUserEmailAddress","createdOn","id","name","principalId","principalTenantId","roleDefinitionId","scope","type","userAuthenticationType","userEmailAddress"})
    private GetBillingRoleAssignmentByEnrollmentAccountResult(
        String createdByPrincipalId,
        String createdByPrincipalTenantId,
        String createdByUserEmailAddress,
        String createdOn,
        String id,
        String name,
        @Nullable String principalId,
        @Nullable String principalTenantId,
        @Nullable String roleDefinitionId,
        String scope,
        String type,
        @Nullable String userAuthenticationType,
        @Nullable String userEmailAddress) {
        this.createdByPrincipalId = Objects.requireNonNull(createdByPrincipalId);
        this.createdByPrincipalTenantId = Objects.requireNonNull(createdByPrincipalTenantId);
        this.createdByUserEmailAddress = Objects.requireNonNull(createdByUserEmailAddress);
        this.createdOn = Objects.requireNonNull(createdOn);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.principalId = principalId;
        this.principalTenantId = principalTenantId;
        this.roleDefinitionId = roleDefinitionId;
        this.scope = Objects.requireNonNull(scope);
        this.type = Objects.requireNonNull(type);
        this.userAuthenticationType = userAuthenticationType;
        this.userEmailAddress = userEmailAddress;
    }

    /**
     * The principal Id of the user who created the role assignment.
     * 
     */
    public String getCreatedByPrincipalId() {
        return this.createdByPrincipalId;
    }
    /**
     * The tenant Id of the user who created the role assignment.
     * 
     */
    public String getCreatedByPrincipalTenantId() {
        return this.createdByPrincipalTenantId;
    }
    /**
     * The email address of the user who created the role assignment. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public String getCreatedByUserEmailAddress() {
        return this.createdByUserEmailAddress;
    }
    /**
     * The date the role assignment was created.
     * 
     */
    public String getCreatedOn() {
        return this.createdOn;
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The principal id of the user to whom the role was assigned.
     * 
     */
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * The principal tenant id of the user to whom the role was assigned.
     * 
     */
    public Optional<String> getPrincipalTenantId() {
        return Optional.ofNullable(this.principalTenantId);
    }
    /**
     * The ID of the role definition.
     * 
     */
    public Optional<String> getRoleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }
    /**
     * The scope at which the role was assigned.
     * 
     */
    public String getScope() {
        return this.scope;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Optional<String> getUserAuthenticationType() {
        return Optional.ofNullable(this.userAuthenticationType);
    }
    /**
     * The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Optional<String> getUserEmailAddress() {
        return Optional.ofNullable(this.userEmailAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingRoleAssignmentByEnrollmentAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdByPrincipalId;
        private String createdByPrincipalTenantId;
        private String createdByUserEmailAddress;
        private String createdOn;
        private String id;
        private String name;
        private @Nullable String principalId;
        private @Nullable String principalTenantId;
        private @Nullable String roleDefinitionId;
        private String scope;
        private String type;
        private @Nullable String userAuthenticationType;
        private @Nullable String userEmailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingRoleAssignmentByEnrollmentAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdByPrincipalId = defaults.createdByPrincipalId;
    	      this.createdByPrincipalTenantId = defaults.createdByPrincipalTenantId;
    	      this.createdByUserEmailAddress = defaults.createdByUserEmailAddress;
    	      this.createdOn = defaults.createdOn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.principalTenantId = defaults.principalTenantId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
    	      this.userAuthenticationType = defaults.userAuthenticationType;
    	      this.userEmailAddress = defaults.userEmailAddress;
        }

        public Builder setCreatedByPrincipalId(String createdByPrincipalId) {
            this.createdByPrincipalId = Objects.requireNonNull(createdByPrincipalId);
            return this;
        }

        public Builder setCreatedByPrincipalTenantId(String createdByPrincipalTenantId) {
            this.createdByPrincipalTenantId = Objects.requireNonNull(createdByPrincipalTenantId);
            return this;
        }

        public Builder setCreatedByUserEmailAddress(String createdByUserEmailAddress) {
            this.createdByUserEmailAddress = Objects.requireNonNull(createdByUserEmailAddress);
            return this;
        }

        public Builder setCreatedOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalTenantId(@Nullable String principalTenantId) {
            this.principalTenantId = principalTenantId;
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserAuthenticationType(@Nullable String userAuthenticationType) {
            this.userAuthenticationType = userAuthenticationType;
            return this;
        }

        public Builder setUserEmailAddress(@Nullable String userEmailAddress) {
            this.userEmailAddress = userEmailAddress;
            return this;
        }

        public GetBillingRoleAssignmentByEnrollmentAccountResult build() {
            return new GetBillingRoleAssignmentByEnrollmentAccountResult(createdByPrincipalId, createdByPrincipalTenantId, createdByUserEmailAddress, createdOn, id, name, principalId, principalTenantId, roleDefinitionId, scope, type, userAuthenticationType, userEmailAddress);
        }
    }
}
