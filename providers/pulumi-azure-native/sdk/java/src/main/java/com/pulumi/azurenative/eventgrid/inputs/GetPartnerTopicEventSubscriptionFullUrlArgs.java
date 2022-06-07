// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPartnerTopicEventSubscriptionFullUrlArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPartnerTopicEventSubscriptionFullUrlArgs Empty = new GetPartnerTopicEventSubscriptionFullUrlArgs();

    /**
     * Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    @Import(name="eventSubscriptionName", required=true)
    private Output<String> eventSubscriptionName;

    /**
     * @return Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    public Output<String> eventSubscriptionName() {
        return this.eventSubscriptionName;
    }

    /**
     * Name of the partner topic.
     * 
     */
    @Import(name="partnerTopicName", required=true)
    private Output<String> partnerTopicName;

    /**
     * @return Name of the partner topic.
     * 
     */
    public Output<String> partnerTopicName() {
        return this.partnerTopicName;
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

    private GetPartnerTopicEventSubscriptionFullUrlArgs() {}

    private GetPartnerTopicEventSubscriptionFullUrlArgs(GetPartnerTopicEventSubscriptionFullUrlArgs $) {
        this.eventSubscriptionName = $.eventSubscriptionName;
        this.partnerTopicName = $.partnerTopicName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPartnerTopicEventSubscriptionFullUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPartnerTopicEventSubscriptionFullUrlArgs $;

        public Builder() {
            $ = new GetPartnerTopicEventSubscriptionFullUrlArgs();
        }

        public Builder(GetPartnerTopicEventSubscriptionFullUrlArgs defaults) {
            $ = new GetPartnerTopicEventSubscriptionFullUrlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
         * 
         * @return builder
         * 
         */
        public Builder eventSubscriptionName(Output<String> eventSubscriptionName) {
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
         * @param partnerTopicName Name of the partner topic.
         * 
         * @return builder
         * 
         */
        public Builder partnerTopicName(Output<String> partnerTopicName) {
            $.partnerTopicName = partnerTopicName;
            return this;
        }

        /**
         * @param partnerTopicName Name of the partner topic.
         * 
         * @return builder
         * 
         */
        public Builder partnerTopicName(String partnerTopicName) {
            return partnerTopicName(Output.of(partnerTopicName));
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

        public GetPartnerTopicEventSubscriptionFullUrlArgs build() {
            $.eventSubscriptionName = Objects.requireNonNull($.eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
            $.partnerTopicName = Objects.requireNonNull($.partnerTopicName, "expected parameter 'partnerTopicName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
