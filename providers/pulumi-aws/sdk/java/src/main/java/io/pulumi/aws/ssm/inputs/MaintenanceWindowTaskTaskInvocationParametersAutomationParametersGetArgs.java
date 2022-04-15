// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs();

    /**
     * The version of an Automation document to use during task execution.
     * 
     */
    @Import(name="documentVersion")
      private final @Nullable Output<String> documentVersion;

    public Output<String> documentVersion() {
        return this.documentVersion == null ? Codegen.empty() : this.documentVersion;
    }

    /**
     * The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterGetArgs>> parameters;

    public Output<List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterGetArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    public MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs(
        @Nullable Output<String> documentVersion,
        @Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterGetArgs>> parameters) {
        this.documentVersion = documentVersion;
        this.parameters = parameters;
    }

    private MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs() {
        this.documentVersion = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> documentVersion;
        private @Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterGetArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentVersion = defaults.documentVersion;
    	      this.parameters = defaults.parameters;
        }

        public Builder documentVersion(@Nullable Output<String> documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }
        public Builder documentVersion(@Nullable String documentVersion) {
            this.documentVersion = Codegen.ofNullable(documentVersion);
            return this;
        }
        public Builder parameters(@Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterGetArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterGetArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterGetArgs... parameters) {
            return parameters(List.of(parameters));
        }        public MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs(documentVersion, parameters);
        }
    }
}
