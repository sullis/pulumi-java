// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkedStorageAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedStorageAccountArgs Empty = new LinkedStorageAccountArgs();

    /**
     * Linked storage accounts type.
     * 
     */
    @InputImport(name="dataSourceType")
      private final @Nullable Input<String> dataSourceType;

    public Input<String> getDataSourceType() {
        return this.dataSourceType == null ? Input.empty() : this.dataSourceType;
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

    /**
     * Linked storage accounts resources ids.
     * 
     */
    @InputImport(name="storageAccountIds")
      private final @Nullable Input<List<String>> storageAccountIds;

    public Input<List<String>> getStorageAccountIds() {
        return this.storageAccountIds == null ? Input.empty() : this.storageAccountIds;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public LinkedStorageAccountArgs(
        @Nullable Input<String> dataSourceType,
        Input<String> resourceGroupName,
        @Nullable Input<List<String>> storageAccountIds,
        Input<String> workspaceName) {
        this.dataSourceType = dataSourceType;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountIds = storageAccountIds;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private LinkedStorageAccountArgs() {
        this.dataSourceType = Input.empty();
        this.resourceGroupName = Input.empty();
        this.storageAccountIds = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedStorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataSourceType;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<String>> storageAccountIds;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedStorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceType = defaults.dataSourceType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountIds = defaults.storageAccountIds;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDataSourceType(@Nullable Input<String> dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        public Builder setDataSourceType(@Nullable String dataSourceType) {
            this.dataSourceType = Input.ofNullable(dataSourceType);
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

        public Builder setStorageAccountIds(@Nullable Input<List<String>> storageAccountIds) {
            this.storageAccountIds = storageAccountIds;
            return this;
        }

        public Builder setStorageAccountIds(@Nullable List<String> storageAccountIds) {
            this.storageAccountIds = Input.ofNullable(storageAccountIds);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public LinkedStorageAccountArgs build() {
            return new LinkedStorageAccountArgs(dataSourceType, resourceGroupName, storageAccountIds, workspaceName);
        }
    }
}