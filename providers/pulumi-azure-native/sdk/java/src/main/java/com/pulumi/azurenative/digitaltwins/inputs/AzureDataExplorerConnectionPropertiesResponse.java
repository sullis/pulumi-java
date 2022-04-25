// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a time series database connection to Azure Data Explorer with data being sent via an EventHub.
 * 
 */
public final class AzureDataExplorerConnectionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureDataExplorerConnectionPropertiesResponse Empty = new AzureDataExplorerConnectionPropertiesResponse();

    /**
     * The name of the Azure Data Explorer database.
     * 
     */
    @Import(name="adxDatabaseName", required=true)
    private String adxDatabaseName;

    /**
     * @return The name of the Azure Data Explorer database.
     * 
     */
    public String adxDatabaseName() {
        return this.adxDatabaseName;
    }

    /**
     * The URI of the Azure Data Explorer endpoint.
     * 
     */
    @Import(name="adxEndpointUri", required=true)
    private String adxEndpointUri;

    /**
     * @return The URI of the Azure Data Explorer endpoint.
     * 
     */
    public String adxEndpointUri() {
        return this.adxEndpointUri;
    }

    /**
     * The resource ID of the Azure Data Explorer cluster.
     * 
     */
    @Import(name="adxResourceId", required=true)
    private String adxResourceId;

    /**
     * @return The resource ID of the Azure Data Explorer cluster.
     * 
     */
    public String adxResourceId() {
        return this.adxResourceId;
    }

    /**
     * The name of the Azure Data Explorer table.
     * 
     */
    @Import(name="adxTableName")
    private @Nullable String adxTableName;

    /**
     * @return The name of the Azure Data Explorer table.
     * 
     */
    public Optional<String> adxTableName() {
        return Optional.ofNullable(this.adxTableName);
    }

    /**
     * The type of time series connection resource.
     * Expected value is &#39;AzureDataExplorer&#39;.
     * 
     */
    @Import(name="connectionType", required=true)
    private String connectionType;

    /**
     * @return The type of time series connection resource.
     * Expected value is &#39;AzureDataExplorer&#39;.
     * 
     */
    public String connectionType() {
        return this.connectionType;
    }

    /**
     * The EventHub consumer group to use when ADX reads from EventHub. Defaults to $Default.
     * 
     */
    @Import(name="eventHubConsumerGroup")
    private @Nullable String eventHubConsumerGroup;

    /**
     * @return The EventHub consumer group to use when ADX reads from EventHub. Defaults to $Default.
     * 
     */
    public Optional<String> eventHubConsumerGroup() {
        return Optional.ofNullable(this.eventHubConsumerGroup);
    }

    /**
     * The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    @Import(name="eventHubEndpointUri", required=true)
    private String eventHubEndpointUri;

    /**
     * @return The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    public String eventHubEndpointUri() {
        return this.eventHubEndpointUri;
    }

    /**
     * The EventHub name in the EventHub namespace for identity-based authentication.
     * 
     */
    @Import(name="eventHubEntityPath", required=true)
    private String eventHubEntityPath;

    /**
     * @return The EventHub name in the EventHub namespace for identity-based authentication.
     * 
     */
    public String eventHubEntityPath() {
        return this.eventHubEntityPath;
    }

    /**
     * The resource ID of the EventHub namespace.
     * 
     */
    @Import(name="eventHubNamespaceResourceId", required=true)
    private String eventHubNamespaceResourceId;

    /**
     * @return The resource ID of the EventHub namespace.
     * 
     */
    public String eventHubNamespaceResourceId() {
        return this.eventHubNamespaceResourceId;
    }

    /**
     * The provisioning state.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    private AzureDataExplorerConnectionPropertiesResponse() {}

    private AzureDataExplorerConnectionPropertiesResponse(AzureDataExplorerConnectionPropertiesResponse $) {
        this.adxDatabaseName = $.adxDatabaseName;
        this.adxEndpointUri = $.adxEndpointUri;
        this.adxResourceId = $.adxResourceId;
        this.adxTableName = $.adxTableName;
        this.connectionType = $.connectionType;
        this.eventHubConsumerGroup = $.eventHubConsumerGroup;
        this.eventHubEndpointUri = $.eventHubEndpointUri;
        this.eventHubEntityPath = $.eventHubEntityPath;
        this.eventHubNamespaceResourceId = $.eventHubNamespaceResourceId;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureDataExplorerConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureDataExplorerConnectionPropertiesResponse $;

        public Builder() {
            $ = new AzureDataExplorerConnectionPropertiesResponse();
        }

        public Builder(AzureDataExplorerConnectionPropertiesResponse defaults) {
            $ = new AzureDataExplorerConnectionPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param adxDatabaseName The name of the Azure Data Explorer database.
         * 
         * @return builder
         * 
         */
        public Builder adxDatabaseName(String adxDatabaseName) {
            $.adxDatabaseName = adxDatabaseName;
            return this;
        }

        /**
         * @param adxEndpointUri The URI of the Azure Data Explorer endpoint.
         * 
         * @return builder
         * 
         */
        public Builder adxEndpointUri(String adxEndpointUri) {
            $.adxEndpointUri = adxEndpointUri;
            return this;
        }

        /**
         * @param adxResourceId The resource ID of the Azure Data Explorer cluster.
         * 
         * @return builder
         * 
         */
        public Builder adxResourceId(String adxResourceId) {
            $.adxResourceId = adxResourceId;
            return this;
        }

        /**
         * @param adxTableName The name of the Azure Data Explorer table.
         * 
         * @return builder
         * 
         */
        public Builder adxTableName(@Nullable String adxTableName) {
            $.adxTableName = adxTableName;
            return this;
        }

        /**
         * @param connectionType The type of time series connection resource.
         * Expected value is &#39;AzureDataExplorer&#39;.
         * 
         * @return builder
         * 
         */
        public Builder connectionType(String connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param eventHubConsumerGroup The EventHub consumer group to use when ADX reads from EventHub. Defaults to $Default.
         * 
         * @return builder
         * 
         */
        public Builder eventHubConsumerGroup(@Nullable String eventHubConsumerGroup) {
            $.eventHubConsumerGroup = eventHubConsumerGroup;
            return this;
        }

        /**
         * @param eventHubEndpointUri The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
         * 
         * @return builder
         * 
         */
        public Builder eventHubEndpointUri(String eventHubEndpointUri) {
            $.eventHubEndpointUri = eventHubEndpointUri;
            return this;
        }

        /**
         * @param eventHubEntityPath The EventHub name in the EventHub namespace for identity-based authentication.
         * 
         * @return builder
         * 
         */
        public Builder eventHubEntityPath(String eventHubEntityPath) {
            $.eventHubEntityPath = eventHubEntityPath;
            return this;
        }

        /**
         * @param eventHubNamespaceResourceId The resource ID of the EventHub namespace.
         * 
         * @return builder
         * 
         */
        public Builder eventHubNamespaceResourceId(String eventHubNamespaceResourceId) {
            $.eventHubNamespaceResourceId = eventHubNamespaceResourceId;
            return this;
        }

        /**
         * @param provisioningState The provisioning state.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public AzureDataExplorerConnectionPropertiesResponse build() {
            $.adxDatabaseName = Objects.requireNonNull($.adxDatabaseName, "expected parameter 'adxDatabaseName' to be non-null");
            $.adxEndpointUri = Objects.requireNonNull($.adxEndpointUri, "expected parameter 'adxEndpointUri' to be non-null");
            $.adxResourceId = Objects.requireNonNull($.adxResourceId, "expected parameter 'adxResourceId' to be non-null");
            $.connectionType = Codegen.stringProp("connectionType").arg($.connectionType).require();
            $.eventHubEndpointUri = Objects.requireNonNull($.eventHubEndpointUri, "expected parameter 'eventHubEndpointUri' to be non-null");
            $.eventHubEntityPath = Objects.requireNonNull($.eventHubEntityPath, "expected parameter 'eventHubEntityPath' to be non-null");
            $.eventHubNamespaceResourceId = Objects.requireNonNull($.eventHubNamespaceResourceId, "expected parameter 'eventHubNamespaceResourceId' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
