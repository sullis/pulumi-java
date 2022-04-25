// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxPageTransitionRouteTriggerFulfillmentMessage;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageTransitionRouteTriggerFulfillment {
    /**
     * @return The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CxPageTransitionRouteTriggerFulfillmentMessage> messages;
    /**
     * @return Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    private final @Nullable Boolean returnPartialResponses;
    /**
     * @return The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
     */
    private final @Nullable String tag;
    /**
     * @return The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
     * 
     */
    private final @Nullable String webhook;

    @CustomType.Constructor
    private CxPageTransitionRouteTriggerFulfillment(
        @CustomType.Parameter("messages") @Nullable List<CxPageTransitionRouteTriggerFulfillmentMessage> messages,
        @CustomType.Parameter("returnPartialResponses") @Nullable Boolean returnPartialResponses,
        @CustomType.Parameter("tag") @Nullable String tag,
        @CustomType.Parameter("webhook") @Nullable String webhook) {
        this.messages = messages;
        this.returnPartialResponses = returnPartialResponses;
        this.tag = tag;
        this.webhook = webhook;
    }

    /**
     * @return The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
     */
    public List<CxPageTransitionRouteTriggerFulfillmentMessage> messages() {
        return this.messages == null ? List.of() : this.messages;
    }
    /**
     * @return Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    public Optional<Boolean> returnPartialResponses() {
        return Optional.ofNullable(this.returnPartialResponses);
    }
    /**
     * @return The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * @return The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
     * 
     */
    public Optional<String> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteTriggerFulfillment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CxPageTransitionRouteTriggerFulfillmentMessage> messages;
        private @Nullable Boolean returnPartialResponses;
        private @Nullable String tag;
        private @Nullable String webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteTriggerFulfillment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder messages(@Nullable List<CxPageTransitionRouteTriggerFulfillmentMessage> messages) {
            this.messages = messages;
            return this;
        }
        public Builder messages(CxPageTransitionRouteTriggerFulfillmentMessage... messages) {
            return messages(List.of(messages));
        }
        public Builder returnPartialResponses(@Nullable Boolean returnPartialResponses) {
            this.returnPartialResponses = returnPartialResponses;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public Builder webhook(@Nullable String webhook) {
            this.webhook = webhook;
            return this;
        }        public CxPageTransitionRouteTriggerFulfillment build() {
            return new CxPageTransitionRouteTriggerFulfillment(messages, returnPartialResponses, tag, webhook);
        }
    }
}
