// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.eventgrid.enums.EventDeliverySchema;
import com.pulumi.azurenative.eventgrid.inputs.AzureFunctionEventSubscriptionDestinationArgs;
import com.pulumi.azurenative.eventgrid.inputs.DeadLetterWithResourceIdentityArgs;
import com.pulumi.azurenative.eventgrid.inputs.DeliveryWithResourceIdentityArgs;
import com.pulumi.azurenative.eventgrid.inputs.EventHubEventSubscriptionDestinationArgs;
import com.pulumi.azurenative.eventgrid.inputs.EventSubscriptionFilterArgs;
import com.pulumi.azurenative.eventgrid.inputs.HybridConnectionEventSubscriptionDestinationArgs;
import com.pulumi.azurenative.eventgrid.inputs.RetryPolicyArgs;
import com.pulumi.azurenative.eventgrid.inputs.ServiceBusQueueEventSubscriptionDestinationArgs;
import com.pulumi.azurenative.eventgrid.inputs.ServiceBusTopicEventSubscriptionDestinationArgs;
import com.pulumi.azurenative.eventgrid.inputs.StorageBlobDeadLetterDestinationArgs;
import com.pulumi.azurenative.eventgrid.inputs.StorageQueueEventSubscriptionDestinationArgs;
import com.pulumi.azurenative.eventgrid.inputs.WebHookEventSubscriptionDestinationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemTopicEventSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemTopicEventSubscriptionArgs Empty = new SystemTopicEventSubscriptionArgs();

    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="deadLetterDestination")
    private @Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination;

    /**
     * @return The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Optional<Output<StorageBlobDeadLetterDestinationArgs>> deadLetterDestination() {
        return Optional.ofNullable(this.deadLetterDestination);
    }

    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="deadLetterWithResourceIdentity")
    private @Nullable Output<DeadLetterWithResourceIdentityArgs> deadLetterWithResourceIdentity;

    /**
     * @return The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Optional<Output<DeadLetterWithResourceIdentityArgs>> deadLetterWithResourceIdentity() {
        return Optional.ofNullable(this.deadLetterWithResourceIdentity);
    }

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="deliveryWithResourceIdentity")
    private @Nullable Output<DeliveryWithResourceIdentityArgs> deliveryWithResourceIdentity;

    /**
     * @return Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Optional<Output<DeliveryWithResourceIdentityArgs>> deliveryWithResourceIdentity() {
        return Optional.ofNullable(this.deliveryWithResourceIdentity);
    }

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<Object> destination;

    /**
     * @return Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Optional<Output<Object>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * The event delivery schema for the event subscription.
     * 
     */
    @Import(name="eventDeliverySchema")
    private @Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema;

    /**
     * @return The event delivery schema for the event subscription.
     * 
     */
    public Optional<Output<Either<String,EventDeliverySchema>>> eventDeliverySchema() {
        return Optional.ofNullable(this.eventDeliverySchema);
    }

    /**
     * Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    @Import(name="eventSubscriptionName")
    private @Nullable Output<String> eventSubscriptionName;

    /**
     * @return Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    public Optional<Output<String>> eventSubscriptionName() {
        return Optional.ofNullable(this.eventSubscriptionName);
    }

    /**
     * Expiration time of the event subscription.
     * 
     */
    @Import(name="expirationTimeUtc")
    private @Nullable Output<String> expirationTimeUtc;

    /**
     * @return Expiration time of the event subscription.
     * 
     */
    public Optional<Output<String>> expirationTimeUtc() {
        return Optional.ofNullable(this.expirationTimeUtc);
    }

    /**
     * Information about the filter for the event subscription.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<EventSubscriptionFilterArgs> filter;

    /**
     * @return Information about the filter for the event subscription.
     * 
     */
    public Optional<Output<EventSubscriptionFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * List of user defined labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return List of user defined labels.
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<RetryPolicyArgs> retryPolicy;

    /**
     * @return The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     * 
     */
    public Optional<Output<RetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Name of the system topic.
     * 
     */
    @Import(name="systemTopicName", required=true)
    private Output<String> systemTopicName;

    /**
     * @return Name of the system topic.
     * 
     */
    public Output<String> systemTopicName() {
        return this.systemTopicName;
    }

    private SystemTopicEventSubscriptionArgs() {}

    private SystemTopicEventSubscriptionArgs(SystemTopicEventSubscriptionArgs $) {
        this.deadLetterDestination = $.deadLetterDestination;
        this.deadLetterWithResourceIdentity = $.deadLetterWithResourceIdentity;
        this.deliveryWithResourceIdentity = $.deliveryWithResourceIdentity;
        this.destination = $.destination;
        this.eventDeliverySchema = $.eventDeliverySchema;
        this.eventSubscriptionName = $.eventSubscriptionName;
        this.expirationTimeUtc = $.expirationTimeUtc;
        this.filter = $.filter;
        this.labels = $.labels;
        this.resourceGroupName = $.resourceGroupName;
        this.retryPolicy = $.retryPolicy;
        this.systemTopicName = $.systemTopicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemTopicEventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemTopicEventSubscriptionArgs $;

        public Builder() {
            $ = new SystemTopicEventSubscriptionArgs();
        }

        public Builder(SystemTopicEventSubscriptionArgs defaults) {
            $ = new SystemTopicEventSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deadLetterDestination The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
         * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterDestination(@Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination) {
            $.deadLetterDestination = deadLetterDestination;
            return this;
        }

        /**
         * @param deadLetterDestination The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
         * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterDestination(StorageBlobDeadLetterDestinationArgs deadLetterDestination) {
            return deadLetterDestination(Output.of(deadLetterDestination));
        }

        /**
         * @param deadLetterWithResourceIdentity The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
         * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterWithResourceIdentity(@Nullable Output<DeadLetterWithResourceIdentityArgs> deadLetterWithResourceIdentity) {
            $.deadLetterWithResourceIdentity = deadLetterWithResourceIdentity;
            return this;
        }

        /**
         * @param deadLetterWithResourceIdentity The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
         * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterWithResourceIdentity(DeadLetterWithResourceIdentityArgs deadLetterWithResourceIdentity) {
            return deadLetterWithResourceIdentity(Output.of(deadLetterWithResourceIdentity));
        }

        /**
         * @param deliveryWithResourceIdentity Information about the destination where events have to be delivered for the event subscription.
         * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
         * 
         * @return builder
         * 
         */
        public Builder deliveryWithResourceIdentity(@Nullable Output<DeliveryWithResourceIdentityArgs> deliveryWithResourceIdentity) {
            $.deliveryWithResourceIdentity = deliveryWithResourceIdentity;
            return this;
        }

        /**
         * @param deliveryWithResourceIdentity Information about the destination where events have to be delivered for the event subscription.
         * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
         * 
         * @return builder
         * 
         */
        public Builder deliveryWithResourceIdentity(DeliveryWithResourceIdentityArgs deliveryWithResourceIdentity) {
            return deliveryWithResourceIdentity(Output.of(deliveryWithResourceIdentity));
        }

        /**
         * @param destination Information about the destination where events have to be delivered for the event subscription.
         * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<Object> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Information about the destination where events have to be delivered for the event subscription.
         * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
         * 
         * @return builder
         * 
         */
        public Builder destination(Object destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param eventDeliverySchema The event delivery schema for the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder eventDeliverySchema(@Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema) {
            $.eventDeliverySchema = eventDeliverySchema;
            return this;
        }

        /**
         * @param eventDeliverySchema The event delivery schema for the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder eventDeliverySchema(Either<String,EventDeliverySchema> eventDeliverySchema) {
            return eventDeliverySchema(Output.of(eventDeliverySchema));
        }

        /**
         * @param eventDeliverySchema The event delivery schema for the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder eventDeliverySchema(String eventDeliverySchema) {
            return eventDeliverySchema(Either.ofLeft(eventDeliverySchema));
        }

        /**
         * @param eventDeliverySchema The event delivery schema for the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder eventDeliverySchema(EventDeliverySchema eventDeliverySchema) {
            return eventDeliverySchema(Either.ofRight(eventDeliverySchema));
        }

        /**
         * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
         * 
         * @return builder
         * 
         */
        public Builder eventSubscriptionName(@Nullable Output<String> eventSubscriptionName) {
            $.eventSubscriptionName = eventSubscriptionName;
            return this;
        }

        /**
         * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
         * 
         * @return builder
         * 
         */
        public Builder eventSubscriptionName(String eventSubscriptionName) {
            return eventSubscriptionName(Output.of(eventSubscriptionName));
        }

        /**
         * @param expirationTimeUtc Expiration time of the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUtc(@Nullable Output<String> expirationTimeUtc) {
            $.expirationTimeUtc = expirationTimeUtc;
            return this;
        }

        /**
         * @param expirationTimeUtc Expiration time of the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUtc(String expirationTimeUtc) {
            return expirationTimeUtc(Output.of(expirationTimeUtc));
        }

        /**
         * @param filter Information about the filter for the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<EventSubscriptionFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Information about the filter for the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder filter(EventSubscriptionFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param labels List of user defined labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels List of user defined labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels List of user defined labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param retryPolicy The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<RetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(RetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param systemTopicName Name of the system topic.
         * 
         * @return builder
         * 
         */
        public Builder systemTopicName(Output<String> systemTopicName) {
            $.systemTopicName = systemTopicName;
            return this;
        }

        /**
         * @param systemTopicName Name of the system topic.
         * 
         * @return builder
         * 
         */
        public Builder systemTopicName(String systemTopicName) {
            return systemTopicName(Output.of(systemTopicName));
        }

        public SystemTopicEventSubscriptionArgs build() {
            $.eventDeliverySchema = Codegen.stringProp("eventDeliverySchema").left(EventDeliverySchema.class).output().arg($.eventDeliverySchema).def("EventGridSchema").getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.systemTopicName = Objects.requireNonNull($.systemTopicName, "expected parameter 'systemTopicName' to be non-null");
            return $;
        }
    }

}
