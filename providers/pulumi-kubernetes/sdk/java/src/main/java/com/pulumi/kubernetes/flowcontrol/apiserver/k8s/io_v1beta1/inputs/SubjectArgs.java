// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs.GroupSubjectArgs;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs.ServiceAccountSubjectArgs;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs.UserSubjectArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
 * 
 */
public final class SubjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubjectArgs Empty = new SubjectArgs();

    /**
     * `group` matches based on user group name.
     * 
     */
    @Import(name="group")
    private @Nullable Output<GroupSubjectArgs> group;

    /**
     * @return `group` matches based on user group name.
     * 
     */
    public Optional<Output<GroupSubjectArgs>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * `serviceAccount` matches ServiceAccounts.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<ServiceAccountSubjectArgs> serviceAccount;

    /**
     * @return `serviceAccount` matches ServiceAccounts.
     * 
     */
    public Optional<Output<ServiceAccountSubjectArgs>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * `user` matches based on username.
     * 
     */
    @Import(name="user")
    private @Nullable Output<UserSubjectArgs> user;

    /**
     * @return `user` matches based on username.
     * 
     */
    public Optional<Output<UserSubjectArgs>> user() {
        return Optional.ofNullable(this.user);
    }

    private SubjectArgs() {}

    private SubjectArgs(SubjectArgs $) {
        this.group = $.group;
        this.kind = $.kind;
        this.serviceAccount = $.serviceAccount;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubjectArgs $;

        public Builder() {
            $ = new SubjectArgs();
        }

        public Builder(SubjectArgs defaults) {
            $ = new SubjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group `group` matches based on user group name.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<GroupSubjectArgs> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group `group` matches based on user group name.
         * 
         * @return builder
         * 
         */
        public Builder group(GroupSubjectArgs group) {
            return group(Output.of(group));
        }

        /**
         * @param kind `kind` indicates which one of the other fields is non-empty. Required
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind `kind` indicates which one of the other fields is non-empty. Required
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param serviceAccount `serviceAccount` matches ServiceAccounts.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<ServiceAccountSubjectArgs> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount `serviceAccount` matches ServiceAccounts.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(ServiceAccountSubjectArgs serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param user `user` matches based on username.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<UserSubjectArgs> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user `user` matches based on username.
         * 
         * @return builder
         * 
         */
        public Builder user(UserSubjectArgs user) {
            return user(Output.of(user));
        }

        public SubjectArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
