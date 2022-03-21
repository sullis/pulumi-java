// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.JobIAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobIAMBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobIAMBindingArgs Empty = new JobIAMBindingArgs();

    @Import(name="condition")
      private final @Nullable Output<JobIAMBindingConditionArgs> condition;

    public Output<JobIAMBindingConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @Import(name="jobId", required=true)
      private final Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The project in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.JobIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public JobIAMBindingArgs(
        @Nullable Output<JobIAMBindingConditionArgs> condition,
        Output<String> jobId,
        Output<List<String>> members,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        Output<String> role) {
        this.condition = condition;
        this.jobId = Objects.requireNonNull(jobId, "expected parameter 'jobId' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private JobIAMBindingArgs() {
        this.condition = Output.empty();
        this.jobId = Output.empty();
        this.members = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobIAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobIAMBindingConditionArgs> condition;
        private Output<String> jobId;
        private Output<List<String>> members;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(JobIAMBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.jobId = defaults.jobId;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<JobIAMBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable JobIAMBindingConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder jobId(Output<String> jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }
        public Builder jobId(String jobId) {
            this.jobId = Output.of(Objects.requireNonNull(jobId));
            return this;
        }
        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public JobIAMBindingArgs build() {
            return new JobIAMBindingArgs(condition, jobId, members, project, region, role);
        }
    }
}
