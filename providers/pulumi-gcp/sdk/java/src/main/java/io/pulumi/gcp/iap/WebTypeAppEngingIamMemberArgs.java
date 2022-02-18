// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.iap.inputs.WebTypeAppEngingIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebTypeAppEngingIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebTypeAppEngingIamMemberArgs Empty = new WebTypeAppEngingIamMemberArgs();

    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="appId", required=true)
    private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<WebTypeAppEngingIamMemberConditionArgs> condition;

    public Input<WebTypeAppEngingIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="member", required=true)
    private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
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
     * `gcp.iap.WebTypeAppEngingIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public WebTypeAppEngingIamMemberArgs(
        Input<String> appId,
        @Nullable Input<WebTypeAppEngingIamMemberConditionArgs> condition,
        Input<String> member,
        @Nullable Input<String> project,
        Input<String> role) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private WebTypeAppEngingIamMemberArgs() {
        this.appId = Input.empty();
        this.condition = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTypeAppEngingIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private @Nullable Input<WebTypeAppEngingIamMemberConditionArgs> condition;
        private Input<String> member;
        private @Nullable Input<String> project;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTypeAppEngingIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setAppId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder setCondition(@Nullable Input<WebTypeAppEngingIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable WebTypeAppEngingIamMemberConditionArgs condition) {
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

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public WebTypeAppEngingIamMemberArgs build() {
            return new WebTypeAppEngingIamMemberArgs(appId, condition, member, project, role);
        }
    }
}
