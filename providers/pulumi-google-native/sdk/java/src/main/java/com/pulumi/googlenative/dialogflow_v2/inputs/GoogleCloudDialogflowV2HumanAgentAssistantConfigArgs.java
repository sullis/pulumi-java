// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2NotificationConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Human Agent Assist to connect to a conversation.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs();

    /**
     * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="endUserSuggestionConfig")
    private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigArgs> endUserSuggestionConfig;

    /**
     * @return Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigArgs>> endUserSuggestionConfig() {
        return Optional.ofNullable(this.endUserSuggestionConfig);
    }

    /**
     * Configuration for agent assistance of human agent participant.
     * 
     */
    @Import(name="humanAgentSuggestionConfig")
    private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigArgs> humanAgentSuggestionConfig;

    /**
     * @return Configuration for agent assistance of human agent participant.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigArgs>> humanAgentSuggestionConfig() {
        return Optional.ofNullable(this.humanAgentSuggestionConfig);
    }

    /**
     * Configuration for message analysis.
     * 
     */
    @Import(name="messageAnalysisConfig")
    private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs> messageAnalysisConfig;

    /**
     * @return Configuration for message analysis.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs>> messageAnalysisConfig() {
        return Optional.ofNullable(this.messageAnalysisConfig);
    }

    /**
     * Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    @Import(name="notificationConfig")
    private @Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> notificationConfig;

    /**
     * @return Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2NotificationConfigArgs>> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs() {}

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs(GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs $) {
        this.endUserSuggestionConfig = $.endUserSuggestionConfig;
        this.humanAgentSuggestionConfig = $.humanAgentSuggestionConfig;
        this.messageAnalysisConfig = $.messageAnalysisConfig;
        this.notificationConfig = $.notificationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endUserSuggestionConfig Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
         * 
         * @return builder
         * 
         */
        public Builder endUserSuggestionConfig(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigArgs> endUserSuggestionConfig) {
            $.endUserSuggestionConfig = endUserSuggestionConfig;
            return this;
        }

        /**
         * @param endUserSuggestionConfig Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
         * 
         * @return builder
         * 
         */
        public Builder endUserSuggestionConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigArgs endUserSuggestionConfig) {
            return endUserSuggestionConfig(Output.of(endUserSuggestionConfig));
        }

        /**
         * @param humanAgentSuggestionConfig Configuration for agent assistance of human agent participant.
         * 
         * @return builder
         * 
         */
        public Builder humanAgentSuggestionConfig(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigArgs> humanAgentSuggestionConfig) {
            $.humanAgentSuggestionConfig = humanAgentSuggestionConfig;
            return this;
        }

        /**
         * @param humanAgentSuggestionConfig Configuration for agent assistance of human agent participant.
         * 
         * @return builder
         * 
         */
        public Builder humanAgentSuggestionConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigArgs humanAgentSuggestionConfig) {
            return humanAgentSuggestionConfig(Output.of(humanAgentSuggestionConfig));
        }

        /**
         * @param messageAnalysisConfig Configuration for message analysis.
         * 
         * @return builder
         * 
         */
        public Builder messageAnalysisConfig(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs> messageAnalysisConfig) {
            $.messageAnalysisConfig = messageAnalysisConfig;
            return this;
        }

        /**
         * @param messageAnalysisConfig Configuration for message analysis.
         * 
         * @return builder
         * 
         */
        public Builder messageAnalysisConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs messageAnalysisConfig) {
            return messageAnalysisConfig(Output.of(messageAnalysisConfig));
        }

        /**
         * @param notificationConfig Pub/Sub topic on which to publish new agent assistant events.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(@Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        /**
         * @param notificationConfig Pub/Sub topic on which to publish new agent assistant events.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(GoogleCloudDialogflowV2NotificationConfigArgs notificationConfig) {
            return notificationConfig(Output.of(notificationConfig));
        }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs build() {
            return $;
        }
    }

}
