// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceDatabaseIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceDatabaseIamPolicyArgs Empty = new GetInstanceDatabaseIamPolicyArgs();

    @InputImport(name="databaseId", required=true)
      private final String databaseId;

    public String getDatabaseId() {
        return this.databaseId;
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

    public GetInstanceDatabaseIamPolicyArgs(
        String databaseId,
        String instanceId,
        @Nullable String project) {
        this.databaseId = Objects.requireNonNull(databaseId, "expected parameter 'databaseId' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.project = project;
    }

    private GetInstanceDatabaseIamPolicyArgs() {
        this.databaseId = null;
        this.instanceId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceDatabaseIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseId;
        private String instanceId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceDatabaseIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder setDatabaseId(String databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
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
        public GetInstanceDatabaseIamPolicyArgs build() {
            return new GetInstanceDatabaseIamPolicyArgs(databaseId, instanceId, project);
        }
    }
}