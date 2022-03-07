// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1LoggingConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1NotificationConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConversationProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConversationProfileArgs Empty = new ConversationProfileArgs();

    /**
     * Configuration for an automated agent to use with this profile.
     * 
     */
    @InputImport(name="automatedAgentConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs> automatedAgentConfig;

    public Input<GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs> getAutomatedAgentConfig() {
        return this.automatedAgentConfig == null ? Input.empty() : this.automatedAgentConfig;
    }

    /**
     * Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Configuration for agent assistance to use with this profile.
     * 
     */
    @InputImport(name="humanAgentAssistantConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs> humanAgentAssistantConfig;

    public Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs> getHumanAgentAssistantConfig() {
        return this.humanAgentAssistantConfig == null ? Input.empty() : this.humanAgentAssistantConfig;
    }

    /**
     * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @InputImport(name="humanAgentHandoffConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs> humanAgentHandoffConfig;

    public Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs> getHumanAgentHandoffConfig() {
        return this.humanAgentHandoffConfig == null ? Input.empty() : this.humanAgentHandoffConfig;
    }

    /**
     * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
     */
    @InputImport(name="languageCode")
      private final @Nullable Input<String> languageCode;

    public Input<String> getLanguageCode() {
        return this.languageCode == null ? Input.empty() : this.languageCode;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Configuration for logging conversation lifecycle events.
     * 
     */
    @InputImport(name="loggingConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1LoggingConfigArgs> loggingConfig;

    public Input<GoogleCloudDialogflowV2beta1LoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    @InputImport(name="newMessageEventNotificationConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> newMessageEventNotificationConfig;

    public Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> getNewMessageEventNotificationConfig() {
        return this.newMessageEventNotificationConfig == null ? Input.empty() : this.newMessageEventNotificationConfig;
    }

    /**
     * Configuration for publishing conversation lifecycle events.
     * 
     */
    @InputImport(name="notificationConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig;

    public Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    @InputImport(name="securitySettings")
      private final @Nullable Input<String> securitySettings;

    public Input<String> getSecuritySettings() {
        return this.securitySettings == null ? Input.empty() : this.securitySettings;
    }

    /**
     * Settings for speech transcription.
     * 
     */
    @InputImport(name="sttConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs> sttConfig;

    public Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs> getSttConfig() {
        return this.sttConfig == null ? Input.empty() : this.sttConfig;
    }

    /**
     * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    @InputImport(name="timeZone")
      private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    public ConversationProfileArgs(
        @Nullable Input<GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs> automatedAgentConfig,
        Input<String> displayName,
        @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs> humanAgentAssistantConfig,
        @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs> humanAgentHandoffConfig,
        @Nullable Input<String> languageCode,
        @Nullable Input<String> location,
        @Nullable Input<GoogleCloudDialogflowV2beta1LoggingConfigArgs> loggingConfig,
        @Nullable Input<String> name,
        @Nullable Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> newMessageEventNotificationConfig,
        @Nullable Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig,
        @Nullable Input<String> project,
        @Nullable Input<String> securitySettings,
        @Nullable Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs> sttConfig,
        @Nullable Input<String> timeZone) {
        this.automatedAgentConfig = automatedAgentConfig;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.humanAgentAssistantConfig = humanAgentAssistantConfig;
        this.humanAgentHandoffConfig = humanAgentHandoffConfig;
        this.languageCode = languageCode;
        this.location = location;
        this.loggingConfig = loggingConfig;
        this.name = name;
        this.newMessageEventNotificationConfig = newMessageEventNotificationConfig;
        this.notificationConfig = notificationConfig;
        this.project = project;
        this.securitySettings = securitySettings;
        this.sttConfig = sttConfig;
        this.timeZone = timeZone;
    }

    private ConversationProfileArgs() {
        this.automatedAgentConfig = Input.empty();
        this.displayName = Input.empty();
        this.humanAgentAssistantConfig = Input.empty();
        this.humanAgentHandoffConfig = Input.empty();
        this.languageCode = Input.empty();
        this.location = Input.empty();
        this.loggingConfig = Input.empty();
        this.name = Input.empty();
        this.newMessageEventNotificationConfig = Input.empty();
        this.notificationConfig = Input.empty();
        this.project = Input.empty();
        this.securitySettings = Input.empty();
        this.sttConfig = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConversationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs> automatedAgentConfig;
        private Input<String> displayName;
        private @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs> humanAgentAssistantConfig;
        private @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs> humanAgentHandoffConfig;
        private @Nullable Input<String> languageCode;
        private @Nullable Input<String> location;
        private @Nullable Input<GoogleCloudDialogflowV2beta1LoggingConfigArgs> loggingConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> newMessageEventNotificationConfig;
        private @Nullable Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<String> securitySettings;
        private @Nullable Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs> sttConfig;
        private @Nullable Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ConversationProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedAgentConfig = defaults.automatedAgentConfig;
    	      this.displayName = defaults.displayName;
    	      this.humanAgentAssistantConfig = defaults.humanAgentAssistantConfig;
    	      this.humanAgentHandoffConfig = defaults.humanAgentHandoffConfig;
    	      this.languageCode = defaults.languageCode;
    	      this.location = defaults.location;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.name = defaults.name;
    	      this.newMessageEventNotificationConfig = defaults.newMessageEventNotificationConfig;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.project = defaults.project;
    	      this.securitySettings = defaults.securitySettings;
    	      this.sttConfig = defaults.sttConfig;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setAutomatedAgentConfig(@Nullable Input<GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs> automatedAgentConfig) {
            this.automatedAgentConfig = automatedAgentConfig;
            return this;
        }

        public Builder setAutomatedAgentConfig(@Nullable GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs automatedAgentConfig) {
            this.automatedAgentConfig = Input.ofNullable(automatedAgentConfig);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setHumanAgentAssistantConfig(@Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs> humanAgentAssistantConfig) {
            this.humanAgentAssistantConfig = humanAgentAssistantConfig;
            return this;
        }

        public Builder setHumanAgentAssistantConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs humanAgentAssistantConfig) {
            this.humanAgentAssistantConfig = Input.ofNullable(humanAgentAssistantConfig);
            return this;
        }

        public Builder setHumanAgentHandoffConfig(@Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs> humanAgentHandoffConfig) {
            this.humanAgentHandoffConfig = humanAgentHandoffConfig;
            return this;
        }

        public Builder setHumanAgentHandoffConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs humanAgentHandoffConfig) {
            this.humanAgentHandoffConfig = Input.ofNullable(humanAgentHandoffConfig);
            return this;
        }

        public Builder setLanguageCode(@Nullable Input<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder setLanguageCode(@Nullable String languageCode) {
            this.languageCode = Input.ofNullable(languageCode);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setLoggingConfig(@Nullable Input<GoogleCloudDialogflowV2beta1LoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setLoggingConfig(@Nullable GoogleCloudDialogflowV2beta1LoggingConfigArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
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

        public Builder setNewMessageEventNotificationConfig(@Nullable Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> newMessageEventNotificationConfig) {
            this.newMessageEventNotificationConfig = newMessageEventNotificationConfig;
            return this;
        }

        public Builder setNewMessageEventNotificationConfig(@Nullable GoogleCloudDialogflowV2beta1NotificationConfigArgs newMessageEventNotificationConfig) {
            this.newMessageEventNotificationConfig = Input.ofNullable(newMessageEventNotificationConfig);
            return this;
        }

        public Builder setNotificationConfig(@Nullable Input<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setNotificationConfig(@Nullable GoogleCloudDialogflowV2beta1NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSecuritySettings(@Nullable Input<String> securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }

        public Builder setSecuritySettings(@Nullable String securitySettings) {
            this.securitySettings = Input.ofNullable(securitySettings);
            return this;
        }

        public Builder setSttConfig(@Nullable Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs> sttConfig) {
            this.sttConfig = sttConfig;
            return this;
        }

        public Builder setSttConfig(@Nullable GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs sttConfig) {
            this.sttConfig = Input.ofNullable(sttConfig);
            return this;
        }

        public Builder setTimeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }
        public ConversationProfileArgs build() {
            return new ConversationProfileArgs(automatedAgentConfig, displayName, humanAgentAssistantConfig, humanAgentHandoffConfig, languageCode, location, loggingConfig, name, newMessageEventNotificationConfig, notificationConfig, project, securitySettings, sttConfig, timeZone);
        }
    }
}