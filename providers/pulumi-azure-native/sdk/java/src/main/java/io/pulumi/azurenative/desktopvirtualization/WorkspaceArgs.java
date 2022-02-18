// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetIdentityArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetPlanArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetSkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * List of applicationGroup resource Ids.
     * 
     */
    @InputImport(name="applicationGroupReferences")
    private final @Nullable Input<List<String>> applicationGroupReferences;

    public Input<List<String>> getApplicationGroupReferences() {
        return this.applicationGroupReferences == null ? Input.empty() : this.applicationGroupReferences;
    }

    /**
     * Description of Workspace.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Friendly name of Workspace.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    @InputImport(name="identity")
    private final @Nullable Input<ResourceModelWithAllowedPropertySetIdentityArgs> identity;

    public Input<ResourceModelWithAllowedPropertySetIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    @InputImport(name="managedBy")
    private final @Nullable Input<String> managedBy;

    public Input<String> getManagedBy() {
        return this.managedBy == null ? Input.empty() : this.managedBy;
    }

    @InputImport(name="plan")
    private final @Nullable Input<ResourceModelWithAllowedPropertySetPlanArgs> plan;

    public Input<ResourceModelWithAllowedPropertySetPlanArgs> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
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

    @InputImport(name="sku")
    private final @Nullable Input<ResourceModelWithAllowedPropertySetSkuArgs> sku;

    public Input<ResourceModelWithAllowedPropertySetSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the workspace
     * 
     */
    @InputImport(name="workspaceName")
    private final @Nullable Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName == null ? Input.empty() : this.workspaceName;
    }

    public WorkspaceArgs(
        @Nullable Input<List<String>> applicationGroupReferences,
        @Nullable Input<String> description,
        @Nullable Input<String> friendlyName,
        @Nullable Input<ResourceModelWithAllowedPropertySetIdentityArgs> identity,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> managedBy,
        @Nullable Input<ResourceModelWithAllowedPropertySetPlanArgs> plan,
        Input<String> resourceGroupName,
        @Nullable Input<ResourceModelWithAllowedPropertySetSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> workspaceName) {
        this.applicationGroupReferences = applicationGroupReferences;
        this.description = description;
        this.friendlyName = friendlyName;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.managedBy = managedBy;
        this.plan = plan;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.workspaceName = workspaceName;
    }

    private WorkspaceArgs() {
        this.applicationGroupReferences = Input.empty();
        this.description = Input.empty();
        this.friendlyName = Input.empty();
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.managedBy = Input.empty();
        this.plan = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> applicationGroupReferences;
        private @Nullable Input<String> description;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<ResourceModelWithAllowedPropertySetIdentityArgs> identity;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> managedBy;
        private @Nullable Input<ResourceModelWithAllowedPropertySetPlanArgs> plan;
        private Input<String> resourceGroupName;
        private @Nullable Input<ResourceModelWithAllowedPropertySetSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGroupReferences = defaults.applicationGroupReferences;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.plan = defaults.plan;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setApplicationGroupReferences(@Nullable Input<List<String>> applicationGroupReferences) {
            this.applicationGroupReferences = applicationGroupReferences;
            return this;
        }

        public Builder setApplicationGroupReferences(@Nullable List<String> applicationGroupReferences) {
            this.applicationGroupReferences = Input.ofNullable(applicationGroupReferences);
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

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ResourceModelWithAllowedPropertySetIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ResourceModelWithAllowedPropertySetIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedBy(@Nullable Input<String> managedBy) {
            this.managedBy = managedBy;
            return this;
        }

        public Builder setManagedBy(@Nullable String managedBy) {
            this.managedBy = Input.ofNullable(managedBy);
            return this;
        }

        public Builder setPlan(@Nullable Input<ResourceModelWithAllowedPropertySetPlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable ResourceModelWithAllowedPropertySetPlanArgs plan) {
            this.plan = Input.ofNullable(plan);
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

        public Builder setSku(@Nullable Input<ResourceModelWithAllowedPropertySetSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable ResourceModelWithAllowedPropertySetSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWorkspaceName(@Nullable Input<String> workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public Builder setWorkspaceName(@Nullable String workspaceName) {
            this.workspaceName = Input.ofNullable(workspaceName);
            return this;
        }

        public WorkspaceArgs build() {
            return new WorkspaceArgs(applicationGroupReferences, description, friendlyName, identity, kind, location, managedBy, plan, resourceGroupName, sku, tags, workspaceName);
        }
    }
}
