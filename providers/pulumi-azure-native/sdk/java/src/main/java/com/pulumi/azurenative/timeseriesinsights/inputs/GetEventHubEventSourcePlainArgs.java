// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventHubEventSourcePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventHubEventSourcePlainArgs Empty = new GetEventHubEventSourcePlainArgs();

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @Import(name="environmentName", required=true)
    private String environmentName;

    /**
     * @return The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    public String environmentName() {
        return this.environmentName;
    }

    /**
     * The name of the Time Series Insights event source associated with the specified environment.
     * 
     */
    @Import(name="eventSourceName", required=true)
    private String eventSourceName;

    /**
     * @return The name of the Time Series Insights event source associated with the specified environment.
     * 
     */
    public String eventSourceName() {
        return this.eventSourceName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetEventHubEventSourcePlainArgs() {}

    private GetEventHubEventSourcePlainArgs(GetEventHubEventSourcePlainArgs $) {
        this.environmentName = $.environmentName;
        this.eventSourceName = $.eventSourceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventHubEventSourcePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventHubEventSourcePlainArgs $;

        public Builder() {
            $ = new GetEventHubEventSourcePlainArgs();
        }

        public Builder(GetEventHubEventSourcePlainArgs defaults) {
            $ = new GetEventHubEventSourcePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param eventSourceName The name of the Time Series Insights event source associated with the specified environment.
         * 
         * @return builder
         * 
         */
        public Builder eventSourceName(String eventSourceName) {
            $.eventSourceName = eventSourceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetEventHubEventSourcePlainArgs build() {
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.eventSourceName = Objects.requireNonNull($.eventSourceName, "expected parameter 'eventSourceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
