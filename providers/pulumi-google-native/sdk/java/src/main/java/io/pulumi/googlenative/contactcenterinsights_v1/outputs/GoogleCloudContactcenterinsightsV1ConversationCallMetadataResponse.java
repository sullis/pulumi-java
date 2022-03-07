// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse {
    /**
     * The audio channel that contains the agent.
     * 
     */
    private final Integer agentChannel;
    /**
     * The audio channel that contains the customer.
     * 
     */
    private final Integer customerChannel;

    @OutputCustomType.Constructor({"agentChannel","customerChannel"})
    private GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse(
        Integer agentChannel,
        Integer customerChannel) {
        this.agentChannel = Objects.requireNonNull(agentChannel);
        this.customerChannel = Objects.requireNonNull(customerChannel);
    }

    /**
     * The audio channel that contains the agent.
     * 
    */
    public Integer getAgentChannel() {
        return this.agentChannel;
    }
    /**
     * The audio channel that contains the customer.
     * 
    */
    public Integer getCustomerChannel() {
        return this.customerChannel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer agentChannel;
        private Integer customerChannel;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentChannel = defaults.agentChannel;
    	      this.customerChannel = defaults.customerChannel;
        }

        public Builder setAgentChannel(Integer agentChannel) {
            this.agentChannel = Objects.requireNonNull(agentChannel);
            return this;
        }

        public Builder setCustomerChannel(Integer customerChannel) {
            this.customerChannel = Objects.requireNonNull(customerChannel);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse(agentChannel, customerChannel);
        }
    }
}