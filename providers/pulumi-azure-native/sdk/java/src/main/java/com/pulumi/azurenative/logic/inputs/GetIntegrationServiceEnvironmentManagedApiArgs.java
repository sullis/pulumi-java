// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationServiceEnvironmentManagedApiArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationServiceEnvironmentManagedApiArgs Empty = new GetIntegrationServiceEnvironmentManagedApiArgs();

    /**
     * The api name.
     * 
     */
    @Import(name="apiName", required=true)
    private Output<String> apiName;

    /**
     * @return The api name.
     * 
     */
    public Output<String> apiName() {
        return this.apiName;
    }

    /**
     * The integration service environment name.
     * 
     */
    @Import(name="integrationServiceEnvironmentName", required=true)
    private Output<String> integrationServiceEnvironmentName;

    /**
     * @return The integration service environment name.
     * 
     */
    public Output<String> integrationServiceEnvironmentName() {
        return this.integrationServiceEnvironmentName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private Output<String> resourceGroup;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }

    private GetIntegrationServiceEnvironmentManagedApiArgs() {}

    private GetIntegrationServiceEnvironmentManagedApiArgs(GetIntegrationServiceEnvironmentManagedApiArgs $) {
        this.apiName = $.apiName;
        this.integrationServiceEnvironmentName = $.integrationServiceEnvironmentName;
        this.resourceGroup = $.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationServiceEnvironmentManagedApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationServiceEnvironmentManagedApiArgs $;

        public Builder() {
            $ = new GetIntegrationServiceEnvironmentManagedApiArgs();
        }

        public Builder(GetIntegrationServiceEnvironmentManagedApiArgs defaults) {
            $ = new GetIntegrationServiceEnvironmentManagedApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiName The api name.
         * 
         * @return builder
         * 
         */
        public Builder apiName(Output<String> apiName) {
            $.apiName = apiName;
            return this;
        }

        /**
         * @param apiName The api name.
         * 
         * @return builder
         * 
         */
        public Builder apiName(String apiName) {
            return apiName(Output.of(apiName));
        }

        /**
         * @param integrationServiceEnvironmentName The integration service environment name.
         * 
         * @return builder
         * 
         */
        public Builder integrationServiceEnvironmentName(Output<String> integrationServiceEnvironmentName) {
            $.integrationServiceEnvironmentName = integrationServiceEnvironmentName;
            return this;
        }

        /**
         * @param integrationServiceEnvironmentName The integration service environment name.
         * 
         * @return builder
         * 
         */
        public Builder integrationServiceEnvironmentName(String integrationServiceEnvironmentName) {
            return integrationServiceEnvironmentName(Output.of(integrationServiceEnvironmentName));
        }

        /**
         * @param resourceGroup The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        public GetIntegrationServiceEnvironmentManagedApiArgs build() {
            $.apiName = Objects.requireNonNull($.apiName, "expected parameter 'apiName' to be non-null");
            $.integrationServiceEnvironmentName = Objects.requireNonNull($.integrationServiceEnvironmentName, "expected parameter 'integrationServiceEnvironmentName' to be non-null");
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            return $;
        }
    }

}
