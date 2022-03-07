// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.eventgrid.inputs.EventChannelDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.EventChannelFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.EventChannelSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventChannelArgs Empty = new EventChannelArgs();

    /**
     * Represents the destination of an event channel.
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Input<EventChannelDestinationArgs> destination;

    public Input<EventChannelDestinationArgs> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * Name of the event channel.
     * 
     */
    @InputImport(name="eventChannelName")
      private final @Nullable Input<String> eventChannelName;

    public Input<String> getEventChannelName() {
        return this.eventChannelName == null ? Input.empty() : this.eventChannelName;
    }

    /**
     * Expiration time of the event channel. If this timer expires while the corresponding partner topic is never activated,
     * the event channel and corresponding partner topic are deleted.
     * 
     */
    @InputImport(name="expirationTimeIfNotActivatedUtc")
      private final @Nullable Input<String> expirationTimeIfNotActivatedUtc;

    public Input<String> getExpirationTimeIfNotActivatedUtc() {
        return this.expirationTimeIfNotActivatedUtc == null ? Input.empty() : this.expirationTimeIfNotActivatedUtc;
    }

    /**
     * Information about the filter for the event channel.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<EventChannelFilterArgs> filter;

    public Input<EventChannelFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * Name of the partner namespace.
     * 
     */
    @InputImport(name="partnerNamespaceName", required=true)
      private final Input<String> partnerNamespaceName;

    public Input<String> getPartnerNamespaceName() {
        return this.partnerNamespaceName;
    }

    /**
     * Friendly description about the topic. This can be set by the publisher/partner to show custom description for the customer partner topic.
     * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer.
     * 
     */
    @InputImport(name="partnerTopicFriendlyDescription")
      private final @Nullable Input<String> partnerTopicFriendlyDescription;

    public Input<String> getPartnerTopicFriendlyDescription() {
        return this.partnerTopicFriendlyDescription == null ? Input.empty() : this.partnerTopicFriendlyDescription;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Source of the event channel. This represents a unique resource in the partner's resource model.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<EventChannelSourceArgs> source;

    public Input<EventChannelSourceArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public EventChannelArgs(
        @Nullable Input<EventChannelDestinationArgs> destination,
        @Nullable Input<String> eventChannelName,
        @Nullable Input<String> expirationTimeIfNotActivatedUtc,
        @Nullable Input<EventChannelFilterArgs> filter,
        Input<String> partnerNamespaceName,
        @Nullable Input<String> partnerTopicFriendlyDescription,
        Input<String> resourceGroupName,
        @Nullable Input<EventChannelSourceArgs> source) {
        this.destination = destination;
        this.eventChannelName = eventChannelName;
        this.expirationTimeIfNotActivatedUtc = expirationTimeIfNotActivatedUtc;
        this.filter = filter;
        this.partnerNamespaceName = Objects.requireNonNull(partnerNamespaceName, "expected parameter 'partnerNamespaceName' to be non-null");
        this.partnerTopicFriendlyDescription = partnerTopicFriendlyDescription;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = source;
    }

    private EventChannelArgs() {
        this.destination = Input.empty();
        this.eventChannelName = Input.empty();
        this.expirationTimeIfNotActivatedUtc = Input.empty();
        this.filter = Input.empty();
        this.partnerNamespaceName = Input.empty();
        this.partnerTopicFriendlyDescription = Input.empty();
        this.resourceGroupName = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EventChannelDestinationArgs> destination;
        private @Nullable Input<String> eventChannelName;
        private @Nullable Input<String> expirationTimeIfNotActivatedUtc;
        private @Nullable Input<EventChannelFilterArgs> filter;
        private Input<String> partnerNamespaceName;
        private @Nullable Input<String> partnerTopicFriendlyDescription;
        private Input<String> resourceGroupName;
        private @Nullable Input<EventChannelSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(EventChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.eventChannelName = defaults.eventChannelName;
    	      this.expirationTimeIfNotActivatedUtc = defaults.expirationTimeIfNotActivatedUtc;
    	      this.filter = defaults.filter;
    	      this.partnerNamespaceName = defaults.partnerNamespaceName;
    	      this.partnerTopicFriendlyDescription = defaults.partnerTopicFriendlyDescription;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.source = defaults.source;
        }

        public Builder setDestination(@Nullable Input<EventChannelDestinationArgs> destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestination(@Nullable EventChannelDestinationArgs destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder setEventChannelName(@Nullable Input<String> eventChannelName) {
            this.eventChannelName = eventChannelName;
            return this;
        }

        public Builder setEventChannelName(@Nullable String eventChannelName) {
            this.eventChannelName = Input.ofNullable(eventChannelName);
            return this;
        }

        public Builder setExpirationTimeIfNotActivatedUtc(@Nullable Input<String> expirationTimeIfNotActivatedUtc) {
            this.expirationTimeIfNotActivatedUtc = expirationTimeIfNotActivatedUtc;
            return this;
        }

        public Builder setExpirationTimeIfNotActivatedUtc(@Nullable String expirationTimeIfNotActivatedUtc) {
            this.expirationTimeIfNotActivatedUtc = Input.ofNullable(expirationTimeIfNotActivatedUtc);
            return this;
        }

        public Builder setFilter(@Nullable Input<EventChannelFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable EventChannelFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setPartnerNamespaceName(Input<String> partnerNamespaceName) {
            this.partnerNamespaceName = Objects.requireNonNull(partnerNamespaceName);
            return this;
        }

        public Builder setPartnerNamespaceName(String partnerNamespaceName) {
            this.partnerNamespaceName = Input.of(Objects.requireNonNull(partnerNamespaceName));
            return this;
        }

        public Builder setPartnerTopicFriendlyDescription(@Nullable Input<String> partnerTopicFriendlyDescription) {
            this.partnerTopicFriendlyDescription = partnerTopicFriendlyDescription;
            return this;
        }

        public Builder setPartnerTopicFriendlyDescription(@Nullable String partnerTopicFriendlyDescription) {
            this.partnerTopicFriendlyDescription = Input.ofNullable(partnerTopicFriendlyDescription);
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

        public Builder setSource(@Nullable Input<EventChannelSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable EventChannelSourceArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }
        public EventChannelArgs build() {
            return new EventChannelArgs(destination, eventChannelName, expirationTimeIfNotActivatedUtc, filter, partnerNamespaceName, partnerTopicFriendlyDescription, resourceGroupName, source);
        }
    }
}