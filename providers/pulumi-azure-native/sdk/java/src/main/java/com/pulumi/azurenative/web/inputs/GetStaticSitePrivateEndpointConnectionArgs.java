// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStaticSitePrivateEndpointConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStaticSitePrivateEndpointConnectionArgs Empty = new GetStaticSitePrivateEndpointConnectionArgs();

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the static site.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the private endpoint connection.
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private Output<String> privateEndpointConnectionName;

    /**
     * @return Name of the private endpoint connection.
     * 
     */
    public Output<String> privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetStaticSitePrivateEndpointConnectionArgs() {}

    private GetStaticSitePrivateEndpointConnectionArgs(GetStaticSitePrivateEndpointConnectionArgs $) {
        this.name = $.name;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStaticSitePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStaticSitePrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new GetStaticSitePrivateEndpointConnectionArgs();
        }

        public Builder(GetStaticSitePrivateEndpointConnectionArgs defaults) {
            $ = new GetStaticSitePrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the static site.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the static site.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateEndpointConnectionName Name of the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName Name of the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetStaticSitePrivateEndpointConnectionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
