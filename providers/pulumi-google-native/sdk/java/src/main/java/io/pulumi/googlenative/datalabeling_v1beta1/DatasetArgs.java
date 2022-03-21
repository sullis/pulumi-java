// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    /**
     * Optional. User-provided description of the annotation specification set. The description can be up to 10000 characters long.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The display name of the dataset. Maximum of 64 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Last time that the Dataset is migrated to AI Platform V2. If any of the AnnotatedDataset is migrated, the last_migration_time in Dataset is also updated.
     * 
     */
    @Import(name="lastMigrateTime")
      private final @Nullable Output<String> lastMigrateTime;

    public Output<String> getLastMigrateTime() {
        return this.lastMigrateTime == null ? Output.empty() : this.lastMigrateTime;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public DatasetArgs(
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<String> lastMigrateTime,
        @Nullable Output<String> project) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.lastMigrateTime = lastMigrateTime;
        this.project = project;
    }

    private DatasetArgs() {
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.lastMigrateTime = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<String> lastMigrateTime;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.lastMigrateTime = defaults.lastMigrateTime;
    	      this.project = defaults.project;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder lastMigrateTime(@Nullable Output<String> lastMigrateTime) {
            this.lastMigrateTime = lastMigrateTime;
            return this;
        }
        public Builder lastMigrateTime(@Nullable String lastMigrateTime) {
            this.lastMigrateTime = Output.ofNullable(lastMigrateTime);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public DatasetArgs build() {
            return new DatasetArgs(description, displayName, lastMigrateTime, project);
        }
    }
}
