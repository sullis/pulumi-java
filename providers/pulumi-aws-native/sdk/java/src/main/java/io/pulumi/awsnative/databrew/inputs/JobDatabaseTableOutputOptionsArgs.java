// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobS3LocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobDatabaseTableOutputOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobDatabaseTableOutputOptionsArgs Empty = new JobDatabaseTableOutputOptionsArgs();

    @InputImport(name="tableName", required=true)
      private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    @InputImport(name="tempDirectory")
      private final @Nullable Input<JobS3LocationArgs> tempDirectory;

    public Input<JobS3LocationArgs> getTempDirectory() {
        return this.tempDirectory == null ? Input.empty() : this.tempDirectory;
    }

    public JobDatabaseTableOutputOptionsArgs(
        Input<String> tableName,
        @Nullable Input<JobS3LocationArgs> tempDirectory) {
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.tempDirectory = tempDirectory;
    }

    private JobDatabaseTableOutputOptionsArgs() {
        this.tableName = Input.empty();
        this.tempDirectory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDatabaseTableOutputOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> tableName;
        private @Nullable Input<JobS3LocationArgs> tempDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDatabaseTableOutputOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableName = defaults.tableName;
    	      this.tempDirectory = defaults.tempDirectory;
        }

        public Builder setTableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }

        public Builder setTempDirectory(@Nullable Input<JobS3LocationArgs> tempDirectory) {
            this.tempDirectory = tempDirectory;
            return this;
        }

        public Builder setTempDirectory(@Nullable JobS3LocationArgs tempDirectory) {
            this.tempDirectory = Input.ofNullable(tempDirectory);
            return this;
        }
        public JobDatabaseTableOutputOptionsArgs build() {
            return new JobDatabaseTableOutputOptionsArgs(tableName, tempDirectory);
        }
    }
}