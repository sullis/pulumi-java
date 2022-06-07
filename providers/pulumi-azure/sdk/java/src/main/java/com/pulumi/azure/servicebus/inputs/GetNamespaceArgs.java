// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNamespaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceArgs Empty = new GetNamespaceArgs();

    /**
     * Specifies the name of the ServiceBus Namespace.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Namespace.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the name of the Resource Group where the ServiceBus Namespace exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the ServiceBus Namespace exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNamespaceArgs() {}

    private GetNamespaceArgs(GetNamespaceArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceArgs $;

        public Builder() {
            $ = new GetNamespaceArgs();
        }

        public Builder(GetNamespaceArgs defaults) {
            $ = new GetNamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the ServiceBus Namespace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the ServiceBus Namespace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetNamespaceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
