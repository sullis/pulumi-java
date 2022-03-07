// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.outputs;

import io.pulumi.azurenative.management.outputs.EntityParentGroupInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EntityInfoResponse {
    /**
     * The friendly name of the management group.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The fully qualified ID for the entity.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    private final String id;
    /**
     * The users specific permissions to this item.
     * 
     */
    private final @Nullable String inheritedPermissions;
    /**
     * The name of the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    private final String name;
    /**
     * Number of children is the number of Groups that are exactly one level underneath the current Group.
     * 
     */
    private final @Nullable Integer numberOfChildGroups;
    /**
     * Number of children is the number of Groups and Subscriptions that are exactly one level underneath the current Group.
     * 
     */
    private final @Nullable Integer numberOfChildren;
    private final @Nullable Integer numberOfDescendants;
    /**
     * (Optional) The ID of the parent management group.
     * 
     */
    private final @Nullable EntityParentGroupInfoResponse parent;
    /**
     * The parent display name chain from the root group to the immediate parent
     * 
     */
    private final @Nullable List<String> parentDisplayNameChain;
    /**
     * The parent name chain from the root group to the immediate parent
     * 
     */
    private final @Nullable List<String> parentNameChain;
    /**
     * The users specific permissions to this item.
     * 
     */
    private final @Nullable String permissions;
    /**
     * The AAD Tenant ID associated with the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    private final @Nullable String tenantId;
    /**
     * The type of the resource. For example, Microsoft.Management/managementGroups
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"displayName","id","inheritedPermissions","name","numberOfChildGroups","numberOfChildren","numberOfDescendants","parent","parentDisplayNameChain","parentNameChain","permissions","tenantId","type"})
    private EntityInfoResponse(
        @Nullable String displayName,
        String id,
        @Nullable String inheritedPermissions,
        String name,
        @Nullable Integer numberOfChildGroups,
        @Nullable Integer numberOfChildren,
        @Nullable Integer numberOfDescendants,
        @Nullable EntityParentGroupInfoResponse parent,
        @Nullable List<String> parentDisplayNameChain,
        @Nullable List<String> parentNameChain,
        @Nullable String permissions,
        @Nullable String tenantId,
        String type) {
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.inheritedPermissions = inheritedPermissions;
        this.name = Objects.requireNonNull(name);
        this.numberOfChildGroups = numberOfChildGroups;
        this.numberOfChildren = numberOfChildren;
        this.numberOfDescendants = numberOfDescendants;
        this.parent = parent;
        this.parentDisplayNameChain = parentDisplayNameChain;
        this.parentNameChain = parentNameChain;
        this.permissions = permissions;
        this.tenantId = tenantId;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The friendly name of the management group.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The fully qualified ID for the entity.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The users specific permissions to this item.
     * 
    */
    public Optional<String> getInheritedPermissions() {
        return Optional.ofNullable(this.inheritedPermissions);
    }
    /**
     * The name of the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Number of children is the number of Groups that are exactly one level underneath the current Group.
     * 
    */
    public Optional<Integer> getNumberOfChildGroups() {
        return Optional.ofNullable(this.numberOfChildGroups);
    }
    /**
     * Number of children is the number of Groups and Subscriptions that are exactly one level underneath the current Group.
     * 
    */
    public Optional<Integer> getNumberOfChildren() {
        return Optional.ofNullable(this.numberOfChildren);
    }
    public Optional<Integer> getNumberOfDescendants() {
        return Optional.ofNullable(this.numberOfDescendants);
    }
    /**
     * (Optional) The ID of the parent management group.
     * 
    */
    public Optional<EntityParentGroupInfoResponse> getParent() {
        return Optional.ofNullable(this.parent);
    }
    /**
     * The parent display name chain from the root group to the immediate parent
     * 
    */
    public List<String> getParentDisplayNameChain() {
        return this.parentDisplayNameChain == null ? List.of() : this.parentDisplayNameChain;
    }
    /**
     * The parent name chain from the root group to the immediate parent
     * 
    */
    public List<String> getParentNameChain() {
        return this.parentNameChain == null ? List.of() : this.parentNameChain;
    }
    /**
     * The users specific permissions to this item.
     * 
    */
    public Optional<String> getPermissions() {
        return Optional.ofNullable(this.permissions);
    }
    /**
     * The AAD Tenant ID associated with the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * The type of the resource. For example, Microsoft.Management/managementGroups
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private @Nullable String inheritedPermissions;
        private String name;
        private @Nullable Integer numberOfChildGroups;
        private @Nullable Integer numberOfChildren;
        private @Nullable Integer numberOfDescendants;
        private @Nullable EntityParentGroupInfoResponse parent;
        private @Nullable List<String> parentDisplayNameChain;
        private @Nullable List<String> parentNameChain;
        private @Nullable String permissions;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.inheritedPermissions = defaults.inheritedPermissions;
    	      this.name = defaults.name;
    	      this.numberOfChildGroups = defaults.numberOfChildGroups;
    	      this.numberOfChildren = defaults.numberOfChildren;
    	      this.numberOfDescendants = defaults.numberOfDescendants;
    	      this.parent = defaults.parent;
    	      this.parentDisplayNameChain = defaults.parentDisplayNameChain;
    	      this.parentNameChain = defaults.parentNameChain;
    	      this.permissions = defaults.permissions;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInheritedPermissions(@Nullable String inheritedPermissions) {
            this.inheritedPermissions = inheritedPermissions;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNumberOfChildGroups(@Nullable Integer numberOfChildGroups) {
            this.numberOfChildGroups = numberOfChildGroups;
            return this;
        }

        public Builder setNumberOfChildren(@Nullable Integer numberOfChildren) {
            this.numberOfChildren = numberOfChildren;
            return this;
        }

        public Builder setNumberOfDescendants(@Nullable Integer numberOfDescendants) {
            this.numberOfDescendants = numberOfDescendants;
            return this;
        }

        public Builder setParent(@Nullable EntityParentGroupInfoResponse parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParentDisplayNameChain(@Nullable List<String> parentDisplayNameChain) {
            this.parentDisplayNameChain = parentDisplayNameChain;
            return this;
        }

        public Builder setParentNameChain(@Nullable List<String> parentNameChain) {
            this.parentNameChain = parentNameChain;
            return this;
        }

        public Builder setPermissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public EntityInfoResponse build() {
            return new EntityInfoResponse(displayName, id, inheritedPermissions, name, numberOfChildGroups, numberOfChildren, numberOfDescendants, parent, parentDisplayNameChain, parentNameChain, permissions, tenantId, type);
        }
    }
}