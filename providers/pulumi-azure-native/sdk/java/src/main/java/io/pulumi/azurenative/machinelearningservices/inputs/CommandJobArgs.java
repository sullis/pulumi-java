// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.AmlTokenArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeConfigurationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.InputDataBindingArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ManagedIdentityArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.MpiArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.OutputDataBindingArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.PyTorchArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.TensorFlowArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Command job definition.
 * 
 */
public final class CommandJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommandJobArgs Empty = new CommandJobArgs();

    /**
     * ARM resource ID of the code asset.
     * 
     */
    @InputImport(name="codeId")
    private final @Nullable Input<String> codeId;

    public Input<String> getCodeId() {
        return this.codeId == null ? Input.empty() : this.codeId;
    }

    /**
     * The command to execute on startup of the job. eg. "python train.py"
     * 
     */
    @InputImport(name="command", required=true)
    private final Input<String> command;

    public Input<String> getCommand() {
        return this.command;
    }

    /**
     * Compute binding for the job.
     * 
     */
    @InputImport(name="compute", required=true)
    private final Input<ComputeConfigurationArgs> compute;

    public Input<ComputeConfigurationArgs> getCompute() {
        return this.compute;
    }

    /**
     * The asset description text.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    @InputImport(name="distribution")
    private final @Nullable Input<Object> distribution;

    public Input<Object> getDistribution() {
        return this.distribution == null ? Input.empty() : this.distribution;
    }

    /**
     * The ARM resource ID of the Environment specification for the job.
     * 
     */
    @InputImport(name="environmentId")
    private final @Nullable Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId == null ? Input.empty() : this.environmentId;
    }

    /**
     * Environment variables included in the job.
     * 
     */
    @InputImport(name="environmentVariables")
    private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * The name of the experiment the job belongs to. If not set, the job is placed in the "Default" experiment.
     * 
     */
    @InputImport(name="experimentName")
    private final @Nullable Input<String> experimentName;

    public Input<String> getExperimentName() {
        return this.experimentName == null ? Input.empty() : this.experimentName;
    }

    /**
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
     * Defaults to AmlToken if null.
     * 
     */
    @InputImport(name="identity")
    private final @Nullable Input<Either<AmlTokenArgs,ManagedIdentityArgs>> identity;

    public Input<Either<AmlTokenArgs,ManagedIdentityArgs>> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Mapping of input data bindings used in the job.
     * 
     */
    @InputImport(name="inputDataBindings")
    private final @Nullable Input<Map<String,InputDataBindingArgs>> inputDataBindings;

    public Input<Map<String,InputDataBindingArgs>> getInputDataBindings() {
        return this.inputDataBindings == null ? Input.empty() : this.inputDataBindings;
    }

    /**
     * Enum to determine the type of job.
     * Expected value is 'Command'.
     * 
     */
    @InputImport(name="jobType", required=true)
    private final Input<String> jobType;

    public Input<String> getJobType() {
        return this.jobType;
    }

    /**
     * Mapping of output data bindings used in the job.
     * 
     */
    @InputImport(name="outputDataBindings")
    private final @Nullable Input<Map<String,OutputDataBindingArgs>> outputDataBindings;

    public Input<Map<String,OutputDataBindingArgs>> getOutputDataBindings() {
        return this.outputDataBindings == null ? Input.empty() : this.outputDataBindings;
    }

    /**
     * Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public CommandJobArgs(
        @Nullable Input<String> codeId,
        Input<String> command,
        Input<ComputeConfigurationArgs> compute,
        @Nullable Input<String> description,
        @Nullable Input<Object> distribution,
        @Nullable Input<String> environmentId,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<String> experimentName,
        @Nullable Input<Either<AmlTokenArgs,ManagedIdentityArgs>> identity,
        @Nullable Input<Map<String,InputDataBindingArgs>> inputDataBindings,
        Input<String> jobType,
        @Nullable Input<Map<String,OutputDataBindingArgs>> outputDataBindings,
        @Nullable Input<Integer> priority,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> timeout) {
        this.codeId = codeId;
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
        this.compute = Objects.requireNonNull(compute, "expected parameter 'compute' to be non-null");
        this.description = description;
        this.distribution = distribution;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.experimentName = experimentName;
        this.identity = identity;
        this.inputDataBindings = inputDataBindings;
        this.jobType = Objects.requireNonNull(jobType, "expected parameter 'jobType' to be non-null");
        this.outputDataBindings = outputDataBindings;
        this.priority = priority;
        this.properties = properties;
        this.tags = tags;
        this.timeout = timeout;
    }

    private CommandJobArgs() {
        this.codeId = Input.empty();
        this.command = Input.empty();
        this.compute = Input.empty();
        this.description = Input.empty();
        this.distribution = Input.empty();
        this.environmentId = Input.empty();
        this.environmentVariables = Input.empty();
        this.experimentName = Input.empty();
        this.identity = Input.empty();
        this.inputDataBindings = Input.empty();
        this.jobType = Input.empty();
        this.outputDataBindings = Input.empty();
        this.priority = Input.empty();
        this.properties = Input.empty();
        this.tags = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> codeId;
        private Input<String> command;
        private Input<ComputeConfigurationArgs> compute;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> distribution;
        private @Nullable Input<String> environmentId;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<String> experimentName;
        private @Nullable Input<Either<AmlTokenArgs,ManagedIdentityArgs>> identity;
        private @Nullable Input<Map<String,InputDataBindingArgs>> inputDataBindings;
        private Input<String> jobType;
        private @Nullable Input<Map<String,OutputDataBindingArgs>> outputDataBindings;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandJobArgs defaults) {
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
    	      this.jobType = defaults.jobType;
    	      this.outputDataBindings = defaults.outputDataBindings;
    	      this.priority = defaults.priority;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        public Builder setCodeId(@Nullable Input<String> codeId) {
            this.codeId = codeId;
            return this;
        }

        public Builder setCodeId(@Nullable String codeId) {
            this.codeId = Input.ofNullable(codeId);
            return this;
        }

        public Builder setCommand(Input<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setCommand(String command) {
            this.command = Input.of(Objects.requireNonNull(command));
            return this;
        }

        public Builder setCompute(Input<ComputeConfigurationArgs> compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }

        public Builder setCompute(ComputeConfigurationArgs compute) {
            this.compute = Input.of(Objects.requireNonNull(compute));
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

        public Builder setDistribution(@Nullable Input<Object> distribution) {
            this.distribution = distribution;
            return this;
        }

        public Builder setDistribution(@Nullable Object distribution) {
            this.distribution = Input.ofNullable(distribution);
            return this;
        }

        public Builder setEnvironmentId(@Nullable Input<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder setEnvironmentId(@Nullable String environmentId) {
            this.environmentId = Input.ofNullable(environmentId);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setExperimentName(@Nullable Input<String> experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder setExperimentName(@Nullable String experimentName) {
            this.experimentName = Input.ofNullable(experimentName);
            return this;
        }

        public Builder setIdentity(@Nullable Input<Either<AmlTokenArgs,ManagedIdentityArgs>> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable Either<AmlTokenArgs,ManagedIdentityArgs> identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setInputDataBindings(@Nullable Input<Map<String,InputDataBindingArgs>> inputDataBindings) {
            this.inputDataBindings = inputDataBindings;
            return this;
        }

        public Builder setInputDataBindings(@Nullable Map<String,InputDataBindingArgs> inputDataBindings) {
            this.inputDataBindings = Input.ofNullable(inputDataBindings);
            return this;
        }

        public Builder setJobType(Input<String> jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }

        public Builder setJobType(String jobType) {
            this.jobType = Input.of(Objects.requireNonNull(jobType));
            return this;
        }

        public Builder setOutputDataBindings(@Nullable Input<Map<String,OutputDataBindingArgs>> outputDataBindings) {
            this.outputDataBindings = outputDataBindings;
            return this;
        }

        public Builder setOutputDataBindings(@Nullable Map<String,OutputDataBindingArgs> outputDataBindings) {
            this.outputDataBindings = Input.ofNullable(outputDataBindings);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public CommandJobArgs build() {
            return new CommandJobArgs(codeId, command, compute, description, distribution, environmentId, environmentVariables, experimentName, identity, inputDataBindings, jobType, outputDataBindings, priority, properties, tags, timeout);
        }
    }
}
