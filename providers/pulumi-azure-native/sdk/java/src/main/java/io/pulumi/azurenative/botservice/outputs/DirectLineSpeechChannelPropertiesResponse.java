// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DirectLineSpeechChannelPropertiesResponse {
    /**
     * The cognitive service region with this channel registration.
     * 
     */
    private final String cognitiveServiceRegion;
    /**
     * The cognitive service subscription key to use with this channel registration.
     * 
     */
    private final String cognitiveServiceSubscriptionKey;
    /**
     * Custom voice deployment id (optional).
     * 
     */
    private final @Nullable String customSpeechModelId;
    /**
     * Custom speech model id (optional).
     * 
     */
    private final @Nullable String customVoiceDeploymentId;
    /**
     * Make this a default bot for chosen cognitive service account.
     * 
     */
    private final @Nullable Boolean isDefaultBotForCogSvcAccount;
    /**
     * Whether this channel is enabled or not.
     * 
     */
    private final @Nullable Boolean isEnabled;

    @OutputCustomType.Constructor({"cognitiveServiceRegion","cognitiveServiceSubscriptionKey","customSpeechModelId","customVoiceDeploymentId","isDefaultBotForCogSvcAccount","isEnabled"})
    private DirectLineSpeechChannelPropertiesResponse(
        String cognitiveServiceRegion,
        String cognitiveServiceSubscriptionKey,
        @Nullable String customSpeechModelId,
        @Nullable String customVoiceDeploymentId,
        @Nullable Boolean isDefaultBotForCogSvcAccount,
        @Nullable Boolean isEnabled) {
        this.cognitiveServiceRegion = Objects.requireNonNull(cognitiveServiceRegion);
        this.cognitiveServiceSubscriptionKey = Objects.requireNonNull(cognitiveServiceSubscriptionKey);
        this.customSpeechModelId = customSpeechModelId;
        this.customVoiceDeploymentId = customVoiceDeploymentId;
        this.isDefaultBotForCogSvcAccount = isDefaultBotForCogSvcAccount;
        this.isEnabled = isEnabled;
    }

    /**
     * The cognitive service region with this channel registration.
     * 
    */
    public String getCognitiveServiceRegion() {
        return this.cognitiveServiceRegion;
    }
    /**
     * The cognitive service subscription key to use with this channel registration.
     * 
    */
    public String getCognitiveServiceSubscriptionKey() {
        return this.cognitiveServiceSubscriptionKey;
    }
    /**
     * Custom voice deployment id (optional).
     * 
    */
    public Optional<String> getCustomSpeechModelId() {
        return Optional.ofNullable(this.customSpeechModelId);
    }
    /**
     * Custom speech model id (optional).
     * 
    */
    public Optional<String> getCustomVoiceDeploymentId() {
        return Optional.ofNullable(this.customVoiceDeploymentId);
    }
    /**
     * Make this a default bot for chosen cognitive service account.
     * 
    */
    public Optional<Boolean> getIsDefaultBotForCogSvcAccount() {
        return Optional.ofNullable(this.isDefaultBotForCogSvcAccount);
    }
    /**
     * Whether this channel is enabled or not.
     * 
    */
    public Optional<Boolean> getIsEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineSpeechChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cognitiveServiceRegion;
        private String cognitiveServiceSubscriptionKey;
        private @Nullable String customSpeechModelId;
        private @Nullable String customVoiceDeploymentId;
        private @Nullable Boolean isDefaultBotForCogSvcAccount;
        private @Nullable Boolean isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineSpeechChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cognitiveServiceRegion = defaults.cognitiveServiceRegion;
    	      this.cognitiveServiceSubscriptionKey = defaults.cognitiveServiceSubscriptionKey;
    	      this.customSpeechModelId = defaults.customSpeechModelId;
    	      this.customVoiceDeploymentId = defaults.customVoiceDeploymentId;
    	      this.isDefaultBotForCogSvcAccount = defaults.isDefaultBotForCogSvcAccount;
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setCognitiveServiceRegion(String cognitiveServiceRegion) {
            this.cognitiveServiceRegion = Objects.requireNonNull(cognitiveServiceRegion);
            return this;
        }

        public Builder setCognitiveServiceSubscriptionKey(String cognitiveServiceSubscriptionKey) {
            this.cognitiveServiceSubscriptionKey = Objects.requireNonNull(cognitiveServiceSubscriptionKey);
            return this;
        }

        public Builder setCustomSpeechModelId(@Nullable String customSpeechModelId) {
            this.customSpeechModelId = customSpeechModelId;
            return this;
        }

        public Builder setCustomVoiceDeploymentId(@Nullable String customVoiceDeploymentId) {
            this.customVoiceDeploymentId = customVoiceDeploymentId;
            return this;
        }

        public Builder setIsDefaultBotForCogSvcAccount(@Nullable Boolean isDefaultBotForCogSvcAccount) {
            this.isDefaultBotForCogSvcAccount = isDefaultBotForCogSvcAccount;
            return this;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public DirectLineSpeechChannelPropertiesResponse build() {
            return new DirectLineSpeechChannelPropertiesResponse(cognitiveServiceRegion, cognitiveServiceSubscriptionKey, customSpeechModelId, customVoiceDeploymentId, isDefaultBotForCogSvcAccount, isEnabled);
        }
    }
}