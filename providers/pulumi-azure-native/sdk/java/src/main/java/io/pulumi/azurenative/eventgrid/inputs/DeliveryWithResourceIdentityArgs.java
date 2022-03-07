// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.inputs.AzureFunctionEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.EventHubEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.EventSubscriptionIdentityArgs;
import io.pulumi.azurenative.eventgrid.inputs.HybridConnectionEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.ServiceBusQueueEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.ServiceBusTopicEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.StorageQueueEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.WebHookEventSubscriptionDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the delivery for an event subscription with resource identity.
 * 
 */
public final class DeliveryWithResourceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryWithResourceIdentityArgs Empty = new DeliveryWithResourceIdentityArgs();

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Input<Object> destination;

    public Input<Object> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * The identity to use when delivering events.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<EventSubscriptionIdentityArgs> identity;

    public Input<EventSubscriptionIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    public DeliveryWithResourceIdentityArgs(
        @Nullable Input<Object> destination,
        @Nullable Input<EventSubscriptionIdentityArgs> identity) {
        this.destination = destination;
        this.identity = identity;
    }

    private DeliveryWithResourceIdentityArgs() {
        this.destination = Input.empty();
        this.identity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryWithResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> destination;
        private @Nullable Input<EventSubscriptionIdentityArgs> identity;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryWithResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.identity = defaults.identity;
        }

        public Builder setDestination(@Nullable Input<Object> destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestination(@Nullable Object destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder setIdentity(@Nullable Input<EventSubscriptionIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable EventSubscriptionIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }
        public DeliveryWithResourceIdentityArgs build() {
            return new DeliveryWithResourceIdentityArgs(destination, identity);
        }
    }
}