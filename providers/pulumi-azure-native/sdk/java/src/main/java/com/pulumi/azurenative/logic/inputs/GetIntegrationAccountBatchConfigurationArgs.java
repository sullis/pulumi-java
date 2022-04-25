// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationAccountBatchConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationAccountBatchConfigurationArgs Empty = new GetIntegrationAccountBatchConfigurationArgs();

    /**
     * The batch configuration name.
     * 
     */
    @Import(name="batchConfigurationName", required=true)
    private String batchConfigurationName;

    /**
     * @return The batch configuration name.
     * 
     */
    public String batchConfigurationName() {
        return this.batchConfigurationName;
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private String integrationAccountName;

    /**
     * @return The integration account name.
     * 
     */
    public String integrationAccountName() {
        return this.integrationAccountName;
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

    private GetIntegrationAccountBatchConfigurationArgs() {}

    private GetIntegrationAccountBatchConfigurationArgs(GetIntegrationAccountBatchConfigurationArgs $) {
        this.batchConfigurationName = $.batchConfigurationName;
        this.integrationAccountName = $.integrationAccountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationAccountBatchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationAccountBatchConfigurationArgs $;

        public Builder() {
            $ = new GetIntegrationAccountBatchConfigurationArgs();
        }

        public Builder(GetIntegrationAccountBatchConfigurationArgs defaults) {
            $ = new GetIntegrationAccountBatchConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchConfigurationName The batch configuration name.
         * 
         * @return builder
         * 
         */
        public Builder batchConfigurationName(String batchConfigurationName) {
            $.batchConfigurationName = batchConfigurationName;
            return this;
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
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

        public GetIntegrationAccountBatchConfigurationArgs build() {
            $.batchConfigurationName = Objects.requireNonNull($.batchConfigurationName, "expected parameter 'batchConfigurationName' to be non-null");
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
