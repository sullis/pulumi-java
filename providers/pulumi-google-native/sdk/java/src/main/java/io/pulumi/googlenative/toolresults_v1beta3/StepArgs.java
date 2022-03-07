// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.enums.StepState;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.DurationArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.MultiStepArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.OutcomeArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.StepDimensionValueEntryArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.StepLabelsEntryArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.TestExecutionStepArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.TimestampArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.ToolExecutionStepArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StepArgs extends io.pulumi.resources.ResourceArgs {

    public static final StepArgs Empty = new StepArgs();

    /**
     * The time when the step status was set to complete. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    @InputImport(name="completionTime")
      private final @Nullable Input<TimestampArgs> completionTime;

    public Input<TimestampArgs> getCompletionTime() {
        return this.completionTime == null ? Input.empty() : this.completionTime;
    }

    /**
     * The time when the step was created. - In response: always set - In create/update request: never set
     * 
     */
    @InputImport(name="creationTime")
      private final @Nullable Input<TimestampArgs> creationTime;

    public Input<TimestampArgs> getCreationTime() {
        return this.creationTime == null ? Input.empty() : this.creationTime;
    }

    /**
     * A description of this tool For example: mvn clean package -D skipTests=true - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * How much the device resource is used to perform the test. This is the device usage used for billing purpose, which is different from the run_duration, for example, infrastructure failure won't be charged for device usage. PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which already has this field set. - In response: present if previously set. - In create request: optional - In update request: optional
     * 
     */
    @InputImport(name="deviceUsageDuration")
      private final @Nullable Input<DurationArgs> deviceUsageDuration;

    public Input<DurationArgs> getDeviceUsageDuration() {
        return this.deviceUsageDuration == null ? Input.empty() : this.deviceUsageDuration;
    }

    /**
     * If the execution containing this step has any dimension_definition set, then this field allows the child to specify the values of the dimensions. The keys must exactly match the dimension_definition of the execution. For example, if the execution has `dimension_definition = ['attempt', 'device']` then a step must define values for those dimensions, eg. `dimension_value = ['attempt': '1', 'device': 'Nexus 6']` If a step does not participate in one dimension of the matrix, the value for that dimension should be empty string. For example, if one of the tests is executed by a runner which does not support retries, the step could have `dimension_value = ['attempt': '', 'device': 'Nexus 6']` If the step does not participate in any dimensions of the matrix, it may leave dimension_value unset. A PRECONDITION_FAILED will be returned if any of the keys do not exist in the dimension_definition of the execution. A PRECONDITION_FAILED will be returned if another step in this execution already has the same name and dimension_value, but differs on other data fields, for example, step field is different. A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a dimension_definition in the execution which is not specified as one of the keys. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    @InputImport(name="dimensionValue")
      private final @Nullable Input<List<StepDimensionValueEntryArgs>> dimensionValue;

    public Input<List<StepDimensionValueEntryArgs>> getDimensionValue() {
        return this.dimensionValue == null ? Input.empty() : this.dimensionValue;
    }

    @InputImport(name="executionId", required=true)
      private final Input<String> executionId;

    public Input<String> getExecutionId() {
        return this.executionId;
    }

    /**
     * Whether any of the outputs of this step are images whose thumbnails can be fetched with ListThumbnails. - In response: always set - In create/update request: never set
     * 
     */
    @InputImport(name="hasImages")
      private final @Nullable Input<Boolean> hasImages;

    public Input<Boolean> getHasImages() {
        return this.hasImages == null ? Input.empty() : this.hasImages;
    }

    @InputImport(name="historyId", required=true)
      private final Input<String> historyId;

    public Input<String> getHistoryId() {
        return this.historyId;
    }

    /**
     * Arbitrary user-supplied key/value pairs that are associated with the step. Users are responsible for managing the key namespace such that keys don't accidentally collide. An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of any of the keys or values exceeds 100 characters. - In response: always set - In create request: optional - In update request: optional; any new key/value pair will be added to the map, and any new value for an existing key will update that key's value
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<List<StepLabelsEntryArgs>> labels;

    public Input<List<StepLabelsEntryArgs>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Details when multiple steps are run with the same configuration as a group. These details can be used identify which group this step is part of. It also identifies the groups 'primary step' which indexes all the group members. - In response: present if previously set. - In create request: optional, set iff this step was performed more than once. - In update request: optional
     * 
     */
    @InputImport(name="multiStep")
      private final @Nullable Input<MultiStepArgs> multiStep;

    public Input<MultiStepArgs> getMultiStep() {
        return this.multiStep == null ? Input.empty() : this.multiStep;
    }

    /**
     * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean build A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and dimension_value with an existing step. If two steps represent a similar action, but have different dimension values, they should share the same name. For instance, if the same set of tests is run on two different platforms, the two steps should have the same name. - In response: always set - In create request: always set - In update request: never set
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Classification of the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @InputImport(name="outcome")
      private final @Nullable Input<OutcomeArgs> outcome;

    public Input<OutcomeArgs> getOutcome() {
        return this.outcome == null ? Input.empty() : this.outcome;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * How long it took for this step to run. If unset, this is set to the difference between creation_time and completion_time when the step is set to the COMPLETE state. In some cases, it is appropriate to set this value separately: For instance, if a step is created, but the operation it represents is queued for a few minutes before it executes, it would be appropriate not to include the time spent queued in its run_duration. PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which already has this field set. - In response: present if previously set; always present on COMPLETE step - In create request: optional - In update request: optional
     * 
     */
    @InputImport(name="runDuration")
      private final @Nullable Input<DurationArgs> runDuration;

    public Input<DurationArgs> getRunDuration() {
        return this.runDuration == null ? Input.empty() : this.runDuration;
    }

    /**
     * The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS -> COMPLETE A PRECONDITION_FAILED will be returned if an invalid transition is requested. It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times. - In response: always set - In create/update request: optional
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<StepState> state;

    public Input<StepState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * A unique identifier within a Execution for this Step. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response: always set - In create/update request: never set
     * 
     */
    @InputImport(name="stepId")
      private final @Nullable Input<String> stepId;

    public Input<String> getStepId() {
        return this.stepId == null ? Input.empty() : this.stepId;
    }

    /**
     * An execution of a test runner.
     * 
     */
    @InputImport(name="testExecutionStep")
      private final @Nullable Input<TestExecutionStepArgs> testExecutionStep;

    public Input<TestExecutionStepArgs> getTestExecutionStep() {
        return this.testExecutionStep == null ? Input.empty() : this.testExecutionStep;
    }

    /**
     * An execution of a tool (used for steps we don't explicitly support).
     * 
     */
    @InputImport(name="toolExecutionStep")
      private final @Nullable Input<ToolExecutionStepArgs> toolExecutionStep;

    public Input<ToolExecutionStepArgs> getToolExecutionStep() {
        return this.toolExecutionStep == null ? Input.empty() : this.toolExecutionStep;
    }

    public StepArgs(
        @Nullable Input<TimestampArgs> completionTime,
        @Nullable Input<TimestampArgs> creationTime,
        @Nullable Input<String> description,
        @Nullable Input<DurationArgs> deviceUsageDuration,
        @Nullable Input<List<StepDimensionValueEntryArgs>> dimensionValue,
        Input<String> executionId,
        @Nullable Input<Boolean> hasImages,
        Input<String> historyId,
        @Nullable Input<List<StepLabelsEntryArgs>> labels,
        @Nullable Input<MultiStepArgs> multiStep,
        @Nullable Input<String> name,
        @Nullable Input<OutcomeArgs> outcome,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<DurationArgs> runDuration,
        @Nullable Input<StepState> state,
        @Nullable Input<String> stepId,
        @Nullable Input<TestExecutionStepArgs> testExecutionStep,
        @Nullable Input<ToolExecutionStepArgs> toolExecutionStep) {
        this.completionTime = completionTime;
        this.creationTime = creationTime;
        this.description = description;
        this.deviceUsageDuration = deviceUsageDuration;
        this.dimensionValue = dimensionValue;
        this.executionId = Objects.requireNonNull(executionId, "expected parameter 'executionId' to be non-null");
        this.hasImages = hasImages;
        this.historyId = Objects.requireNonNull(historyId, "expected parameter 'historyId' to be non-null");
        this.labels = labels;
        this.multiStep = multiStep;
        this.name = name;
        this.outcome = outcome;
        this.project = project;
        this.requestId = requestId;
        this.runDuration = runDuration;
        this.state = state;
        this.stepId = stepId;
        this.testExecutionStep = testExecutionStep;
        this.toolExecutionStep = toolExecutionStep;
    }

    private StepArgs() {
        this.completionTime = Input.empty();
        this.creationTime = Input.empty();
        this.description = Input.empty();
        this.deviceUsageDuration = Input.empty();
        this.dimensionValue = Input.empty();
        this.executionId = Input.empty();
        this.hasImages = Input.empty();
        this.historyId = Input.empty();
        this.labels = Input.empty();
        this.multiStep = Input.empty();
        this.name = Input.empty();
        this.outcome = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.runDuration = Input.empty();
        this.state = Input.empty();
        this.stepId = Input.empty();
        this.testExecutionStep = Input.empty();
        this.toolExecutionStep = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TimestampArgs> completionTime;
        private @Nullable Input<TimestampArgs> creationTime;
        private @Nullable Input<String> description;
        private @Nullable Input<DurationArgs> deviceUsageDuration;
        private @Nullable Input<List<StepDimensionValueEntryArgs>> dimensionValue;
        private Input<String> executionId;
        private @Nullable Input<Boolean> hasImages;
        private Input<String> historyId;
        private @Nullable Input<List<StepLabelsEntryArgs>> labels;
        private @Nullable Input<MultiStepArgs> multiStep;
        private @Nullable Input<String> name;
        private @Nullable Input<OutcomeArgs> outcome;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<DurationArgs> runDuration;
        private @Nullable Input<StepState> state;
        private @Nullable Input<String> stepId;
        private @Nullable Input<TestExecutionStepArgs> testExecutionStep;
        private @Nullable Input<ToolExecutionStepArgs> toolExecutionStep;

        public Builder() {
    	      // Empty
        }

        public Builder(StepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionTime = defaults.completionTime;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.deviceUsageDuration = defaults.deviceUsageDuration;
    	      this.dimensionValue = defaults.dimensionValue;
    	      this.executionId = defaults.executionId;
    	      this.hasImages = defaults.hasImages;
    	      this.historyId = defaults.historyId;
    	      this.labels = defaults.labels;
    	      this.multiStep = defaults.multiStep;
    	      this.name = defaults.name;
    	      this.outcome = defaults.outcome;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.runDuration = defaults.runDuration;
    	      this.state = defaults.state;
    	      this.stepId = defaults.stepId;
    	      this.testExecutionStep = defaults.testExecutionStep;
    	      this.toolExecutionStep = defaults.toolExecutionStep;
        }

        public Builder setCompletionTime(@Nullable Input<TimestampArgs> completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        public Builder setCompletionTime(@Nullable TimestampArgs completionTime) {
            this.completionTime = Input.ofNullable(completionTime);
            return this;
        }

        public Builder setCreationTime(@Nullable Input<TimestampArgs> creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setCreationTime(@Nullable TimestampArgs creationTime) {
            this.creationTime = Input.ofNullable(creationTime);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDeviceUsageDuration(@Nullable Input<DurationArgs> deviceUsageDuration) {
            this.deviceUsageDuration = deviceUsageDuration;
            return this;
        }

        public Builder setDeviceUsageDuration(@Nullable DurationArgs deviceUsageDuration) {
            this.deviceUsageDuration = Input.ofNullable(deviceUsageDuration);
            return this;
        }

        public Builder setDimensionValue(@Nullable Input<List<StepDimensionValueEntryArgs>> dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }

        public Builder setDimensionValue(@Nullable List<StepDimensionValueEntryArgs> dimensionValue) {
            this.dimensionValue = Input.ofNullable(dimensionValue);
            return this;
        }

        public Builder setExecutionId(Input<String> executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }

        public Builder setExecutionId(String executionId) {
            this.executionId = Input.of(Objects.requireNonNull(executionId));
            return this;
        }

        public Builder setHasImages(@Nullable Input<Boolean> hasImages) {
            this.hasImages = hasImages;
            return this;
        }

        public Builder setHasImages(@Nullable Boolean hasImages) {
            this.hasImages = Input.ofNullable(hasImages);
            return this;
        }

        public Builder setHistoryId(Input<String> historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }

        public Builder setHistoryId(String historyId) {
            this.historyId = Input.of(Objects.requireNonNull(historyId));
            return this;
        }

        public Builder setLabels(@Nullable Input<List<StepLabelsEntryArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable List<StepLabelsEntryArgs> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMultiStep(@Nullable Input<MultiStepArgs> multiStep) {
            this.multiStep = multiStep;
            return this;
        }

        public Builder setMultiStep(@Nullable MultiStepArgs multiStep) {
            this.multiStep = Input.ofNullable(multiStep);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOutcome(@Nullable Input<OutcomeArgs> outcome) {
            this.outcome = outcome;
            return this;
        }

        public Builder setOutcome(@Nullable OutcomeArgs outcome) {
            this.outcome = Input.ofNullable(outcome);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setRunDuration(@Nullable Input<DurationArgs> runDuration) {
            this.runDuration = runDuration;
            return this;
        }

        public Builder setRunDuration(@Nullable DurationArgs runDuration) {
            this.runDuration = Input.ofNullable(runDuration);
            return this;
        }

        public Builder setState(@Nullable Input<StepState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable StepState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setStepId(@Nullable Input<String> stepId) {
            this.stepId = stepId;
            return this;
        }

        public Builder setStepId(@Nullable String stepId) {
            this.stepId = Input.ofNullable(stepId);
            return this;
        }

        public Builder setTestExecutionStep(@Nullable Input<TestExecutionStepArgs> testExecutionStep) {
            this.testExecutionStep = testExecutionStep;
            return this;
        }

        public Builder setTestExecutionStep(@Nullable TestExecutionStepArgs testExecutionStep) {
            this.testExecutionStep = Input.ofNullable(testExecutionStep);
            return this;
        }

        public Builder setToolExecutionStep(@Nullable Input<ToolExecutionStepArgs> toolExecutionStep) {
            this.toolExecutionStep = toolExecutionStep;
            return this;
        }

        public Builder setToolExecutionStep(@Nullable ToolExecutionStepArgs toolExecutionStep) {
            this.toolExecutionStep = Input.ofNullable(toolExecutionStep);
            return this;
        }
        public StepArgs build() {
            return new StepArgs(completionTime, creationTime, description, deviceUsageDuration, dimensionValue, executionId, hasImages, historyId, labels, multiStep, name, outcome, project, requestId, runDuration, state, stepId, testExecutionStep, toolExecutionStep);
        }
    }
}