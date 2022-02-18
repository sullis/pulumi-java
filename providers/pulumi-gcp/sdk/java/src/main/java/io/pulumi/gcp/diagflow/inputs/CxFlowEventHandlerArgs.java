// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxFlowEventHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxFlowEventHandlerArgs Empty = new CxFlowEventHandlerArgs();

    /**
     * The name of the event to handle.
     * 
     */
    @InputImport(name="event")
    private final @Nullable Input<String> event;

    public Input<String> getEvent() {
        return this.event == null ? Input.empty() : this.event;
    }

    /**
     * - 
     * The unique identifier of this event handler.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The target flow to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    @InputImport(name="targetFlow")
    private final @Nullable Input<String> targetFlow;

    public Input<String> getTargetFlow() {
        return this.targetFlow == null ? Input.empty() : this.targetFlow;
    }

    /**
     * The target page to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
     * 
     */
    @InputImport(name="targetPage")
    private final @Nullable Input<String> targetPage;

    public Input<String> getTargetPage() {
        return this.targetPage == null ? Input.empty() : this.targetPage;
    }

    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
     */
    @InputImport(name="triggerFulfillment")
    private final @Nullable Input<CxFlowEventHandlerTriggerFulfillmentArgs> triggerFulfillment;

    public Input<CxFlowEventHandlerTriggerFulfillmentArgs> getTriggerFulfillment() {
        return this.triggerFulfillment == null ? Input.empty() : this.triggerFulfillment;
    }

    public CxFlowEventHandlerArgs(
        @Nullable Input<String> event,
        @Nullable Input<String> name,
        @Nullable Input<String> targetFlow,
        @Nullable Input<String> targetPage,
        @Nullable Input<CxFlowEventHandlerTriggerFulfillmentArgs> triggerFulfillment) {
        this.event = event;
        this.name = name;
        this.targetFlow = targetFlow;
        this.targetPage = targetPage;
        this.triggerFulfillment = triggerFulfillment;
    }

    private CxFlowEventHandlerArgs() {
        this.event = Input.empty();
        this.name = Input.empty();
        this.targetFlow = Input.empty();
        this.targetPage = Input.empty();
        this.triggerFulfillment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowEventHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> event;
        private @Nullable Input<String> name;
        private @Nullable Input<String> targetFlow;
        private @Nullable Input<String> targetPage;
        private @Nullable Input<CxFlowEventHandlerTriggerFulfillmentArgs> triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowEventHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder setEvent(@Nullable Input<String> event) {
            this.event = event;
            return this;
        }

        public Builder setEvent(@Nullable String event) {
            this.event = Input.ofNullable(event);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTargetFlow(@Nullable Input<String> targetFlow) {
            this.targetFlow = targetFlow;
            return this;
        }

        public Builder setTargetFlow(@Nullable String targetFlow) {
            this.targetFlow = Input.ofNullable(targetFlow);
            return this;
        }

        public Builder setTargetPage(@Nullable Input<String> targetPage) {
            this.targetPage = targetPage;
            return this;
        }

        public Builder setTargetPage(@Nullable String targetPage) {
            this.targetPage = Input.ofNullable(targetPage);
            return this;
        }

        public Builder setTriggerFulfillment(@Nullable Input<CxFlowEventHandlerTriggerFulfillmentArgs> triggerFulfillment) {
            this.triggerFulfillment = triggerFulfillment;
            return this;
        }

        public Builder setTriggerFulfillment(@Nullable CxFlowEventHandlerTriggerFulfillmentArgs triggerFulfillment) {
            this.triggerFulfillment = Input.ofNullable(triggerFulfillment);
            return this;
        }

        public CxFlowEventHandlerArgs build() {
            return new CxFlowEventHandlerArgs(event, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
