// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Config to process conversation.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse();

    /**
     * Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
     * 
     */
    @Import(name="recentSentencesCount", required=true)
    private Integer recentSentencesCount;

    /**
     * @return Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
     * 
     */
    public Integer recentSentencesCount() {
        return this.recentSentencesCount;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse() {}

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse $) {
        this.recentSentencesCount = $.recentSentencesCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param recentSentencesCount Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
         * 
         * @return builder
         * 
         */
        public Builder recentSentencesCount(Integer recentSentencesCount) {
            $.recentSentencesCount = recentSentencesCount;
            return this;
        }

        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse build() {
            $.recentSentencesCount = Objects.requireNonNull($.recentSentencesCount, "expected parameter 'recentSentencesCount' to be non-null");
            return $;
        }
    }

}
