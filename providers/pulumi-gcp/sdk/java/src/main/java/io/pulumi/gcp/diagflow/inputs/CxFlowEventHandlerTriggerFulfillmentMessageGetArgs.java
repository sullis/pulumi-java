// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageTextGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxFlowEventHandlerTriggerFulfillmentMessageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxFlowEventHandlerTriggerFulfillmentMessageGetArgs Empty = new CxFlowEventHandlerTriggerFulfillmentMessageGetArgs();

    /**
     * A collection of text responses.
     * 
     */
    @InputImport(name="text")
    private final @Nullable Input<CxFlowEventHandlerTriggerFulfillmentMessageTextGetArgs> text;

    public Input<CxFlowEventHandlerTriggerFulfillmentMessageTextGetArgs> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public CxFlowEventHandlerTriggerFulfillmentMessageGetArgs(@Nullable Input<CxFlowEventHandlerTriggerFulfillmentMessageTextGetArgs> text) {
        this.text = text;
    }

    private CxFlowEventHandlerTriggerFulfillmentMessageGetArgs() {
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowEventHandlerTriggerFulfillmentMessageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CxFlowEventHandlerTriggerFulfillmentMessageTextGetArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowEventHandlerTriggerFulfillmentMessageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(@Nullable Input<CxFlowEventHandlerTriggerFulfillmentMessageTextGetArgs> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable CxFlowEventHandlerTriggerFulfillmentMessageTextGetArgs text) {
            this.text = Input.ofNullable(text);
            return this;
        }

        public CxFlowEventHandlerTriggerFulfillmentMessageGetArgs build() {
            return new CxFlowEventHandlerTriggerFulfillmentMessageGetArgs(text);
        }
    }
}
