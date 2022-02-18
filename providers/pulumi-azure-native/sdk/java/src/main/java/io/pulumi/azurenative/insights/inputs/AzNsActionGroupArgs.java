// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure action group
 * 
 */
public final class AzNsActionGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzNsActionGroupArgs Empty = new AzNsActionGroupArgs();

    /**
     * Azure Action Group reference.
     * 
     */
    @InputImport(name="actionGroup")
    private final @Nullable Input<List<String>> actionGroup;

    public Input<List<String>> getActionGroup() {
        return this.actionGroup == null ? Input.empty() : this.actionGroup;
    }

    /**
     * Custom payload to be sent for all webhook URI in Azure action group
     * 
     */
    @InputImport(name="customWebhookPayload")
    private final @Nullable Input<String> customWebhookPayload;

    public Input<String> getCustomWebhookPayload() {
        return this.customWebhookPayload == null ? Input.empty() : this.customWebhookPayload;
    }

    /**
     * Custom subject override for all email ids in Azure action group
     * 
     */
    @InputImport(name="emailSubject")
    private final @Nullable Input<String> emailSubject;

    public Input<String> getEmailSubject() {
        return this.emailSubject == null ? Input.empty() : this.emailSubject;
    }

    public AzNsActionGroupArgs(
        @Nullable Input<List<String>> actionGroup,
        @Nullable Input<String> customWebhookPayload,
        @Nullable Input<String> emailSubject) {
        this.actionGroup = actionGroup;
        this.customWebhookPayload = customWebhookPayload;
        this.emailSubject = emailSubject;
    }

    private AzNsActionGroupArgs() {
        this.actionGroup = Input.empty();
        this.customWebhookPayload = Input.empty();
        this.emailSubject = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzNsActionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> actionGroup;
        private @Nullable Input<String> customWebhookPayload;
        private @Nullable Input<String> emailSubject;

        public Builder() {
    	      // Empty
        }

        public Builder(AzNsActionGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroup = defaults.actionGroup;
    	      this.customWebhookPayload = defaults.customWebhookPayload;
    	      this.emailSubject = defaults.emailSubject;
        }

        public Builder setActionGroup(@Nullable Input<List<String>> actionGroup) {
            this.actionGroup = actionGroup;
            return this;
        }

        public Builder setActionGroup(@Nullable List<String> actionGroup) {
            this.actionGroup = Input.ofNullable(actionGroup);
            return this;
        }

        public Builder setCustomWebhookPayload(@Nullable Input<String> customWebhookPayload) {
            this.customWebhookPayload = customWebhookPayload;
            return this;
        }

        public Builder setCustomWebhookPayload(@Nullable String customWebhookPayload) {
            this.customWebhookPayload = Input.ofNullable(customWebhookPayload);
            return this;
        }

        public Builder setEmailSubject(@Nullable Input<String> emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }

        public Builder setEmailSubject(@Nullable String emailSubject) {
            this.emailSubject = Input.ofNullable(emailSubject);
            return this;
        }

        public AzNsActionGroupArgs build() {
            return new AzNsActionGroupArgs(actionGroup, customWebhookPayload, emailSubject);
        }
    }
}
