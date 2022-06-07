// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRosettaNetProcessConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRosettaNetProcessConfigurationArgs Empty = new GetRosettaNetProcessConfigurationArgs();

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
     * The integration account RosettaNetProcessConfiguration name.
     * 
     */
    @Import(name="rosettaNetProcessConfigurationName", required=true)
    private Output<String> rosettaNetProcessConfigurationName;

    /**
     * @return The integration account RosettaNetProcessConfiguration name.
     * 
     */
    public Output<String> rosettaNetProcessConfigurationName() {
        return this.rosettaNetProcessConfigurationName;
    }

    private GetRosettaNetProcessConfigurationArgs() {}

    private GetRosettaNetProcessConfigurationArgs(GetRosettaNetProcessConfigurationArgs $) {
        this.integrationAccountName = $.integrationAccountName;
        this.resourceGroupName = $.resourceGroupName;
        this.rosettaNetProcessConfigurationName = $.rosettaNetProcessConfigurationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRosettaNetProcessConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRosettaNetProcessConfigurationArgs $;

        public Builder() {
            $ = new GetRosettaNetProcessConfigurationArgs();
        }

        public Builder(GetRosettaNetProcessConfigurationArgs defaults) {
            $ = new GetRosettaNetProcessConfigurationArgs(Objects.requireNonNull(defaults));
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
         * @param rosettaNetProcessConfigurationName The integration account RosettaNetProcessConfiguration name.
         * 
         * @return builder
         * 
         */
        public Builder rosettaNetProcessConfigurationName(Output<String> rosettaNetProcessConfigurationName) {
            $.rosettaNetProcessConfigurationName = rosettaNetProcessConfigurationName;
            return this;
        }

        /**
         * @param rosettaNetProcessConfigurationName The integration account RosettaNetProcessConfiguration name.
         * 
         * @return builder
         * 
         */
        public Builder rosettaNetProcessConfigurationName(String rosettaNetProcessConfigurationName) {
            return rosettaNetProcessConfigurationName(Output.of(rosettaNetProcessConfigurationName));
        }

        public GetRosettaNetProcessConfigurationArgs build() {
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.rosettaNetProcessConfigurationName = Objects.requireNonNull($.rosettaNetProcessConfigurationName, "expected parameter 'rosettaNetProcessConfigurationName' to be non-null");
            return $;
        }
    }

}
