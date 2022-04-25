// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.outputs;

import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetADLSGen2FileSystemDataSetResult {
    /**
     * @return Unique id for identifying a data set resource
     * 
     */
    private final String dataSetId;
    /**
     * @return The file system name.
     * 
     */
    private final String fileSystem;
    /**
     * @return The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * @return Kind of data set.
     * Expected value is &#39;AdlsGen2FileSystem&#39;.
     * 
     */
    private final String kind;
    /**
     * @return Name of the azure resource
     * 
     */
    private final String name;
    /**
     * @return Resource group of storage account
     * 
     */
    private final String resourceGroup;
    /**
     * @return Storage account name of the source data set
     * 
     */
    private final String storageAccountName;
    /**
     * @return Subscription id of storage account
     * 
     */
    private final String subscriptionId;
    /**
     * @return System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Type of the azure resource
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetADLSGen2FileSystemDataSetResult(
        @CustomType.Parameter("dataSetId") String dataSetId,
        @CustomType.Parameter("fileSystem") String fileSystem,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroup") String resourceGroup,
        @CustomType.Parameter("storageAccountName") String storageAccountName,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.dataSetId = dataSetId;
        this.fileSystem = fileSystem;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.resourceGroup = resourceGroup;
        this.storageAccountName = storageAccountName;
        this.subscriptionId = subscriptionId;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Unique id for identifying a data set resource
     * 
     */
    public String dataSetId() {
        return this.dataSetId;
    }
    /**
     * @return The file system name.
     * 
     */
    public String fileSystem() {
        return this.fileSystem;
    }
    /**
     * @return The resource id of the azure resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of data set.
     * Expected value is &#39;AdlsGen2FileSystem&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the azure resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource group of storage account
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * @return Storage account name of the source data set
     * 
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * @return Subscription id of storage account
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * @return System Data of the Azure resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Type of the azure resource
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetADLSGen2FileSystemDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String fileSystem;
        private String id;
        private String kind;
        private String name;
        private String resourceGroup;
        private String storageAccountName;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetADLSGen2FileSystemDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.fileSystem = defaults.fileSystem;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }
        public Builder fileSystem(String fileSystem) {
            this.fileSystem = Objects.requireNonNull(fileSystem);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetADLSGen2FileSystemDataSetResult build() {
            return new GetADLSGen2FileSystemDataSetResult(dataSetId, fileSystem, id, kind, name, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
