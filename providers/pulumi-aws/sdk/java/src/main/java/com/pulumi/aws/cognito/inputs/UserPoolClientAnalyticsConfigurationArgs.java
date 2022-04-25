// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolClientAnalyticsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolClientAnalyticsConfigurationArgs Empty = new UserPoolClientAnalyticsConfigurationArgs();

    /**
     * Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    @Import(name="applicationArn")
    private @Nullable Output<String> applicationArn;

    /**
     * @return Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    public Optional<Output<String>> applicationArn() {
        return Optional.ofNullable(this.applicationArn);
    }

    /**
     * Application ID for an Amazon Pinpoint application.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return Application ID for an Amazon Pinpoint application.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    @Import(name="userDataShared")
    private @Nullable Output<Boolean> userDataShared;

    /**
     * @return If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    public Optional<Output<Boolean>> userDataShared() {
        return Optional.ofNullable(this.userDataShared);
    }

    private UserPoolClientAnalyticsConfigurationArgs() {}

    private UserPoolClientAnalyticsConfigurationArgs(UserPoolClientAnalyticsConfigurationArgs $) {
        this.applicationArn = $.applicationArn;
        this.applicationId = $.applicationId;
        this.externalId = $.externalId;
        this.roleArn = $.roleArn;
        this.userDataShared = $.userDataShared;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolClientAnalyticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolClientAnalyticsConfigurationArgs $;

        public Builder() {
            $ = new UserPoolClientAnalyticsConfigurationArgs();
        }

        public Builder(UserPoolClientAnalyticsConfigurationArgs defaults) {
            $ = new UserPoolClientAnalyticsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationArn Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
         * 
         * @return builder
         * 
         */
        public Builder applicationArn(@Nullable Output<String> applicationArn) {
            $.applicationArn = applicationArn;
            return this;
        }

        /**
         * @param applicationArn Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
         * 
         * @return builder
         * 
         */
        public Builder applicationArn(String applicationArn) {
            return applicationArn(Output.of(applicationArn));
        }

        /**
         * @param applicationId Application ID for an Amazon Pinpoint application.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId Application ID for an Amazon Pinpoint application.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param externalId ID for the Analytics Configuration. Conflicts with `application_arn`.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId ID for the Analytics Configuration. Conflicts with `application_arn`.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param roleArn ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param userDataShared If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
         * 
         * @return builder
         * 
         */
        public Builder userDataShared(@Nullable Output<Boolean> userDataShared) {
            $.userDataShared = userDataShared;
            return this;
        }

        /**
         * @param userDataShared If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
         * 
         * @return builder
         * 
         */
        public Builder userDataShared(Boolean userDataShared) {
            return userDataShared(Output.of(userDataShared));
        }

        public UserPoolClientAnalyticsConfigurationArgs build() {
            return $;
        }
    }

}
