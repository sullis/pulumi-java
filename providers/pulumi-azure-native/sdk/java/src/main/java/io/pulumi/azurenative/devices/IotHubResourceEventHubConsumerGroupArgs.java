// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.devices.inputs.EventHubConsumerGroupNameArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IotHubResourceEventHubConsumerGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotHubResourceEventHubConsumerGroupArgs Empty = new IotHubResourceEventHubConsumerGroupArgs();

    /**
     * The name of the Event Hub-compatible endpoint in the IoT hub.
     * 
     */
    @InputImport(name="eventHubEndpointName", required=true)
    private final Input<String> eventHubEndpointName;

    public Input<String> getEventHubEndpointName() {
        return this.eventHubEndpointName;
    }

    /**
     * The name of the consumer group to add.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The EventHub consumer group name.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<EventHubConsumerGroupNameArgs> properties;

    public Input<EventHubConsumerGroupNameArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the IoT hub.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the IoT hub.
     * 
     */
    @InputImport(name="resourceName", required=true)
    private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    public IotHubResourceEventHubConsumerGroupArgs(
        Input<String> eventHubEndpointName,
        @Nullable Input<String> name,
        @Nullable Input<EventHubConsumerGroupNameArgs> properties,
        Input<String> resourceGroupName,
        Input<String> resourceName) {
        this.eventHubEndpointName = Objects.requireNonNull(eventHubEndpointName, "expected parameter 'eventHubEndpointName' to be non-null");
        this.name = name;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private IotHubResourceEventHubConsumerGroupArgs() {
        this.eventHubEndpointName = Input.empty();
        this.name = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubResourceEventHubConsumerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> eventHubEndpointName;
        private @Nullable Input<String> name;
        private @Nullable Input<EventHubConsumerGroupNameArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubResourceEventHubConsumerGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubEndpointName = defaults.eventHubEndpointName;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setEventHubEndpointName(Input<String> eventHubEndpointName) {
            this.eventHubEndpointName = Objects.requireNonNull(eventHubEndpointName);
            return this;
        }

        public Builder setEventHubEndpointName(String eventHubEndpointName) {
            this.eventHubEndpointName = Input.of(Objects.requireNonNull(eventHubEndpointName));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProperties(@Nullable Input<EventHubConsumerGroupNameArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable EventHubConsumerGroupNameArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }

        public IotHubResourceEventHubConsumerGroupArgs build() {
            return new IotHubResourceEventHubConsumerGroupArgs(eventHubEndpointName, name, properties, resourceGroupName, resourceName);
        }
    }
}
