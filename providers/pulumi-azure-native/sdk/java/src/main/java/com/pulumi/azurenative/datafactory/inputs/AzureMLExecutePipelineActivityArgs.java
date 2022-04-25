// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure ML Execute Pipeline activity.
 * 
 */
public final class AzureMLExecutePipelineActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureMLExecutePipelineActivityArgs Empty = new AzureMLExecutePipelineActivityArgs();

    /**
     * Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="continueOnStepFailure")
    private @Nullable Output<Object> continueOnStepFailure;

    /**
     * @return Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> continueOnStepFailure() {
        return Optional.ofNullable(this.continueOnStepFailure);
    }

    /**
     * Dictionary used for changing data path assignments without retraining. Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    @Import(name="dataPathAssignments")
    private @Nullable Output<Object> dataPathAssignments;

    /**
     * @return Dictionary used for changing data path assignments without retraining. Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    public Optional<Output<Object>> dataPathAssignments() {
        return Optional.ofNullable(this.dataPathAssignments);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    /**
     * @return Activity depends on condition.
     * 
     */
    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Activity description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="experimentName")
    private @Nullable Output<Object> experimentName;

    /**
     * @return Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> experimentName() {
        return Optional.ofNullable(this.experimentName);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return Linked service reference.
     * 
     */
    public Optional<Output<LinkedServiceReferenceArgs>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlParentRunId")
    private @Nullable Output<Object> mlParentRunId;

    /**
     * @return The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> mlParentRunId() {
        return Optional.ofNullable(this.mlParentRunId);
    }

    /**
     * ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlPipelineEndpointId")
    private @Nullable Output<Object> mlPipelineEndpointId;

    /**
     * @return ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> mlPipelineEndpointId() {
        return Optional.ofNullable(this.mlPipelineEndpointId);
    }

    /**
     * ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlPipelineId")
    private @Nullable Output<Object> mlPipelineId;

    /**
     * @return ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> mlPipelineId() {
        return Optional.ofNullable(this.mlPipelineId);
    }

    /**
     * Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    @Import(name="mlPipelineParameters")
    private @Nullable Output<Object> mlPipelineParameters;

    /**
     * @return Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    public Optional<Output<Object>> mlPipelineParameters() {
        return Optional.ofNullable(this.mlPipelineParameters);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Activity name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ActivityPolicyArgs> policy;

    /**
     * @return Activity policy.
     * 
     */
    public Optional<Output<ActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Type of activity.
     * Expected value is &#39;AzureMLExecutePipeline&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of activity.
     * Expected value is &#39;AzureMLExecutePipeline&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    /**
     * @return Activity user properties.
     * 
     */
    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    /**
     * Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="version")
    private @Nullable Output<Object> version;

    /**
     * @return Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> version() {
        return Optional.ofNullable(this.version);
    }

    private AzureMLExecutePipelineActivityArgs() {}

    private AzureMLExecutePipelineActivityArgs(AzureMLExecutePipelineActivityArgs $) {
        this.continueOnStepFailure = $.continueOnStepFailure;
        this.dataPathAssignments = $.dataPathAssignments;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.experimentName = $.experimentName;
        this.linkedServiceName = $.linkedServiceName;
        this.mlParentRunId = $.mlParentRunId;
        this.mlPipelineEndpointId = $.mlPipelineEndpointId;
        this.mlPipelineId = $.mlPipelineId;
        this.mlPipelineParameters = $.mlPipelineParameters;
        this.name = $.name;
        this.policy = $.policy;
        this.type = $.type;
        this.userProperties = $.userProperties;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureMLExecutePipelineActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureMLExecutePipelineActivityArgs $;

        public Builder() {
            $ = new AzureMLExecutePipelineActivityArgs();
        }

        public Builder(AzureMLExecutePipelineActivityArgs defaults) {
            $ = new AzureMLExecutePipelineActivityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param continueOnStepFailure Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder continueOnStepFailure(@Nullable Output<Object> continueOnStepFailure) {
            $.continueOnStepFailure = continueOnStepFailure;
            return this;
        }

        /**
         * @param continueOnStepFailure Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder continueOnStepFailure(Object continueOnStepFailure) {
            return continueOnStepFailure(Output.of(continueOnStepFailure));
        }

        /**
         * @param dataPathAssignments Dictionary used for changing data path assignments without retraining. Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
         * 
         * @return builder
         * 
         */
        public Builder dataPathAssignments(@Nullable Output<Object> dataPathAssignments) {
            $.dataPathAssignments = dataPathAssignments;
            return this;
        }

        /**
         * @param dataPathAssignments Dictionary used for changing data path assignments without retraining. Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
         * 
         * @return builder
         * 
         */
        public Builder dataPathAssignments(Object dataPathAssignments) {
            return dataPathAssignments(Output.of(dataPathAssignments));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param experimentName Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder experimentName(@Nullable Output<Object> experimentName) {
            $.experimentName = experimentName;
            return this;
        }

        /**
         * @param experimentName Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder experimentName(Object experimentName) {
            return experimentName(Output.of(experimentName));
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param mlParentRunId The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder mlParentRunId(@Nullable Output<Object> mlParentRunId) {
            $.mlParentRunId = mlParentRunId;
            return this;
        }

        /**
         * @param mlParentRunId The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder mlParentRunId(Object mlParentRunId) {
            return mlParentRunId(Output.of(mlParentRunId));
        }

        /**
         * @param mlPipelineEndpointId ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder mlPipelineEndpointId(@Nullable Output<Object> mlPipelineEndpointId) {
            $.mlPipelineEndpointId = mlPipelineEndpointId;
            return this;
        }

        /**
         * @param mlPipelineEndpointId ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder mlPipelineEndpointId(Object mlPipelineEndpointId) {
            return mlPipelineEndpointId(Output.of(mlPipelineEndpointId));
        }

        /**
         * @param mlPipelineId ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder mlPipelineId(@Nullable Output<Object> mlPipelineId) {
            $.mlPipelineId = mlPipelineId;
            return this;
        }

        /**
         * @param mlPipelineId ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder mlPipelineId(Object mlPipelineId) {
            return mlPipelineId(Output.of(mlPipelineId));
        }

        /**
         * @param mlPipelineParameters Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
         * 
         * @return builder
         * 
         */
        public Builder mlPipelineParameters(@Nullable Output<Object> mlPipelineParameters) {
            $.mlPipelineParameters = mlPipelineParameters;
            return this;
        }

        /**
         * @param mlPipelineParameters Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
         * 
         * @return builder
         * 
         */
        public Builder mlPipelineParameters(Object mlPipelineParameters) {
            return mlPipelineParameters(Output.of(mlPipelineParameters));
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(ActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;AzureMLExecutePipeline&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;AzureMLExecutePipeline&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        /**
         * @param version Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Object> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder version(Object version) {
            return version(Output.of(version));
        }

        public AzureMLExecutePipelineActivityArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
