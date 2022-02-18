// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the action to send email when the rule condition is evaluated. The discriminator is always RuleEmailAction in this case.
 * 
 */
public final class RuleEmailActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final RuleEmailActionResponse Empty = new RuleEmailActionResponse();

    /**
     * the list of administrator's custom email addresses to notify of the activation of the alert.
     * 
     */
    @InputImport(name="customEmails")
    private final @Nullable List<String> customEmails;

    public List<String> getCustomEmails() {
        return this.customEmails == null ? List.of() : this.customEmails;
    }

    /**
     * specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleEmailAction'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Whether the administrators (service and co-administrators) of the service should be notified when the alert is activated.
     * 
     */
    @InputImport(name="sendToServiceOwners")
    private final @Nullable Boolean sendToServiceOwners;

    public Optional<Boolean> getSendToServiceOwners() {
        return this.sendToServiceOwners == null ? Optional.empty() : Optional.ofNullable(this.sendToServiceOwners);
    }

    public RuleEmailActionResponse(
        @Nullable List<String> customEmails,
        String odataType,
        @Nullable Boolean sendToServiceOwners) {
        this.customEmails = customEmails;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.sendToServiceOwners = sendToServiceOwners;
    }

    private RuleEmailActionResponse() {
        this.customEmails = List.of();
        this.odataType = null;
        this.sendToServiceOwners = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleEmailActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customEmails;
        private String odataType;
        private @Nullable Boolean sendToServiceOwners;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleEmailActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEmails = defaults.customEmails;
    	      this.odataType = defaults.odataType;
    	      this.sendToServiceOwners = defaults.sendToServiceOwners;
        }

        public Builder setCustomEmails(@Nullable List<String> customEmails) {
            this.customEmails = customEmails;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setSendToServiceOwners(@Nullable Boolean sendToServiceOwners) {
            this.sendToServiceOwners = sendToServiceOwners;
            return this;
        }

        public RuleEmailActionResponse build() {
            return new RuleEmailActionResponse(customEmails, odataType, sendToServiceOwners);
        }
    }
}
