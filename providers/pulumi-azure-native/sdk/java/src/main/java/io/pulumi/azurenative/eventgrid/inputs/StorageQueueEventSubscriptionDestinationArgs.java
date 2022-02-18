// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the storage queue destination for an event subscription.
 * 
 */
public final class StorageQueueEventSubscriptionDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageQueueEventSubscriptionDestinationArgs Empty = new StorageQueueEventSubscriptionDestinationArgs();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'StorageQueue'.
     * 
     */
    @InputImport(name="endpointType", required=true)
    private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * The name of the Storage queue under a storage account that is the destination of an event subscription.
     * 
     */
    @InputImport(name="queueName")
    private final @Nullable Input<String> queueName;

    public Input<String> getQueueName() {
        return this.queueName == null ? Input.empty() : this.queueName;
    }

    /**
     * The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public StorageQueueEventSubscriptionDestinationArgs(
        Input<String> endpointType,
        @Nullable Input<String> queueName,
        @Nullable Input<String> resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.queueName = queueName;
        this.resourceId = resourceId;
    }

    private StorageQueueEventSubscriptionDestinationArgs() {
        this.endpointType = Input.empty();
        this.queueName = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageQueueEventSubscriptionDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endpointType;
        private @Nullable Input<String> queueName;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageQueueEventSubscriptionDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.queueName = defaults.queueName;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setEndpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder setQueueName(@Nullable Input<String> queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder setQueueName(@Nullable String queueName) {
            this.queueName = Input.ofNullable(queueName);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public StorageQueueEventSubscriptionDestinationArgs build() {
            return new StorageQueueEventSubscriptionDestinationArgs(endpointType, queueName, resourceId);
        }
    }
}
