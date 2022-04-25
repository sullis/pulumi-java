// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.outputs;

import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBlobDataSetMappingResult {
    /**
     * @return Container that has the file path.
     * 
     */
    private final String containerName;
    /**
     * @return The id of the source data set.
     * 
     */
    private final String dataSetId;
    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    private final String dataSetMappingStatus;
    /**
     * @return File path within the source data set
     * 
     */
    private final String filePath;
    /**
     * @return The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;Blob&#39;.
     * 
     */
    private final String kind;
    /**
     * @return Name of the azure resource
     * 
     */
    private final String name;
    /**
     * @return File output type
     * 
     */
    private final @Nullable String outputType;
    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource group of storage account.
     * 
     */
    private final String resourceGroup;
    /**
     * @return Storage account name of the source data set.
     * 
     */
    private final String storageAccountName;
    /**
     * @return Subscription id of storage account.
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
    private GetBlobDataSetMappingResult(
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("dataSetId") String dataSetId,
        @CustomType.Parameter("dataSetMappingStatus") String dataSetMappingStatus,
        @CustomType.Parameter("filePath") String filePath,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outputType") @Nullable String outputType,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGroup") String resourceGroup,
        @CustomType.Parameter("storageAccountName") String storageAccountName,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.containerName = containerName;
        this.dataSetId = dataSetId;
        this.dataSetMappingStatus = dataSetMappingStatus;
        this.filePath = filePath;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.outputType = outputType;
        this.provisioningState = provisioningState;
        this.resourceGroup = resourceGroup;
        this.storageAccountName = storageAccountName;
        this.subscriptionId = subscriptionId;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Container that has the file path.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return The id of the source data set.
     * 
     */
    public String dataSetId() {
        return this.dataSetId;
    }
    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    public String dataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * @return File path within the source data set
     * 
     */
    public String filePath() {
        return this.filePath;
    }
    /**
     * @return The resource id of the azure resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;Blob&#39;.
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
     * @return File output type
     * 
     */
    public Optional<String> outputType() {
        return Optional.ofNullable(this.outputType);
    }
    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource group of storage account.
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * @return Storage account name of the source data set.
     * 
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * @return Subscription id of storage account.
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

    public static Builder builder(GetBlobDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String dataSetId;
        private String dataSetMappingStatus;
        private String filePath;
        private String id;
        private String kind;
        private String name;
        private @Nullable String outputType;
        private String provisioningState;
        private String resourceGroup;
        private String storageAccountName;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.filePath = defaults.filePath;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.outputType = defaults.outputType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }
        public Builder dataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }
        public Builder filePath(String filePath) {
            this.filePath = Objects.requireNonNull(filePath);
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
        public Builder outputType(@Nullable String outputType) {
            this.outputType = outputType;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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
        }        public GetBlobDataSetMappingResult build() {
            return new GetBlobDataSetMappingResult(containerName, dataSetId, dataSetMappingStatus, filePath, id, kind, name, outputType, provisioningState, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
