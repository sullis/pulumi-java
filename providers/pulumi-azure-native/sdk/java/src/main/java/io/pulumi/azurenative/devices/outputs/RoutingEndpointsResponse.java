// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.azurenative.devices.outputs.RoutingEventHubPropertiesResponse;
import io.pulumi.azurenative.devices.outputs.RoutingServiceBusQueueEndpointPropertiesResponse;
import io.pulumi.azurenative.devices.outputs.RoutingServiceBusTopicEndpointPropertiesResponse;
import io.pulumi.azurenative.devices.outputs.RoutingStorageContainerPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RoutingEndpointsResponse {
    /**
     * The list of Event Hubs endpoints that IoT hub routes messages to, based on the routing rules. This list does not include the built-in Event Hubs endpoint.
     * 
     */
    private final @Nullable List<RoutingEventHubPropertiesResponse> eventHubs;
    /**
     * The list of Service Bus queue endpoints that IoT hub routes the messages to, based on the routing rules.
     * 
     */
    private final @Nullable List<RoutingServiceBusQueueEndpointPropertiesResponse> serviceBusQueues;
    /**
     * The list of Service Bus topic endpoints that the IoT hub routes the messages to, based on the routing rules.
     * 
     */
    private final @Nullable List<RoutingServiceBusTopicEndpointPropertiesResponse> serviceBusTopics;
    /**
     * The list of storage container endpoints that IoT hub routes messages to, based on the routing rules.
     * 
     */
    private final @Nullable List<RoutingStorageContainerPropertiesResponse> storageContainers;

    @OutputCustomType.Constructor({"eventHubs","serviceBusQueues","serviceBusTopics","storageContainers"})
    private RoutingEndpointsResponse(
        @Nullable List<RoutingEventHubPropertiesResponse> eventHubs,
        @Nullable List<RoutingServiceBusQueueEndpointPropertiesResponse> serviceBusQueues,
        @Nullable List<RoutingServiceBusTopicEndpointPropertiesResponse> serviceBusTopics,
        @Nullable List<RoutingStorageContainerPropertiesResponse> storageContainers) {
        this.eventHubs = eventHubs;
        this.serviceBusQueues = serviceBusQueues;
        this.serviceBusTopics = serviceBusTopics;
        this.storageContainers = storageContainers;
    }

    /**
     * The list of Event Hubs endpoints that IoT hub routes messages to, based on the routing rules. This list does not include the built-in Event Hubs endpoint.
     * 
     */
    public List<RoutingEventHubPropertiesResponse> getEventHubs() {
        return this.eventHubs == null ? List.of() : this.eventHubs;
    }
    /**
     * The list of Service Bus queue endpoints that IoT hub routes the messages to, based on the routing rules.
     * 
     */
    public List<RoutingServiceBusQueueEndpointPropertiesResponse> getServiceBusQueues() {
        return this.serviceBusQueues == null ? List.of() : this.serviceBusQueues;
    }
    /**
     * The list of Service Bus topic endpoints that the IoT hub routes the messages to, based on the routing rules.
     * 
     */
    public List<RoutingServiceBusTopicEndpointPropertiesResponse> getServiceBusTopics() {
        return this.serviceBusTopics == null ? List.of() : this.serviceBusTopics;
    }
    /**
     * The list of storage container endpoints that IoT hub routes messages to, based on the routing rules.
     * 
     */
    public List<RoutingStorageContainerPropertiesResponse> getStorageContainers() {
        return this.storageContainers == null ? List.of() : this.storageContainers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RoutingEventHubPropertiesResponse> eventHubs;
        private @Nullable List<RoutingServiceBusQueueEndpointPropertiesResponse> serviceBusQueues;
        private @Nullable List<RoutingServiceBusTopicEndpointPropertiesResponse> serviceBusTopics;
        private @Nullable List<RoutingStorageContainerPropertiesResponse> storageContainers;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubs = defaults.eventHubs;
    	      this.serviceBusQueues = defaults.serviceBusQueues;
    	      this.serviceBusTopics = defaults.serviceBusTopics;
    	      this.storageContainers = defaults.storageContainers;
        }

        public Builder setEventHubs(@Nullable List<RoutingEventHubPropertiesResponse> eventHubs) {
            this.eventHubs = eventHubs;
            return this;
        }

        public Builder setServiceBusQueues(@Nullable List<RoutingServiceBusQueueEndpointPropertiesResponse> serviceBusQueues) {
            this.serviceBusQueues = serviceBusQueues;
            return this;
        }

        public Builder setServiceBusTopics(@Nullable List<RoutingServiceBusTopicEndpointPropertiesResponse> serviceBusTopics) {
            this.serviceBusTopics = serviceBusTopics;
            return this;
        }

        public Builder setStorageContainers(@Nullable List<RoutingStorageContainerPropertiesResponse> storageContainers) {
            this.storageContainers = storageContainers;
            return this;
        }

        public RoutingEndpointsResponse build() {
            return new RoutingEndpointsResponse(eventHubs, serviceBusQueues, serviceBusTopics, storageContainers);
        }
    }
}
