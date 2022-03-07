// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceRestoreBackupContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceRestoreBackupContextArgs Empty = new DatabaseInstanceRestoreBackupContextArgs();

    /**
     * The ID of the backup run to restore from.
     * 
     */
    @InputImport(name="backupRunId", required=true)
      private final Input<Integer> backupRunId;

    public Input<Integer> getBackupRunId() {
        return this.backupRunId;
    }

    /**
     * The ID of the instance that the backup was taken from. If left empty,
     * this instance's ID will be used.
     * 
     */
    @InputImport(name="instanceId")
      private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * The full project ID of the source instance.`
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DatabaseInstanceRestoreBackupContextArgs(
        Input<Integer> backupRunId,
        @Nullable Input<String> instanceId,
        @Nullable Input<String> project) {
        this.backupRunId = Objects.requireNonNull(backupRunId, "expected parameter 'backupRunId' to be non-null");
        this.instanceId = instanceId;
        this.project = project;
    }

    private DatabaseInstanceRestoreBackupContextArgs() {
        this.backupRunId = Input.empty();
        this.instanceId = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceRestoreBackupContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> backupRunId;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceRestoreBackupContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRunId = defaults.backupRunId;
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder setBackupRunId(Input<Integer> backupRunId) {
            this.backupRunId = Objects.requireNonNull(backupRunId);
            return this;
        }

        public Builder setBackupRunId(Integer backupRunId) {
            this.backupRunId = Input.of(Objects.requireNonNull(backupRunId));
            return this;
        }

        public Builder setInstanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public DatabaseInstanceRestoreBackupContextArgs build() {
            return new DatabaseInstanceRestoreBackupContextArgs(backupRunId, instanceId, project);
        }
    }
}