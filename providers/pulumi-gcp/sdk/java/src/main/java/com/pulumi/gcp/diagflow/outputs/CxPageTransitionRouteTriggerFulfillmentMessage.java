// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxPageTransitionRouteTriggerFulfillmentMessageText;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageTransitionRouteTriggerFulfillmentMessage {
    /**
     * @return A collection of text responses.
     * 
     */
    private final @Nullable CxPageTransitionRouteTriggerFulfillmentMessageText text;

    @CustomType.Constructor
    private CxPageTransitionRouteTriggerFulfillmentMessage(@CustomType.Parameter("text") @Nullable CxPageTransitionRouteTriggerFulfillmentMessageText text) {
        this.text = text;
    }

    /**
     * @return A collection of text responses.
     * 
     */
    public Optional<CxPageTransitionRouteTriggerFulfillmentMessageText> text() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteTriggerFulfillmentMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CxPageTransitionRouteTriggerFulfillmentMessageText text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteTriggerFulfillmentMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable CxPageTransitionRouteTriggerFulfillmentMessageText text) {
            this.text = text;
            return this;
        }        public CxPageTransitionRouteTriggerFulfillmentMessage build() {
            return new CxPageTransitionRouteTriggerFulfillmentMessage(text);
        }
    }
}
