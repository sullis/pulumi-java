// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionArgs Empty = new GetSubscriptionArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * 
     */
    @Import(name="sid", required=true)
    private Output<String> sid;

    /**
     * @return Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * 
     */
    public Output<String> sid() {
        return this.sid;
    }

    private GetSubscriptionArgs() {}

    private GetSubscriptionArgs(GetSubscriptionArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.sid = $.sid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionArgs $;

        public Builder() {
            $ = new GetSubscriptionArgs();
        }

        public Builder(GetSubscriptionArgs defaults) {
            $ = new GetSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
         * 
         * @return builder
         * 
         */
        public Builder sid(Output<String> sid) {
            $.sid = sid;
            return this;
        }

        /**
         * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
         * 
         * @return builder
         * 
         */
        public Builder sid(String sid) {
            return sid(Output.of(sid));
        }

        public GetSubscriptionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.sid = Objects.requireNonNull($.sid, "expected parameter 'sid' to be non-null");
            return $;
        }
    }

}
