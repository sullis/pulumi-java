// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.ClusterIAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIAMMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIAMMemberArgs Empty = new ClusterIAMMemberArgs();

    /**
     * The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    @InputImport(name="cluster", required=true)
    private final Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster;
    }

    @InputImport(name="condition")
    private final @Nullable Input<ClusterIAMMemberConditionArgs> condition;

    public Input<ClusterIAMMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="member", required=true)
    private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    /**
     * The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public ClusterIAMMemberArgs(
        Input<String> cluster,
        @Nullable Input<ClusterIAMMemberConditionArgs> condition,
        Input<String> member,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> role) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ClusterIAMMemberArgs() {
        this.cluster = Input.empty();
        this.condition = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cluster;
        private @Nullable Input<ClusterIAMMemberConditionArgs> condition;
        private Input<String> member;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIAMMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder setCluster(Input<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public Builder setCluster(String cluster) {
            this.cluster = Input.of(Objects.requireNonNull(cluster));
            return this;
        }

        public Builder setCondition(@Nullable Input<ClusterIAMMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable ClusterIAMMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public ClusterIAMMemberArgs build() {
            return new ClusterIAMMemberArgs(cluster, condition, member, project, region, role);
        }
    }
}
