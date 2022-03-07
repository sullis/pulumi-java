// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the storage queue destination for an event subscription.
 * 
 */
public final class StorageQueueEventSubscriptionDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageQueueEventSubscriptionDestinationResponse Empty = new StorageQueueEventSubscriptionDestinationResponse();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'StorageQueue'.
     * 
     */
    @InputImport(name="endpointType", required=true)
      private final String endpointType;

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * The name of the Storage queue under a storage account that is the destination of an event subscription.
     * 
     */
    @InputImport(name="queueName")
      private final @Nullable String queueName;

    public Optional<String> getQueueName() {
        return this.queueName == null ? Optional.empty() : Optional.ofNullable(this.queueName);
    }

    /**
     * The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public StorageQueueEventSubscriptionDestinationResponse(
        String endpointType,
        @Nullable String queueName,
        @Nullable String resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.queueName = queueName;
        this.resourceId = resourceId;
    }

    private StorageQueueEventSubscriptionDestinationResponse() {
        this.endpointType = null;
        this.queueName = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageQueueEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String queueName;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageQueueEventSubscriptionDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.queueName = defaults.queueName;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setQueueName(@Nullable String queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public StorageQueueEventSubscriptionDestinationResponse build() {
            return new StorageQueueEventSubscriptionDestinationResponse(endpointType, queueName, resourceId);
        }
    }
}