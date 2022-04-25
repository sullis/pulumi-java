// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
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
public final class RuleEmailActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleEmailActionArgs Empty = new RuleEmailActionArgs();

    /**
     * the list of administrator&#39;s custom email addresses to notify of the activation of the alert.
     * 
     */
    @Import(name="customEmails")
    private @Nullable Output<List<String>> customEmails;

    /**
     * @return the list of administrator&#39;s custom email addresses to notify of the activation of the alert.
     * 
     */
    public Optional<Output<List<String>>> customEmails() {
        return Optional.ofNullable(this.customEmails);
    }

    /**
     * specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.RuleEmailAction&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.RuleEmailAction&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * Whether the administrators (service and co-administrators) of the service should be notified when the alert is activated.
     * 
     */
    @Import(name="sendToServiceOwners")
    private @Nullable Output<Boolean> sendToServiceOwners;

    /**
     * @return Whether the administrators (service and co-administrators) of the service should be notified when the alert is activated.
     * 
     */
    public Optional<Output<Boolean>> sendToServiceOwners() {
        return Optional.ofNullable(this.sendToServiceOwners);
    }

    private RuleEmailActionArgs() {}

    private RuleEmailActionArgs(RuleEmailActionArgs $) {
        this.customEmails = $.customEmails;
        this.odataType = $.odataType;
        this.sendToServiceOwners = $.sendToServiceOwners;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleEmailActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleEmailActionArgs $;

        public Builder() {
            $ = new RuleEmailActionArgs();
        }

        public Builder(RuleEmailActionArgs defaults) {
            $ = new RuleEmailActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customEmails the list of administrator&#39;s custom email addresses to notify of the activation of the alert.
         * 
         * @return builder
         * 
         */
        public Builder customEmails(@Nullable Output<List<String>> customEmails) {
            $.customEmails = customEmails;
            return this;
        }

        /**
         * @param customEmails the list of administrator&#39;s custom email addresses to notify of the activation of the alert.
         * 
         * @return builder
         * 
         */
        public Builder customEmails(List<String> customEmails) {
            return customEmails(Output.of(customEmails));
        }

        /**
         * @param customEmails the list of administrator&#39;s custom email addresses to notify of the activation of the alert.
         * 
         * @return builder
         * 
         */
        public Builder customEmails(String... customEmails) {
            return customEmails(List.of(customEmails));
        }

        /**
         * @param odataType specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
         * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.RuleEmailAction&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
         * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.RuleEmailAction&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param sendToServiceOwners Whether the administrators (service and co-administrators) of the service should be notified when the alert is activated.
         * 
         * @return builder
         * 
         */
        public Builder sendToServiceOwners(@Nullable Output<Boolean> sendToServiceOwners) {
            $.sendToServiceOwners = sendToServiceOwners;
            return this;
        }

        /**
         * @param sendToServiceOwners Whether the administrators (service and co-administrators) of the service should be notified when the alert is activated.
         * 
         * @return builder
         * 
         */
        public Builder sendToServiceOwners(Boolean sendToServiceOwners) {
            return sendToServiceOwners(Output.of(sendToServiceOwners));
        }

        public RuleEmailActionArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
