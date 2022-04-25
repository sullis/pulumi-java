// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1AudioInputArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1DtmfInputArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EventInputArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1IntentInputArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TextInputArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the query input. It can contain one of: 1. A conversational query in the form of text. 2. An intent query that specifies which intent to trigger. 3. Natural language speech audio to be processed. 4. An event to be triggered.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1QueryInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1QueryInputArgs Empty = new GoogleCloudDialogflowCxV3beta1QueryInputArgs();

    /**
     * The natural language speech audio to be processed.
     * 
     */
    @Import(name="audio")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1AudioInputArgs> audio;

    /**
     * @return The natural language speech audio to be processed.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1AudioInputArgs>> audio() {
        return Optional.ofNullable(this.audio);
    }

    /**
     * The DTMF event to be handled.
     * 
     */
    @Import(name="dtmf")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1DtmfInputArgs> dtmf;

    /**
     * @return The DTMF event to be handled.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1DtmfInputArgs>> dtmf() {
        return Optional.ofNullable(this.dtmf);
    }

    /**
     * The event to be triggered.
     * 
     */
    @Import(name="event")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1EventInputArgs> event;

    /**
     * @return The event to be triggered.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1EventInputArgs>> event() {
        return Optional.ofNullable(this.event);
    }

    /**
     * The intent to be triggered.
     * 
     */
    @Import(name="intent")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1IntentInputArgs> intent;

    /**
     * @return The intent to be triggered.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1IntentInputArgs>> intent() {
        return Optional.ofNullable(this.intent);
    }

    /**
     * The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    @Import(name="languageCode", required=true)
    private Output<String> languageCode;

    /**
     * @return The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }

    /**
     * The natural language text to be processed.
     * 
     */
    @Import(name="text")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1TextInputArgs> text;

    /**
     * @return The natural language text to be processed.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1TextInputArgs>> text() {
        return Optional.ofNullable(this.text);
    }

    private GoogleCloudDialogflowCxV3beta1QueryInputArgs() {}

    private GoogleCloudDialogflowCxV3beta1QueryInputArgs(GoogleCloudDialogflowCxV3beta1QueryInputArgs $) {
        this.audio = $.audio;
        this.dtmf = $.dtmf;
        this.event = $.event;
        this.intent = $.intent;
        this.languageCode = $.languageCode;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1QueryInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1QueryInputArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1QueryInputArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1QueryInputArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1QueryInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audio The natural language speech audio to be processed.
         * 
         * @return builder
         * 
         */
        public Builder audio(@Nullable Output<GoogleCloudDialogflowCxV3beta1AudioInputArgs> audio) {
            $.audio = audio;
            return this;
        }

        /**
         * @param audio The natural language speech audio to be processed.
         * 
         * @return builder
         * 
         */
        public Builder audio(GoogleCloudDialogflowCxV3beta1AudioInputArgs audio) {
            return audio(Output.of(audio));
        }

        /**
         * @param dtmf The DTMF event to be handled.
         * 
         * @return builder
         * 
         */
        public Builder dtmf(@Nullable Output<GoogleCloudDialogflowCxV3beta1DtmfInputArgs> dtmf) {
            $.dtmf = dtmf;
            return this;
        }

        /**
         * @param dtmf The DTMF event to be handled.
         * 
         * @return builder
         * 
         */
        public Builder dtmf(GoogleCloudDialogflowCxV3beta1DtmfInputArgs dtmf) {
            return dtmf(Output.of(dtmf));
        }

        /**
         * @param event The event to be triggered.
         * 
         * @return builder
         * 
         */
        public Builder event(@Nullable Output<GoogleCloudDialogflowCxV3beta1EventInputArgs> event) {
            $.event = event;
            return this;
        }

        /**
         * @param event The event to be triggered.
         * 
         * @return builder
         * 
         */
        public Builder event(GoogleCloudDialogflowCxV3beta1EventInputArgs event) {
            return event(Output.of(event));
        }

        /**
         * @param intent The intent to be triggered.
         * 
         * @return builder
         * 
         */
        public Builder intent(@Nullable Output<GoogleCloudDialogflowCxV3beta1IntentInputArgs> intent) {
            $.intent = intent;
            return this;
        }

        /**
         * @param intent The intent to be triggered.
         * 
         * @return builder
         * 
         */
        public Builder intent(GoogleCloudDialogflowCxV3beta1IntentInputArgs intent) {
            return intent(Output.of(intent));
        }

        /**
         * @param languageCode The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param text The natural language text to be processed.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<GoogleCloudDialogflowCxV3beta1TextInputArgs> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text The natural language text to be processed.
         * 
         * @return builder
         * 
         */
        public Builder text(GoogleCloudDialogflowCxV3beta1TextInputArgs text) {
            return text(Output.of(text));
        }

        public GoogleCloudDialogflowCxV3beta1QueryInputArgs build() {
            $.languageCode = Objects.requireNonNull($.languageCode, "expected parameter 'languageCode' to be non-null");
            return $;
        }
    }

}
