// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.ConnectToSourceSqlServerTaskInputResponse;
import com.pulumi.azurenative.datamigration.outputs.ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse;
import com.pulumi.azurenative.datamigration.outputs.ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse;
import com.pulumi.azurenative.datamigration.outputs.ConnectToSourceSqlServerTaskOutputLoginLevelResponse;
import com.pulumi.azurenative.datamigration.outputs.ConnectToSourceSqlServerTaskOutputTaskLevelResponse;
import com.pulumi.azurenative.datamigration.outputs.MigrateMISyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.outputs.MigrateSyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.outputs.ODataErrorResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectToSourceSqlServerSyncTaskPropertiesResponse {
    /**
     * @return Array of command properties.
     * 
     */
    private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
    /**
     * @return Array of errors. This is ignored if submitted.
     * 
     */
    private final List<ODataErrorResponse> errors;
    /**
     * @return Task input
     * 
     */
    private final @Nullable ConnectToSourceSqlServerTaskInputResponse input;
    /**
     * @return Task output. This is ignored if submitted.
     * 
     */
    private final List<Object> output;
    /**
     * @return The state of the task. This is ignored if submitted.
     * 
     */
    private final String state;
    /**
     * @return Task type.
     * Expected value is &#39;ConnectToSource.SqlServer.Sync&#39;.
     * 
     */
    private final String taskType;

    @CustomType.Constructor
    private ConnectToSourceSqlServerSyncTaskPropertiesResponse(
        @CustomType.Parameter("commands") List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        @CustomType.Parameter("errors") List<ODataErrorResponse> errors,
        @CustomType.Parameter("input") @Nullable ConnectToSourceSqlServerTaskInputResponse input,
        @CustomType.Parameter("output") List<Object> output,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("taskType") String taskType) {
        this.commands = commands;
        this.errors = errors;
        this.input = input;
        this.output = output;
        this.state = state;
        this.taskType = taskType;
    }

    /**
     * @return Array of command properties.
     * 
     */
    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands() {
        return this.commands;
    }
    /**
     * @return Array of errors. This is ignored if submitted.
     * 
     */
    public List<ODataErrorResponse> errors() {
        return this.errors;
    }
    /**
     * @return Task input
     * 
     */
    public Optional<ConnectToSourceSqlServerTaskInputResponse> input() {
        return Optional.ofNullable(this.input);
    }
    /**
     * @return Task output. This is ignored if submitted.
     * 
     */
    public List<Object> output() {
        return this.output;
    }
    /**
     * @return The state of the task. This is ignored if submitted.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Task type.
     * Expected value is &#39;ConnectToSource.SqlServer.Sync&#39;.
     * 
     */
    public String taskType() {
        return this.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerSyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable ConnectToSourceSqlServerTaskInputResponse input;
        private List<Object> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerSyncTaskPropertiesResponse defaults) {
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
        public Builder input(@Nullable ConnectToSourceSqlServerTaskInputResponse input) {
            this.input = input;
            return this;
        }
        public Builder output(List<Object> output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }
        public Builder output(Object... output) {
            return output(List.of(output));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder taskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }        public ConnectToSourceSqlServerSyncTaskPropertiesResponse build() {
            return new ConnectToSourceSqlServerSyncTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
