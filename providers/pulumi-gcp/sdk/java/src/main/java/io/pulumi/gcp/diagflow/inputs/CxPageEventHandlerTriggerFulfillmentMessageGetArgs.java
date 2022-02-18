// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageTextGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageEventHandlerTriggerFulfillmentMessageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageEventHandlerTriggerFulfillmentMessageGetArgs Empty = new CxPageEventHandlerTriggerFulfillmentMessageGetArgs();

    /**
     * A collection of text responses.
     * 
     */
    @InputImport(name="text")
    private final @Nullable Input<CxPageEventHandlerTriggerFulfillmentMessageTextGetArgs> text;

    public Input<CxPageEventHandlerTriggerFulfillmentMessageTextGetArgs> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public CxPageEventHandlerTriggerFulfillmentMessageGetArgs(@Nullable Input<CxPageEventHandlerTriggerFulfillmentMessageTextGetArgs> text) {
        this.text = text;
    }

    private CxPageEventHandlerTriggerFulfillmentMessageGetArgs() {
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageEventHandlerTriggerFulfillmentMessageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CxPageEventHandlerTriggerFulfillmentMessageTextGetArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageEventHandlerTriggerFulfillmentMessageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(@Nullable Input<CxPageEventHandlerTriggerFulfillmentMessageTextGetArgs> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable CxPageEventHandlerTriggerFulfillmentMessageTextGetArgs text) {
            this.text = Input.ofNullable(text);
            return this;
        }

        public CxPageEventHandlerTriggerFulfillmentMessageGetArgs build() {
            return new CxPageEventHandlerTriggerFulfillmentMessageGetArgs(text);
        }
    }
}
