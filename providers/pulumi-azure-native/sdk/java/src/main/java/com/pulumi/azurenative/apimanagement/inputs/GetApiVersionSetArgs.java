// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiVersionSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiVersionSetArgs Empty = new GetApiVersionSetArgs();

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
     * Api Version Set identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="versionSetId", required=true)
    private Output<String> versionSetId;

    /**
     * @return Api Version Set identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> versionSetId() {
        return this.versionSetId;
    }

    private GetApiVersionSetArgs() {}

    private GetApiVersionSetArgs(GetApiVersionSetArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.versionSetId = $.versionSetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiVersionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiVersionSetArgs $;

        public Builder() {
            $ = new GetApiVersionSetArgs();
        }

        public Builder(GetApiVersionSetArgs defaults) {
            $ = new GetApiVersionSetArgs(Objects.requireNonNull(defaults));
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
         * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder versionSetId(Output<String> versionSetId) {
            $.versionSetId = versionSetId;
            return this;
        }

        /**
         * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder versionSetId(String versionSetId) {
            return versionSetId(Output.of(versionSetId));
        }

        public GetApiVersionSetArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.versionSetId = Objects.requireNonNull($.versionSetId, "expected parameter 'versionSetId' to be non-null");
            return $;
        }
    }

}
