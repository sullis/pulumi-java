// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an Event Hub input data source that contains stream data.
 * 
 */
public final class EventHubStreamInputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubStreamInputDataSourceArgs Empty = new EventHubStreamInputDataSourceArgs();

    /**
     * The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not specified, the input uses the Event Hub’s default consumer group.
     * 
     */
    @InputImport(name="consumerGroupName")
    private final @Nullable Input<String> consumerGroupName;

    public Input<String> getConsumerGroupName() {
        return this.consumerGroupName == null ? Input.empty() : this.consumerGroupName;
    }

    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="eventHubName")
    private final @Nullable Input<String> eventHubName;

    public Input<String> getEventHubName() {
        return this.eventHubName == null ? Input.empty() : this.eventHubName;
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="serviceBusNamespace")
    private final @Nullable Input<String> serviceBusNamespace;

    public Input<String> getServiceBusNamespace() {
        return this.serviceBusNamespace == null ? Input.empty() : this.serviceBusNamespace;
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyKey")
    private final @Nullable Input<String> sharedAccessPolicyKey;

    public Input<String> getSharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey == null ? Input.empty() : this.sharedAccessPolicyKey;
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyName")
    private final @Nullable Input<String> sharedAccessPolicyName;

    public Input<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName == null ? Input.empty() : this.sharedAccessPolicyName;
    }

    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/EventHub'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public EventHubStreamInputDataSourceArgs(
        @Nullable Input<String> consumerGroupName,
        @Nullable Input<String> eventHubName,
        @Nullable Input<String> serviceBusNamespace,
        @Nullable Input<String> sharedAccessPolicyKey,
        @Nullable Input<String> sharedAccessPolicyName,
        Input<String> type) {
        this.consumerGroupName = consumerGroupName;
        this.eventHubName = eventHubName;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EventHubStreamInputDataSourceArgs() {
        this.consumerGroupName = Input.empty();
        this.eventHubName = Input.empty();
        this.serviceBusNamespace = Input.empty();
        this.sharedAccessPolicyKey = Input.empty();
        this.sharedAccessPolicyName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubStreamInputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> consumerGroupName;
        private @Nullable Input<String> eventHubName;
        private @Nullable Input<String> serviceBusNamespace;
        private @Nullable Input<String> sharedAccessPolicyKey;
        private @Nullable Input<String> sharedAccessPolicyName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubStreamInputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroupName = defaults.consumerGroupName;
    	      this.eventHubName = defaults.eventHubName;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder setConsumerGroupName(@Nullable Input<String> consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        public Builder setConsumerGroupName(@Nullable String consumerGroupName) {
            this.consumerGroupName = Input.ofNullable(consumerGroupName);
            return this;
        }

        public Builder setEventHubName(@Nullable Input<String> eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder setEventHubName(@Nullable String eventHubName) {
            this.eventHubName = Input.ofNullable(eventHubName);
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable Input<String> serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = Input.ofNullable(serviceBusNamespace);
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable Input<String> sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = Input.ofNullable(sharedAccessPolicyKey);
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable Input<String> sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Input.ofNullable(sharedAccessPolicyName);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public EventHubStreamInputDataSourceArgs build() {
            return new EventHubStreamInputDataSourceArgs(consumerGroupName, eventHubName, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
