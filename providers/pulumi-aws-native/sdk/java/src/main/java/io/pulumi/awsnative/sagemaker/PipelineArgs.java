// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.inputs.ParallelismConfigurationPropertiesArgs;
import io.pulumi.awsnative.sagemaker.inputs.PipelineTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    @InputImport(name="parallelismConfiguration")
    private final @Nullable Input<ParallelismConfigurationPropertiesArgs> parallelismConfiguration;

    public Input<ParallelismConfigurationPropertiesArgs> getParallelismConfiguration() {
        return this.parallelismConfiguration == null ? Input.empty() : this.parallelismConfiguration;
    }

    @InputImport(name="pipelineDefinition", required=true)
    private final Input<Object> pipelineDefinition;

    public Input<Object> getPipelineDefinition() {
        return this.pipelineDefinition;
    }

    /**
     * The description of the Pipeline.
     * 
     */
    @InputImport(name="pipelineDescription")
    private final @Nullable Input<String> pipelineDescription;

    public Input<String> getPipelineDescription() {
        return this.pipelineDescription == null ? Input.empty() : this.pipelineDescription;
    }

    /**
     * The display name of the Pipeline.
     * 
     */
    @InputImport(name="pipelineDisplayName")
    private final @Nullable Input<String> pipelineDisplayName;

    public Input<String> getPipelineDisplayName() {
        return this.pipelineDisplayName == null ? Input.empty() : this.pipelineDisplayName;
    }

    /**
     * The name of the Pipeline.
     * 
     */
    @InputImport(name="pipelineName")
    private final @Nullable Input<String> pipelineName;

    public Input<String> getPipelineName() {
        return this.pipelineName == null ? Input.empty() : this.pipelineName;
    }

    /**
     * Role Arn
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<PipelineTagArgs>> tags;

    public Input<List<PipelineTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PipelineArgs(
        @Nullable Input<ParallelismConfigurationPropertiesArgs> parallelismConfiguration,
        Input<Object> pipelineDefinition,
        @Nullable Input<String> pipelineDescription,
        @Nullable Input<String> pipelineDisplayName,
        @Nullable Input<String> pipelineName,
        Input<String> roleArn,
        @Nullable Input<List<PipelineTagArgs>> tags) {
        this.parallelismConfiguration = parallelismConfiguration;
        this.pipelineDefinition = Objects.requireNonNull(pipelineDefinition, "expected parameter 'pipelineDefinition' to be non-null");
        this.pipelineDescription = pipelineDescription;
        this.pipelineDisplayName = pipelineDisplayName;
        this.pipelineName = pipelineName;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private PipelineArgs() {
        this.parallelismConfiguration = Input.empty();
        this.pipelineDefinition = Input.empty();
        this.pipelineDescription = Input.empty();
        this.pipelineDisplayName = Input.empty();
        this.pipelineName = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ParallelismConfigurationPropertiesArgs> parallelismConfiguration;
        private Input<Object> pipelineDefinition;
        private @Nullable Input<String> pipelineDescription;
        private @Nullable Input<String> pipelineDisplayName;
        private @Nullable Input<String> pipelineName;
        private Input<String> roleArn;
        private @Nullable Input<List<PipelineTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parallelismConfiguration = defaults.parallelismConfiguration;
    	      this.pipelineDefinition = defaults.pipelineDefinition;
    	      this.pipelineDescription = defaults.pipelineDescription;
    	      this.pipelineDisplayName = defaults.pipelineDisplayName;
    	      this.pipelineName = defaults.pipelineName;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setParallelismConfiguration(@Nullable Input<ParallelismConfigurationPropertiesArgs> parallelismConfiguration) {
            this.parallelismConfiguration = parallelismConfiguration;
            return this;
        }

        public Builder setParallelismConfiguration(@Nullable ParallelismConfigurationPropertiesArgs parallelismConfiguration) {
            this.parallelismConfiguration = Input.ofNullable(parallelismConfiguration);
            return this;
        }

        public Builder setPipelineDefinition(Input<Object> pipelineDefinition) {
            this.pipelineDefinition = Objects.requireNonNull(pipelineDefinition);
            return this;
        }

        public Builder setPipelineDefinition(Object pipelineDefinition) {
            this.pipelineDefinition = Input.of(Objects.requireNonNull(pipelineDefinition));
            return this;
        }

        public Builder setPipelineDescription(@Nullable Input<String> pipelineDescription) {
            this.pipelineDescription = pipelineDescription;
            return this;
        }

        public Builder setPipelineDescription(@Nullable String pipelineDescription) {
            this.pipelineDescription = Input.ofNullable(pipelineDescription);
            return this;
        }

        public Builder setPipelineDisplayName(@Nullable Input<String> pipelineDisplayName) {
            this.pipelineDisplayName = pipelineDisplayName;
            return this;
        }

        public Builder setPipelineDisplayName(@Nullable String pipelineDisplayName) {
            this.pipelineDisplayName = Input.ofNullable(pipelineDisplayName);
            return this;
        }

        public Builder setPipelineName(@Nullable Input<String> pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        public Builder setPipelineName(@Nullable String pipelineName) {
            this.pipelineName = Input.ofNullable(pipelineName);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<List<PipelineTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<PipelineTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public PipelineArgs build() {
            return new PipelineArgs(parallelismConfiguration, pipelineDefinition, pipelineDescription, pipelineDisplayName, pipelineName, roleArn, tags);
        }
    }
}
