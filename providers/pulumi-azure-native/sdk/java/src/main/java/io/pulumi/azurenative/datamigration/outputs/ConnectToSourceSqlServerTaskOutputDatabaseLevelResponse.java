// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.DatabaseFileInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse {
    /**
     * SQL Server compatibility level of database
     * 
     */
    private final String compatibilityLevel;
    /**
     * The list of database files
     * 
     */
    private final List<DatabaseFileInfoResponse> databaseFiles;
    /**
     * State of the database
     * 
     */
    private final String databaseState;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Database name
     * 
     */
    private final String name;
    /**
     * Type of result - database level or task level
     * Expected value is 'DatabaseLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Size of the file in megabytes
     * 
     */
    private final Double sizeMB;

    @OutputCustomType.Constructor({"compatibilityLevel","databaseFiles","databaseState","id","name","resultType","sizeMB"})
    private ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse(
        String compatibilityLevel,
        List<DatabaseFileInfoResponse> databaseFiles,
        String databaseState,
        String id,
        String name,
        String resultType,
        Double sizeMB) {
        this.compatibilityLevel = Objects.requireNonNull(compatibilityLevel);
        this.databaseFiles = Objects.requireNonNull(databaseFiles);
        this.databaseState = Objects.requireNonNull(databaseState);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.resultType = Objects.requireNonNull(resultType);
        this.sizeMB = Objects.requireNonNull(sizeMB);
    }

    /**
     * SQL Server compatibility level of database
     * 
    */
    public String getCompatibilityLevel() {
        return this.compatibilityLevel;
    }
    /**
     * The list of database files
     * 
    */
    public List<DatabaseFileInfoResponse> getDatabaseFiles() {
        return this.databaseFiles;
    }
    /**
     * State of the database
     * 
    */
    public String getDatabaseState() {
        return this.databaseState;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Database name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Type of result - database level or task level
     * Expected value is 'DatabaseLevelOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }
    /**
     * Size of the file in megabytes
     * 
    */
    public Double getSizeMB() {
        return this.sizeMB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compatibilityLevel;
        private List<DatabaseFileInfoResponse> databaseFiles;
        private String databaseState;
        private String id;
        private String name;
        private String resultType;
        private Double sizeMB;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.databaseFiles = defaults.databaseFiles;
    	      this.databaseState = defaults.databaseState;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resultType = defaults.resultType;
    	      this.sizeMB = defaults.sizeMB;
        }

        public Builder setCompatibilityLevel(String compatibilityLevel) {
            this.compatibilityLevel = Objects.requireNonNull(compatibilityLevel);
            return this;
        }

        public Builder setDatabaseFiles(List<DatabaseFileInfoResponse> databaseFiles) {
            this.databaseFiles = Objects.requireNonNull(databaseFiles);
            return this;
        }

        public Builder setDatabaseState(String databaseState) {
            this.databaseState = Objects.requireNonNull(databaseState);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setSizeMB(Double sizeMB) {
            this.sizeMB = Objects.requireNonNull(sizeMB);
            return this;
        }
        public ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse build() {
            return new ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse(compatibilityLevel, databaseFiles, databaseState, id, name, resultType, sizeMB);
        }
    }
}