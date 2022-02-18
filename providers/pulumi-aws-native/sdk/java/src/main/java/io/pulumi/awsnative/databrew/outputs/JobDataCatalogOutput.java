// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.JobDatabaseTableOutputOptions;
import io.pulumi.awsnative.databrew.outputs.JobS3TableOutputOptions;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobDataCatalogOutput {
    private final @Nullable String catalogId;
    private final String databaseName;
    private final @Nullable JobDatabaseTableOutputOptions databaseOptions;
    private final @Nullable Boolean overwrite;
    private final @Nullable JobS3TableOutputOptions s3Options;
    private final String tableName;

    @OutputCustomType.Constructor({"catalogId","databaseName","databaseOptions","overwrite","s3Options","tableName"})
    private JobDataCatalogOutput(
        @Nullable String catalogId,
        String databaseName,
        @Nullable JobDatabaseTableOutputOptions databaseOptions,
        @Nullable Boolean overwrite,
        @Nullable JobS3TableOutputOptions s3Options,
        String tableName) {
        this.catalogId = catalogId;
        this.databaseName = Objects.requireNonNull(databaseName);
        this.databaseOptions = databaseOptions;
        this.overwrite = overwrite;
        this.s3Options = s3Options;
        this.tableName = Objects.requireNonNull(tableName);
    }

    public Optional<String> getCatalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    public String getDatabaseName() {
        return this.databaseName;
    }
    public Optional<JobDatabaseTableOutputOptions> getDatabaseOptions() {
        return Optional.ofNullable(this.databaseOptions);
    }
    public Optional<Boolean> getOverwrite() {
        return Optional.ofNullable(this.overwrite);
    }
    public Optional<JobS3TableOutputOptions> getS3Options() {
        return Optional.ofNullable(this.s3Options);
    }
    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDataCatalogOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private String databaseName;
        private @Nullable JobDatabaseTableOutputOptions databaseOptions;
        private @Nullable Boolean overwrite;
        private @Nullable JobS3TableOutputOptions s3Options;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDataCatalogOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.databaseOptions = defaults.databaseOptions;
    	      this.overwrite = defaults.overwrite;
    	      this.s3Options = defaults.s3Options;
    	      this.tableName = defaults.tableName;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseOptions(@Nullable JobDatabaseTableOutputOptions databaseOptions) {
            this.databaseOptions = databaseOptions;
            return this;
        }

        public Builder setOverwrite(@Nullable Boolean overwrite) {
            this.overwrite = overwrite;
            return this;
        }

        public Builder setS3Options(@Nullable JobS3TableOutputOptions s3Options) {
            this.s3Options = s3Options;
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public JobDataCatalogOutput build() {
            return new JobDataCatalogOutput(catalogId, databaseName, databaseOptions, overwrite, s3Options, tableName);
        }
    }
}
