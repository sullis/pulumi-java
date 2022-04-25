// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.inputs.ConnectionGatewayDefinitionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionGatewayArgs Empty = new ConnectionGatewayArgs();

    /**
     * The connection gateway name
     * 
     */
    @Import(name="connectionGatewayName")
    private @Nullable Output<String> connectionGatewayName;

    /**
     * @return The connection gateway name
     * 
     */
    public Optional<Output<String>> connectionGatewayName() {
        return Optional.ofNullable(this.connectionGatewayName);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="properties")
    private @Nullable Output<ConnectionGatewayDefinitionPropertiesArgs> properties;

    public Optional<Output<ConnectionGatewayDefinitionPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Subscription Id
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return Subscription Id
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ConnectionGatewayArgs() {}

    private ConnectionGatewayArgs(ConnectionGatewayArgs $) {
        this.connectionGatewayName = $.connectionGatewayName;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.subscriptionId = $.subscriptionId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionGatewayArgs $;

        public Builder() {
            $ = new ConnectionGatewayArgs();
        }

        public Builder(ConnectionGatewayArgs defaults) {
            $ = new ConnectionGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionGatewayName The connection gateway name
         * 
         * @return builder
         * 
         */
        public Builder connectionGatewayName(@Nullable Output<String> connectionGatewayName) {
            $.connectionGatewayName = connectionGatewayName;
            return this;
        }

        /**
         * @param connectionGatewayName The connection gateway name
         * 
         * @return builder
         * 
         */
        public Builder connectionGatewayName(String connectionGatewayName) {
            return connectionGatewayName(Output.of(connectionGatewayName));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder properties(@Nullable Output<ConnectionGatewayDefinitionPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(ConnectionGatewayDefinitionPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subscriptionId Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ConnectionGatewayArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
