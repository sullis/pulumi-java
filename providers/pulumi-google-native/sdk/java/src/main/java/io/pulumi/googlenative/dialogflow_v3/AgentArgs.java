// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3AdvancedSettingsArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AgentArgs Empty = new AgentArgs();

    /**
     * Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     * 
     */
    @InputImport(name="advancedSettings")
      private final @Nullable Input<GoogleCloudDialogflowCxV3AdvancedSettingsArgs> advancedSettings;

    public Input<GoogleCloudDialogflowCxV3AdvancedSettingsArgs> getAdvancedSettings() {
        return this.advancedSettings == null ? Input.empty() : this.advancedSettings;
    }

    /**
     * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
     * 
     */
    @InputImport(name="avatarUri")
      private final @Nullable Input<String> avatarUri;

    public Input<String> getAvatarUri() {
        return this.avatarUri == null ? Input.empty() : this.avatarUri;
    }

    /**
     * Immutable. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
     * 
     */
    @InputImport(name="defaultLanguageCode", required=true)
      private final Input<String> defaultLanguageCode;

    public Input<String> getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * The description of the agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    @InputImport(name="enableSpellCorrection")
      private final @Nullable Input<Boolean> enableSpellCorrection;

    public Input<Boolean> getEnableSpellCorrection() {
        return this.enableSpellCorrection == null ? Input.empty() : this.enableSpellCorrection;
    }

    /**
     * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings instead.
     * 
     */
    @InputImport(name="enableStackdriverLogging")
      private final @Nullable Input<Boolean> enableStackdriverLogging;

    public Input<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Input.empty() : this.enableStackdriverLogging;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Name of the SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    @InputImport(name="securitySettings")
      private final @Nullable Input<String> securitySettings;

    public Input<String> getSecuritySettings() {
        return this.securitySettings == null ? Input.empty() : this.securitySettings;
    }

    /**
     * Speech recognition related settings.
     * 
     */
    @InputImport(name="speechToTextSettings")
      private final @Nullable Input<GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs> speechToTextSettings;

    public Input<GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs> getSpeechToTextSettings() {
        return this.speechToTextSettings == null ? Input.empty() : this.speechToTextSettings;
    }

    /**
     * Immutable. Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: `projects//locations//agents//flows/`.
     * 
     */
    @InputImport(name="startFlow")
      private final @Nullable Input<String> startFlow;

    public Input<String> getStartFlow() {
        return this.startFlow == null ? Input.empty() : this.startFlow;
    }

    /**
     * The list of all languages supported by the agent (except for the `default_language_code`).
     * 
     */
    @InputImport(name="supportedLanguageCodes")
      private final @Nullable Input<List<String>> supportedLanguageCodes;

    public Input<List<String>> getSupportedLanguageCodes() {
        return this.supportedLanguageCodes == null ? Input.empty() : this.supportedLanguageCodes;
    }

    /**
     * The time zone of the agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris.
     * 
     */
    @InputImport(name="timeZone", required=true)
      private final Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone;
    }

    public AgentArgs(
        @Nullable Input<GoogleCloudDialogflowCxV3AdvancedSettingsArgs> advancedSettings,
        @Nullable Input<String> avatarUri,
        Input<String> defaultLanguageCode,
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<Boolean> enableSpellCorrection,
        @Nullable Input<Boolean> enableStackdriverLogging,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> securitySettings,
        @Nullable Input<GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs> speechToTextSettings,
        @Nullable Input<String> startFlow,
        @Nullable Input<List<String>> supportedLanguageCodes,
        Input<String> timeZone) {
        this.advancedSettings = advancedSettings;
        this.avatarUri = avatarUri;
        this.defaultLanguageCode = Objects.requireNonNull(defaultLanguageCode, "expected parameter 'defaultLanguageCode' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableSpellCorrection = enableSpellCorrection;
        this.enableStackdriverLogging = enableStackdriverLogging;
        this.location = location;
        this.name = name;
        this.project = project;
        this.securitySettings = securitySettings;
        this.speechToTextSettings = speechToTextSettings;
        this.startFlow = startFlow;
        this.supportedLanguageCodes = supportedLanguageCodes;
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private AgentArgs() {
        this.advancedSettings = Input.empty();
        this.avatarUri = Input.empty();
        this.defaultLanguageCode = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.enableSpellCorrection = Input.empty();
        this.enableStackdriverLogging = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.securitySettings = Input.empty();
        this.speechToTextSettings = Input.empty();
        this.startFlow = Input.empty();
        this.supportedLanguageCodes = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowCxV3AdvancedSettingsArgs> advancedSettings;
        private @Nullable Input<String> avatarUri;
        private Input<String> defaultLanguageCode;
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<Boolean> enableSpellCorrection;
        private @Nullable Input<Boolean> enableStackdriverLogging;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> securitySettings;
        private @Nullable Input<GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs> speechToTextSettings;
        private @Nullable Input<String> startFlow;
        private @Nullable Input<List<String>> supportedLanguageCodes;
        private Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSettings = defaults.advancedSettings;
    	      this.avatarUri = defaults.avatarUri;
    	      this.defaultLanguageCode = defaults.defaultLanguageCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enableSpellCorrection = defaults.enableSpellCorrection;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.securitySettings = defaults.securitySettings;
    	      this.speechToTextSettings = defaults.speechToTextSettings;
    	      this.startFlow = defaults.startFlow;
    	      this.supportedLanguageCodes = defaults.supportedLanguageCodes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setAdvancedSettings(@Nullable Input<GoogleCloudDialogflowCxV3AdvancedSettingsArgs> advancedSettings) {
            this.advancedSettings = advancedSettings;
            return this;
        }

        public Builder setAdvancedSettings(@Nullable GoogleCloudDialogflowCxV3AdvancedSettingsArgs advancedSettings) {
            this.advancedSettings = Input.ofNullable(advancedSettings);
            return this;
        }

        public Builder setAvatarUri(@Nullable Input<String> avatarUri) {
            this.avatarUri = avatarUri;
            return this;
        }

        public Builder setAvatarUri(@Nullable String avatarUri) {
            this.avatarUri = Input.ofNullable(avatarUri);
            return this;
        }

        public Builder setDefaultLanguageCode(Input<String> defaultLanguageCode) {
            this.defaultLanguageCode = Objects.requireNonNull(defaultLanguageCode);
            return this;
        }

        public Builder setDefaultLanguageCode(String defaultLanguageCode) {
            this.defaultLanguageCode = Input.of(Objects.requireNonNull(defaultLanguageCode));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setEnableSpellCorrection(@Nullable Input<Boolean> enableSpellCorrection) {
            this.enableSpellCorrection = enableSpellCorrection;
            return this;
        }

        public Builder setEnableSpellCorrection(@Nullable Boolean enableSpellCorrection) {
            this.enableSpellCorrection = Input.ofNullable(enableSpellCorrection);
            return this;
        }

        public Builder setEnableStackdriverLogging(@Nullable Input<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        public Builder setEnableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Input.ofNullable(enableStackdriverLogging);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setSpeechToTextSettings(@Nullable Input<GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs> speechToTextSettings) {
            this.speechToTextSettings = speechToTextSettings;
            return this;
        }

        public Builder setSpeechToTextSettings(@Nullable GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs speechToTextSettings) {
            this.speechToTextSettings = Input.ofNullable(speechToTextSettings);
            return this;
        }

        public Builder setStartFlow(@Nullable Input<String> startFlow) {
            this.startFlow = startFlow;
            return this;
        }

        public Builder setStartFlow(@Nullable String startFlow) {
            this.startFlow = Input.ofNullable(startFlow);
            return this;
        }

        public Builder setSupportedLanguageCodes(@Nullable Input<List<String>> supportedLanguageCodes) {
            this.supportedLanguageCodes = supportedLanguageCodes;
            return this;
        }

        public Builder setSupportedLanguageCodes(@Nullable List<String> supportedLanguageCodes) {
            this.supportedLanguageCodes = Input.ofNullable(supportedLanguageCodes);
            return this;
        }

        public Builder setTimeZone(Input<String> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Input.of(Objects.requireNonNull(timeZone));
            return this;
        }
        public AgentArgs build() {
            return new AgentArgs(advancedSettings, avatarUri, defaultLanguageCode, description, displayName, enableSpellCorrection, enableStackdriverLogging, location, name, project, securitySettings, speechToTextSettings, startFlow, supportedLanguageCodes, timeZone);
        }
    }
}