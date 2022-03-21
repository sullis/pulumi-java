// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.iap.inputs.WebBackendServiceIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebBackendServiceIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final WebBackendServiceIamBindingState Empty = new WebBackendServiceIamBindingState();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<WebBackendServiceIamBindingConditionGetArgs> condition;

    public Output<WebBackendServiceIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Output.empty() : this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.iap.WebBackendServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="webBackendService")
      private final @Nullable Output<String> webBackendService;

    public Output<String> getWebBackendService() {
        return this.webBackendService == null ? Output.empty() : this.webBackendService;
    }

    public WebBackendServiceIamBindingState(
        @Nullable Output<WebBackendServiceIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> project,
        @Nullable Output<String> role,
        @Nullable Output<String> webBackendService) {
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.project = project;
        this.role = role;
        this.webBackendService = webBackendService;
    }

    private WebBackendServiceIamBindingState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.members = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
        this.webBackendService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebBackendServiceIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebBackendServiceIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;
        private @Nullable Output<String> webBackendService;

        public Builder() {
    	      // Empty
        }

        public Builder(WebBackendServiceIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.webBackendService = defaults.webBackendService;
        }

        public Builder condition(@Nullable Output<WebBackendServiceIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable WebBackendServiceIamBindingConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Output.ofNullable(members);
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
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }
        public Builder webBackendService(@Nullable Output<String> webBackendService) {
            this.webBackendService = webBackendService;
            return this;
        }
        public Builder webBackendService(@Nullable String webBackendService) {
            this.webBackendService = Output.ofNullable(webBackendService);
            return this;
        }        public WebBackendServiceIamBindingState build() {
            return new WebBackendServiceIamBindingState(condition, etag, members, project, role, webBackendService);
        }
    }
}
