// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Email notification of an autoscale event.
 * 
 */
public final class EmailNotificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final EmailNotificationResponse Empty = new EmailNotificationResponse();

    /**
     * the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
     * 
     */
    @Import(name="customEmails")
    private @Nullable List<String> customEmails;

    /**
     * @return the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
     * 
     */
    public Optional<List<String>> customEmails() {
        return Optional.ofNullable(this.customEmails);
    }

    /**
     * a value indicating whether to send email to subscription administrator.
     * 
     */
    @Import(name="sendToSubscriptionAdministrator")
    private @Nullable Boolean sendToSubscriptionAdministrator;

    /**
     * @return a value indicating whether to send email to subscription administrator.
     * 
     */
    public Optional<Boolean> sendToSubscriptionAdministrator() {
        return Optional.ofNullable(this.sendToSubscriptionAdministrator);
    }

    /**
     * a value indicating whether to send email to subscription co-administrators.
     * 
     */
    @Import(name="sendToSubscriptionCoAdministrators")
    private @Nullable Boolean sendToSubscriptionCoAdministrators;

    /**
     * @return a value indicating whether to send email to subscription co-administrators.
     * 
     */
    public Optional<Boolean> sendToSubscriptionCoAdministrators() {
        return Optional.ofNullable(this.sendToSubscriptionCoAdministrators);
    }

    private EmailNotificationResponse() {}

    private EmailNotificationResponse(EmailNotificationResponse $) {
        this.customEmails = $.customEmails;
        this.sendToSubscriptionAdministrator = $.sendToSubscriptionAdministrator;
        this.sendToSubscriptionCoAdministrators = $.sendToSubscriptionCoAdministrators;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailNotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailNotificationResponse $;

        public Builder() {
            $ = new EmailNotificationResponse();
        }

        public Builder(EmailNotificationResponse defaults) {
            $ = new EmailNotificationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param customEmails the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder customEmails(@Nullable List<String> customEmails) {
            $.customEmails = customEmails;
            return this;
        }

        /**
         * @param customEmails the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder customEmails(String... customEmails) {
            return customEmails(List.of(customEmails));
        }

        /**
         * @param sendToSubscriptionAdministrator a value indicating whether to send email to subscription administrator.
         * 
         * @return builder
         * 
         */
        public Builder sendToSubscriptionAdministrator(@Nullable Boolean sendToSubscriptionAdministrator) {
            $.sendToSubscriptionAdministrator = sendToSubscriptionAdministrator;
            return this;
        }

        /**
         * @param sendToSubscriptionCoAdministrators a value indicating whether to send email to subscription co-administrators.
         * 
         * @return builder
         * 
         */
        public Builder sendToSubscriptionCoAdministrators(@Nullable Boolean sendToSubscriptionCoAdministrators) {
            $.sendToSubscriptionCoAdministrators = sendToSubscriptionCoAdministrators;
            return this;
        }

        public EmailNotificationResponse build() {
            $.sendToSubscriptionAdministrator = Codegen.booleanProp("sendToSubscriptionAdministrator").arg($.sendToSubscriptionAdministrator).def(false).getNullable();
            $.sendToSubscriptionCoAdministrators = Codegen.booleanProp("sendToSubscriptionCoAdministrators").arg($.sendToSubscriptionCoAdministrators).def(false).getNullable();
            return $;
        }
    }

}
