// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.BqmlIterationResultArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.BqmlTrainingRunTrainingOptionsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BqmlTrainingRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final BqmlTrainingRunArgs Empty = new BqmlTrainingRunArgs();

    /**
     * [Output-only, Beta] List of each iteration results.
     * 
     */
    @InputImport(name="iterationResults")
      private final @Nullable Input<List<BqmlIterationResultArgs>> iterationResults;

    public Input<List<BqmlIterationResultArgs>> getIterationResults() {
        return this.iterationResults == null ? Input.empty() : this.iterationResults;
    }

    /**
     * [Output-only, Beta] Training run start time in milliseconds since the epoch.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
     * 
     */
    @InputImport(name="trainingOptions")
      private final @Nullable Input<BqmlTrainingRunTrainingOptionsArgs> trainingOptions;

    public Input<BqmlTrainingRunTrainingOptionsArgs> getTrainingOptions() {
        return this.trainingOptions == null ? Input.empty() : this.trainingOptions;
    }

    public BqmlTrainingRunArgs(
        @Nullable Input<List<BqmlIterationResultArgs>> iterationResults,
        @Nullable Input<String> startTime,
        @Nullable Input<String> state,
        @Nullable Input<BqmlTrainingRunTrainingOptionsArgs> trainingOptions) {
        this.iterationResults = iterationResults;
        this.startTime = startTime;
        this.state = state;
        this.trainingOptions = trainingOptions;
    }

    private BqmlTrainingRunArgs() {
        this.iterationResults = Input.empty();
        this.startTime = Input.empty();
        this.state = Input.empty();
        this.trainingOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BqmlTrainingRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BqmlIterationResultArgs>> iterationResults;
        private @Nullable Input<String> startTime;
        private @Nullable Input<String> state;
        private @Nullable Input<BqmlTrainingRunTrainingOptionsArgs> trainingOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(BqmlTrainingRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iterationResults = defaults.iterationResults;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.trainingOptions = defaults.trainingOptions;
        }

        public Builder setIterationResults(@Nullable Input<List<BqmlIterationResultArgs>> iterationResults) {
            this.iterationResults = iterationResults;
            return this;
        }

        public Builder setIterationResults(@Nullable List<BqmlIterationResultArgs> iterationResults) {
            this.iterationResults = Input.ofNullable(iterationResults);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTrainingOptions(@Nullable Input<BqmlTrainingRunTrainingOptionsArgs> trainingOptions) {
            this.trainingOptions = trainingOptions;
            return this;
        }

        public Builder setTrainingOptions(@Nullable BqmlTrainingRunTrainingOptionsArgs trainingOptions) {
            this.trainingOptions = Input.ofNullable(trainingOptions);
            return this;
        }
        public BqmlTrainingRunArgs build() {
            return new BqmlTrainingRunArgs(iterationResults, startTime, state, trainingOptions);
        }
    }
}