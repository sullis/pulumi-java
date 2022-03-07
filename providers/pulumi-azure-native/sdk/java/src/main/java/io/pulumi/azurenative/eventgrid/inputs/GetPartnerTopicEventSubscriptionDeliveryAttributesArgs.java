// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPartnerTopicEventSubscriptionDeliveryAttributesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPartnerTopicEventSubscriptionDeliveryAttributesArgs Empty = new GetPartnerTopicEventSubscriptionDeliveryAttributesArgs();

    /**
     * Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    @InputImport(name="eventSubscriptionName", required=true)
      private final String eventSubscriptionName;

    public String getEventSubscriptionName() {
        return this.eventSubscriptionName;
    }

    /**
     * Name of the partner topic.
     * 
     */
    @InputImport(name="partnerTopicName", required=true)
      private final String partnerTopicName;

    public String getPartnerTopicName() {
        return this.partnerTopicName;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPartnerTopicEventSubscriptionDeliveryAttributesArgs(
        String eventSubscriptionName,
        String partnerTopicName,
        String resourceGroupName) {
        this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
        this.partnerTopicName = Objects.requireNonNull(partnerTopicName, "expected parameter 'partnerTopicName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPartnerTopicEventSubscriptionDeliveryAttributesArgs() {
        this.eventSubscriptionName = null;
        this.partnerTopicName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventSubscriptionName;
        private String partnerTopicName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSubscriptionName = defaults.eventSubscriptionName;
    	      this.partnerTopicName = defaults.partnerTopicName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEventSubscriptionName(String eventSubscriptionName) {
            this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName);
            return this;
        }

        public Builder setPartnerTopicName(String partnerTopicName) {
            this.partnerTopicName = Objects.requireNonNull(partnerTopicName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetPartnerTopicEventSubscriptionDeliveryAttributesArgs build() {
            return new GetPartnerTopicEventSubscriptionDeliveryAttributesArgs(eventSubscriptionName, partnerTopicName, resourceGroupName);
        }
    }
}