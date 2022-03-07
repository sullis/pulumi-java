// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DestinationResponse {
    /**
     * Blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
     * 
     */
    private final @Nullable String archiveNameFormat;
    /**
     * Blob container Name
     * 
     */
    private final @Nullable String blobContainer;
    /**
     * Name for capture destination
     * 
     */
    private final @Nullable String name;
    /**
     * Resource id of the storage account to be used to create the blobs
     * 
     */
    private final @Nullable String storageAccountResourceId;

    @OutputCustomType.Constructor({"archiveNameFormat","blobContainer","name","storageAccountResourceId"})
    private DestinationResponse(
        @Nullable String archiveNameFormat,
        @Nullable String blobContainer,
        @Nullable String name,
        @Nullable String storageAccountResourceId) {
        this.archiveNameFormat = archiveNameFormat;
        this.blobContainer = blobContainer;
        this.name = name;
        this.storageAccountResourceId = storageAccountResourceId;
    }

    /**
     * Blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
     * 
    */
    public Optional<String> getArchiveNameFormat() {
        return Optional.ofNullable(this.archiveNameFormat);
    }
    /**
     * Blob container Name
     * 
    */
    public Optional<String> getBlobContainer() {
        return Optional.ofNullable(this.blobContainer);
    }
    /**
     * Name for capture destination
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Resource id of the storage account to be used to create the blobs
     * 
    */
    public Optional<String> getStorageAccountResourceId() {
        return Optional.ofNullable(this.storageAccountResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String archiveNameFormat;
        private @Nullable String blobContainer;
        private @Nullable String name;
        private @Nullable String storageAccountResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveNameFormat = defaults.archiveNameFormat;
    	      this.blobContainer = defaults.blobContainer;
    	      this.name = defaults.name;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
        }

        public Builder setArchiveNameFormat(@Nullable String archiveNameFormat) {
            this.archiveNameFormat = archiveNameFormat;
            return this;
        }

        public Builder setBlobContainer(@Nullable String blobContainer) {
            this.blobContainer = blobContainer;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStorageAccountResourceId(@Nullable String storageAccountResourceId) {
            this.storageAccountResourceId = storageAccountResourceId;
            return this;
        }
        public DestinationResponse build() {
            return new DestinationResponse(archiveNameFormat, blobContainer, name, storageAccountResourceId);
        }
    }
}