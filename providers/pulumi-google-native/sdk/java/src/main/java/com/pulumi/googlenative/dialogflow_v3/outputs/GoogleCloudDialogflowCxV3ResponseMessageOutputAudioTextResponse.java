// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse {
    /**
     * @return Whether the playback of this message can be interrupted by the end user&#39;s speech and the client can then starts the next Dialogflow request.
     * 
     */
    private final Boolean allowPlaybackInterruption;
    /**
     * @return The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
     * 
     */
    private final String ssml;
    /**
     * @return The raw text to be synthesized.
     * 
     */
    private final String text;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse(
        @CustomType.Parameter("allowPlaybackInterruption") Boolean allowPlaybackInterruption,
        @CustomType.Parameter("ssml") String ssml,
        @CustomType.Parameter("text") String text) {
        this.allowPlaybackInterruption = allowPlaybackInterruption;
        this.ssml = ssml;
        this.text = text;
    }

    /**
     * @return Whether the playback of this message can be interrupted by the end user&#39;s speech and the client can then starts the next Dialogflow request.
     * 
     */
    public Boolean allowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }
    /**
     * @return The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
     * 
     */
    public String ssml() {
        return this.ssml;
    }
    /**
     * @return The raw text to be synthesized.
     * 
     */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowPlaybackInterruption;
        private String ssml;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.ssml = defaults.ssml;
    	      this.text = defaults.text;
        }

        public Builder allowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption);
            return this;
        }
        public Builder ssml(String ssml) {
            this.ssml = Objects.requireNonNull(ssml);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse(allowPlaybackInterruption, ssml, text);
        }
    }
}
