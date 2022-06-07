// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagArgs Empty = new GetTagArgs();

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
     * Tag identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="tagId", required=true)
    private Output<String> tagId;

    /**
     * @return Tag identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> tagId() {
        return this.tagId;
    }

    private GetTagArgs() {}

    private GetTagArgs(GetTagArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.tagId = $.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagArgs $;

        public Builder() {
            $ = new GetTagArgs();
        }

        public Builder(GetTagArgs defaults) {
            $ = new GetTagArgs(Objects.requireNonNull(defaults));
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
         * @param tagId Tag identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder tagId(Output<String> tagId) {
            $.tagId = tagId;
            return this;
        }

        /**
         * @param tagId Tag identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder tagId(String tagId) {
            return tagId(Output.of(tagId));
        }

        public GetTagArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.tagId = Objects.requireNonNull($.tagId, "expected parameter 'tagId' to be non-null");
            return $;
        }
    }

}
