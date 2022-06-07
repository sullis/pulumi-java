// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupPlainArgs Empty = new GetGroupPlainArgs();

    /**
     * The Name of the API Management Service in which this Group exists.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private String apiManagementName;

    /**
     * @return The Name of the API Management Service in which this Group exists.
     * 
     */
    public String apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * The Name of the API Management Group.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The Name of the API Management Group.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group in which the API Management Service exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group in which the API Management Service exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetGroupPlainArgs() {}

    private GetGroupPlainArgs(GetGroupPlainArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupPlainArgs $;

        public Builder() {
            $ = new GetGroupPlainArgs();
        }

        public Builder(GetGroupPlainArgs defaults) {
            $ = new GetGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The Name of the API Management Service in which this Group exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param name The Name of the API Management Group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which the API Management Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetGroupPlainArgs build() {
            $.apiManagementName = Objects.requireNonNull($.apiManagementName, "expected parameter 'apiManagementName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
