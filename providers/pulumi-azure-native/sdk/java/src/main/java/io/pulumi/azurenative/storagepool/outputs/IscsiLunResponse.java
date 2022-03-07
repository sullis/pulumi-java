// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IscsiLunResponse {
    /**
     * Azure Resource ID of the Managed Disk.
     * 
     */
    private final String managedDiskAzureResourceId;
    /**
     * User defined name for iSCSI LUN; example: "lun0"
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"managedDiskAzureResourceId","name"})
    private IscsiLunResponse(
        String managedDiskAzureResourceId,
        String name) {
        this.managedDiskAzureResourceId = Objects.requireNonNull(managedDiskAzureResourceId);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Azure Resource ID of the Managed Disk.
     * 
    */
    public String getManagedDiskAzureResourceId() {
        return this.managedDiskAzureResourceId;
    }
    /**
     * User defined name for iSCSI LUN; example: "lun0"
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IscsiLunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managedDiskAzureResourceId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IscsiLunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedDiskAzureResourceId = defaults.managedDiskAzureResourceId;
    	      this.name = defaults.name;
        }

        public Builder setManagedDiskAzureResourceId(String managedDiskAzureResourceId) {
            this.managedDiskAzureResourceId = Objects.requireNonNull(managedDiskAzureResourceId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public IscsiLunResponse build() {
            return new IscsiLunResponse(managedDiskAzureResourceId, name);
        }
    }
}