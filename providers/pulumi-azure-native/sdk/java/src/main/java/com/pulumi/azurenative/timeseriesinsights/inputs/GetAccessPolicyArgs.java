// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessPolicyArgs Empty = new GetAccessPolicyArgs();

    /**
     * The name of the Time Series Insights access policy associated with the specified environment.
     * 
     */
    @Import(name="accessPolicyName", required=true)
    private Output<String> accessPolicyName;

    /**
     * @return The name of the Time Series Insights access policy associated with the specified environment.
     * 
     */
    public Output<String> accessPolicyName() {
        return this.accessPolicyName;
    }

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @Import(name="environmentName", required=true)
    private Output<String> environmentName;

    /**
     * @return The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    public Output<String> environmentName() {
        return this.environmentName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAccessPolicyArgs() {}

    private GetAccessPolicyArgs(GetAccessPolicyArgs $) {
        this.accessPolicyName = $.accessPolicyName;
        this.environmentName = $.environmentName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessPolicyArgs $;

        public Builder() {
            $ = new GetAccessPolicyArgs();
        }

        public Builder(GetAccessPolicyArgs defaults) {
            $ = new GetAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(Output<String> accessPolicyName) {
            $.accessPolicyName = accessPolicyName;
            return this;
        }

        /**
         * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(String accessPolicyName) {
            return accessPolicyName(Output.of(accessPolicyName));
        }

        /**
         * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(Output<String> environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            return environmentName(Output.of(environmentName));
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetAccessPolicyArgs build() {
            $.accessPolicyName = Objects.requireNonNull($.accessPolicyName, "expected parameter 'accessPolicyName' to be non-null");
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
