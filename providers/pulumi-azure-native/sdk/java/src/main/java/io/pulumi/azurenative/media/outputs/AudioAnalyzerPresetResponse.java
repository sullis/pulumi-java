// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AudioAnalyzerPresetResponse {
    /**
     * The language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US').  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn't specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to 'en-US'." The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
     * 
     */
    private final @Nullable String audioLanguage;
    /**
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    private final @Nullable Map<String,String> experimentalOptions;
    /**
     * Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
     */
    private final @Nullable String mode;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AudioAnalyzerPreset'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"audioLanguage","experimentalOptions","mode","odataType"})
    private AudioAnalyzerPresetResponse(
        @Nullable String audioLanguage,
        @Nullable Map<String,String> experimentalOptions,
        @Nullable String mode,
        String odataType) {
        this.audioLanguage = audioLanguage;
        this.experimentalOptions = experimentalOptions;
        this.mode = mode;
        this.odataType = Objects.requireNonNull(odataType);
    }

    /**
     * The language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US').  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn't specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to 'en-US'." The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
     * 
    */
    public Optional<String> getAudioLanguage() {
        return Optional.ofNullable(this.audioLanguage);
    }
    /**
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
    */
    public Map<String,String> getExperimentalOptions() {
        return this.experimentalOptions == null ? Map.of() : this.experimentalOptions;
    }
    /**
     * Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
    */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AudioAnalyzerPreset'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioAnalyzerPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audioLanguage;
        private @Nullable Map<String,String> experimentalOptions;
        private @Nullable String mode;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioAnalyzerPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioLanguage = defaults.audioLanguage;
    	      this.experimentalOptions = defaults.experimentalOptions;
    	      this.mode = defaults.mode;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAudioLanguage(@Nullable String audioLanguage) {
            this.audioLanguage = audioLanguage;
            return this;
        }

        public Builder setExperimentalOptions(@Nullable Map<String,String> experimentalOptions) {
            this.experimentalOptions = experimentalOptions;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public AudioAnalyzerPresetResponse build() {
            return new AudioAnalyzerPresetResponse(audioLanguage, experimentalOptions, mode, odataType);
        }
    }
}