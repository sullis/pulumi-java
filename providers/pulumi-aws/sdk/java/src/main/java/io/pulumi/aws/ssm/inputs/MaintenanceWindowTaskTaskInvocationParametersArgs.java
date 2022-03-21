// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersArgs();

    /**
     * The parameters for an AUTOMATION task type. Documented below.
     * 
     */
    @Import(name="automationParameters")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs> automationParameters;

    public Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs> getAutomationParameters() {
        return this.automationParameters == null ? Output.empty() : this.automationParameters;
    }

    /**
     * The parameters for a LAMBDA task type. Documented below.
     * 
     */
    @Import(name="lambdaParameters")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs> lambdaParameters;

    public Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs> getLambdaParameters() {
        return this.lambdaParameters == null ? Output.empty() : this.lambdaParameters;
    }

    /**
     * The parameters for a RUN_COMMAND task type. Documented below.
     * 
     */
    @Import(name="runCommandParameters")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs> runCommandParameters;

    public Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs> getRunCommandParameters() {
        return this.runCommandParameters == null ? Output.empty() : this.runCommandParameters;
    }

    /**
     * The parameters for a STEP_FUNCTIONS task type. Documented below.
     * 
     */
    @Import(name="stepFunctionsParameters")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs> stepFunctionsParameters;

    public Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs> getStepFunctionsParameters() {
        return this.stepFunctionsParameters == null ? Output.empty() : this.stepFunctionsParameters;
    }

    public MaintenanceWindowTaskTaskInvocationParametersArgs(
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs> automationParameters,
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs> lambdaParameters,
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs> runCommandParameters,
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs> stepFunctionsParameters) {
        this.automationParameters = automationParameters;
        this.lambdaParameters = lambdaParameters;
        this.runCommandParameters = runCommandParameters;
        this.stepFunctionsParameters = stepFunctionsParameters;
    }

    private MaintenanceWindowTaskTaskInvocationParametersArgs() {
        this.automationParameters = Output.empty();
        this.lambdaParameters = Output.empty();
        this.runCommandParameters = Output.empty();
        this.stepFunctionsParameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs> automationParameters;
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs> lambdaParameters;
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs> runCommandParameters;
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs> stepFunctionsParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationParameters = defaults.automationParameters;
    	      this.lambdaParameters = defaults.lambdaParameters;
    	      this.runCommandParameters = defaults.runCommandParameters;
    	      this.stepFunctionsParameters = defaults.stepFunctionsParameters;
        }

        public Builder automationParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs> automationParameters) {
            this.automationParameters = automationParameters;
            return this;
        }
        public Builder automationParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs automationParameters) {
            this.automationParameters = Output.ofNullable(automationParameters);
            return this;
        }
        public Builder lambdaParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs> lambdaParameters) {
            this.lambdaParameters = lambdaParameters;
            return this;
        }
        public Builder lambdaParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs lambdaParameters) {
            this.lambdaParameters = Output.ofNullable(lambdaParameters);
            return this;
        }
        public Builder runCommandParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs> runCommandParameters) {
            this.runCommandParameters = runCommandParameters;
            return this;
        }
        public Builder runCommandParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs runCommandParameters) {
            this.runCommandParameters = Output.ofNullable(runCommandParameters);
            return this;
        }
        public Builder stepFunctionsParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs> stepFunctionsParameters) {
            this.stepFunctionsParameters = stepFunctionsParameters;
            return this;
        }
        public Builder stepFunctionsParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs stepFunctionsParameters) {
            this.stepFunctionsParameters = Output.ofNullable(stepFunctionsParameters);
            return this;
        }        public MaintenanceWindowTaskTaskInvocationParametersArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersArgs(automationParameters, lambdaParameters, runCommandParameters, stepFunctionsParameters);
        }
    }
}
