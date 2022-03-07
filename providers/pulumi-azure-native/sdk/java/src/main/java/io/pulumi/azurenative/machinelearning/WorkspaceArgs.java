// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The key vault identifier used for encrypted workspaces.
     * 
     */
    @InputImport(name="keyVaultIdentifierId")
      private final @Nullable Input<String> keyVaultIdentifierId;

    public Input<String> getKeyVaultIdentifierId() {
        return this.keyVaultIdentifierId == null ? Input.empty() : this.keyVaultIdentifierId;
    }

    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The email id of the owner for this workspace.
     * 
     */
    @InputImport(name="ownerEmail", required=true)
      private final Input<String> ownerEmail;

    public Input<String> getOwnerEmail() {
        return this.ownerEmail;
    }

    /**
     * The name of the resource group to which the machine learning workspace belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The fully qualified arm id of the storage account associated with this workspace.
     * 
     */
    @InputImport(name="userStorageAccountId", required=true)
      private final Input<String> userStorageAccountId;

    public Input<String> getUserStorageAccountId() {
        return this.userStorageAccountId;
    }

    /**
     * The name of the machine learning workspace.
     * 
     */
    @InputImport(name="workspaceName")
      private final @Nullable Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName == null ? Input.empty() : this.workspaceName;
    }

    public WorkspaceArgs(
        @Nullable Input<String> keyVaultIdentifierId,
        @Nullable Input<String> location,
        Input<String> ownerEmail,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> userStorageAccountId,
        @Nullable Input<String> workspaceName) {
        this.keyVaultIdentifierId = keyVaultIdentifierId;
        this.location = location;
        this.ownerEmail = Objects.requireNonNull(ownerEmail, "expected parameter 'ownerEmail' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.userStorageAccountId = Objects.requireNonNull(userStorageAccountId, "expected parameter 'userStorageAccountId' to be non-null");
        this.workspaceName = workspaceName;
    }

    private WorkspaceArgs() {
        this.keyVaultIdentifierId = Input.empty();
        this.location = Input.empty();
        this.ownerEmail = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.userStorageAccountId = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyVaultIdentifierId;
        private @Nullable Input<String> location;
        private Input<String> ownerEmail;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> userStorageAccountId;
        private @Nullable Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultIdentifierId = defaults.keyVaultIdentifierId;
    	      this.location = defaults.location;
    	      this.ownerEmail = defaults.ownerEmail;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.userStorageAccountId = defaults.userStorageAccountId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setKeyVaultIdentifierId(@Nullable Input<String> keyVaultIdentifierId) {
            this.keyVaultIdentifierId = keyVaultIdentifierId;
            return this;
        }

        public Builder setKeyVaultIdentifierId(@Nullable String keyVaultIdentifierId) {
            this.keyVaultIdentifierId = Input.ofNullable(keyVaultIdentifierId);
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

        public Builder setOwnerEmail(Input<String> ownerEmail) {
            this.ownerEmail = Objects.requireNonNull(ownerEmail);
            return this;
        }

        public Builder setOwnerEmail(String ownerEmail) {
            this.ownerEmail = Input.of(Objects.requireNonNull(ownerEmail));
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUserStorageAccountId(Input<String> userStorageAccountId) {
            this.userStorageAccountId = Objects.requireNonNull(userStorageAccountId);
            return this;
        }

        public Builder setUserStorageAccountId(String userStorageAccountId) {
            this.userStorageAccountId = Input.of(Objects.requireNonNull(userStorageAccountId));
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
            return new WorkspaceArgs(keyVaultIdentifierId, location, ownerEmail, resourceGroupName, tags, userStorageAccountId, workspaceName);
        }
    }
}