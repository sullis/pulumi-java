// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.iap.inputs.TunnelInstanceIAMBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TunnelInstanceIAMBindingState extends io.pulumi.resources.ResourceArgs {

    public static final TunnelInstanceIAMBindingState Empty = new TunnelInstanceIAMBindingState();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<TunnelInstanceIAMBindingConditionGetArgs> condition;

    public Input<TunnelInstanceIAMBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="instance")
    private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.iap.TunnelInstanceIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public TunnelInstanceIAMBindingState(
        @Nullable Input<TunnelInstanceIAMBindingConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> instance,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> project,
        @Nullable Input<String> role,
        @Nullable Input<String> zone) {
        this.condition = condition;
        this.etag = etag;
        this.instance = instance;
        this.members = members;
        this.project = project;
        this.role = role;
        this.zone = zone;
    }

    private TunnelInstanceIAMBindingState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.instance = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelInstanceIAMBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TunnelInstanceIAMBindingConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> instance;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> project;
        private @Nullable Input<String> role;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(TunnelInstanceIAMBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.instance = defaults.instance;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.zone = defaults.zone;
        }

        public Builder setCondition(@Nullable Input<TunnelInstanceIAMBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable TunnelInstanceIAMBindingConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
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

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public TunnelInstanceIAMBindingState build() {
            return new TunnelInstanceIAMBindingState(condition, etag, instance, members, project, role, zone);
        }
    }
}
