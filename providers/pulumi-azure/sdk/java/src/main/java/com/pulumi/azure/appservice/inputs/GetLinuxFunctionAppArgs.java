// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinuxFunctionAppArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLinuxFunctionAppArgs Empty = new GetLinuxFunctionAppArgs();

    /**
     * The name which should be used for this Linux Function App.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this Linux Function App.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Linux Function App should exist.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Linux Function App should exist.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLinuxFunctionAppArgs() {}

    private GetLinuxFunctionAppArgs(GetLinuxFunctionAppArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinuxFunctionAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinuxFunctionAppArgs $;

        public Builder() {
            $ = new GetLinuxFunctionAppArgs();
        }

        public Builder(GetLinuxFunctionAppArgs defaults) {
            $ = new GetLinuxFunctionAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name which should be used for this Linux Function App.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Linux Function App.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Linux Function App should exist.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Linux Function App should exist.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetLinuxFunctionAppArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
