// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EventHandlerArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for how the filling of a parameter should be handled.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs Empty = new GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs();

    /**
     * The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * 
     */
    @Import(name="initialPromptFulfillment", required=true)
    private Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> initialPromptFulfillment;

    /**
     * @return The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> initialPromptFulfillment() {
        return this.initialPromptFulfillment;
    }

    /**
     * The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys.no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first prompt for the parameter. If the user&#39;s response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys.no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys.no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on. A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the parameter values have been `invalidated` by webhook. For example, if the user&#39;s response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If the event handler for the corresponding event can&#39;t be found on the parameter, `initial_prompt_fulfillment` will be re-prompted.
     * 
     */
    @Import(name="repromptEventHandlers")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> repromptEventHandlers;

    /**
     * @return The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys.no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first prompt for the parameter. If the user&#39;s response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys.no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys.no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on. A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the parameter values have been `invalidated` by webhook. For example, if the user&#39;s response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If the event handler for the corresponding event can&#39;t be found on the parameter, `initial_prompt_fulfillment` will be re-prompted.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>>> repromptEventHandlers() {
        return Optional.ofNullable(this.repromptEventHandlers);
    }

    private GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs() {}

    private GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs $) {
        this.initialPromptFulfillment = $.initialPromptFulfillment;
        this.repromptEventHandlers = $.repromptEventHandlers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param initialPromptFulfillment The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
         * 
         * @return builder
         * 
         */
        public Builder initialPromptFulfillment(Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> initialPromptFulfillment) {
            $.initialPromptFulfillment = initialPromptFulfillment;
            return this;
        }

        /**
         * @param initialPromptFulfillment The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
         * 
         * @return builder
         * 
         */
        public Builder initialPromptFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentArgs initialPromptFulfillment) {
            return initialPromptFulfillment(Output.of(initialPromptFulfillment));
        }

        /**
         * @param repromptEventHandlers The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys.no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first prompt for the parameter. If the user&#39;s response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys.no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys.no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on. A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the parameter values have been `invalidated` by webhook. For example, if the user&#39;s response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If the event handler for the corresponding event can&#39;t be found on the parameter, `initial_prompt_fulfillment` will be re-prompted.
         * 
         * @return builder
         * 
         */
        public Builder repromptEventHandlers(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> repromptEventHandlers) {
            $.repromptEventHandlers = repromptEventHandlers;
            return this;
        }

        /**
         * @param repromptEventHandlers The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys.no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first prompt for the parameter. If the user&#39;s response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys.no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys.no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on. A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the parameter values have been `invalidated` by webhook. For example, if the user&#39;s response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If the event handler for the corresponding event can&#39;t be found on the parameter, `initial_prompt_fulfillment` will be re-prompted.
         * 
         * @return builder
         * 
         */
        public Builder repromptEventHandlers(List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs> repromptEventHandlers) {
            return repromptEventHandlers(Output.of(repromptEventHandlers));
        }

        /**
         * @param repromptEventHandlers The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys.no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first prompt for the parameter. If the user&#39;s response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys.no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys.no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on. A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the parameter values have been `invalidated` by webhook. For example, if the user&#39;s response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If the event handler for the corresponding event can&#39;t be found on the parameter, `initial_prompt_fulfillment` will be re-prompted.
         * 
         * @return builder
         * 
         */
        public Builder repromptEventHandlers(GoogleCloudDialogflowCxV3beta1EventHandlerArgs... repromptEventHandlers) {
            return repromptEventHandlers(List.of(repromptEventHandlers));
        }

        public GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs build() {
            $.initialPromptFulfillment = Objects.requireNonNull($.initialPromptFulfillment, "expected parameter 'initialPromptFulfillment' to be non-null");
            return $;
        }
    }

}
