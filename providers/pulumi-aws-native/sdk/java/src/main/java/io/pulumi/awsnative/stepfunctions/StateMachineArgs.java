// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions;

import io.pulumi.awsnative.stepfunctions.enums.StateMachineType;
import io.pulumi.awsnative.stepfunctions.inputs.StateMachineDefinitionArgs;
import io.pulumi.awsnative.stepfunctions.inputs.StateMachineDefinitionSubstitutionsArgs;
import io.pulumi.awsnative.stepfunctions.inputs.StateMachineLoggingConfigurationArgs;
import io.pulumi.awsnative.stepfunctions.inputs.StateMachineS3LocationArgs;
import io.pulumi.awsnative.stepfunctions.inputs.StateMachineTagsEntryArgs;
import io.pulumi.awsnative.stepfunctions.inputs.StateMachineTracingConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineArgs Empty = new StateMachineArgs();

    @Import(name="definition")
      private final @Nullable Output<StateMachineDefinitionArgs> definition;

    public Output<StateMachineDefinitionArgs> definition() {
        return this.definition == null ? Codegen.empty() : this.definition;
    }

    @Import(name="definitionS3Location")
      private final @Nullable Output<StateMachineS3LocationArgs> definitionS3Location;

    public Output<StateMachineS3LocationArgs> definitionS3Location() {
        return this.definitionS3Location == null ? Codegen.empty() : this.definitionS3Location;
    }

    @Import(name="definitionString")
      private final @Nullable Output<String> definitionString;

    public Output<String> definitionString() {
        return this.definitionString == null ? Codegen.empty() : this.definitionString;
    }

    @Import(name="definitionSubstitutions")
      private final @Nullable Output<StateMachineDefinitionSubstitutionsArgs> definitionSubstitutions;

    public Output<StateMachineDefinitionSubstitutionsArgs> definitionSubstitutions() {
        return this.definitionSubstitutions == null ? Codegen.empty() : this.definitionSubstitutions;
    }

    @Import(name="loggingConfiguration")
      private final @Nullable Output<StateMachineLoggingConfigurationArgs> loggingConfiguration;

    public Output<StateMachineLoggingConfigurationArgs> loggingConfiguration() {
        return this.loggingConfiguration == null ? Codegen.empty() : this.loggingConfiguration;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="stateMachineName")
      private final @Nullable Output<String> stateMachineName;

    public Output<String> stateMachineName() {
        return this.stateMachineName == null ? Codegen.empty() : this.stateMachineName;
    }

    @Import(name="stateMachineType")
      private final @Nullable Output<StateMachineType> stateMachineType;

    public Output<StateMachineType> stateMachineType() {
        return this.stateMachineType == null ? Codegen.empty() : this.stateMachineType;
    }

    @Import(name="tags")
      private final @Nullable Output<List<StateMachineTagsEntryArgs>> tags;

    public Output<List<StateMachineTagsEntryArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="tracingConfiguration")
      private final @Nullable Output<StateMachineTracingConfigurationArgs> tracingConfiguration;

    public Output<StateMachineTracingConfigurationArgs> tracingConfiguration() {
        return this.tracingConfiguration == null ? Codegen.empty() : this.tracingConfiguration;
    }

    public StateMachineArgs(
        @Nullable Output<StateMachineDefinitionArgs> definition,
        @Nullable Output<StateMachineS3LocationArgs> definitionS3Location,
        @Nullable Output<String> definitionString,
        @Nullable Output<StateMachineDefinitionSubstitutionsArgs> definitionSubstitutions,
        @Nullable Output<StateMachineLoggingConfigurationArgs> loggingConfiguration,
        Output<String> roleArn,
        @Nullable Output<String> stateMachineName,
        @Nullable Output<StateMachineType> stateMachineType,
        @Nullable Output<List<StateMachineTagsEntryArgs>> tags,
        @Nullable Output<StateMachineTracingConfigurationArgs> tracingConfiguration) {
        this.definition = definition;
        this.definitionS3Location = definitionS3Location;
        this.definitionString = definitionString;
        this.definitionSubstitutions = definitionSubstitutions;
        this.loggingConfiguration = loggingConfiguration;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stateMachineName = stateMachineName;
        this.stateMachineType = stateMachineType;
        this.tags = tags;
        this.tracingConfiguration = tracingConfiguration;
    }

    private StateMachineArgs() {
        this.definition = Codegen.empty();
        this.definitionS3Location = Codegen.empty();
        this.definitionString = Codegen.empty();
        this.definitionSubstitutions = Codegen.empty();
        this.loggingConfiguration = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.stateMachineName = Codegen.empty();
        this.stateMachineType = Codegen.empty();
        this.tags = Codegen.empty();
        this.tracingConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StateMachineDefinitionArgs> definition;
        private @Nullable Output<StateMachineS3LocationArgs> definitionS3Location;
        private @Nullable Output<String> definitionString;
        private @Nullable Output<StateMachineDefinitionSubstitutionsArgs> definitionSubstitutions;
        private @Nullable Output<StateMachineLoggingConfigurationArgs> loggingConfiguration;
        private Output<String> roleArn;
        private @Nullable Output<String> stateMachineName;
        private @Nullable Output<StateMachineType> stateMachineType;
        private @Nullable Output<List<StateMachineTagsEntryArgs>> tags;
        private @Nullable Output<StateMachineTracingConfigurationArgs> tracingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.definitionS3Location = defaults.definitionS3Location;
    	      this.definitionString = defaults.definitionString;
    	      this.definitionSubstitutions = defaults.definitionSubstitutions;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.roleArn = defaults.roleArn;
    	      this.stateMachineName = defaults.stateMachineName;
    	      this.stateMachineType = defaults.stateMachineType;
    	      this.tags = defaults.tags;
    	      this.tracingConfiguration = defaults.tracingConfiguration;
        }

        public Builder definition(@Nullable Output<StateMachineDefinitionArgs> definition) {
            this.definition = definition;
            return this;
        }
        public Builder definition(@Nullable StateMachineDefinitionArgs definition) {
            this.definition = Codegen.ofNullable(definition);
            return this;
        }
        public Builder definitionS3Location(@Nullable Output<StateMachineS3LocationArgs> definitionS3Location) {
            this.definitionS3Location = definitionS3Location;
            return this;
        }
        public Builder definitionS3Location(@Nullable StateMachineS3LocationArgs definitionS3Location) {
            this.definitionS3Location = Codegen.ofNullable(definitionS3Location);
            return this;
        }
        public Builder definitionString(@Nullable Output<String> definitionString) {
            this.definitionString = definitionString;
            return this;
        }
        public Builder definitionString(@Nullable String definitionString) {
            this.definitionString = Codegen.ofNullable(definitionString);
            return this;
        }
        public Builder definitionSubstitutions(@Nullable Output<StateMachineDefinitionSubstitutionsArgs> definitionSubstitutions) {
            this.definitionSubstitutions = definitionSubstitutions;
            return this;
        }
        public Builder definitionSubstitutions(@Nullable StateMachineDefinitionSubstitutionsArgs definitionSubstitutions) {
            this.definitionSubstitutions = Codegen.ofNullable(definitionSubstitutions);
            return this;
        }
        public Builder loggingConfiguration(@Nullable Output<StateMachineLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }
        public Builder loggingConfiguration(@Nullable StateMachineLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Codegen.ofNullable(loggingConfiguration);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder stateMachineName(@Nullable Output<String> stateMachineName) {
            this.stateMachineName = stateMachineName;
            return this;
        }
        public Builder stateMachineName(@Nullable String stateMachineName) {
            this.stateMachineName = Codegen.ofNullable(stateMachineName);
            return this;
        }
        public Builder stateMachineType(@Nullable Output<StateMachineType> stateMachineType) {
            this.stateMachineType = stateMachineType;
            return this;
        }
        public Builder stateMachineType(@Nullable StateMachineType stateMachineType) {
            this.stateMachineType = Codegen.ofNullable(stateMachineType);
            return this;
        }
        public Builder tags(@Nullable Output<List<StateMachineTagsEntryArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<StateMachineTagsEntryArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(StateMachineTagsEntryArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder tracingConfiguration(@Nullable Output<StateMachineTracingConfigurationArgs> tracingConfiguration) {
            this.tracingConfiguration = tracingConfiguration;
            return this;
        }
        public Builder tracingConfiguration(@Nullable StateMachineTracingConfigurationArgs tracingConfiguration) {
            this.tracingConfiguration = Codegen.ofNullable(tracingConfiguration);
            return this;
        }        public StateMachineArgs build() {
            return new StateMachineArgs(definition, definitionS3Location, definitionString, definitionSubstitutions, loggingConfiguration, roleArn, stateMachineName, stateMachineType, tags, tracingConfiguration);
        }
    }
}
