// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the storage queue destination for an event subscription.
 * 
 */
public final class StorageQueueEventSubscriptionDestinationResponse extends com.pulumi.resources.InvokeArgs {

    public static final StorageQueueEventSubscriptionDestinationResponse Empty = new StorageQueueEventSubscriptionDestinationResponse();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is &#39;StorageQueue&#39;.
     * 
     */
    @Import(name="endpointType", required=true)
    private String endpointType;

    /**
     * @return Type of the endpoint for the event subscription destination.
     * Expected value is &#39;StorageQueue&#39;.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }

    /**
     * The name of the Storage queue under a storage account that is the destination of an event subscription.
     * 
     */
    @Import(name="queueName")
    private @Nullable String queueName;

    /**
     * @return The name of the Storage queue under a storage account that is the destination of an event subscription.
     * 
     */
    public Optional<String> queueName() {
        return Optional.ofNullable(this.queueName);
    }

    /**
     * The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     * 
     */
    @Import(name="resourceId")
    private @Nullable String resourceId;

    /**
     * @return The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private StorageQueueEventSubscriptionDestinationResponse() {}

    private StorageQueueEventSubscriptionDestinationResponse(StorageQueueEventSubscriptionDestinationResponse $) {
        this.endpointType = $.endpointType;
        this.queueName = $.queueName;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageQueueEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageQueueEventSubscriptionDestinationResponse $;

        public Builder() {
            $ = new StorageQueueEventSubscriptionDestinationResponse();
        }

        public Builder(StorageQueueEventSubscriptionDestinationResponse defaults) {
            $ = new StorageQueueEventSubscriptionDestinationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointType Type of the endpoint for the event subscription destination.
         * Expected value is &#39;StorageQueue&#39;.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(String endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        /**
         * @param queueName The name of the Storage queue under a storage account that is the destination of an event subscription.
         * 
         * @return builder
         * 
         */
        public Builder queueName(@Nullable String queueName) {
            $.queueName = queueName;
            return this;
        }

        /**
         * @param resourceId The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public StorageQueueEventSubscriptionDestinationResponse build() {
            $.endpointType = Codegen.stringProp("endpointType").arg($.endpointType).require();
            return $;
        }
    }

}
