// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ADLSGen2FileSystemDataSetMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ADLSGen2FileSystemDataSetMappingArgs Empty = new ADLSGen2FileSystemDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The id of the source data set.
     * 
     */
    @InputImport(name="dataSetId", required=true)
    private final Input<String> dataSetId;

    public Input<String> getDataSetId() {
        return this.dataSetId;
    }

    /**
     * The name of the data set mapping to be created.
     * 
     */
    @InputImport(name="dataSetMappingName")
    private final @Nullable Input<String> dataSetMappingName;

    public Input<String> getDataSetMappingName() {
        return this.dataSetMappingName == null ? Input.empty() : this.dataSetMappingName;
    }

    /**
     * The file system name.
     * 
     */
    @InputImport(name="fileSystem", required=true)
    private final Input<String> fileSystem;

    public Input<String> getFileSystem() {
        return this.fileSystem;
    }

    /**
     * Kind of data set mapping.
     * Expected value is 'AdlsGen2FileSystem'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Resource group of storage account.
     * 
     */
    @InputImport(name="resourceGroup", required=true)
    private final Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @InputImport(name="shareSubscriptionName", required=true)
    private final Input<String> shareSubscriptionName;

    public Input<String> getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Storage account name of the source data set.
     * 
     */
    @InputImport(name="storageAccountName", required=true)
    private final Input<String> storageAccountName;

    public Input<String> getStorageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Subscription id of storage account.
     * 
     */
    @InputImport(name="subscriptionId", required=true)
    private final Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId;
    }

    public ADLSGen2FileSystemDataSetMappingArgs(
        Input<String> accountName,
        Input<String> dataSetId,
        @Nullable Input<String> dataSetMappingName,
        Input<String> fileSystem,
        Input<String> kind,
        Input<String> resourceGroup,
        Input<String> resourceGroupName,
        Input<String> shareSubscriptionName,
        Input<String> storageAccountName,
        Input<String> subscriptionId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetId = Objects.requireNonNull(dataSetId, "expected parameter 'dataSetId' to be non-null");
        this.dataSetMappingName = dataSetMappingName;
        this.fileSystem = Objects.requireNonNull(fileSystem, "expected parameter 'fileSystem' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private ADLSGen2FileSystemDataSetMappingArgs() {
        this.accountName = Input.empty();
        this.dataSetId = Input.empty();
        this.dataSetMappingName = Input.empty();
        this.fileSystem = Input.empty();
        this.kind = Input.empty();
        this.resourceGroup = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareSubscriptionName = Input.empty();
        this.storageAccountName = Input.empty();
        this.subscriptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ADLSGen2FileSystemDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> dataSetId;
        private @Nullable Input<String> dataSetMappingName;
        private Input<String> fileSystem;
        private Input<String> kind;
        private Input<String> resourceGroup;
        private Input<String> resourceGroupName;
        private Input<String> shareSubscriptionName;
        private Input<String> storageAccountName;
        private Input<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ADLSGen2FileSystemDataSetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingName = defaults.dataSetMappingName;
    	      this.fileSystem = defaults.fileSystem;
    	      this.kind = defaults.kind;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDataSetId(Input<String> dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Input.of(Objects.requireNonNull(dataSetId));
            return this;
        }

        public Builder setDataSetMappingName(@Nullable Input<String> dataSetMappingName) {
            this.dataSetMappingName = dataSetMappingName;
            return this;
        }

        public Builder setDataSetMappingName(@Nullable String dataSetMappingName) {
            this.dataSetMappingName = Input.ofNullable(dataSetMappingName);
            return this;
        }

        public Builder setFileSystem(Input<String> fileSystem) {
            this.fileSystem = Objects.requireNonNull(fileSystem);
            return this;
        }

        public Builder setFileSystem(String fileSystem) {
            this.fileSystem = Input.of(Objects.requireNonNull(fileSystem));
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setResourceGroup(Input<String> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Input.of(Objects.requireNonNull(resourceGroup));
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

        public Builder setShareSubscriptionName(Input<String> shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder setShareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Input.of(Objects.requireNonNull(shareSubscriptionName));
            return this;
        }

        public Builder setStorageAccountName(Input<String> storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Input.of(Objects.requireNonNull(storageAccountName));
            return this;
        }

        public Builder setSubscriptionId(Input<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Input.of(Objects.requireNonNull(subscriptionId));
            return this;
        }

        public ADLSGen2FileSystemDataSetMappingArgs build() {
            return new ADLSGen2FileSystemDataSetMappingArgs(accountName, dataSetId, dataSetMappingName, fileSystem, kind, resourceGroup, resourceGroupName, shareSubscriptionName, storageAccountName, subscriptionId);
        }
    }
}
