// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionPlainArgs Empty = new GetPrivateEndpointConnectionPlainArgs();

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return The Namespace name
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * The PrivateEndpointConnection name
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private String privateEndpointConnectionName;

    /**
     * @return The PrivateEndpointConnection name
     * 
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group within the azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPrivateEndpointConnectionPlainArgs() {}

    private GetPrivateEndpointConnectionPlainArgs(GetPrivateEndpointConnectionPlainArgs $) {
        this.namespaceName = $.namespaceName;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointConnectionPlainArgs $;

        public Builder() {
            $ = new GetPrivateEndpointConnectionPlainArgs();
        }

        public Builder(GetPrivateEndpointConnectionPlainArgs defaults) {
            $ = new GetPrivateEndpointConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespaceName The Namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName The PrivateEndpointConnection name
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group within the azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPrivateEndpointConnectionPlainArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
