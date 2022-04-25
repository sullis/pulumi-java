// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final MemberArgs Empty = new MemberArgs();

    /**
     * The AWS account ID for the account.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The AWS account ID for the account.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The email address for the account.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email address for the account.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
     * 
     */
    @Import(name="invitationDisableEmailNotification")
    private @Nullable Output<String> invitationDisableEmailNotification;

    /**
     * @return Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
     * 
     */
    public Optional<Output<String>> invitationDisableEmailNotification() {
        return Optional.ofNullable(this.invitationDisableEmailNotification);
    }

    /**
     * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
     * 
     */
    @Import(name="invitationMessage")
    private @Nullable Output<String> invitationMessage;

    /**
     * @return A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
     * 
     */
    public Optional<Output<String>> invitationMessage() {
        return Optional.ofNullable(this.invitationMessage);
    }

    /**
     * Send an invitation to a member
     * 
     */
    @Import(name="invite")
    private @Nullable Output<Boolean> invite;

    /**
     * @return Send an invitation to a member
     * 
     */
    public Optional<Output<Boolean>> invite() {
        return Optional.ofNullable(this.invite);
    }

    /**
     * Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private MemberArgs() {}

    private MemberArgs(MemberArgs $) {
        this.accountId = $.accountId;
        this.email = $.email;
        this.invitationDisableEmailNotification = $.invitationDisableEmailNotification;
        this.invitationMessage = $.invitationMessage;
        this.invite = $.invite;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MemberArgs $;

        public Builder() {
            $ = new MemberArgs();
        }

        public Builder(MemberArgs defaults) {
            $ = new MemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The AWS account ID for the account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The AWS account ID for the account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param email The email address for the account.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address for the account.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param invitationDisableEmailNotification Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
         * 
         * @return builder
         * 
         */
        public Builder invitationDisableEmailNotification(@Nullable Output<String> invitationDisableEmailNotification) {
            $.invitationDisableEmailNotification = invitationDisableEmailNotification;
            return this;
        }

        /**
         * @param invitationDisableEmailNotification Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
         * 
         * @return builder
         * 
         */
        public Builder invitationDisableEmailNotification(String invitationDisableEmailNotification) {
            return invitationDisableEmailNotification(Output.of(invitationDisableEmailNotification));
        }

        /**
         * @param invitationMessage A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
         * 
         * @return builder
         * 
         */
        public Builder invitationMessage(@Nullable Output<String> invitationMessage) {
            $.invitationMessage = invitationMessage;
            return this;
        }

        /**
         * @param invitationMessage A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
         * 
         * @return builder
         * 
         */
        public Builder invitationMessage(String invitationMessage) {
            return invitationMessage(Output.of(invitationMessage));
        }

        /**
         * @param invite Send an invitation to a member
         * 
         * @return builder
         * 
         */
        public Builder invite(@Nullable Output<Boolean> invite) {
            $.invite = invite;
            return this;
        }

        /**
         * @param invite Send an invitation to a member
         * 
         * @return builder
         * 
         */
        public Builder invite(Boolean invite) {
            return invite(Output.of(invite));
        }

        /**
         * @param status Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public MemberArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            return $;
        }
    }

}
