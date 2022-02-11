// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetS3Location;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetDatabaseInputDefinition extends io.pulumi.resources.InvokeArgs {

    public static final DatasetDatabaseInputDefinition Empty = new DatasetDatabaseInputDefinition();

    @InputImport(name="databaseTableName")
    private final @Nullable String databaseTableName;

    public Optional<String> getDatabaseTableName() {
        return this.databaseTableName == null ? Optional.empty() : Optional.ofNullable(this.databaseTableName);
    }

    @InputImport(name="glueConnectionName", required=true)
    private final String glueConnectionName;

    public String getGlueConnectionName() {
        return this.glueConnectionName;
    }

    @InputImport(name="queryString")
    private final @Nullable String queryString;

    public Optional<String> getQueryString() {
        return this.queryString == null ? Optional.empty() : Optional.ofNullable(this.queryString);
    }

    @InputImport(name="tempDirectory")
    private final @Nullable DatasetS3Location tempDirectory;

    public Optional<DatasetS3Location> getTempDirectory() {
        return this.tempDirectory == null ? Optional.empty() : Optional.ofNullable(this.tempDirectory);
    }

    public DatasetDatabaseInputDefinition(
        @Nullable String databaseTableName,
        String glueConnectionName,
        @Nullable String queryString,
        @Nullable DatasetS3Location tempDirectory) {
        this.databaseTableName = databaseTableName;
        this.glueConnectionName = Objects.requireNonNull(glueConnectionName, "expected parameter 'glueConnectionName' to be non-null");
        this.queryString = queryString;
        this.tempDirectory = tempDirectory;
    }

    private DatasetDatabaseInputDefinition() {
        this.databaseTableName = null;
        this.glueConnectionName = null;
        this.queryString = null;
        this.tempDirectory = null;
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
