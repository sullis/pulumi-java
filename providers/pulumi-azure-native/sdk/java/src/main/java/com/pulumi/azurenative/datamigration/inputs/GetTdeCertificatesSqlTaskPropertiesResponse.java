// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.GetTdeCertificatesSqlTaskInputResponse;
import com.pulumi.azurenative.datamigration.inputs.GetTdeCertificatesSqlTaskOutputResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.inputs.ODataErrorResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that gets TDE certificates in Base64 encoded format.
 * 
 */
public final class GetTdeCertificatesSqlTaskPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final GetTdeCertificatesSqlTaskPropertiesResponse Empty = new GetTdeCertificatesSqlTaskPropertiesResponse();

    /**
     * Array of command properties.
     * 
     */
    @Import(name="commands", required=true)
      private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;

    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands() {
        return this.commands;
    }

    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    @Import(name="errors", required=true)
      private final List<ODataErrorResponse> errors;

    public List<ODataErrorResponse> errors() {
        return this.errors;
    }

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable GetTdeCertificatesSqlTaskInputResponse input;

    public Optional<GetTdeCertificatesSqlTaskInputResponse> input() {
        return this.input == null ? Optional.empty() : Optional.ofNullable(this.input);
    }

    /**
     * Task output. This is ignored if submitted.
     * 
     */
    @Import(name="output", required=true)
      private final List<GetTdeCertificatesSqlTaskOutputResponse> output;

    public List<GetTdeCertificatesSqlTaskOutputResponse> output() {
        return this.output;
    }

    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * Task type.
     * Expected value is 'GetTDECertificates.Sql'.
     * 
     */
    @Import(name="taskType", required=true)
      private final String taskType;

    public String taskType() {
        return this.taskType;
    }

    public GetTdeCertificatesSqlTaskPropertiesResponse(
        List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        List<ODataErrorResponse> errors,
        @Nullable GetTdeCertificatesSqlTaskInputResponse input,
        List<GetTdeCertificatesSqlTaskOutputResponse> output,
        String state,
        String taskType) {
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.input = input;
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.taskType = Codegen.stringProp("taskType").arg(taskType).require();
    }

    private GetTdeCertificatesSqlTaskPropertiesResponse() {
        this.commands = List.of();
        this.errors = List.of();
        this.input = null;
        this.output = List.of();
        this.state = null;
        this.taskType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTdeCertificatesSqlTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable GetTdeCertificatesSqlTaskInputResponse input;
        private List<GetTdeCertificatesSqlTaskOutputResponse> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTdeCertificatesSqlTaskPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.errors = defaults.errors;
    	      this.input = defaults.input;
    	      this.output = defaults.output;
    	      this.state = defaults.state;
    	      this.taskType = defaults.taskType;
        }

        public Builder commands(List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }
        public Builder commands(Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>... commands) {
            return commands(List.of(commands));
        }
        public Builder errors(List<ODataErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(ODataErrorResponse... errors) {
            return errors(List.of(errors));
        }
        public Builder input(@Nullable GetTdeCertificatesSqlTaskInputResponse input) {
            this.input = input;
            return this;
        }
        public Builder output(List<GetTdeCertificatesSqlTaskOutputResponse> output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }
        public Builder output(GetTdeCertificatesSqlTaskOutputResponse... output) {
            return output(List.of(output));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder taskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }        public GetTdeCertificatesSqlTaskPropertiesResponse build() {
            return new GetTdeCertificatesSqlTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
