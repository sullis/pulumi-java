// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppEngineVersionIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppEngineVersionIamMemberArgs Empty = new AppEngineVersionIamMemberArgs();

    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<AppEngineVersionIamMemberConditionArgs> condition;

    /**
     * @return An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AppEngineVersionIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.iap.AppEngineVersionIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.iap.AppEngineVersionIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     * Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="versionId", required=true)
    private Output<String> versionId;

    /**
     * @return Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }

    private AppEngineVersionIamMemberArgs() {}

    private AppEngineVersionIamMemberArgs(AppEngineVersionIamMemberArgs $) {
        this.appId = $.appId;
        this.condition = $.condition;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
        this.service = $.service;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppEngineVersionIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineVersionIamMemberArgs $;

        public Builder() {
            $ = new AppEngineVersionIamMemberArgs();
        }

        public Builder(AppEngineVersionIamMemberArgs defaults) {
            $ = new AppEngineVersionIamMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<AppEngineVersionIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(AppEngineVersionIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder member(Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.iap.AppEngineVersionIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.iap.AppEngineVersionIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param service Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param versionId Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder versionId(Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public AppEngineVersionIamMemberArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            return $;
        }
    }

}
