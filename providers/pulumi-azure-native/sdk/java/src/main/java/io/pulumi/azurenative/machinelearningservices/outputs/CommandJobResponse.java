// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.AmlTokenResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ComputeConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.InputDataBindingResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.JobEndpointResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.JobOutputResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ManagedIdentityResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.MpiResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.OutputDataBindingResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.PyTorchResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.TensorFlowResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CommandJobResponse {
    /**
     * ARM resource ID of the code asset.
     * 
     */
    private final @Nullable String codeId;
    /**
     * The command to execute on startup of the job. eg. "python train.py"
     * 
     */
    private final String command;
    /**
     * Compute binding for the job.
     * 
     */
    private final ComputeConfigurationResponse compute;
    /**
     * The asset description text.
     * 
     */
    private final @Nullable String description;
    /**
     * Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    private final @Nullable Object distribution;
    /**
     * The ARM resource ID of the Environment specification for the job.
     * 
     */
    private final @Nullable String environmentId;
    /**
     * Environment variables included in the job.
     * 
     */
    private final @Nullable Map<String,String> environmentVariables;
    /**
     * The name of the experiment the job belongs to. If not set, the job is placed in the "Default" experiment.
     * 
     */
    private final @Nullable String experimentName;
    /**
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
     * Defaults to AmlToken if null.
     * 
     */
    private final @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;
    /**
     * Mapping of input data bindings used in the job.
     * 
     */
    private final @Nullable Map<String,InputDataBindingResponse> inputDataBindings;
    /**
     * List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
     */
    private final Map<String,JobEndpointResponse> interactionEndpoints;
    /**
     * Enum to determine the type of job.
     * Expected value is 'Command'.
     * 
     */
    private final String jobType;
    /**
     * Location of the job output logs and artifacts.
     * 
     */
    private final JobOutputResponse output;
    /**
     * Mapping of output data bindings used in the job.
     * 
     */
    private final @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;
    /**
     * Input parameters.
     * 
     */
    private final Object parameters;
    /**
     * Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The asset property dictionary.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Specifies the job provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Status of the job.
     * 
     */
    private final String status;
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
     * 
     */
    private final @Nullable String timeout;

    @OutputCustomType.Constructor({"codeId","command","compute","description","distribution","environmentId","environmentVariables","experimentName","identity","inputDataBindings","interactionEndpoints","jobType","output","outputDataBindings","parameters","priority","properties","provisioningState","status","tags","timeout"})
    private CommandJobResponse(
        @Nullable String codeId,
        String command,
        ComputeConfigurationResponse compute,
        @Nullable String description,
        @Nullable Object distribution,
        @Nullable String environmentId,
        @Nullable Map<String,String> environmentVariables,
        @Nullable String experimentName,
        @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity,
        @Nullable Map<String,InputDataBindingResponse> inputDataBindings,
        Map<String,JobEndpointResponse> interactionEndpoints,
        String jobType,
        JobOutputResponse output,
        @Nullable Map<String,OutputDataBindingResponse> outputDataBindings,
        Object parameters,
        @Nullable Integer priority,
        @Nullable Map<String,String> properties,
        String provisioningState,
        String status,
        @Nullable Map<String,String> tags,
        @Nullable String timeout) {
        this.codeId = codeId;
        this.command = Objects.requireNonNull(command);
        this.compute = Objects.requireNonNull(compute);
        this.description = description;
        this.distribution = distribution;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.experimentName = experimentName;
        this.identity = identity;
        this.inputDataBindings = inputDataBindings;
        this.interactionEndpoints = Objects.requireNonNull(interactionEndpoints);
        this.jobType = Objects.requireNonNull(jobType);
        this.output = Objects.requireNonNull(output);
        this.outputDataBindings = outputDataBindings;
        this.parameters = Objects.requireNonNull(parameters);
        this.priority = priority;
        this.properties = properties;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.timeout = timeout;
    }

    /**
     * ARM resource ID of the code asset.
     * 
    */
    public Optional<String> getCodeId() {
        return Optional.ofNullable(this.codeId);
    }
    /**
     * The command to execute on startup of the job. eg. "python train.py"
     * 
    */
    public String getCommand() {
        return this.command;
    }
    /**
     * Compute binding for the job.
     * 
    */
    public ComputeConfigurationResponse getCompute() {
        return this.compute;
    }
    /**
     * The asset description text.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
    */
    public Optional<Object> getDistribution() {
        return Optional.ofNullable(this.distribution);
    }
    /**
     * The ARM resource ID of the Environment specification for the job.
     * 
    */
    public Optional<String> getEnvironmentId() {
        return Optional.ofNullable(this.environmentId);
    }
    /**
     * Environment variables included in the job.
     * 
    */
    public Map<String,String> getEnvironmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    /**
     * The name of the experiment the job belongs to. If not set, the job is placed in the "Default" experiment.
     * 
    */
    public Optional<String> getExperimentName() {
        return Optional.ofNullable(this.experimentName);
    }
    /**
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
     * Defaults to AmlToken if null.
     * 
    */
    public Optional<Either<AmlTokenResponse,ManagedIdentityResponse>> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Mapping of input data bindings used in the job.
     * 
    */
    public Map<String,InputDataBindingResponse> getInputDataBindings() {
        return this.inputDataBindings == null ? Map.of() : this.inputDataBindings;
    }
    /**
     * List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
    */
    public Map<String,JobEndpointResponse> getInteractionEndpoints() {
        return this.interactionEndpoints;
    }
    /**
     * Enum to determine the type of job.
     * Expected value is 'Command'.
     * 
    */
    public String getJobType() {
        return this.jobType;
    }
    /**
     * Location of the job output logs and artifacts.
     * 
    */
    public JobOutputResponse getOutput() {
        return this.output;
    }
    /**
     * Mapping of output data bindings used in the job.
     * 
    */
    public Map<String,OutputDataBindingResponse> getOutputDataBindings() {
        return this.outputDataBindings == null ? Map.of() : this.outputDataBindings;
    }
    /**
     * Input parameters.
     * 
    */
    public Object getParameters() {
        return this.parameters;
    }
    /**
     * Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The asset property dictionary.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Specifies the job provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Status of the job.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
     * 
    */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String codeId;
        private String command;
        private ComputeConfigurationResponse compute;
        private @Nullable String description;
        private @Nullable Object distribution;
        private @Nullable String environmentId;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable String experimentName;
        private @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;
        private @Nullable Map<String,InputDataBindingResponse> inputDataBindings;
        private Map<String,JobEndpointResponse> interactionEndpoints;
        private String jobType;
        private JobOutputResponse output;
        private @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;
        private Object parameters;
        private @Nullable Integer priority;
        private @Nullable Map<String,String> properties;
        private String provisioningState;
        private String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeId = defaults.codeId;
    	      this.command = defaults.command;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.distribution = defaults.distribution;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.inputDataBindings = defaults.inputDataBindings;
    	      this.interactionEndpoints = defaults.interactionEndpoints;
    	      this.jobType = defaults.jobType;
    	      this.output = defaults.output;
    	      this.outputDataBindings = defaults.outputDataBindings;
    	      this.parameters = defaults.parameters;
    	      this.priority = defaults.priority;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        public Builder setCodeId(@Nullable String codeId) {
            this.codeId = codeId;
            return this;
        }

        public Builder setCommand(String command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setCompute(ComputeConfigurationResponse compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDistribution(@Nullable Object distribution) {
            this.distribution = distribution;
            return this;
        }

        public Builder setEnvironmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setExperimentName(@Nullable String experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder setIdentity(@Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setInputDataBindings(@Nullable Map<String,InputDataBindingResponse> inputDataBindings) {
            this.inputDataBindings = inputDataBindings;
            return this;
        }

        public Builder setInteractionEndpoints(Map<String,JobEndpointResponse> interactionEndpoints) {
            this.interactionEndpoints = Objects.requireNonNull(interactionEndpoints);
            return this;
        }

        public Builder setJobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }

        public Builder setOutput(JobOutputResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder setOutputDataBindings(@Nullable Map<String,OutputDataBindingResponse> outputDataBindings) {
            this.outputDataBindings = outputDataBindings;
            return this;
        }

        public Builder setParameters(Object parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public CommandJobResponse build() {
            return new CommandJobResponse(codeId, command, compute, description, distribution, environmentId, environmentVariables, experimentName, identity, inputDataBindings, interactionEndpoints, jobType, output, outputDataBindings, parameters, priority, properties, provisioningState, status, tags, timeout);
        }
    }
}