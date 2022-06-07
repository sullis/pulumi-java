// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetChannelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetChannelArgs Empty = new GetChannelArgs();

    /**
     * Name of the channel.
     * 
     */
    @Import(name="channelName", required=true)
    private Output<String> channelName;

    /**
     * @return Name of the channel.
     * 
     */
    public Output<String> channelName() {
        return this.channelName;
    }

    /**
     * Name of the partner namespace.
     * 
     */
    @Import(name="partnerNamespaceName", required=true)
    private Output<String> partnerNamespaceName;

    /**
     * @return Name of the partner namespace.
     * 
     */
    public Output<String> partnerNamespaceName() {
        return this.partnerNamespaceName;
    }

    /**
     * The name of the resource group within the partners subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the partners subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetChannelArgs() {}

    private GetChannelArgs(GetChannelArgs $) {
        this.channelName = $.channelName;
        this.partnerNamespaceName = $.partnerNamespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetChannelArgs $;

        public Builder() {
            $ = new GetChannelArgs();
        }

        public Builder(GetChannelArgs defaults) {
            $ = new GetChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelName Name of the channel.
         * 
         * @return builder
         * 
         */
        public Builder channelName(Output<String> channelName) {
            $.channelName = channelName;
            return this;
        }

        /**
         * @param channelName Name of the channel.
         * 
         * @return builder
         * 
         */
        public Builder channelName(String channelName) {
            return channelName(Output.of(channelName));
        }

        /**
         * @param partnerNamespaceName Name of the partner namespace.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceName(Output<String> partnerNamespaceName) {
            $.partnerNamespaceName = partnerNamespaceName;
            return this;
        }

        /**
         * @param partnerNamespaceName Name of the partner namespace.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceName(String partnerNamespaceName) {
            return partnerNamespaceName(Output.of(partnerNamespaceName));
        }

        /**
         * @param resourceGroupName The name of the resource group within the partners subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the partners subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetChannelArgs build() {
            $.channelName = Objects.requireNonNull($.channelName, "expected parameter 'channelName' to be non-null");
            $.partnerNamespaceName = Objects.requireNonNull($.partnerNamespaceName, "expected parameter 'partnerNamespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
