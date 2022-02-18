// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ValidateMigrationInputSqlServerSqlMITaskInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for task that validates migration input for SQL to Azure SQL Database Managed Instance
 * 
 */
public final class ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs Empty = new ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
    private final @Nullable Input<ValidateMigrationInputSqlServerSqlMITaskInputArgs> input;

    public Input<ValidateMigrationInputSqlServerSqlMITaskInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ValidateMigrationInput.SqlServer.AzureSqlDbMI'.
     * 
     */
    @InputImport(name="taskType", required=true)
    private final Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType;
    }

    public ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs(
        @Nullable Input<ValidateMigrationInputSqlServerSqlMITaskInputArgs> input,
        Input<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs() {
        this.input = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ValidateMigrationInputSqlServerSqlMITaskInputArgs> input;
        private Input<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder setInput(@Nullable Input<ValidateMigrationInputSqlServerSqlMITaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable ValidateMigrationInputSqlServerSqlMITaskInputArgs input) {
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

        public ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs build() {
            return new ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs(input, taskType);
        }
    }
}
