// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWindowsWebAppPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWindowsWebAppPlainArgs Empty = new GetWindowsWebAppPlainArgs();

    /**
     * The name of this Windows Web App.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this Windows Web App.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Windows Web App exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Windows Web App exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetWindowsWebAppPlainArgs() {}

    private GetWindowsWebAppPlainArgs(GetWindowsWebAppPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWindowsWebAppPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWindowsWebAppPlainArgs $;

        public Builder() {
            $ = new GetWindowsWebAppPlainArgs();
        }

        public Builder(GetWindowsWebAppPlainArgs defaults) {
            $ = new GetWindowsWebAppPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Windows Web App.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Windows Web App exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetWindowsWebAppPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
