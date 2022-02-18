// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEventChannelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventChannelArgs Empty = new GetEventChannelArgs();

    /**
     * Name of the event channel.
     * 
     */
    @InputImport(name="eventChannelName", required=true)
    private final String eventChannelName;

    public String getEventChannelName() {
        return this.eventChannelName;
    }

    /**
     * Name of the partner namespace.
     * 
     */
    @InputImport(name="partnerNamespaceName", required=true)
    private final String partnerNamespaceName;

    public String getPartnerNamespaceName() {
        return this.partnerNamespaceName;
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

    public GetEventChannelArgs(
        String eventChannelName,
        String partnerNamespaceName,
        String resourceGroupName) {
        this.eventChannelName = Objects.requireNonNull(eventChannelName, "expected parameter 'eventChannelName' to be non-null");
        this.partnerNamespaceName = Objects.requireNonNull(partnerNamespaceName, "expected parameter 'partnerNamespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetEventChannelArgs() {
        this.eventChannelName = null;
        this.partnerNamespaceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventChannelName;
        private String partnerNamespaceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventChannelName = defaults.eventChannelName;
    	      this.partnerNamespaceName = defaults.partnerNamespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEventChannelName(String eventChannelName) {
            this.eventChannelName = Objects.requireNonNull(eventChannelName);
            return this;
        }

        public Builder setPartnerNamespaceName(String partnerNamespaceName) {
            this.partnerNamespaceName = Objects.requireNonNull(partnerNamespaceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetEventChannelArgs build() {
            return new GetEventChannelArgs(eventChannelName, partnerNamespaceName, resourceGroupName);
        }
    }
}
