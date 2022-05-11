// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HybridConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HybridConnectionArgs Empty = new HybridConnectionArgs();

    /**
     * Specifies the name of the App Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="appServiceName", required=true)
    private Output<String> appServiceName;

    /**
     * @return Specifies the name of the App Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> appServiceName() {
        return this.appServiceName;
    }

    /**
     * The hostname of the endpoint.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return The hostname of the endpoint.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * The port of the endpoint.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port of the endpoint.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The ID of the Service Bus Relay. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="relayId", required=true)
    private Output<String> relayId;

    /**
     * @return The ID of the Service Bus Relay. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> relayId() {
        return this.relayId;
    }

    /**
     * The name of the resource group in which to create the App Service.  Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the App Service.  Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service Bus key which has Send permissions. Defaults to `RootManageSharedAccessKey`.
     * 
     */
    @Import(name="sendKeyName")
    private @Nullable Output<String> sendKeyName;

    /**
     * @return The name of the Service Bus key which has Send permissions. Defaults to `RootManageSharedAccessKey`.
     * 
     */
    public Optional<Output<String>> sendKeyName() {
        return Optional.ofNullable(this.sendKeyName);
    }

    private HybridConnectionArgs() {}

    private HybridConnectionArgs(HybridConnectionArgs $) {
        this.appServiceName = $.appServiceName;
        this.hostname = $.hostname;
        this.port = $.port;
        this.relayId = $.relayId;
        this.resourceGroupName = $.resourceGroupName;
        this.sendKeyName = $.sendKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridConnectionArgs $;

        public Builder() {
            $ = new HybridConnectionArgs();
        }

        public Builder(HybridConnectionArgs defaults) {
            $ = new HybridConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appServiceName Specifies the name of the App Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceName(Output<String> appServiceName) {
            $.appServiceName = appServiceName;
            return this;
        }

        /**
         * @param appServiceName Specifies the name of the App Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceName(String appServiceName) {
            return appServiceName(Output.of(appServiceName));
        }

        /**
         * @param hostname The hostname of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The hostname of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param port The port of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param relayId The ID of the Service Bus Relay. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder relayId(Output<String> relayId) {
            $.relayId = relayId;
            return this;
        }

        /**
         * @param relayId The ID of the Service Bus Relay. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder relayId(String relayId) {
            return relayId(Output.of(relayId));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the App Service.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the App Service.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sendKeyName The name of the Service Bus key which has Send permissions. Defaults to `RootManageSharedAccessKey`.
         * 
         * @return builder
         * 
         */
        public Builder sendKeyName(@Nullable Output<String> sendKeyName) {
            $.sendKeyName = sendKeyName;
            return this;
        }

        /**
         * @param sendKeyName The name of the Service Bus key which has Send permissions. Defaults to `RootManageSharedAccessKey`.
         * 
         * @return builder
         * 
         */
        public Builder sendKeyName(String sendKeyName) {
            return sendKeyName(Output.of(sendKeyName));
        }

        public HybridConnectionArgs build() {
            $.appServiceName = Objects.requireNonNull($.appServiceName, "expected parameter 'appServiceName' to be non-null");
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.relayId = Objects.requireNonNull($.relayId, "expected parameter 'relayId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
