// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3AudioInputResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3DtmfInputResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3EventInputResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3IntentInputResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3TextInputResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3QueryInputResponse {
    /**
     * The natural language speech audio to be processed.
     * 
     */
    private final GoogleCloudDialogflowCxV3AudioInputResponse audio;
    /**
     * The DTMF event to be handled.
     * 
     */
    private final GoogleCloudDialogflowCxV3DtmfInputResponse dtmf;
    /**
     * The event to be triggered.
     * 
     */
    private final GoogleCloudDialogflowCxV3EventInputResponse event;
    /**
     * The intent to be triggered.
     * 
     */
    private final GoogleCloudDialogflowCxV3IntentInputResponse intent;
    /**
     * The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    private final String languageCode;
    /**
     * The natural language text to be processed.
     * 
     */
    private final GoogleCloudDialogflowCxV3TextInputResponse text;

    @OutputCustomType.Constructor({"audio","dtmf","event","intent","languageCode","text"})
    private GoogleCloudDialogflowCxV3QueryInputResponse(
        GoogleCloudDialogflowCxV3AudioInputResponse audio,
        GoogleCloudDialogflowCxV3DtmfInputResponse dtmf,
        GoogleCloudDialogflowCxV3EventInputResponse event,
        GoogleCloudDialogflowCxV3IntentInputResponse intent,
        String languageCode,
        GoogleCloudDialogflowCxV3TextInputResponse text) {
        this.audio = Objects.requireNonNull(audio);
        this.dtmf = Objects.requireNonNull(dtmf);
        this.event = Objects.requireNonNull(event);
        this.intent = Objects.requireNonNull(intent);
        this.languageCode = Objects.requireNonNull(languageCode);
        this.text = Objects.requireNonNull(text);
    }

    /**
     * The natural language speech audio to be processed.
     * 
    */
    public GoogleCloudDialogflowCxV3AudioInputResponse getAudio() {
        return this.audio;
    }
    /**
     * The DTMF event to be handled.
     * 
    */
    public GoogleCloudDialogflowCxV3DtmfInputResponse getDtmf() {
        return this.dtmf;
    }
    /**
     * The event to be triggered.
     * 
    */
    public GoogleCloudDialogflowCxV3EventInputResponse getEvent() {
        return this.event;
    }
    /**
     * The intent to be triggered.
     * 
    */
    public GoogleCloudDialogflowCxV3IntentInputResponse getIntent() {
        return this.intent;
    }
    /**
     * The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
    */
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * The natural language text to be processed.
     * 
    */
    public GoogleCloudDialogflowCxV3TextInputResponse getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3QueryInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3AudioInputResponse audio;
        private GoogleCloudDialogflowCxV3DtmfInputResponse dtmf;
        private GoogleCloudDialogflowCxV3EventInputResponse event;
        private GoogleCloudDialogflowCxV3IntentInputResponse intent;
        private String languageCode;
        private GoogleCloudDialogflowCxV3TextInputResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3QueryInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.dtmf = defaults.dtmf;
    	      this.event = defaults.event;
    	      this.intent = defaults.intent;
    	      this.languageCode = defaults.languageCode;
    	      this.text = defaults.text;
        }

        public Builder setAudio(GoogleCloudDialogflowCxV3AudioInputResponse audio) {
            this.audio = Objects.requireNonNull(audio);
            return this;
        }

        public Builder setDtmf(GoogleCloudDialogflowCxV3DtmfInputResponse dtmf) {
            this.dtmf = Objects.requireNonNull(dtmf);
            return this;
        }

        public Builder setEvent(GoogleCloudDialogflowCxV3EventInputResponse event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }

        public Builder setIntent(GoogleCloudDialogflowCxV3IntentInputResponse intent) {
            this.intent = Objects.requireNonNull(intent);
            return this;
        }

        public Builder setLanguageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder setText(GoogleCloudDialogflowCxV3TextInputResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowCxV3QueryInputResponse build() {
            return new GoogleCloudDialogflowCxV3QueryInputResponse(audio, dtmf, event, intent, languageCode, text);
        }
    }
}