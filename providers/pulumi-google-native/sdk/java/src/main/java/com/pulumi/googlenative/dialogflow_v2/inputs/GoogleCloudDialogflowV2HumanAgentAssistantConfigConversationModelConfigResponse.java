// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Custom conversation models used in agent assist feature. Supported feature: ARTICLE_SUGGESTION, SMART_COMPOSE, SMART_REPLY.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse();

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

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse() {}

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse $) {
        this.model = $.model;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse();
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse defaults) {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse(Objects.requireNonNull(defaults));
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

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse build() {
            $.model = Objects.requireNonNull($.model, "expected parameter 'model' to be non-null");
            return $;
        }
    }

}
