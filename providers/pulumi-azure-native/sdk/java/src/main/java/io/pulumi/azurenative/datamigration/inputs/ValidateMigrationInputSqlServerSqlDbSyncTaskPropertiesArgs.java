// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ValidateSyncMigrationInputSqlServerTaskInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for task that validates migration input for SQL to Azure SQL DB sync migrations
 * 
 */
public final class ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs Empty = new ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
      private final @Nullable Input<ValidateSyncMigrationInputSqlServerTaskInputArgs> input;

    public Input<ValidateSyncMigrationInputSqlServerTaskInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ValidateMigrationInput.SqlServer.SqlDb.Sync'.
     * 
     */
    @InputImport(name="taskType", required=true)
      private final Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType;
    }

    public ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs(
        @Nullable Input<ValidateSyncMigrationInputSqlServerTaskInputArgs> input,
        Input<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs() {
        this.input = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ValidateSyncMigrationInputSqlServerTaskInputArgs> input;
        private Input<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder setInput(@Nullable Input<ValidateSyncMigrationInputSqlServerTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable ValidateSyncMigrationInputSqlServerTaskInputArgs input) {
            this.input = Input.ofNullable(input);
            return this;
        }

        public Builder setTaskType(Input<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public Builder setTaskType(String taskType) {
            this.taskType = Input.of(Objects.requireNonNull(taskType));
            return this;
        }
        public ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs build() {
            return new ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs(input, taskType);
        }
    }
}