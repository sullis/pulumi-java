// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the managed disks.
 * 
 */
public final class ManagedDiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedDiskDetailsResponse Empty = new ManagedDiskDetailsResponse();

    /**
     * Account Type of the data to be transferred.
     * Expected value is 'ManagedDisk'.
     * 
     */
    @InputImport(name="dataAccountType", required=true)
    private final String dataAccountType;

    public String getDataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Resource Group Id of the compute disks.
     * 
     */
    @InputImport(name="resourceGroupId", required=true)
    private final String resourceGroupId;

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * Resource Id of the storage account that can be used to copy the vhd for staging.
     * 
     */
    @InputImport(name="stagingStorageAccountId", required=true)
    private final String stagingStorageAccountId;

    public String getStagingStorageAccountId() {
        return this.stagingStorageAccountId;
    }

    public ManagedDiskDetailsResponse(
        String dataAccountType,
        String resourceGroupId,
        String stagingStorageAccountId) {
        this.dataAccountType = dataAccountType == null ? "StorageAccount" : Objects.requireNonNull(dataAccountType, "expected parameter 'dataAccountType' to be non-null");
        this.resourceGroupId = Objects.requireNonNull(resourceGroupId, "expected parameter 'resourceGroupId' to be non-null");
        this.stagingStorageAccountId = Objects.requireNonNull(stagingStorageAccountId, "expected parameter 'stagingStorageAccountId' to be non-null");
    }

    private ManagedDiskDetailsResponse() {
        this.dataAccountType = null;
        this.resourceGroupId = null;
        this.stagingStorageAccountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataAccountType;
        private String resourceGroupId;
        private String stagingStorageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.stagingStorageAccountId = defaults.stagingStorageAccountId;
        }

        public Builder setDataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }

        public Builder setStagingStorageAccountId(String stagingStorageAccountId) {
            this.stagingStorageAccountId = Objects.requireNonNull(stagingStorageAccountId);
            return this;
        }

        public ManagedDiskDetailsResponse build() {
            return new ManagedDiskDetailsResponse(dataAccountType, resourceGroupId, stagingStorageAccountId);
        }
    }
}
