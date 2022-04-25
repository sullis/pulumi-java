// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A transition route specifies a intent that can be matched and/or a data condition that can be evaluated during a session. When a specified transition is matched, the following actions are taken in order: * If there is a `trigger_fulfillment` associated with the transition, it will be called. * If there is a `target_page` associated with the transition, the session will transition into the specified page. * If there is a `target_flow` associated with the transition, the session will transition into the specified flow.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1TransitionRouteResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1TransitionRouteResponse Empty = new GoogleCloudDialogflowCxV3beta1TransitionRouteResponse();

    /**
     * The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @Import(name="condition", required=true)
    private String condition;

    /**
     * @return The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    public String condition() {
        return this.condition;
    }

    /**
     * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @Import(name="intent", required=true)
    private String intent;

    /**
     * @return The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    public String intent() {
        return this.intent;
    }

    /**
     * The unique identifier of this transition route.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The unique identifier of this transition route.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Import(name="targetFlow", required=true)
    private String targetFlow;

    /**
     * @return The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    public String targetFlow() {
        return this.targetFlow;
    }

    /**
     * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    @Import(name="targetPage", required=true)
    private String targetPage;

    /**
     * @return The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    public String targetPage() {
        return this.targetPage;
    }

    /**
     * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
     * 
     */
    @Import(name="triggerFulfillment", required=true)
    private GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment;

    /**
     * @return The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment() {
        return this.triggerFulfillment;
    }

    private GoogleCloudDialogflowCxV3beta1TransitionRouteResponse() {}

    private GoogleCloudDialogflowCxV3beta1TransitionRouteResponse(GoogleCloudDialogflowCxV3beta1TransitionRouteResponse $) {
        this.condition = $.condition;
        this.intent = $.intent;
        this.name = $.name;
        this.targetFlow = $.targetFlow;
        this.targetPage = $.targetPage;
        this.triggerFulfillment = $.triggerFulfillment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1TransitionRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1TransitionRouteResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1TransitionRouteResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TransitionRouteResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1TransitionRouteResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param intent The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
         * 
         * @return builder
         * 
         */
        public Builder intent(String intent) {
            $.intent = intent;
            return this;
        }

        /**
         * @param name The unique identifier of this transition route.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param targetFlow The target flow to transition to. Format: `projects//locations//agents//flows/`.
         * 
         * @return builder
         * 
         */
        public Builder targetFlow(String targetFlow) {
            $.targetFlow = targetFlow;
            return this;
        }

        /**
         * @param targetPage The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
         * 
         * @return builder
         * 
         */
        public Builder targetPage(String targetPage) {
            $.targetPage = targetPage;
            return this;
        }

        /**
         * @param triggerFulfillment The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
         * 
         * @return builder
         * 
         */
        public Builder triggerFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment) {
            $.triggerFulfillment = triggerFulfillment;
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1TransitionRouteResponse build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.intent = Objects.requireNonNull($.intent, "expected parameter 'intent' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.targetFlow = Objects.requireNonNull($.targetFlow, "expected parameter 'targetFlow' to be non-null");
            $.targetPage = Objects.requireNonNull($.targetPage, "expected parameter 'targetPage' to be non-null");
            $.triggerFulfillment = Objects.requireNonNull($.triggerFulfillment, "expected parameter 'triggerFulfillment' to be non-null");
            return $;
        }
    }

}
