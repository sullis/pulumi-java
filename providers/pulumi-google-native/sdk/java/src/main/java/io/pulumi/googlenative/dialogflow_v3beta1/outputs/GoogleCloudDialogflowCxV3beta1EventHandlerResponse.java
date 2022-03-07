// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1EventHandlerResponse {
    /**
     * The name of the event to handle.
     * 
     */
    private final String event;
    /**
     * The unique identifier of this event handler.
     * 
     */
    private final String name;
    /**
     * The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    private final String targetFlow;
    /**
     * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    private final String targetPage;
    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment;

    @OutputCustomType.Constructor({"event","name","targetFlow","targetPage","triggerFulfillment"})
    private GoogleCloudDialogflowCxV3beta1EventHandlerResponse(
        String event,
        String name,
        String targetFlow,
        String targetPage,
        GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment) {
        this.event = Objects.requireNonNull(event);
        this.name = Objects.requireNonNull(name);
        this.targetFlow = Objects.requireNonNull(targetFlow);
        this.targetPage = Objects.requireNonNull(targetPage);
        this.triggerFulfillment = Objects.requireNonNull(triggerFulfillment);
    }

    /**
     * The name of the event to handle.
     * 
    */
    public String getEvent() {
        return this.event;
    }
    /**
     * The unique identifier of this event handler.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
    */
    public String getTargetFlow() {
        return this.targetFlow;
    }
    /**
     * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
    */
    public String getTargetPage() {
        return this.targetPage;
    }
    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1FulfillmentResponse getTriggerFulfillment() {
        return this.triggerFulfillment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EventHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String event;
        private String name;
        private String targetFlow;
        private String targetPage;
        private GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EventHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder setEvent(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTargetFlow(String targetFlow) {
            this.targetFlow = Objects.requireNonNull(targetFlow);
            return this;
        }

        public Builder setTargetPage(String targetPage) {
            this.targetPage = Objects.requireNonNull(targetPage);
            return this;
        }

        public Builder setTriggerFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment) {
            this.triggerFulfillment = Objects.requireNonNull(triggerFulfillment);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1EventHandlerResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EventHandlerResponse(event, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}