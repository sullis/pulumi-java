// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServicePlanPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePlanPlainArgs Empty = new GetServicePlanPlainArgs();

    /**
     * The name of this Service Plan.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this Service Plan.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Service Plan exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Service Plan exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetServicePlanPlainArgs() {}

    private GetServicePlanPlainArgs(GetServicePlanPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePlanPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePlanPlainArgs $;

        public Builder() {
            $ = new GetServicePlanPlainArgs();
        }

        public Builder(GetServicePlanPlainArgs defaults) {
            $ = new GetServicePlanPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Service Plan.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Service Plan exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetServicePlanPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
