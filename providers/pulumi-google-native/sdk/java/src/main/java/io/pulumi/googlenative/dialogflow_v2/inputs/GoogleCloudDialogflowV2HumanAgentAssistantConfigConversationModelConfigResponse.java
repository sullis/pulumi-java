// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Custom conversation models used in agent assist feature. Supported feature: ARTICLE_SUGGESTION, SMART_COMPOSE, SMART_REPLY.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse();

    /**
     * Conversation model resource name. Format: `projects//conversationModels/`.
     * 
     */
    @InputImport(name="model", required=true)
      private final String model;

    public String getModel() {
        return this.model;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse(String model) {
        this.model = Objects.requireNonNull(model, "expected parameter 'model' to be non-null");
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse() {
        this.model = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String model;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
        }

        public Builder setModel(String model) {
            this.model = Objects.requireNonNull(model);
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse(model);
        }
    }
}