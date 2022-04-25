// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__HyperparameterSpecAlgorithm;
import com.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__HyperparameterSpecGoal;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ParameterSpecArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a set of hyperparameters to optimize.
 * 
 */
public final class GoogleCloudMlV1__HyperparameterSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__HyperparameterSpecArgs Empty = new GoogleCloudMlV1__HyperparameterSpecArgs();

    /**
     * Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm;

    /**
     * @return Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
     * 
     */
    public Optional<Output<GoogleCloudMlV1__HyperparameterSpecAlgorithm>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * Optional. Indicates if the hyperparameter tuning job enables auto trial early stopping.
     * 
     */
    @Import(name="enableTrialEarlyStopping")
    private @Nullable Output<Boolean> enableTrialEarlyStopping;

    /**
     * @return Optional. Indicates if the hyperparameter tuning job enables auto trial early stopping.
     * 
     */
    public Optional<Output<Boolean>> enableTrialEarlyStopping() {
        return Optional.ofNullable(this.enableTrialEarlyStopping);
    }

    /**
     * The type of goal to use for tuning. Available types are `MAXIMIZE` and `MINIMIZE`. Defaults to `MAXIMIZE`.
     * 
     */
    @Import(name="goal", required=true)
    private Output<GoogleCloudMlV1__HyperparameterSpecGoal> goal;

    /**
     * @return The type of goal to use for tuning. Available types are `MAXIMIZE` and `MINIMIZE`. Defaults to `MAXIMIZE`.
     * 
     */
    public Output<GoogleCloudMlV1__HyperparameterSpecGoal> goal() {
        return this.goal;
    }

    /**
     * Optional. The TensorFlow summary tag name to use for optimizing trials. For current versions of TensorFlow, this tag name should exactly match what is shown in TensorBoard, including all scopes. For versions of TensorFlow prior to 0.12, this should be only the tag passed to tf.Summary. By default, &#34;training/hptuning/metric&#34; will be used.
     * 
     */
    @Import(name="hyperparameterMetricTag")
    private @Nullable Output<String> hyperparameterMetricTag;

    /**
     * @return Optional. The TensorFlow summary tag name to use for optimizing trials. For current versions of TensorFlow, this tag name should exactly match what is shown in TensorBoard, including all scopes. For versions of TensorFlow prior to 0.12, this should be only the tag passed to tf.Summary. By default, &#34;training/hptuning/metric&#34; will be used.
     * 
     */
    public Optional<Output<String>> hyperparameterMetricTag() {
        return Optional.ofNullable(this.hyperparameterMetricTag);
    }

    /**
     * Optional. The number of failed trials that need to be seen before failing the hyperparameter tuning job. You can specify this field to override the default failing criteria for AI Platform hyperparameter tuning jobs. Defaults to zero, which means the service decides when a hyperparameter job should fail.
     * 
     */
    @Import(name="maxFailedTrials")
    private @Nullable Output<Integer> maxFailedTrials;

    /**
     * @return Optional. The number of failed trials that need to be seen before failing the hyperparameter tuning job. You can specify this field to override the default failing criteria for AI Platform hyperparameter tuning jobs. Defaults to zero, which means the service decides when a hyperparameter job should fail.
     * 
     */
    public Optional<Output<Integer>> maxFailedTrials() {
        return Optional.ofNullable(this.maxFailedTrials);
    }

    /**
     * Optional. The number of training trials to run concurrently. You can reduce the time it takes to perform hyperparameter tuning by adding trials in parallel. However, each trail only benefits from the information gained in completed trials. That means that a trial does not get access to the results of trials running at the same time, which could reduce the quality of the overall optimization. Each trial will use the same scale tier and machine types. Defaults to one.
     * 
     */
    @Import(name="maxParallelTrials")
    private @Nullable Output<Integer> maxParallelTrials;

    /**
     * @return Optional. The number of training trials to run concurrently. You can reduce the time it takes to perform hyperparameter tuning by adding trials in parallel. However, each trail only benefits from the information gained in completed trials. That means that a trial does not get access to the results of trials running at the same time, which could reduce the quality of the overall optimization. Each trial will use the same scale tier and machine types. Defaults to one.
     * 
     */
    public Optional<Output<Integer>> maxParallelTrials() {
        return Optional.ofNullable(this.maxParallelTrials);
    }

    /**
     * Optional. How many training trials should be attempted to optimize the specified hyperparameters. Defaults to one.
     * 
     */
    @Import(name="maxTrials")
    private @Nullable Output<Integer> maxTrials;

    /**
     * @return Optional. How many training trials should be attempted to optimize the specified hyperparameters. Defaults to one.
     * 
     */
    public Optional<Output<Integer>> maxTrials() {
        return Optional.ofNullable(this.maxTrials);
    }

    /**
     * The set of parameters to tune.
     * 
     */
    @Import(name="params", required=true)
    private Output<List<GoogleCloudMlV1__ParameterSpecArgs>> params;

    /**
     * @return The set of parameters to tune.
     * 
     */
    public Output<List<GoogleCloudMlV1__ParameterSpecArgs>> params() {
        return this.params;
    }

    /**
     * Optional. The prior hyperparameter tuning job id that users hope to continue with. The job id will be used to find the corresponding vizier study guid and resume the study.
     * 
     */
    @Import(name="resumePreviousJobId")
    private @Nullable Output<String> resumePreviousJobId;

    /**
     * @return Optional. The prior hyperparameter tuning job id that users hope to continue with. The job id will be used to find the corresponding vizier study guid and resume the study.
     * 
     */
    public Optional<Output<String>> resumePreviousJobId() {
        return Optional.ofNullable(this.resumePreviousJobId);
    }

    private GoogleCloudMlV1__HyperparameterSpecArgs() {}

    private GoogleCloudMlV1__HyperparameterSpecArgs(GoogleCloudMlV1__HyperparameterSpecArgs $) {
        this.algorithm = $.algorithm;
        this.enableTrialEarlyStopping = $.enableTrialEarlyStopping;
        this.goal = $.goal;
        this.hyperparameterMetricTag = $.hyperparameterMetricTag;
        this.maxFailedTrials = $.maxFailedTrials;
        this.maxParallelTrials = $.maxParallelTrials;
        this.maxTrials = $.maxTrials;
        this.params = $.params;
        this.resumePreviousJobId = $.resumePreviousJobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__HyperparameterSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__HyperparameterSpecArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1__HyperparameterSpecArgs();
        }

        public Builder(GoogleCloudMlV1__HyperparameterSpecArgs defaults) {
            $ = new GoogleCloudMlV1__HyperparameterSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable Output<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(GoogleCloudMlV1__HyperparameterSpecAlgorithm algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param enableTrialEarlyStopping Optional. Indicates if the hyperparameter tuning job enables auto trial early stopping.
         * 
         * @return builder
         * 
         */
        public Builder enableTrialEarlyStopping(@Nullable Output<Boolean> enableTrialEarlyStopping) {
            $.enableTrialEarlyStopping = enableTrialEarlyStopping;
            return this;
        }

        /**
         * @param enableTrialEarlyStopping Optional. Indicates if the hyperparameter tuning job enables auto trial early stopping.
         * 
         * @return builder
         * 
         */
        public Builder enableTrialEarlyStopping(Boolean enableTrialEarlyStopping) {
            return enableTrialEarlyStopping(Output.of(enableTrialEarlyStopping));
        }

        /**
         * @param goal The type of goal to use for tuning. Available types are `MAXIMIZE` and `MINIMIZE`. Defaults to `MAXIMIZE`.
         * 
         * @return builder
         * 
         */
        public Builder goal(Output<GoogleCloudMlV1__HyperparameterSpecGoal> goal) {
            $.goal = goal;
            return this;
        }

        /**
         * @param goal The type of goal to use for tuning. Available types are `MAXIMIZE` and `MINIMIZE`. Defaults to `MAXIMIZE`.
         * 
         * @return builder
         * 
         */
        public Builder goal(GoogleCloudMlV1__HyperparameterSpecGoal goal) {
            return goal(Output.of(goal));
        }

        /**
         * @param hyperparameterMetricTag Optional. The TensorFlow summary tag name to use for optimizing trials. For current versions of TensorFlow, this tag name should exactly match what is shown in TensorBoard, including all scopes. For versions of TensorFlow prior to 0.12, this should be only the tag passed to tf.Summary. By default, &#34;training/hptuning/metric&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder hyperparameterMetricTag(@Nullable Output<String> hyperparameterMetricTag) {
            $.hyperparameterMetricTag = hyperparameterMetricTag;
            return this;
        }

        /**
         * @param hyperparameterMetricTag Optional. The TensorFlow summary tag name to use for optimizing trials. For current versions of TensorFlow, this tag name should exactly match what is shown in TensorBoard, including all scopes. For versions of TensorFlow prior to 0.12, this should be only the tag passed to tf.Summary. By default, &#34;training/hptuning/metric&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder hyperparameterMetricTag(String hyperparameterMetricTag) {
            return hyperparameterMetricTag(Output.of(hyperparameterMetricTag));
        }

        /**
         * @param maxFailedTrials Optional. The number of failed trials that need to be seen before failing the hyperparameter tuning job. You can specify this field to override the default failing criteria for AI Platform hyperparameter tuning jobs. Defaults to zero, which means the service decides when a hyperparameter job should fail.
         * 
         * @return builder
         * 
         */
        public Builder maxFailedTrials(@Nullable Output<Integer> maxFailedTrials) {
            $.maxFailedTrials = maxFailedTrials;
            return this;
        }

        /**
         * @param maxFailedTrials Optional. The number of failed trials that need to be seen before failing the hyperparameter tuning job. You can specify this field to override the default failing criteria for AI Platform hyperparameter tuning jobs. Defaults to zero, which means the service decides when a hyperparameter job should fail.
         * 
         * @return builder
         * 
         */
        public Builder maxFailedTrials(Integer maxFailedTrials) {
            return maxFailedTrials(Output.of(maxFailedTrials));
        }

        /**
         * @param maxParallelTrials Optional. The number of training trials to run concurrently. You can reduce the time it takes to perform hyperparameter tuning by adding trials in parallel. However, each trail only benefits from the information gained in completed trials. That means that a trial does not get access to the results of trials running at the same time, which could reduce the quality of the overall optimization. Each trial will use the same scale tier and machine types. Defaults to one.
         * 
         * @return builder
         * 
         */
        public Builder maxParallelTrials(@Nullable Output<Integer> maxParallelTrials) {
            $.maxParallelTrials = maxParallelTrials;
            return this;
        }

        /**
         * @param maxParallelTrials Optional. The number of training trials to run concurrently. You can reduce the time it takes to perform hyperparameter tuning by adding trials in parallel. However, each trail only benefits from the information gained in completed trials. That means that a trial does not get access to the results of trials running at the same time, which could reduce the quality of the overall optimization. Each trial will use the same scale tier and machine types. Defaults to one.
         * 
         * @return builder
         * 
         */
        public Builder maxParallelTrials(Integer maxParallelTrials) {
            return maxParallelTrials(Output.of(maxParallelTrials));
        }

        /**
         * @param maxTrials Optional. How many training trials should be attempted to optimize the specified hyperparameters. Defaults to one.
         * 
         * @return builder
         * 
         */
        public Builder maxTrials(@Nullable Output<Integer> maxTrials) {
            $.maxTrials = maxTrials;
            return this;
        }

        /**
         * @param maxTrials Optional. How many training trials should be attempted to optimize the specified hyperparameters. Defaults to one.
         * 
         * @return builder
         * 
         */
        public Builder maxTrials(Integer maxTrials) {
            return maxTrials(Output.of(maxTrials));
        }

        /**
         * @param params The set of parameters to tune.
         * 
         * @return builder
         * 
         */
        public Builder params(Output<List<GoogleCloudMlV1__ParameterSpecArgs>> params) {
            $.params = params;
            return this;
        }

        /**
         * @param params The set of parameters to tune.
         * 
         * @return builder
         * 
         */
        public Builder params(List<GoogleCloudMlV1__ParameterSpecArgs> params) {
            return params(Output.of(params));
        }

        /**
         * @param params The set of parameters to tune.
         * 
         * @return builder
         * 
         */
        public Builder params(GoogleCloudMlV1__ParameterSpecArgs... params) {
            return params(List.of(params));
        }

        /**
         * @param resumePreviousJobId Optional. The prior hyperparameter tuning job id that users hope to continue with. The job id will be used to find the corresponding vizier study guid and resume the study.
         * 
         * @return builder
         * 
         */
        public Builder resumePreviousJobId(@Nullable Output<String> resumePreviousJobId) {
            $.resumePreviousJobId = resumePreviousJobId;
            return this;
        }

        /**
         * @param resumePreviousJobId Optional. The prior hyperparameter tuning job id that users hope to continue with. The job id will be used to find the corresponding vizier study guid and resume the study.
         * 
         * @return builder
         * 
         */
        public Builder resumePreviousJobId(String resumePreviousJobId) {
            return resumePreviousJobId(Output.of(resumePreviousJobId));
        }

        public GoogleCloudMlV1__HyperparameterSpecArgs build() {
            $.goal = Objects.requireNonNull($.goal, "expected parameter 'goal' to be non-null");
            $.params = Objects.requireNonNull($.params, "expected parameter 'params' to be non-null");
            return $;
        }
    }

}
