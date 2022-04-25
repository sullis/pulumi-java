// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationRuntimeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeArgs Empty = new GetIntegrationRuntimeArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private String factoryName;

    /**
     * @return The factory name.
     * 
     */
    public String factoryName() {
        return this.factoryName;
    }

    /**
     * The integration runtime name.
     * 
     */
    @Import(name="integrationRuntimeName", required=true)
    private String integrationRuntimeName;

    /**
     * @return The integration runtime name.
     * 
     */
    public String integrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetIntegrationRuntimeArgs() {}

    private GetIntegrationRuntimeArgs(GetIntegrationRuntimeArgs $) {
        this.factoryName = $.factoryName;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationRuntimeArgs $;

        public Builder() {
            $ = new GetIntegrationRuntimeArgs();
        }

        public Builder(GetIntegrationRuntimeArgs defaults) {
            $ = new GetIntegrationRuntimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param integrationRuntimeName The integration runtime name.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetIntegrationRuntimeArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.integrationRuntimeName = Objects.requireNonNull($.integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
