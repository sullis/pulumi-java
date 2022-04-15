// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.FrameworkControlControlScopePropertiesArgs;
import io.pulumi.awsnative.backup.inputs.FrameworkControlInputParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FrameworkControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrameworkControlArgs Empty = new FrameworkControlArgs();

    /**
     * A list of ParameterName and ParameterValue pairs.
     * 
     */
    @Import(name="controlInputParameters")
      private final @Nullable Output<List<FrameworkControlInputParameterArgs>> controlInputParameters;

    public Output<List<FrameworkControlInputParameterArgs>> controlInputParameters() {
        return this.controlInputParameters == null ? Codegen.empty() : this.controlInputParameters;
    }

    /**
     * The name of a control. This name is between 1 and 256 characters.
     * 
     */
    @Import(name="controlName", required=true)
      private final Output<String> controlName;

    public Output<String> controlName() {
        return this.controlName;
    }

    /**
     * The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
     * 
     */
    @Import(name="controlScope")
      private final @Nullable Output<FrameworkControlControlScopePropertiesArgs> controlScope;

    public Output<FrameworkControlControlScopePropertiesArgs> controlScope() {
        return this.controlScope == null ? Codegen.empty() : this.controlScope;
    }

    public FrameworkControlArgs(
        @Nullable Output<List<FrameworkControlInputParameterArgs>> controlInputParameters,
        Output<String> controlName,
        @Nullable Output<FrameworkControlControlScopePropertiesArgs> controlScope) {
        this.controlInputParameters = controlInputParameters;
        this.controlName = Objects.requireNonNull(controlName, "expected parameter 'controlName' to be non-null");
        this.controlScope = controlScope;
    }

    private FrameworkControlArgs() {
        this.controlInputParameters = Codegen.empty();
        this.controlName = Codegen.empty();
        this.controlScope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FrameworkControlInputParameterArgs>> controlInputParameters;
        private Output<String> controlName;
        private @Nullable Output<FrameworkControlControlScopePropertiesArgs> controlScope;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlInputParameters = defaults.controlInputParameters;
    	      this.controlName = defaults.controlName;
    	      this.controlScope = defaults.controlScope;
        }

        public Builder controlInputParameters(@Nullable Output<List<FrameworkControlInputParameterArgs>> controlInputParameters) {
            this.controlInputParameters = controlInputParameters;
            return this;
        }
        public Builder controlInputParameters(@Nullable List<FrameworkControlInputParameterArgs> controlInputParameters) {
            this.controlInputParameters = Codegen.ofNullable(controlInputParameters);
            return this;
        }
        public Builder controlInputParameters(FrameworkControlInputParameterArgs... controlInputParameters) {
            return controlInputParameters(List.of(controlInputParameters));
        }
        public Builder controlName(Output<String> controlName) {
            this.controlName = Objects.requireNonNull(controlName);
            return this;
        }
        public Builder controlName(String controlName) {
            this.controlName = Output.of(Objects.requireNonNull(controlName));
            return this;
        }
        public Builder controlScope(@Nullable Output<FrameworkControlControlScopePropertiesArgs> controlScope) {
            this.controlScope = controlScope;
            return this;
        }
        public Builder controlScope(@Nullable FrameworkControlControlScopePropertiesArgs controlScope) {
            this.controlScope = Codegen.ofNullable(controlScope);
            return this;
        }        public FrameworkControlArgs build() {
            return new FrameworkControlArgs(controlInputParameters, controlName, controlScope);
        }
    }
}
