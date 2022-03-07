// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRoleAssignmentArtifactResult {
    /**
     * Artifacts which need to be deployed before the specified artifact.
     * 
     */
    private final @Nullable List<String> dependsOn;
    /**
     * Multi-line explain this resource.
     * 
     */
    private final @Nullable String description;
    /**
     * One-liner string explain this resource.
     * 
     */
    private final @Nullable String displayName;
    /**
     * String Id used to locate any resource on Azure.
     * 
     */
    private final String id;
    /**
     * Specifies the kind of blueprint artifact.
     * Expected value is 'roleAssignment'.
     * 
     */
    private final String kind;
    /**
     * Name of this resource.
     * 
     */
    private final String name;
    /**
     * Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
     * 
     */
    private final Object principalIds;
    /**
     * RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * Azure resource ID of the RoleDefinition.
     * 
     */
    private final String roleDefinitionId;
    /**
     * Type of this resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dependsOn","description","displayName","id","kind","name","principalIds","resourceGroup","roleDefinitionId","type"})
    private GetRoleAssignmentArtifactResult(
        @Nullable List<String> dependsOn,
        @Nullable String description,
        @Nullable String displayName,
        String id,
        String kind,
        String name,
        Object principalIds,
        @Nullable String resourceGroup,
        String roleDefinitionId,
        String type) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.principalIds = Objects.requireNonNull(principalIds);
        this.resourceGroup = resourceGroup;
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Artifacts which need to be deployed before the specified artifact.
     * 
    */
    public List<String> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Multi-line explain this resource.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * One-liner string explain this resource.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * String Id used to locate any resource on Azure.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies the kind of blueprint artifact.
     * Expected value is 'roleAssignment'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of this resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
     * 
    */
    public Object getPrincipalIds() {
        return this.principalIds;
    }
    /**
     * RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
     * 
    */
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * Azure resource ID of the RoleDefinition.
     * 
    */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Type of this resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleAssignmentArtifactResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dependsOn;
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private String kind;
        private String name;
        private Object principalIds;
        private @Nullable String resourceGroup;
        private String roleDefinitionId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleAssignmentArtifactResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.principalIds = defaults.principalIds;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.type = defaults.type;
        }

        public Builder setDependsOn(@Nullable List<String> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrincipalIds(Object principalIds) {
            this.principalIds = Objects.requireNonNull(principalIds);
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRoleAssignmentArtifactResult build() {
            return new GetRoleAssignmentArtifactResult(dependsOn, description, displayName, id, kind, name, principalIds, resourceGroup, roleDefinitionId, type);
        }
    }
}