// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationAccountSchemaArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationAccountSchemaArgs Empty = new GetIntegrationAccountSchemaArgs();

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private Output<String> integrationAccountName;

    /**
     * @return The integration account name.
     * 
     */
    public Output<String> integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The integration account schema name.
     * 
     */
    @Import(name="schemaName", required=true)
    private Output<String> schemaName;

    /**
     * @return The integration account schema name.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }

    private GetIntegrationAccountSchemaArgs() {}

    private GetIntegrationAccountSchemaArgs(GetIntegrationAccountSchemaArgs $) {
        this.integrationAccountName = $.integrationAccountName;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaName = $.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationAccountSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationAccountSchemaArgs $;

        public Builder() {
            $ = new GetIntegrationAccountSchemaArgs();
        }

        public Builder(GetIntegrationAccountSchemaArgs defaults) {
            $ = new GetIntegrationAccountSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(Output<String> integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            return integrationAccountName(Output.of(integrationAccountName));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param schemaName The integration account schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The integration account schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        public GetIntegrationAccountSchemaArgs build() {
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.schemaName = Objects.requireNonNull($.schemaName, "expected parameter 'schemaName' to be non-null");
            return $;
        }
    }

}
