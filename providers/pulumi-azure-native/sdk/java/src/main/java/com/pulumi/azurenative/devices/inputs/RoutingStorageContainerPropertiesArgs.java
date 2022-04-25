// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.azurenative.devices.enums.AuthenticationType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties related to a storage container endpoint.
 * 
 */
public final class RoutingStorageContainerPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutingStorageContainerPropertiesArgs Empty = new RoutingStorageContainerPropertiesArgs();

    /**
     * Method used to authenticate against the storage endpoint
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<Either<String,AuthenticationType>> authenticationType;

    /**
     * @return Method used to authenticate against the storage endpoint
     * 
     */
    public Optional<Output<Either<String,AuthenticationType>>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     * 
     */
    @Import(name="batchFrequencyInSeconds")
    private @Nullable Output<Integer> batchFrequencyInSeconds;

    /**
     * @return Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     * 
     */
    public Optional<Output<Integer>> batchFrequencyInSeconds() {
        return Optional.ofNullable(this.batchFrequencyInSeconds);
    }

    /**
     * The connection string of the storage account.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return The connection string of the storage account.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The name of storage container in the storage account.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return The name of storage container in the storage account.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * Encoding that is used to serialize messages to blobs. Supported values are &#39;avro&#39;, &#39;avrodeflate&#39;, and &#39;JSON&#39;. Default value is &#39;avro&#39;.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return Encoding that is used to serialize messages to blobs. Supported values are &#39;avro&#39;, &#39;avrodeflate&#39;, and &#39;JSON&#39;. Default value is &#39;avro&#39;.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * The url of the storage endpoint. It must include the protocol https://
     * 
     */
    @Import(name="endpointUri")
    private @Nullable Output<String> endpointUri;

    /**
     * @return The url of the storage endpoint. It must include the protocol https://
     * 
     */
    public Optional<Output<String>> endpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }

    /**
     * File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     * 
     */
    @Import(name="fileNameFormat")
    private @Nullable Output<String> fileNameFormat;

    /**
     * @return File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     * 
     */
    public Optional<Output<String>> fileNameFormat() {
        return Optional.ofNullable(this.fileNameFormat);
    }

    /**
     * Id of the storage container endpoint
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Id of the storage container endpoint
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     * 
     */
    @Import(name="maxChunkSizeInBytes")
    private @Nullable Output<Integer> maxChunkSizeInBytes;

    /**
     * @return Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     * 
     */
    public Optional<Output<Integer>> maxChunkSizeInBytes() {
        return Optional.ofNullable(this.maxChunkSizeInBytes);
    }

    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group of the storage account.
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable Output<String> resourceGroup;

    /**
     * @return The name of the resource group of the storage account.
     * 
     */
    public Optional<Output<String>> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The subscription identifier of the storage account.
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return The subscription identifier of the storage account.
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    private RoutingStorageContainerPropertiesArgs() {}

    private RoutingStorageContainerPropertiesArgs(RoutingStorageContainerPropertiesArgs $) {
        this.authenticationType = $.authenticationType;
        this.batchFrequencyInSeconds = $.batchFrequencyInSeconds;
        this.connectionString = $.connectionString;
        this.containerName = $.containerName;
        this.encoding = $.encoding;
        this.endpointUri = $.endpointUri;
        this.fileNameFormat = $.fileNameFormat;
        this.id = $.id;
        this.maxChunkSizeInBytes = $.maxChunkSizeInBytes;
        this.name = $.name;
        this.resourceGroup = $.resourceGroup;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingStorageContainerPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingStorageContainerPropertiesArgs $;

        public Builder() {
            $ = new RoutingStorageContainerPropertiesArgs();
        }

        public Builder(RoutingStorageContainerPropertiesArgs defaults) {
            $ = new RoutingStorageContainerPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationType Method used to authenticate against the storage endpoint
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Output<Either<String,AuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType Method used to authenticate against the storage endpoint
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Either<String,AuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param authenticationType Method used to authenticate against the storage endpoint
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Either.ofLeft(authenticationType));
        }

        /**
         * @param authenticationType Method used to authenticate against the storage endpoint
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(AuthenticationType authenticationType) {
            return authenticationType(Either.ofRight(authenticationType));
        }

        /**
         * @param batchFrequencyInSeconds Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
         * 
         * @return builder
         * 
         */
        public Builder batchFrequencyInSeconds(@Nullable Output<Integer> batchFrequencyInSeconds) {
            $.batchFrequencyInSeconds = batchFrequencyInSeconds;
            return this;
        }

        /**
         * @param batchFrequencyInSeconds Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
         * 
         * @return builder
         * 
         */
        public Builder batchFrequencyInSeconds(Integer batchFrequencyInSeconds) {
            return batchFrequencyInSeconds(Output.of(batchFrequencyInSeconds));
        }

        /**
         * @param connectionString The connection string of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The connection string of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param containerName The name of storage container in the storage account.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName The name of storage container in the storage account.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param encoding Encoding that is used to serialize messages to blobs. Supported values are &#39;avro&#39;, &#39;avrodeflate&#39;, and &#39;JSON&#39;. Default value is &#39;avro&#39;.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding Encoding that is used to serialize messages to blobs. Supported values are &#39;avro&#39;, &#39;avrodeflate&#39;, and &#39;JSON&#39;. Default value is &#39;avro&#39;.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param endpointUri The url of the storage endpoint. It must include the protocol https://
         * 
         * @return builder
         * 
         */
        public Builder endpointUri(@Nullable Output<String> endpointUri) {
            $.endpointUri = endpointUri;
            return this;
        }

        /**
         * @param endpointUri The url of the storage endpoint. It must include the protocol https://
         * 
         * @return builder
         * 
         */
        public Builder endpointUri(String endpointUri) {
            return endpointUri(Output.of(endpointUri));
        }

        /**
         * @param fileNameFormat File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
         * 
         * @return builder
         * 
         */
        public Builder fileNameFormat(@Nullable Output<String> fileNameFormat) {
            $.fileNameFormat = fileNameFormat;
            return this;
        }

        /**
         * @param fileNameFormat File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
         * 
         * @return builder
         * 
         */
        public Builder fileNameFormat(String fileNameFormat) {
            return fileNameFormat(Output.of(fileNameFormat));
        }

        /**
         * @param id Id of the storage container endpoint
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id of the storage container endpoint
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param maxChunkSizeInBytes Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
         * 
         * @return builder
         * 
         */
        public Builder maxChunkSizeInBytes(@Nullable Output<Integer> maxChunkSizeInBytes) {
            $.maxChunkSizeInBytes = maxChunkSizeInBytes;
            return this;
        }

        /**
         * @param maxChunkSizeInBytes Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
         * 
         * @return builder
         * 
         */
        public Builder maxChunkSizeInBytes(Integer maxChunkSizeInBytes) {
            return maxChunkSizeInBytes(Output.of(maxChunkSizeInBytes));
        }

        /**
         * @param name The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroup The name of the resource group of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup The name of the resource group of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param subscriptionId The subscription identifier of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The subscription identifier of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public RoutingStorageContainerPropertiesArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
