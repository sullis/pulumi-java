// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateMySqlAzureDbForMySqlSyncTaskInputResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseErrorResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateMySqlAzureDbForMySqlSyncTaskOutputErrorResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevelResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateSyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.inputs.ODataErrorResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that migrates MySQL databases to Azure Database for MySQL for online migrations
 * 
 */
public final class MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse Empty = new MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse();

    /**
     * Array of command properties.
     * 
     */
    @InputImport(name="commands", required=true)
    private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;

    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> getCommands() {
        return this.commands;
    }

    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    @InputImport(name="errors", required=true)
    private final List<ODataErrorResponse> errors;

    public List<ODataErrorResponse> getErrors() {
        return this.errors;
    }

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
    private final @Nullable MigrateMySqlAzureDbForMySqlSyncTaskInputResponse input;

    public Optional<MigrateMySqlAzureDbForMySqlSyncTaskInputResponse> getInput() {
        return this.input == null ? Optional.empty() : Optional.ofNullable(this.input);
    }

    /**
     * Task output. This is ignored if submitted.
     * 
     */
    @InputImport(name="output", required=true)
    private final List<Object> output;

    public List<Object> getOutput() {
        return this.output;
    }

    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Task type.
     * Expected value is 'Migrate.MySql.AzureDbForMySql.Sync'.
     * 
     */
    @InputImport(name="taskType", required=true)
    private final String taskType;

    public String getTaskType() {
        return this.taskType;
    }

    public MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse(
        List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        List<ODataErrorResponse> errors,
        @Nullable MigrateMySqlAzureDbForMySqlSyncTaskInputResponse input,
        List<Object> output,
        String state,
        String taskType) {
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.input = input;
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse() {
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

    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable MigrateMySqlAzureDbForMySqlSyncTaskInputResponse input;
        private List<Object> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse defaults) {
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

        public Builder setInput(@Nullable MigrateMySqlAzureDbForMySqlSyncTaskInputResponse input) {
            this.input = input;
            return this;
        }

        public Builder setOutput(List<Object> output) {
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

        public MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse build() {
            return new MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
