// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppServiceEnvironmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppServiceEnvironmentPlainArgs Empty = new GetAppServiceEnvironmentPlainArgs();

    /**
     * The name of this App Service Environment.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this App Service Environment.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the App Service Environment exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the App Service Environment exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAppServiceEnvironmentPlainArgs() {}

    private GetAppServiceEnvironmentPlainArgs(GetAppServiceEnvironmentPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppServiceEnvironmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppServiceEnvironmentPlainArgs $;

        public Builder() {
            $ = new GetAppServiceEnvironmentPlainArgs();
        }

        public Builder(GetAppServiceEnvironmentPlainArgs defaults) {
            $ = new GetAppServiceEnvironmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the App Service Environment exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAppServiceEnvironmentPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
