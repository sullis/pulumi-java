// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the DirectLine Speech channel.
 * 
 */
public final class DirectLineSpeechChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectLineSpeechChannelPropertiesArgs Empty = new DirectLineSpeechChannelPropertiesArgs();

    /**
     * The cognitive service region with this channel registration.
     * 
     */
    @InputImport(name="cognitiveServiceRegion", required=true)
    private final Input<String> cognitiveServiceRegion;

    public Input<String> getCognitiveServiceRegion() {
        return this.cognitiveServiceRegion;
    }

    /**
     * The cognitive service subscription key to use with this channel registration.
     * 
     */
    @InputImport(name="cognitiveServiceSubscriptionKey", required=true)
    private final Input<String> cognitiveServiceSubscriptionKey;

    public Input<String> getCognitiveServiceSubscriptionKey() {
        return this.cognitiveServiceSubscriptionKey;
    }

    /**
     * Custom voice deployment id (optional).
     * 
     */
    @InputImport(name="customSpeechModelId")
    private final @Nullable Input<String> customSpeechModelId;

    public Input<String> getCustomSpeechModelId() {
        return this.customSpeechModelId == null ? Input.empty() : this.customSpeechModelId;
    }

    /**
     * Custom speech model id (optional).
     * 
     */
    @InputImport(name="customVoiceDeploymentId")
    private final @Nullable Input<String> customVoiceDeploymentId;

    public Input<String> getCustomVoiceDeploymentId() {
        return this.customVoiceDeploymentId == null ? Input.empty() : this.customVoiceDeploymentId;
    }

    /**
     * Make this a default bot for chosen cognitive service account.
     * 
     */
    @InputImport(name="isDefaultBotForCogSvcAccount")
    private final @Nullable Input<Boolean> isDefaultBotForCogSvcAccount;

    public Input<Boolean> getIsDefaultBotForCogSvcAccount() {
        return this.isDefaultBotForCogSvcAccount == null ? Input.empty() : this.isDefaultBotForCogSvcAccount;
    }

    /**
     * Whether this channel is enabled or not.
     * 
     */
    @InputImport(name="isEnabled")
    private final @Nullable Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Input.empty() : this.isEnabled;
    }

    public DirectLineSpeechChannelPropertiesArgs(
        Input<String> cognitiveServiceRegion,
        Input<String> cognitiveServiceSubscriptionKey,
        @Nullable Input<String> customSpeechModelId,
        @Nullable Input<String> customVoiceDeploymentId,
        @Nullable Input<Boolean> isDefaultBotForCogSvcAccount,
        @Nullable Input<Boolean> isEnabled) {
        this.cognitiveServiceRegion = Objects.requireNonNull(cognitiveServiceRegion, "expected parameter 'cognitiveServiceRegion' to be non-null");
        this.cognitiveServiceSubscriptionKey = Objects.requireNonNull(cognitiveServiceSubscriptionKey, "expected parameter 'cognitiveServiceSubscriptionKey' to be non-null");
        this.customSpeechModelId = customSpeechModelId;
        this.customVoiceDeploymentId = customVoiceDeploymentId;
        this.isDefaultBotForCogSvcAccount = isDefaultBotForCogSvcAccount;
        this.isEnabled = isEnabled;
    }

    private DirectLineSpeechChannelPropertiesArgs() {
        this.cognitiveServiceRegion = Input.empty();
        this.cognitiveServiceSubscriptionKey = Input.empty();
        this.customSpeechModelId = Input.empty();
        this.customVoiceDeploymentId = Input.empty();
        this.isDefaultBotForCogSvcAccount = Input.empty();
        this.isEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineSpeechChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cognitiveServiceRegion;
        private Input<String> cognitiveServiceSubscriptionKey;
        private @Nullable Input<String> customSpeechModelId;
        private @Nullable Input<String> customVoiceDeploymentId;
        private @Nullable Input<Boolean> isDefaultBotForCogSvcAccount;
        private @Nullable Input<Boolean> isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineSpeechChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cognitiveServiceRegion = defaults.cognitiveServiceRegion;
    	      this.cognitiveServiceSubscriptionKey = defaults.cognitiveServiceSubscriptionKey;
    	      this.customSpeechModelId = defaults.customSpeechModelId;
    	      this.customVoiceDeploymentId = defaults.customVoiceDeploymentId;
    	      this.isDefaultBotForCogSvcAccount = defaults.isDefaultBotForCogSvcAccount;
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setCognitiveServiceRegion(Input<String> cognitiveServiceRegion) {
            this.cognitiveServiceRegion = Objects.requireNonNull(cognitiveServiceRegion);
            return this;
        }

        public Builder setCognitiveServiceRegion(String cognitiveServiceRegion) {
            this.cognitiveServiceRegion = Input.of(Objects.requireNonNull(cognitiveServiceRegion));
            return this;
        }

        public Builder setCognitiveServiceSubscriptionKey(Input<String> cognitiveServiceSubscriptionKey) {
            this.cognitiveServiceSubscriptionKey = Objects.requireNonNull(cognitiveServiceSubscriptionKey);
            return this;
        }

        public Builder setCognitiveServiceSubscriptionKey(String cognitiveServiceSubscriptionKey) {
            this.cognitiveServiceSubscriptionKey = Input.of(Objects.requireNonNull(cognitiveServiceSubscriptionKey));
            return this;
        }

        public Builder setCustomSpeechModelId(@Nullable Input<String> customSpeechModelId) {
            this.customSpeechModelId = customSpeechModelId;
            return this;
        }

        public Builder setCustomSpeechModelId(@Nullable String customSpeechModelId) {
            this.customSpeechModelId = Input.ofNullable(customSpeechModelId);
            return this;
        }

        public Builder setCustomVoiceDeploymentId(@Nullable Input<String> customVoiceDeploymentId) {
            this.customVoiceDeploymentId = customVoiceDeploymentId;
            return this;
        }

        public Builder setCustomVoiceDeploymentId(@Nullable String customVoiceDeploymentId) {
            this.customVoiceDeploymentId = Input.ofNullable(customVoiceDeploymentId);
            return this;
        }

        public Builder setIsDefaultBotForCogSvcAccount(@Nullable Input<Boolean> isDefaultBotForCogSvcAccount) {
            this.isDefaultBotForCogSvcAccount = isDefaultBotForCogSvcAccount;
            return this;
        }

        public Builder setIsDefaultBotForCogSvcAccount(@Nullable Boolean isDefaultBotForCogSvcAccount) {
            this.isDefaultBotForCogSvcAccount = Input.ofNullable(isDefaultBotForCogSvcAccount);
            return this;
        }

        public Builder setIsEnabled(@Nullable Input<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Input.ofNullable(isEnabled);
            return this;
        }

        public DirectLineSpeechChannelPropertiesArgs build() {
            return new DirectLineSpeechChannelPropertiesArgs(cognitiveServiceRegion, cognitiveServiceSubscriptionKey, customSpeechModelId, customVoiceDeploymentId, isDefaultBotForCogSvcAccount, isEnabled);
        }
    }
}
