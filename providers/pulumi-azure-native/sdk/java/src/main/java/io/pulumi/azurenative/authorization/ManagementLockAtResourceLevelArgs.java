// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.authorization.enums.LockLevel;
import io.pulumi.azurenative.authorization.inputs.ManagementLockOwnerArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementLockAtResourceLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementLockAtResourceLevelArgs Empty = new ManagementLockAtResourceLevelArgs();

    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
     * 
     */
    @InputImport(name="level", required=true)
      private final Input<Either<String,LockLevel>> level;

    public Input<Either<String,LockLevel>> getLevel() {
        return this.level;
    }

    /**
     * The name of lock. The lock name can be a maximum of 260 characters. It cannot contain <, > %, &, :, \, ?, /, or any control characters.
     * 
     */
    @InputImport(name="lockName")
      private final @Nullable Input<String> lockName;

    public Input<String> getLockName() {
        return this.lockName == null ? Input.empty() : this.lockName;
    }

    /**
     * Notes about the lock. Maximum of 512 characters.
     * 
     */
    @InputImport(name="notes")
      private final @Nullable Input<String> notes;

    public Input<String> getNotes() {
        return this.notes == null ? Input.empty() : this.notes;
    }

    /**
     * The owners of the lock.
     * 
     */
    @InputImport(name="owners")
      private final @Nullable Input<List<ManagementLockOwnerArgs>> owners;

    public Input<List<ManagementLockOwnerArgs>> getOwners() {
        return this.owners == null ? Input.empty() : this.owners;
    }

    /**
     * The parent resource identity.
     * 
     */
    @InputImport(name="parentResourcePath", required=true)
      private final Input<String> parentResourcePath;

    public Input<String> getParentResourcePath() {
        return this.parentResourcePath;
    }

    /**
     * The name of the resource group containing the resource to lock.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource to lock.
     * 
     */
    @InputImport(name="resourceName", required=true)
      private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    /**
     * The resource provider namespace of the resource to lock.
     * 
     */
    @InputImport(name="resourceProviderNamespace", required=true)
      private final Input<String> resourceProviderNamespace;

    public Input<String> getResourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    /**
     * The resource type of the resource to lock.
     * 
     */
    @InputImport(name="resourceType", required=true)
      private final Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType;
    }

    public ManagementLockAtResourceLevelArgs(
        Input<Either<String,LockLevel>> level,
        @Nullable Input<String> lockName,
        @Nullable Input<String> notes,
        @Nullable Input<List<ManagementLockOwnerArgs>> owners,
        Input<String> parentResourcePath,
        Input<String> resourceGroupName,
        Input<String> resourceName,
        Input<String> resourceProviderNamespace,
        Input<String> resourceType) {
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
        this.lockName = lockName;
        this.notes = notes;
        this.owners = owners;
        this.parentResourcePath = Objects.requireNonNull(parentResourcePath, "expected parameter 'parentResourcePath' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace, "expected parameter 'resourceProviderNamespace' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private ManagementLockAtResourceLevelArgs() {
        this.level = Input.empty();
        this.lockName = Input.empty();
        this.notes = Input.empty();
        this.owners = Input.empty();
        this.parentResourcePath = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.resourceProviderNamespace = Input.empty();
        this.resourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementLockAtResourceLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,LockLevel>> level;
        private @Nullable Input<String> lockName;
        private @Nullable Input<String> notes;
        private @Nullable Input<List<ManagementLockOwnerArgs>> owners;
        private Input<String> parentResourcePath;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;
        private Input<String> resourceProviderNamespace;
        private Input<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementLockAtResourceLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.lockName = defaults.lockName;
    	      this.notes = defaults.notes;
    	      this.owners = defaults.owners;
    	      this.parentResourcePath = defaults.parentResourcePath;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceProviderNamespace = defaults.resourceProviderNamespace;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setLevel(Input<Either<String,LockLevel>> level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder setLevel(Either<String,LockLevel> level) {
            this.level = Input.of(Objects.requireNonNull(level));
            return this;
        }

        public Builder setLockName(@Nullable Input<String> lockName) {
            this.lockName = lockName;
            return this;
        }

        public Builder setLockName(@Nullable String lockName) {
            this.lockName = Input.ofNullable(lockName);
            return this;
        }

        public Builder setNotes(@Nullable Input<String> notes) {
            this.notes = notes;
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = Input.ofNullable(notes);
            return this;
        }

        public Builder setOwners(@Nullable Input<List<ManagementLockOwnerArgs>> owners) {
            this.owners = owners;
            return this;
        }

        public Builder setOwners(@Nullable List<ManagementLockOwnerArgs> owners) {
            this.owners = Input.ofNullable(owners);
            return this;
        }

        public Builder setParentResourcePath(Input<String> parentResourcePath) {
            this.parentResourcePath = Objects.requireNonNull(parentResourcePath);
            return this;
        }

        public Builder setParentResourcePath(String parentResourcePath) {
            this.parentResourcePath = Input.of(Objects.requireNonNull(parentResourcePath));
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

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }

        public Builder setResourceProviderNamespace(Input<String> resourceProviderNamespace) {
            this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace);
            return this;
        }

        public Builder setResourceProviderNamespace(String resourceProviderNamespace) {
            this.resourceProviderNamespace = Input.of(Objects.requireNonNull(resourceProviderNamespace));
            return this;
        }

        public Builder setResourceType(Input<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Input.of(Objects.requireNonNull(resourceType));
            return this;
        }
        public ManagementLockAtResourceLevelArgs build() {
            return new ManagementLockAtResourceLevelArgs(level, lockName, notes, owners, parentResourcePath, resourceGroupName, resourceName, resourceProviderNamespace, resourceType);
        }
    }
}