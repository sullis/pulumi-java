// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinuxFunctionAppPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLinuxFunctionAppPlainArgs Empty = new GetLinuxFunctionAppPlainArgs();

    /**
     * The name which should be used for this Linux Function App.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name which should be used for this Linux Function App.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Linux Function App should exist.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Linux Function App should exist.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLinuxFunctionAppPlainArgs() {}

    private GetLinuxFunctionAppPlainArgs(GetLinuxFunctionAppPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinuxFunctionAppPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinuxFunctionAppPlainArgs $;

        public Builder() {
            $ = new GetLinuxFunctionAppPlainArgs();
        }

        public Builder(GetLinuxFunctionAppPlainArgs defaults) {
            $ = new GetLinuxFunctionAppPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name which should be used for this Linux Function App.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Linux Function App should exist.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetLinuxFunctionAppPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
