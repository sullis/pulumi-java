// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.azurenative.eventgrid.outputs.AzureFunctionEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.EventHubEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.EventSubscriptionIdentityResponse;
import com.pulumi.azurenative.eventgrid.outputs.HybridConnectionEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.ServiceBusQueueEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.ServiceBusTopicEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.StorageQueueEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.WebHookEventSubscriptionDestinationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryWithResourceIdentityResponse {
    /**
     * @return Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    private final @Nullable Object destination;
    /**
     * @return The identity to use when delivering events.
     * 
     */
    private final @Nullable EventSubscriptionIdentityResponse identity;

    @CustomType.Constructor
    private DeliveryWithResourceIdentityResponse(
        @CustomType.Parameter("destination") @Nullable Object destination,
        @CustomType.Parameter("identity") @Nullable EventSubscriptionIdentityResponse identity) {
        this.destination = destination;
        this.identity = identity;
    }

    /**
     * @return Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Optional<Object> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * @return The identity to use when delivering events.
     * 
     */
    public Optional<EventSubscriptionIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryWithResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object destination;
        private @Nullable EventSubscriptionIdentityResponse identity;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryWithResourceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.identity = defaults.identity;
        }

        public Builder destination(@Nullable Object destination) {
            this.destination = destination;
            return this;
        }
        public Builder identity(@Nullable EventSubscriptionIdentityResponse identity) {
            this.identity = identity;
            return this;
        }        public DeliveryWithResourceIdentityResponse build() {
            return new DeliveryWithResourceIdentityResponse(destination, identity);
        }
    }
}
