// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse {
    /**
     * @return Optional. The text to display.
     * 
     */
    private final String displayText;
    /**
     * @return One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech.
     * 
     */
    private final String ssml;
    /**
     * @return One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml.
     * 
     */
    private final String textToSpeech;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse(
        @CustomType.Parameter("displayText") String displayText,
        @CustomType.Parameter("ssml") String ssml,
        @CustomType.Parameter("textToSpeech") String textToSpeech) {
        this.displayText = displayText;
        this.ssml = ssml;
        this.textToSpeech = textToSpeech;
    }

    /**
     * @return Optional. The text to display.
     * 
     */
    public String displayText() {
        return this.displayText;
    }
    /**
     * @return One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech.
     * 
     */
    public String ssml() {
        return this.ssml;
    }
    /**
     * @return One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml.
     * 
     */
    public String textToSpeech() {
        return this.textToSpeech;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayText;
        private String ssml;
        private String textToSpeech;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayText = defaults.displayText;
    	      this.ssml = defaults.ssml;
    	      this.textToSpeech = defaults.textToSpeech;
        }

        public Builder displayText(String displayText) {
            this.displayText = Objects.requireNonNull(displayText);
            return this;
        }
        public Builder ssml(String ssml) {
            this.ssml = Objects.requireNonNull(ssml);
            return this;
        }
        public Builder textToSpeech(String textToSpeech) {
            this.textToSpeech = Objects.requireNonNull(textToSpeech);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse(displayText, ssml, textToSpeech);
        }
    }
}
