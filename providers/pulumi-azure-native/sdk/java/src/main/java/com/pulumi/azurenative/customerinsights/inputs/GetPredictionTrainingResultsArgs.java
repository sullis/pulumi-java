// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPredictionTrainingResultsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPredictionTrainingResultsArgs Empty = new GetPredictionTrainingResultsArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * The name of the Prediction.
     * 
     */
    @Import(name="predictionName", required=true)
    private Output<String> predictionName;

    /**
     * @return The name of the Prediction.
     * 
     */
    public Output<String> predictionName() {
        return this.predictionName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPredictionTrainingResultsArgs() {}

    private GetPredictionTrainingResultsArgs(GetPredictionTrainingResultsArgs $) {
        this.hubName = $.hubName;
        this.predictionName = $.predictionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPredictionTrainingResultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPredictionTrainingResultsArgs $;

        public Builder() {
            $ = new GetPredictionTrainingResultsArgs();
        }

        public Builder(GetPredictionTrainingResultsArgs defaults) {
            $ = new GetPredictionTrainingResultsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        /**
         * @param predictionName The name of the Prediction.
         * 
         * @return builder
         * 
         */
        public Builder predictionName(Output<String> predictionName) {
            $.predictionName = predictionName;
            return this;
        }

        /**
         * @param predictionName The name of the Prediction.
         * 
         * @return builder
         * 
         */
        public Builder predictionName(String predictionName) {
            return predictionName(Output.of(predictionName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetPredictionTrainingResultsArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.predictionName = Objects.requireNonNull($.predictionName, "expected parameter 'predictionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
