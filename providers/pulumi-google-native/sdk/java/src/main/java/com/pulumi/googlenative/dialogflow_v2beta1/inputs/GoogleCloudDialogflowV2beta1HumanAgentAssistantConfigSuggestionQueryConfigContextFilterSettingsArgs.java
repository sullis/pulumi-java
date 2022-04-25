// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings that determine how to filter recent conversation context when generating suggestions.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs();

    /**
     * If set to true, the last message from virtual agent (hand off message) and the message before it (trigger message of hand off) are dropped.
     * 
     */
    @Import(name="dropHandoffMessages")
    private @Nullable Output<Boolean> dropHandoffMessages;

    /**
     * @return If set to true, the last message from virtual agent (hand off message) and the message before it (trigger message of hand off) are dropped.
     * 
     */
    public Optional<Output<Boolean>> dropHandoffMessages() {
        return Optional.ofNullable(this.dropHandoffMessages);
    }

    /**
     * If set to true, all messages from ivr stage are dropped.
     * 
     */
    @Import(name="dropIvrMessages")
    private @Nullable Output<Boolean> dropIvrMessages;

    /**
     * @return If set to true, all messages from ivr stage are dropped.
     * 
     */
    public Optional<Output<Boolean>> dropIvrMessages() {
        return Optional.ofNullable(this.dropIvrMessages);
    }

    /**
     * If set to true, all messages from virtual agent are dropped.
     * 
     */
    @Import(name="dropVirtualAgentMessages")
    private @Nullable Output<Boolean> dropVirtualAgentMessages;

    /**
     * @return If set to true, all messages from virtual agent are dropped.
     * 
     */
    public Optional<Output<Boolean>> dropVirtualAgentMessages() {
        return Optional.ofNullable(this.dropVirtualAgentMessages);
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs() {}

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs $) {
        this.dropHandoffMessages = $.dropHandoffMessages;
        this.dropIvrMessages = $.dropIvrMessages;
        this.dropVirtualAgentMessages = $.dropVirtualAgentMessages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dropHandoffMessages If set to true, the last message from virtual agent (hand off message) and the message before it (trigger message of hand off) are dropped.
         * 
         * @return builder
         * 
         */
        public Builder dropHandoffMessages(@Nullable Output<Boolean> dropHandoffMessages) {
            $.dropHandoffMessages = dropHandoffMessages;
            return this;
        }

        /**
         * @param dropHandoffMessages If set to true, the last message from virtual agent (hand off message) and the message before it (trigger message of hand off) are dropped.
         * 
         * @return builder
         * 
         */
        public Builder dropHandoffMessages(Boolean dropHandoffMessages) {
            return dropHandoffMessages(Output.of(dropHandoffMessages));
        }

        /**
         * @param dropIvrMessages If set to true, all messages from ivr stage are dropped.
         * 
         * @return builder
         * 
         */
        public Builder dropIvrMessages(@Nullable Output<Boolean> dropIvrMessages) {
            $.dropIvrMessages = dropIvrMessages;
            return this;
        }

        /**
         * @param dropIvrMessages If set to true, all messages from ivr stage are dropped.
         * 
         * @return builder
         * 
         */
        public Builder dropIvrMessages(Boolean dropIvrMessages) {
            return dropIvrMessages(Output.of(dropIvrMessages));
        }

        /**
         * @param dropVirtualAgentMessages If set to true, all messages from virtual agent are dropped.
         * 
         * @return builder
         * 
         */
        public Builder dropVirtualAgentMessages(@Nullable Output<Boolean> dropVirtualAgentMessages) {
            $.dropVirtualAgentMessages = dropVirtualAgentMessages;
            return this;
        }

        /**
         * @param dropVirtualAgentMessages If set to true, all messages from virtual agent are dropped.
         * 
         * @return builder
         * 
         */
        public Builder dropVirtualAgentMessages(Boolean dropVirtualAgentMessages) {
            return dropVirtualAgentMessages(Output.of(dropVirtualAgentMessages));
        }

        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs build() {
            return $;
        }
    }

}
