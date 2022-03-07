// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzNsActionGroupResponse {
    /**
     * Azure Action Group reference.
     * 
     */
    private final @Nullable List<String> actionGroup;
    /**
     * Custom payload to be sent for all webhook URI in Azure action group
     * 
     */
    private final @Nullable String customWebhookPayload;
    /**
     * Custom subject override for all email ids in Azure action group
     * 
     */
    private final @Nullable String emailSubject;

    @OutputCustomType.Constructor({"actionGroup","customWebhookPayload","emailSubject"})
    private AzNsActionGroupResponse(
        @Nullable List<String> actionGroup,
        @Nullable String customWebhookPayload,
        @Nullable String emailSubject) {
        this.actionGroup = actionGroup;
        this.customWebhookPayload = customWebhookPayload;
        this.emailSubject = emailSubject;
    }

    /**
     * Azure Action Group reference.
     * 
    */
    public List<String> getActionGroup() {
        return this.actionGroup == null ? List.of() : this.actionGroup;
    }
    /**
     * Custom payload to be sent for all webhook URI in Azure action group
     * 
    */
    public Optional<String> getCustomWebhookPayload() {
        return Optional.ofNullable(this.customWebhookPayload);
    }
    /**
     * Custom subject override for all email ids in Azure action group
     * 
    */
    public Optional<String> getEmailSubject() {
        return Optional.ofNullable(this.emailSubject);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzNsActionGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> actionGroup;
        private @Nullable String customWebhookPayload;
        private @Nullable String emailSubject;

        public Builder() {
    	      // Empty
        }

        public Builder(AzNsActionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroup = defaults.actionGroup;
    	      this.customWebhookPayload = defaults.customWebhookPayload;
    	      this.emailSubject = defaults.emailSubject;
        }

        public Builder setActionGroup(@Nullable List<String> actionGroup) {
            this.actionGroup = actionGroup;
            return this;
        }

        public Builder setCustomWebhookPayload(@Nullable String customWebhookPayload) {
            this.customWebhookPayload = customWebhookPayload;
            return this;
        }

        public Builder setEmailSubject(@Nullable String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public AzNsActionGroupResponse build() {
            return new AzNsActionGroupResponse(actionGroup, customWebhookPayload, emailSubject);
        }
    }
}