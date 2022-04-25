// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.AmlTokenArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ComputeConfigurationArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.InputDataBindingArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ManagedIdentityArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.MpiArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.OutputDataBindingArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.PyTorchArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.TensorFlowArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Command job definition.
 * 
 */
public final class CommandJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final CommandJobArgs Empty = new CommandJobArgs();

    /**
     * ARM resource ID of the code asset.
     * 
     */
    @Import(name="codeId")
    private @Nullable Output<String> codeId;

    /**
     * @return ARM resource ID of the code asset.
     * 
     */
    public Optional<Output<String>> codeId() {
        return Optional.ofNullable(this.codeId);
    }

    /**
     * The command to execute on startup of the job. eg. &#34;python train.py&#34;
     * 
     */
    @Import(name="command", required=true)
    private Output<String> command;

    /**
     * @return The command to execute on startup of the job. eg. &#34;python train.py&#34;
     * 
     */
    public Output<String> command() {
        return this.command;
    }

    /**
     * Compute binding for the job.
     * 
     */
    @Import(name="compute", required=true)
    private Output<ComputeConfigurationArgs> compute;

    /**
     * @return Compute binding for the job.
     * 
     */
    public Output<ComputeConfigurationArgs> compute() {
        return this.compute;
    }

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The asset description text.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    @Import(name="distribution")
    private @Nullable Output<Object> distribution;

    /**
     * @return Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    public Optional<Output<Object>> distribution() {
        return Optional.ofNullable(this.distribution);
    }

    /**
     * The ARM resource ID of the Environment specification for the job.
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    /**
     * @return The ARM resource ID of the Environment specification for the job.
     * 
     */
    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * Environment variables included in the job.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    /**
     * @return Environment variables included in the job.
     * 
     */
    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The name of the experiment the job belongs to. If not set, the job is placed in the &#34;Default&#34; experiment.
     * 
     */
    @Import(name="experimentName")
    private @Nullable Output<String> experimentName;

    /**
     * @return The name of the experiment the job belongs to. If not set, the job is placed in the &#34;Default&#34; experiment.
     * 
     */
    public Optional<Output<String>> experimentName() {
        return Optional.ofNullable(this.experimentName);
    }

    /**
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
     * Defaults to AmlToken if null.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity;

    /**
     * @return Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
     * Defaults to AmlToken if null.
     * 
     */
    public Optional<Output<Either<AmlTokenArgs,ManagedIdentityArgs>>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Mapping of input data bindings used in the job.
     * 
     */
    @Import(name="inputDataBindings")
    private @Nullable Output<Map<String,InputDataBindingArgs>> inputDataBindings;

    /**
     * @return Mapping of input data bindings used in the job.
     * 
     */
    public Optional<Output<Map<String,InputDataBindingArgs>>> inputDataBindings() {
        return Optional.ofNullable(this.inputDataBindings);
    }

    /**
     * Enum to determine the type of job.
     * Expected value is &#39;Command&#39;.
     * 
     */
    @Import(name="jobType", required=true)
    private Output<String> jobType;

    /**
     * @return Enum to determine the type of job.
     * Expected value is &#39;Command&#39;.
     * 
     */
    public Output<String> jobType() {
        return this.jobType;
    }

    /**
     * Mapping of output data bindings used in the job.
     * 
     */
    @Import(name="outputDataBindings")
    private @Nullable Output<Map<String,OutputDataBindingArgs>> outputDataBindings;

    /**
     * @return Mapping of output data bindings used in the job.
     * 
     */
    public Optional<Output<Map<String,OutputDataBindingArgs>>> outputDataBindings() {
        return Optional.ofNullable(this.outputDataBindings);
    }

    /**
     * Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return The asset property dictionary.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private CommandJobArgs() {}

    private CommandJobArgs(CommandJobArgs $) {
        this.codeId = $.codeId;
        this.command = $.command;
        this.compute = $.compute;
        this.description = $.description;
        this.distribution = $.distribution;
        this.environmentId = $.environmentId;
        this.environmentVariables = $.environmentVariables;
        this.experimentName = $.experimentName;
        this.identity = $.identity;
        this.inputDataBindings = $.inputDataBindings;
        this.jobType = $.jobType;
        this.outputDataBindings = $.outputDataBindings;
        this.priority = $.priority;
        this.properties = $.properties;
        this.tags = $.tags;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommandJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommandJobArgs $;

        public Builder() {
            $ = new CommandJobArgs();
        }

        public Builder(CommandJobArgs defaults) {
            $ = new CommandJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param codeId ARM resource ID of the code asset.
         * 
         * @return builder
         * 
         */
        public Builder codeId(@Nullable Output<String> codeId) {
            $.codeId = codeId;
            return this;
        }

        /**
         * @param codeId ARM resource ID of the code asset.
         * 
         * @return builder
         * 
         */
        public Builder codeId(String codeId) {
            return codeId(Output.of(codeId));
        }

        /**
         * @param command The command to execute on startup of the job. eg. &#34;python train.py&#34;
         * 
         * @return builder
         * 
         */
        public Builder command(Output<String> command) {
            $.command = command;
            return this;
        }

        /**
         * @param command The command to execute on startup of the job. eg. &#34;python train.py&#34;
         * 
         * @return builder
         * 
         */
        public Builder command(String command) {
            return command(Output.of(command));
        }

        /**
         * @param compute Compute binding for the job.
         * 
         * @return builder
         * 
         */
        public Builder compute(Output<ComputeConfigurationArgs> compute) {
            $.compute = compute;
            return this;
        }

        /**
         * @param compute Compute binding for the job.
         * 
         * @return builder
         * 
         */
        public Builder compute(ComputeConfigurationArgs compute) {
            return compute(Output.of(compute));
        }

        /**
         * @param description The asset description text.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The asset description text.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param distribution Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
         * 
         * @return builder
         * 
         */
        public Builder distribution(@Nullable Output<Object> distribution) {
            $.distribution = distribution;
            return this;
        }

        /**
         * @param distribution Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
         * 
         * @return builder
         * 
         */
        public Builder distribution(Object distribution) {
            return distribution(Output.of(distribution));
        }

        /**
         * @param environmentId The ARM resource ID of the Environment specification for the job.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId The ARM resource ID of the Environment specification for the job.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param environmentVariables Environment variables included in the job.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables Environment variables included in the job.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param experimentName The name of the experiment the job belongs to. If not set, the job is placed in the &#34;Default&#34; experiment.
         * 
         * @return builder
         * 
         */
        public Builder experimentName(@Nullable Output<String> experimentName) {
            $.experimentName = experimentName;
            return this;
        }

        /**
         * @param experimentName The name of the experiment the job belongs to. If not set, the job is placed in the &#34;Default&#34; experiment.
         * 
         * @return builder
         * 
         */
        public Builder experimentName(String experimentName) {
            return experimentName(Output.of(experimentName));
        }

        /**
         * @param identity Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
         * Defaults to AmlToken if null.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
         * Defaults to AmlToken if null.
         * 
         * @return builder
         * 
         */
        public Builder identity(Either<AmlTokenArgs,ManagedIdentityArgs> identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param identity Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
         * Defaults to AmlToken if null.
         * 
         * @return builder
         * 
         */
        public Builder identity(AmlTokenArgs identity) {
            return identity(Either.ofLeft(identity));
        }

        /**
         * @param identity Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
         * Defaults to AmlToken if null.
         * 
         * @return builder
         * 
         */
        public Builder identity(ManagedIdentityArgs identity) {
            return identity(Either.ofRight(identity));
        }

        /**
         * @param inputDataBindings Mapping of input data bindings used in the job.
         * 
         * @return builder
         * 
         */
        public Builder inputDataBindings(@Nullable Output<Map<String,InputDataBindingArgs>> inputDataBindings) {
            $.inputDataBindings = inputDataBindings;
            return this;
        }

        /**
         * @param inputDataBindings Mapping of input data bindings used in the job.
         * 
         * @return builder
         * 
         */
        public Builder inputDataBindings(Map<String,InputDataBindingArgs> inputDataBindings) {
            return inputDataBindings(Output.of(inputDataBindings));
        }

        /**
         * @param jobType Enum to determine the type of job.
         * Expected value is &#39;Command&#39;.
         * 
         * @return builder
         * 
         */
        public Builder jobType(Output<String> jobType) {
            $.jobType = jobType;
            return this;
        }

        /**
         * @param jobType Enum to determine the type of job.
         * Expected value is &#39;Command&#39;.
         * 
         * @return builder
         * 
         */
        public Builder jobType(String jobType) {
            return jobType(Output.of(jobType));
        }

        /**
         * @param outputDataBindings Mapping of output data bindings used in the job.
         * 
         * @return builder
         * 
         */
        public Builder outputDataBindings(@Nullable Output<Map<String,OutputDataBindingArgs>> outputDataBindings) {
            $.outputDataBindings = outputDataBindings;
            return this;
        }

        /**
         * @param outputDataBindings Mapping of output data bindings used in the job.
         * 
         * @return builder
         * 
         */
        public Builder outputDataBindings(Map<String,OutputDataBindingArgs> outputDataBindings) {
            return outputDataBindings(Output.of(outputDataBindings));
        }

        /**
         * @param priority Job priority for scheduling policy. Only applies to AMLCompute.
         * Private preview feature and only available to users on the allow list.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Job priority for scheduling policy. Only applies to AMLCompute.
         * Private preview feature and only available to users on the allow list.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param properties The asset property dictionary.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The asset property dictionary.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param tags Tag dictionary. Tags can be added, removed, and updated.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tag dictionary. Tags can be added, removed, and updated.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param timeout The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public CommandJobArgs build() {
            $.command = Objects.requireNonNull($.command, "expected parameter 'command' to be non-null");
            $.compute = Objects.requireNonNull($.compute, "expected parameter 'compute' to be non-null");
            $.jobType = Codegen.stringProp("jobType").output().arg($.jobType).require();
            return $;
        }
    }

}
