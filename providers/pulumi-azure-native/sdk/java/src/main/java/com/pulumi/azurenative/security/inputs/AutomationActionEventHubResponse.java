// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The target Event Hub to which event data will be exported. To learn more about Security Center continuous export capabilities, visit https://aka.ms/ASCExportLearnMore
 * 
 */
public final class AutomationActionEventHubResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutomationActionEventHubResponse Empty = new AutomationActionEventHubResponse();

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is &#39;EventHub&#39;.
     * 
     */
    @Import(name="actionType", required=true)
    private String actionType;

    /**
     * @return The type of the action that will be triggered by the Automation
     * Expected value is &#39;EventHub&#39;.
     * 
     */
    public String actionType() {
        return this.actionType;
    }

    /**
     * The target Event Hub connection string (it will not be included in any response).
     * 
     */
    @Import(name="connectionString")
    private @Nullable String connectionString;

    /**
     * @return The target Event Hub connection string (it will not be included in any response).
     * 
     */
    public Optional<String> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The target Event Hub Azure Resource ID.
     * 
     */
    @Import(name="eventHubResourceId")
    private @Nullable String eventHubResourceId;

    /**
     * @return The target Event Hub Azure Resource ID.
     * 
     */
    public Optional<String> eventHubResourceId() {
        return Optional.ofNullable(this.eventHubResourceId);
    }

    /**
     * The target Event Hub SAS policy name.
     * 
     */
    @Import(name="sasPolicyName", required=true)
    private String sasPolicyName;

    /**
     * @return The target Event Hub SAS policy name.
     * 
     */
    public String sasPolicyName() {
        return this.sasPolicyName;
    }

    private AutomationActionEventHubResponse() {}

    private AutomationActionEventHubResponse(AutomationActionEventHubResponse $) {
        this.actionType = $.actionType;
        this.connectionString = $.connectionString;
        this.eventHubResourceId = $.eventHubResourceId;
        this.sasPolicyName = $.sasPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationActionEventHubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationActionEventHubResponse $;

        public Builder() {
            $ = new AutomationActionEventHubResponse();
        }

        public Builder(AutomationActionEventHubResponse defaults) {
            $ = new AutomationActionEventHubResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType The type of the action that will be triggered by the Automation
         * Expected value is &#39;EventHub&#39;.
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param connectionString The target Event Hub connection string (it will not be included in any response).
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable String connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param eventHubResourceId The target Event Hub Azure Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder eventHubResourceId(@Nullable String eventHubResourceId) {
            $.eventHubResourceId = eventHubResourceId;
            return this;
        }

        /**
         * @param sasPolicyName The target Event Hub SAS policy name.
         * 
         * @return builder
         * 
         */
        public Builder sasPolicyName(String sasPolicyName) {
            $.sasPolicyName = sasPolicyName;
            return this;
        }

        public AutomationActionEventHubResponse build() {
            $.actionType = Codegen.stringProp("actionType").arg($.actionType).require();
            $.sasPolicyName = Objects.requireNonNull($.sasPolicyName, "expected parameter 'sasPolicyName' to be non-null");
            return $;
        }
    }

}
