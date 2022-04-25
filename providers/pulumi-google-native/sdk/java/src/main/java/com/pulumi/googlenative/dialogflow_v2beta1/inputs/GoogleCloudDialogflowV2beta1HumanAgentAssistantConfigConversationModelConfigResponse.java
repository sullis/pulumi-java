// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Custom conversation models used in agent assist feature. Supported feature: ARTICLE_SUGGESTION, SMART_COMPOSE, SMART_REPLY.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse();

    /**
     * Conversation model resource name. Format: `projects//conversationModels/`.
     * 
     */
    @Import(name="model", required=true)
    private String model;

    /**
     * @return Conversation model resource name. Format: `projects//conversationModels/`.
     * 
     */
    public String model() {
        return this.model;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse() {}

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse $) {
        this.model = $.model;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param model Conversation model resource name. Format: `projects//conversationModels/`.
         * 
         * @return builder
         * 
         */
        public Builder model(String model) {
            $.model = model;
            return this;
        }

        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse build() {
            $.model = Objects.requireNonNull($.model, "expected parameter 'model' to be non-null");
            return $;
        }
    }

}
