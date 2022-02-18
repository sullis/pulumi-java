// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure ML Execute Pipeline activity.
 * 
 */
public final class AzureMLExecutePipelineActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMLExecutePipelineActivityArgs Empty = new AzureMLExecutePipelineActivityArgs();

    /**
     * Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="continueOnStepFailure")
    private final @Nullable Input<Object> continueOnStepFailure;

    public Input<Object> getContinueOnStepFailure() {
        return this.continueOnStepFailure == null ? Input.empty() : this.continueOnStepFailure;
    }

    /**
     * Dictionary used for changing data path assignments without retraining. Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    @InputImport(name="dataPathAssignments")
    private final @Nullable Input<Object> dataPathAssignments;

    public Input<Object> getDataPathAssignments() {
        return this.dataPathAssignments == null ? Input.empty() : this.dataPathAssignments;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="experimentName")
    private final @Nullable Input<Object> experimentName;

    public Input<Object> getExperimentName() {
        return this.experimentName == null ? Input.empty() : this.experimentName;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
    private final @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    /**
     * The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="mlParentRunId")
    private final @Nullable Input<Object> mlParentRunId;

    public Input<Object> getMlParentRunId() {
        return this.mlParentRunId == null ? Input.empty() : this.mlParentRunId;
    }

    /**
     * ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="mlPipelineEndpointId")
    private final @Nullable Input<Object> mlPipelineEndpointId;

    public Input<Object> getMlPipelineEndpointId() {
        return this.mlPipelineEndpointId == null ? Input.empty() : this.mlPipelineEndpointId;
    }

    /**
     * ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="mlPipelineId")
    private final @Nullable Input<Object> mlPipelineId;

    public Input<Object> getMlPipelineId() {
        return this.mlPipelineId == null ? Input.empty() : this.mlPipelineId;
    }

    /**
     * Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    @InputImport(name="mlPipelineParameters")
    private final @Nullable Input<Object> mlPipelineParameters;

    public Input<Object> getMlPipelineParameters() {
        return this.mlPipelineParameters == null ? Input.empty() : this.mlPipelineParameters;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable Input<ActivityPolicyArgs> policy;

    public Input<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * Type of activity.
     * Expected value is 'AzureMLExecutePipeline'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    /**
     * Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<Object> version;

    public Input<Object> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public AzureMLExecutePipelineActivityArgs(
        @Nullable Input<Object> continueOnStepFailure,
        @Nullable Input<Object> dataPathAssignments,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<Object> experimentName,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<Object> mlParentRunId,
        @Nullable Input<Object> mlPipelineEndpointId,
        @Nullable Input<Object> mlPipelineId,
        @Nullable Input<Object> mlPipelineParameters,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties,
        @Nullable Input<Object> version) {
        this.continueOnStepFailure = continueOnStepFailure;
        this.dataPathAssignments = dataPathAssignments;
        this.dependsOn = dependsOn;
        this.description = description;
        this.experimentName = experimentName;
        this.linkedServiceName = linkedServiceName;
        this.mlParentRunId = mlParentRunId;
        this.mlPipelineEndpointId = mlPipelineEndpointId;
        this.mlPipelineId = mlPipelineId;
        this.mlPipelineParameters = mlPipelineParameters;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.version = version;
    }

    private AzureMLExecutePipelineActivityArgs() {
        this.continueOnStepFailure = Input.empty();
        this.dataPathAssignments = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.experimentName = Input.empty();
        this.linkedServiceName = Input.empty();
        this.mlParentRunId = Input.empty();
        this.mlPipelineEndpointId = Input.empty();
        this.mlPipelineId = Input.empty();
        this.mlPipelineParameters = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLExecutePipelineActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> continueOnStepFailure;
        private @Nullable Input<Object> dataPathAssignments;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> experimentName;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<Object> mlParentRunId;
        private @Nullable Input<Object> mlPipelineEndpointId;
        private @Nullable Input<Object> mlPipelineId;
        private @Nullable Input<Object> mlPipelineParameters;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;
        private @Nullable Input<Object> version;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLExecutePipelineActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnStepFailure = defaults.continueOnStepFailure;
    	      this.dataPathAssignments = defaults.dataPathAssignments;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.experimentName = defaults.experimentName;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.mlParentRunId = defaults.mlParentRunId;
    	      this.mlPipelineEndpointId = defaults.mlPipelineEndpointId;
    	      this.mlPipelineId = defaults.mlPipelineId;
    	      this.mlPipelineParameters = defaults.mlPipelineParameters;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.version = defaults.version;
        }

        public Builder setContinueOnStepFailure(@Nullable Input<Object> continueOnStepFailure) {
            this.continueOnStepFailure = continueOnStepFailure;
            return this;
        }

        public Builder setContinueOnStepFailure(@Nullable Object continueOnStepFailure) {
            this.continueOnStepFailure = Input.ofNullable(continueOnStepFailure);
            return this;
        }

        public Builder setDataPathAssignments(@Nullable Input<Object> dataPathAssignments) {
            this.dataPathAssignments = dataPathAssignments;
            return this;
        }

        public Builder setDataPathAssignments(@Nullable Object dataPathAssignments) {
            this.dataPathAssignments = Input.ofNullable(dataPathAssignments);
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
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

        public Builder setExperimentName(@Nullable Input<Object> experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder setExperimentName(@Nullable Object experimentName) {
            this.experimentName = Input.ofNullable(experimentName);
            return this;
        }

        public Builder setLinkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
            return this;
        }

        public Builder setMlParentRunId(@Nullable Input<Object> mlParentRunId) {
            this.mlParentRunId = mlParentRunId;
            return this;
        }

        public Builder setMlParentRunId(@Nullable Object mlParentRunId) {
            this.mlParentRunId = Input.ofNullable(mlParentRunId);
            return this;
        }

        public Builder setMlPipelineEndpointId(@Nullable Input<Object> mlPipelineEndpointId) {
            this.mlPipelineEndpointId = mlPipelineEndpointId;
            return this;
        }

        public Builder setMlPipelineEndpointId(@Nullable Object mlPipelineEndpointId) {
            this.mlPipelineEndpointId = Input.ofNullable(mlPipelineEndpointId);
            return this;
        }

        public Builder setMlPipelineId(@Nullable Input<Object> mlPipelineId) {
            this.mlPipelineId = mlPipelineId;
            return this;
        }

        public Builder setMlPipelineId(@Nullable Object mlPipelineId) {
            this.mlPipelineId = Input.ofNullable(mlPipelineId);
            return this;
        }

        public Builder setMlPipelineParameters(@Nullable Input<Object> mlPipelineParameters) {
            this.mlPipelineParameters = mlPipelineParameters;
            return this;
        }

        public Builder setMlPipelineParameters(@Nullable Object mlPipelineParameters) {
            this.mlPipelineParameters = Input.ofNullable(mlPipelineParameters);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPolicy(@Nullable Input<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }

        public Builder setVersion(@Nullable Input<Object> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Object version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public AzureMLExecutePipelineActivityArgs build() {
            return new AzureMLExecutePipelineActivityArgs(continueOnStepFailure, dataPathAssignments, dependsOn, description, experimentName, linkedServiceName, mlParentRunId, mlPipelineEndpointId, mlPipelineId, mlPipelineParameters, name, policy, type, userProperties, version);
        }
    }
}
