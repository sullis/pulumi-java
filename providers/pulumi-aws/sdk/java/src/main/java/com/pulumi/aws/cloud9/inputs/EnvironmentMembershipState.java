// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloud9.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentMembershipState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentMembershipState Empty = new EnvironmentMembershipState();

    /**
     * The ID of the environment that contains the environment member you want to add.
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    /**
     * @return The ID of the environment that contains the environment member you want to add.
     * 
     */
    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<String> permissions;

    /**
     * @return The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
     * 
     */
    public Optional<Output<String>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * The Amazon Resource Name (ARN) of the environment member you want to add.
     * 
     */
    @Import(name="userArn")
    private @Nullable Output<String> userArn;

    /**
     * @return The Amazon Resource Name (ARN) of the environment member you want to add.
     * 
     */
    public Optional<Output<String>> userArn() {
        return Optional.ofNullable(this.userArn);
    }

    /**
     * he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private EnvironmentMembershipState() {}

    private EnvironmentMembershipState(EnvironmentMembershipState $) {
        this.environmentId = $.environmentId;
        this.permissions = $.permissions;
        this.userArn = $.userArn;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentMembershipState $;

        public Builder() {
            $ = new EnvironmentMembershipState();
        }

        public Builder(EnvironmentMembershipState defaults) {
            $ = new EnvironmentMembershipState(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentId The ID of the environment that contains the environment member you want to add.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId The ID of the environment that contains the environment member you want to add.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param permissions The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param userArn The Amazon Resource Name (ARN) of the environment member you want to add.
         * 
         * @return builder
         * 
         */
        public Builder userArn(@Nullable Output<String> userArn) {
            $.userArn = userArn;
            return this;
        }

        /**
         * @param userArn The Amazon Resource Name (ARN) of the environment member you want to add.
         * 
         * @return builder
         * 
         */
        public Builder userArn(String userArn) {
            return userArn(Output.of(userArn));
        }

        /**
         * @param userId he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public EnvironmentMembershipState build() {
            return $;
        }
    }

}
