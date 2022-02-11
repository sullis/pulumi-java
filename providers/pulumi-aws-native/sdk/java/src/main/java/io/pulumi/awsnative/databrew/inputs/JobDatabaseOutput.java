// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.enums.JobDatabaseOutputDatabaseOutputMode;
import io.pulumi.awsnative.databrew.inputs.JobDatabaseTableOutputOptions;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobDatabaseOutput extends io.pulumi.resources.InvokeArgs {

    public static final JobDatabaseOutput Empty = new JobDatabaseOutput();

    @InputImport(name="databaseOptions", required=true)
    private final JobDatabaseTableOutputOptions databaseOptions;

    public JobDatabaseTableOutputOptions getDatabaseOptions() {
        return this.databaseOptions;
    }

    @InputImport(name="databaseOutputMode")
    private final @Nullable JobDatabaseOutputDatabaseOutputMode databaseOutputMode;

    public Optional<JobDatabaseOutputDatabaseOutputMode> getDatabaseOutputMode() {
        return this.databaseOutputMode == null ? Optional.empty() : Optional.ofNullable(this.databaseOutputMode);
    }

    @InputImport(name="glueConnectionName", required=true)
    private final String glueConnectionName;

    public String getGlueConnectionName() {
        return this.glueConnectionName;
    }

    public JobDatabaseOutput(
        JobDatabaseTableOutputOptions databaseOptions,
        @Nullable JobDatabaseOutputDatabaseOutputMode databaseOutputMode,
        String glueConnectionName) {
        this.databaseOptions = Objects.requireNonNull(databaseOptions, "expected parameter 'databaseOptions' to be non-null");
        this.databaseOutputMode = databaseOutputMode;
        this.glueConnectionName = Objects.requireNonNull(glueConnectionName, "expected parameter 'glueConnectionName' to be non-null");
    }

    private JobDatabaseOutput() {
        this.databaseOptions = null;
        this.databaseOutputMode = null;
        this.glueConnectionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDatabaseOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobDatabaseTableOutputOptions databaseOptions;
        private @Nullable JobDatabaseOutputDatabaseOutputMode databaseOutputMode;
        private String glueConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDatabaseOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseOptions = defaults.databaseOptions;
    	      this.databaseOutputMode = defaults.databaseOutputMode;
    	      this.glueConnectionName = defaults.glueConnectionName;
        }

        public Builder setDatabaseOptions(JobDatabaseTableOutputOptions databaseOptions) {
            this.databaseOptions = Objects.requireNonNull(databaseOptions);
            return this;
        }

        public Builder setDatabaseOutputMode(@Nullable JobDatabaseOutputDatabaseOutputMode databaseOutputMode) {
            this.databaseOutputMode = databaseOutputMode;
            return this;
        }

        public Builder setGlueConnectionName(String glueConnectionName) {
            this.glueConnectionName = Objects.requireNonNull(glueConnectionName);
            return this;
        }

        public JobDatabaseOutput build() {
            return new JobDatabaseOutput(databaseOptions, databaseOutputMode, glueConnectionName);
        }
    }
}
