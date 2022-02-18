// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.DatabaseTableResponse;
import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetUserTablesSqlSyncTaskOutputResponse {
    /**
     * Mapping from database name to list of source tables
     * 
     */
    private final Map<String,List<DatabaseTableResponse>> databasesToSourceTables;
    /**
     * Mapping from database name to list of target tables
     * 
     */
    private final Map<String,List<DatabaseTableResponse>> databasesToTargetTables;
    /**
     * Mapping from database name to list of validation errors
     * 
     */
    private final Map<String,List<String>> tableValidationErrors;
    /**
     * Validation errors
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @OutputCustomType.Constructor({"databasesToSourceTables","databasesToTargetTables","tableValidationErrors","validationErrors"})
    private GetUserTablesSqlSyncTaskOutputResponse(
        Map<String,List<DatabaseTableResponse>> databasesToSourceTables,
        Map<String,List<DatabaseTableResponse>> databasesToTargetTables,
        Map<String,List<String>> tableValidationErrors,
        List<ReportableExceptionResponse> validationErrors) {
        this.databasesToSourceTables = Objects.requireNonNull(databasesToSourceTables);
        this.databasesToTargetTables = Objects.requireNonNull(databasesToTargetTables);
        this.tableValidationErrors = Objects.requireNonNull(tableValidationErrors);
        this.validationErrors = Objects.requireNonNull(validationErrors);
    }

    /**
     * Mapping from database name to list of source tables
     * 
     */
    public Map<String,List<DatabaseTableResponse>> getDatabasesToSourceTables() {
        return this.databasesToSourceTables;
    }
    /**
     * Mapping from database name to list of target tables
     * 
     */
    public Map<String,List<DatabaseTableResponse>> getDatabasesToTargetTables() {
        return this.databasesToTargetTables;
    }
    /**
     * Mapping from database name to list of validation errors
     * 
     */
    public Map<String,List<String>> getTableValidationErrors() {
        return this.tableValidationErrors;
    }
    /**
     * Validation errors
     * 
     */
    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserTablesSqlSyncTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,List<DatabaseTableResponse>> databasesToSourceTables;
        private Map<String,List<DatabaseTableResponse>> databasesToTargetTables;
        private Map<String,List<String>> tableValidationErrors;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserTablesSqlSyncTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databasesToSourceTables = defaults.databasesToSourceTables;
    	      this.databasesToTargetTables = defaults.databasesToTargetTables;
    	      this.tableValidationErrors = defaults.tableValidationErrors;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder setDatabasesToSourceTables(Map<String,List<DatabaseTableResponse>> databasesToSourceTables) {
            this.databasesToSourceTables = Objects.requireNonNull(databasesToSourceTables);
            return this;
        }

        public Builder setDatabasesToTargetTables(Map<String,List<DatabaseTableResponse>> databasesToTargetTables) {
            this.databasesToTargetTables = Objects.requireNonNull(databasesToTargetTables);
            return this;
        }

        public Builder setTableValidationErrors(Map<String,List<String>> tableValidationErrors) {
            this.tableValidationErrors = Objects.requireNonNull(tableValidationErrors);
            return this;
        }

        public Builder setValidationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }

        public GetUserTablesSqlSyncTaskOutputResponse build() {
            return new GetUserTablesSqlSyncTaskOutputResponse(databasesToSourceTables, databasesToTargetTables, tableValidationErrors, validationErrors);
        }
    }
}
