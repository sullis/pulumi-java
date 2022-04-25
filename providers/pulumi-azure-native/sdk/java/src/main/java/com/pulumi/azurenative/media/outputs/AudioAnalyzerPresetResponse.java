// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AudioAnalyzerPresetResponse {
    /**
     * @return The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;).  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
     * 
     */
    private final @Nullable String audioLanguage;
    /**
     * @return Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    private final @Nullable Map<String,String> experimentalOptions;
    /**
     * @return Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
     */
    private final @Nullable String mode;
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.AudioAnalyzerPreset&#39;.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private AudioAnalyzerPresetResponse(
        @CustomType.Parameter("audioLanguage") @Nullable String audioLanguage,
        @CustomType.Parameter("experimentalOptions") @Nullable Map<String,String> experimentalOptions,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("odataType") String odataType) {
        this.audioLanguage = audioLanguage;
        this.experimentalOptions = experimentalOptions;
        this.mode = mode;
        this.odataType = odataType;
    }

    /**
     * @return The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;).  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
     * 
     */
    public Optional<String> audioLanguage() {
        return Optional.ofNullable(this.audioLanguage);
    }
    /**
     * @return Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    public Map<String,String> experimentalOptions() {
        return this.experimentalOptions == null ? Map.of() : this.experimentalOptions;
    }
    /**
     * @return Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.AudioAnalyzerPreset&#39;.
     * 
     */
    public String odataType() {
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

        public Builder audioLanguage(@Nullable String audioLanguage) {
            this.audioLanguage = audioLanguage;
            return this;
        }
        public Builder experimentalOptions(@Nullable Map<String,String> experimentalOptions) {
            this.experimentalOptions = experimentalOptions;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public AudioAnalyzerPresetResponse build() {
            return new AudioAnalyzerPresetResponse(audioLanguage, experimentalOptions, mode, odataType);
        }
    }
}
