// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotVoiceSettings {
    /**
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * 
     */
    private final String voiceId;

    @OutputCustomType.Constructor({"voiceId"})
    private BotVoiceSettings(String voiceId) {
        this.voiceId = Objects.requireNonNull(voiceId);
    }

    /**
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * 
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotVoiceSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String voiceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotVoiceSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.voiceId = defaults.voiceId;
        }

        public Builder setVoiceId(String voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId);
            return this;
        }

        public BotVoiceSettings build() {
            return new BotVoiceSettings(voiceId);
        }
    }
}
