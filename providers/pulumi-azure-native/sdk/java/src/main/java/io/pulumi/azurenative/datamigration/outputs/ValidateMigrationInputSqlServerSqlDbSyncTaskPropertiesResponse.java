// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MigrateMISyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ODataErrorResponse;
import io.pulumi.azurenative.datamigration.outputs.ValidateSyncMigrationInputSqlServerTaskInputResponse;
import io.pulumi.azurenative.datamigration.outputs.ValidateSyncMigrationInputSqlServerTaskOutputResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesResponse {
    /**
     * Array of command properties.
     * 
     */
    private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    private final List<ODataErrorResponse> errors;
    /**
     * Task input
     * 
     */
    private final @Nullable ValidateSyncMigrationInputSqlServerTaskInputResponse input;
    /**
     * Task output. This is ignored if submitted.
     * 
     */
    private final List<ValidateSyncMigrationInputSqlServerTaskOutputResponse> output;
    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    private final String state;
    /**
     * Task type.
     * Expected value is 'ValidateMigrationInput.SqlServer.SqlDb.Sync'.
     * 
     */
    private final String taskType;

    @OutputCustomType.Constructor({"commands","errors","input","output","state","taskType"})
    private ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesResponse(
        List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        List<ODataErrorResponse> errors,
        @Nullable ValidateSyncMigrationInputSqlServerTaskInputResponse input,
        List<ValidateSyncMigrationInputSqlServerTaskOutputResponse> output,
        String state,
        String taskType) {
        this.commands = Objects.requireNonNull(commands);
        this.errors = Objects.requireNonNull(errors);
        this.input = input;
        this.output = Objects.requireNonNull(output);
        this.state = Objects.requireNonNull(state);
        this.taskType = Objects.requireNonNull(taskType);
    }

    /**
     * Array of command properties.
     * 
     */
    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> getCommands() {
        return this.commands;
    }
    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    public List<ODataErrorResponse> getErrors() {
        return this.errors;
    }
    /**
     * Task input
     * 
     */
    public Optional<ValidateSyncMigrationInputSqlServerTaskInputResponse> getInput() {
        return Optional.ofNullable(this.input);
    }
    /**
     * Task output. This is ignored if submitted.
     * 
     */
    public List<ValidateSyncMigrationInputSqlServerTaskOutputResponse> getOutput() {
        return this.output;
    }
    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Task type.
     * Expected value is 'ValidateMigrationInput.SqlServer.SqlDb.Sync'.
     * 
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable ValidateSyncMigrationInputSqlServerTaskInputResponse input;
        private List<ValidateSyncMigrationInputSqlServerTaskOutputResponse> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.errors = defaults.errors;
    	      this.input = defaults.input;
    	      this.output = defaults.output;
    	      this.state = defaults.state;
    	      this.taskType = defaults.taskType;
        }

        public Builder setCommands(List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }

        public Builder setErrors(List<ODataErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setInput(@Nullable ValidateSyncMigrationInputSqlServerTaskInputResponse input) {
            this.input = input;
            return this;
        }

        public Builder setOutput(List<ValidateSyncMigrationInputSqlServerTaskOutputResponse> output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTaskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesResponse build() {
            return new ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
