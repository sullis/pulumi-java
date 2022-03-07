// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.DatasetS3Location;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetDatabaseInputDefinition {
    /**
     * Database table name
     * 
     */
    private final @Nullable String databaseTableName;
    /**
     * Glue connection name
     * 
     */
    private final String glueConnectionName;
    /**
     * Custom SQL to run against the provided AWS Glue connection. This SQL will be used as the input for DataBrew projects and jobs.
     * 
     */
    private final @Nullable String queryString;
    private final @Nullable DatasetS3Location tempDirectory;

    @OutputCustomType.Constructor({"databaseTableName","glueConnectionName","queryString","tempDirectory"})
    private DatasetDatabaseInputDefinition(
        @Nullable String databaseTableName,
        String glueConnectionName,
        @Nullable String queryString,
        @Nullable DatasetS3Location tempDirectory) {
        this.databaseTableName = databaseTableName;
        this.glueConnectionName = Objects.requireNonNull(glueConnectionName);
        this.queryString = queryString;
        this.tempDirectory = tempDirectory;
    }

    /**
     * Database table name
     * 
    */
    public Optional<String> getDatabaseTableName() {
        return Optional.ofNullable(this.databaseTableName);
    }
    /**
     * Glue connection name
     * 
    */
    public String getGlueConnectionName() {
        return this.glueConnectionName;
    }
    /**
     * Custom SQL to run against the provided AWS Glue connection. This SQL will be used as the input for DataBrew projects and jobs.
     * 
    */
    public Optional<String> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    public Optional<DatasetS3Location> getTempDirectory() {
        return Optional.ofNullable(this.tempDirectory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDatabaseInputDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseTableName;
        private String glueConnectionName;
        private @Nullable String queryString;
        private @Nullable DatasetS3Location tempDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDatabaseInputDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseTableName = defaults.databaseTableName;
    	      this.glueConnectionName = defaults.glueConnectionName;
    	      this.queryString = defaults.queryString;
    	      this.tempDirectory = defaults.tempDirectory;
        }

        public Builder setDatabaseTableName(@Nullable String databaseTableName) {
            this.databaseTableName = databaseTableName;
            return this;
        }

        public Builder setGlueConnectionName(String glueConnectionName) {
            this.glueConnectionName = Objects.requireNonNull(glueConnectionName);
            return this;
        }

        public Builder setQueryString(@Nullable String queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setTempDirectory(@Nullable DatasetS3Location tempDirectory) {
            this.tempDirectory = tempDirectory;
            return this;
        }
        public DatasetDatabaseInputDefinition build() {
            return new DatasetDatabaseInputDefinition(databaseTableName, glueConnectionName, queryString, tempDirectory);
        }
    }
}