// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceBackupIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceBackupIamPolicyArgs Empty = new GetInstanceBackupIamPolicyArgs();

    @InputImport(name="backupId", required=true)
      private final String backupId;

    public String getBackupId() {
        return this.backupId;
    }

    @InputImport(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetInstanceBackupIamPolicyArgs(
        String backupId,
        String instanceId,
        @Nullable String project) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.project = project;
    }

    private GetInstanceBackupIamPolicyArgs() {
        this.backupId = null;
        this.instanceId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceBackupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupId;
        private String instanceId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceBackupIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder setBackupId(String backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetInstanceBackupIamPolicyArgs build() {
            return new GetInstanceBackupIamPolicyArgs(backupId, instanceId, project);
        }
    }
}