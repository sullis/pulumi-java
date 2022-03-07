// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
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
public final class EmailNotificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final EmailNotificationResponse Empty = new EmailNotificationResponse();

    /**
     * the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
     * 
     */
    @InputImport(name="customEmails")
      private final @Nullable List<String> customEmails;

    public List<String> getCustomEmails() {
        return this.customEmails == null ? List.of() : this.customEmails;
    }

    /**
     * a value indicating whether to send email to subscription administrator.
     * 
     */
    @InputImport(name="sendToSubscriptionAdministrator")
      private final @Nullable Boolean sendToSubscriptionAdministrator;

    public Optional<Boolean> getSendToSubscriptionAdministrator() {
        return this.sendToSubscriptionAdministrator == null ? Optional.empty() : Optional.ofNullable(this.sendToSubscriptionAdministrator);
    }

    /**
     * a value indicating whether to send email to subscription co-administrators.
     * 
     */
    @InputImport(name="sendToSubscriptionCoAdministrators")
      private final @Nullable Boolean sendToSubscriptionCoAdministrators;

    public Optional<Boolean> getSendToSubscriptionCoAdministrators() {
        return this.sendToSubscriptionCoAdministrators == null ? Optional.empty() : Optional.ofNullable(this.sendToSubscriptionCoAdministrators);
    }

    public EmailNotificationResponse(
        @Nullable List<String> customEmails,
        @Nullable Boolean sendToSubscriptionAdministrator,
        @Nullable Boolean sendToSubscriptionCoAdministrators) {
        this.customEmails = customEmails;
        this.sendToSubscriptionAdministrator = sendToSubscriptionAdministrator == null ? false : sendToSubscriptionAdministrator;
        this.sendToSubscriptionCoAdministrators = sendToSubscriptionCoAdministrators == null ? false : sendToSubscriptionCoAdministrators;
    }

    private EmailNotificationResponse() {
        this.customEmails = List.of();
        this.sendToSubscriptionAdministrator = null;
        this.sendToSubscriptionCoAdministrators = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailNotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customEmails;
        private @Nullable Boolean sendToSubscriptionAdministrator;
        private @Nullable Boolean sendToSubscriptionCoAdministrators;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailNotificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEmails = defaults.customEmails;
    	      this.sendToSubscriptionAdministrator = defaults.sendToSubscriptionAdministrator;
    	      this.sendToSubscriptionCoAdministrators = defaults.sendToSubscriptionCoAdministrators;
        }

        public Builder setCustomEmails(@Nullable List<String> customEmails) {
            this.customEmails = customEmails;
            return this;
        }

        public Builder setSendToSubscriptionAdministrator(@Nullable Boolean sendToSubscriptionAdministrator) {
            this.sendToSubscriptionAdministrator = sendToSubscriptionAdministrator;
            return this;
        }

        public Builder setSendToSubscriptionCoAdministrators(@Nullable Boolean sendToSubscriptionCoAdministrators) {
            this.sendToSubscriptionCoAdministrators = sendToSubscriptionCoAdministrators;
            return this;
        }
        public EmailNotificationResponse build() {
            return new EmailNotificationResponse(customEmails, sendToSubscriptionAdministrator, sendToSubscriptionCoAdministrators);
        }
    }
}