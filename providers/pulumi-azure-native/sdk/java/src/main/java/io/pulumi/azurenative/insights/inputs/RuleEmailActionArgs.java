// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the action to send email when the rule condition is evaluated. The discriminator is always RuleEmailAction in this case.
 * 
 */
public final class RuleEmailActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleEmailActionArgs Empty = new RuleEmailActionArgs();

    /**
     * the list of administrator's custom email addresses to notify of the activation of the alert.
     * 
     */
    @InputImport(name="customEmails")
      private final @Nullable Input<List<String>> customEmails;

    public Input<List<String>> getCustomEmails() {
        return this.customEmails == null ? Input.empty() : this.customEmails;
    }

    /**
     * specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleEmailAction'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Whether the administrators (service and co-administrators) of the service should be notified when the alert is activated.
     * 
     */
    @InputImport(name="sendToServiceOwners")
      private final @Nullable Input<Boolean> sendToServiceOwners;

    public Input<Boolean> getSendToServiceOwners() {
        return this.sendToServiceOwners == null ? Input.empty() : this.sendToServiceOwners;
    }

    public RuleEmailActionArgs(
        @Nullable Input<List<String>> customEmails,
        Input<String> odataType,
        @Nullable Input<Boolean> sendToServiceOwners) {
        this.customEmails = customEmails;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.sendToServiceOwners = sendToServiceOwners;
    }

    private RuleEmailActionArgs() {
        this.customEmails = Input.empty();
        this.odataType = Input.empty();
        this.sendToServiceOwners = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleEmailActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> customEmails;
        private Input<String> odataType;
        private @Nullable Input<Boolean> sendToServiceOwners;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleEmailActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEmails = defaults.customEmails;
    	      this.odataType = defaults.odataType;
    	      this.sendToServiceOwners = defaults.sendToServiceOwners;
        }

        public Builder setCustomEmails(@Nullable Input<List<String>> customEmails) {
            this.customEmails = customEmails;
            return this;
        }

        public Builder setCustomEmails(@Nullable List<String> customEmails) {
            this.customEmails = Input.ofNullable(customEmails);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setSendToServiceOwners(@Nullable Input<Boolean> sendToServiceOwners) {
            this.sendToServiceOwners = sendToServiceOwners;
            return this;
        }

        public Builder setSendToServiceOwners(@Nullable Boolean sendToServiceOwners) {
            this.sendToServiceOwners = Input.ofNullable(sendToServiceOwners);
            return this;
        }
        public RuleEmailActionArgs build() {
            return new RuleEmailActionArgs(customEmails, odataType, sendToServiceOwners);
        }
    }
}