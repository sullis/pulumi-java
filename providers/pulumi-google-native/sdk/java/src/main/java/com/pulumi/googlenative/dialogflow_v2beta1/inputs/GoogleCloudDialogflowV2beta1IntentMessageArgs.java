// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1IntentMessagePlatform;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageCardArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageMediaContentArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmTextArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTextArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Corresponds to the `Response` field in the Dialogflow console.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageArgs();

    /**
     * Displays a basic card for Actions on Google.
     * 
     */
    @Import(name="basicCard")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs> basicCard;

    /**
     * @return Displays a basic card for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs>> basicCard() {
        return Optional.ofNullable(this.basicCard);
    }

    /**
     * Browse carousel card for Actions on Google.
     * 
     */
    @Import(name="browseCarouselCard")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs> browseCarouselCard;

    /**
     * @return Browse carousel card for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs>> browseCarouselCard() {
        return Optional.ofNullable(this.browseCarouselCard);
    }

    /**
     * Displays a card.
     * 
     */
    @Import(name="card")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageCardArgs> card;

    /**
     * @return Displays a card.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageCardArgs>> card() {
        return Optional.ofNullable(this.card);
    }

    /**
     * Displays a carousel card for Actions on Google.
     * 
     */
    @Import(name="carouselSelect")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs> carouselSelect;

    /**
     * @return Displays a carousel card for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs>> carouselSelect() {
        return Optional.ofNullable(this.carouselSelect);
    }

    /**
     * Displays an image.
     * 
     */
    @Import(name="image")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;

    /**
     * @return Displays an image.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Displays a link out suggestion chip for Actions on Google.
     * 
     */
    @Import(name="linkOutSuggestion")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs> linkOutSuggestion;

    /**
     * @return Displays a link out suggestion chip for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs>> linkOutSuggestion() {
        return Optional.ofNullable(this.linkOutSuggestion);
    }

    /**
     * Displays a list card for Actions on Google.
     * 
     */
    @Import(name="listSelect")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs> listSelect;

    /**
     * @return Displays a list card for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs>> listSelect() {
        return Optional.ofNullable(this.listSelect);
    }

    /**
     * The media content card for Actions on Google.
     * 
     */
    @Import(name="mediaContent")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageMediaContentArgs> mediaContent;

    /**
     * @return The media content card for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageMediaContentArgs>> mediaContent() {
        return Optional.ofNullable(this.mediaContent);
    }

    /**
     * A custom platform-specific response.
     * 
     */
    @Import(name="payload")
    private @Nullable Output<Map<String,String>> payload;

    /**
     * @return A custom platform-specific response.
     * 
     */
    public Optional<Output<Map<String,String>>> payload() {
        return Optional.ofNullable(this.payload);
    }

    /**
     * Optional. The platform that this message is intended for.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessagePlatform> platform;

    /**
     * @return Optional. The platform that this message is intended for.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessagePlatform>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * Displays quick replies.
     * 
     */
    @Import(name="quickReplies")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs> quickReplies;

    /**
     * @return Displays quick replies.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs>> quickReplies() {
        return Optional.ofNullable(this.quickReplies);
    }

    /**
     * Rich Business Messaging (RBM) carousel rich card response.
     * 
     */
    @Import(name="rbmCarouselRichCard")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs> rbmCarouselRichCard;

    /**
     * @return Rich Business Messaging (RBM) carousel rich card response.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs>> rbmCarouselRichCard() {
        return Optional.ofNullable(this.rbmCarouselRichCard);
    }

    /**
     * Standalone Rich Business Messaging (RBM) rich card response.
     * 
     */
    @Import(name="rbmStandaloneRichCard")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs> rbmStandaloneRichCard;

    /**
     * @return Standalone Rich Business Messaging (RBM) rich card response.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs>> rbmStandaloneRichCard() {
        return Optional.ofNullable(this.rbmStandaloneRichCard);
    }

    /**
     * Rich Business Messaging (RBM) text response. RBM allows businesses to send enriched and branded versions of SMS. See https://jibe.google.com/business-messaging.
     * 
     */
    @Import(name="rbmText")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmTextArgs> rbmText;

    /**
     * @return Rich Business Messaging (RBM) text response. RBM allows businesses to send enriched and branded versions of SMS. See https://jibe.google.com/business-messaging.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageRbmTextArgs>> rbmText() {
        return Optional.ofNullable(this.rbmText);
    }

    /**
     * Returns a voice or text-only response for Actions on Google.
     * 
     */
    @Import(name="simpleResponses")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs> simpleResponses;

    /**
     * @return Returns a voice or text-only response for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs>> simpleResponses() {
        return Optional.ofNullable(this.simpleResponses);
    }

    /**
     * Displays suggestion chips for Actions on Google.
     * 
     */
    @Import(name="suggestions")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs> suggestions;

    /**
     * @return Displays suggestion chips for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs>> suggestions() {
        return Optional.ofNullable(this.suggestions);
    }

    /**
     * Table card for Actions on Google.
     * 
     */
    @Import(name="tableCard")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs> tableCard;

    /**
     * @return Table card for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs>> tableCard() {
        return Optional.ofNullable(this.tableCard);
    }

    /**
     * Plays audio from a file in Telephony Gateway.
     * 
     */
    @Import(name="telephonyPlayAudio")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs> telephonyPlayAudio;

    /**
     * @return Plays audio from a file in Telephony Gateway.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs>> telephonyPlayAudio() {
        return Optional.ofNullable(this.telephonyPlayAudio);
    }

    /**
     * Synthesizes speech in Telephony Gateway.
     * 
     */
    @Import(name="telephonySynthesizeSpeech")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs> telephonySynthesizeSpeech;

    /**
     * @return Synthesizes speech in Telephony Gateway.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs>> telephonySynthesizeSpeech() {
        return Optional.ofNullable(this.telephonySynthesizeSpeech);
    }

    /**
     * Transfers the call in Telephony Gateway.
     * 
     */
    @Import(name="telephonyTransferCall")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs> telephonyTransferCall;

    /**
     * @return Transfers the call in Telephony Gateway.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs>> telephonyTransferCall() {
        return Optional.ofNullable(this.telephonyTransferCall);
    }

    /**
     * Returns a text response.
     * 
     */
    @Import(name="text")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTextArgs> text;

    /**
     * @return Returns a text response.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageTextArgs>> text() {
        return Optional.ofNullable(this.text);
    }

    private GoogleCloudDialogflowV2beta1IntentMessageArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageArgs(GoogleCloudDialogflowV2beta1IntentMessageArgs $) {
        this.basicCard = $.basicCard;
        this.browseCarouselCard = $.browseCarouselCard;
        this.card = $.card;
        this.carouselSelect = $.carouselSelect;
        this.image = $.image;
        this.linkOutSuggestion = $.linkOutSuggestion;
        this.listSelect = $.listSelect;
        this.mediaContent = $.mediaContent;
        this.payload = $.payload;
        this.platform = $.platform;
        this.quickReplies = $.quickReplies;
        this.rbmCarouselRichCard = $.rbmCarouselRichCard;
        this.rbmStandaloneRichCard = $.rbmStandaloneRichCard;
        this.rbmText = $.rbmText;
        this.simpleResponses = $.simpleResponses;
        this.suggestions = $.suggestions;
        this.tableCard = $.tableCard;
        this.telephonyPlayAudio = $.telephonyPlayAudio;
        this.telephonySynthesizeSpeech = $.telephonySynthesizeSpeech;
        this.telephonyTransferCall = $.telephonyTransferCall;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basicCard Displays a basic card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder basicCard(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs> basicCard) {
            $.basicCard = basicCard;
            return this;
        }

        /**
         * @param basicCard Displays a basic card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder basicCard(GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs basicCard) {
            return basicCard(Output.of(basicCard));
        }

        /**
         * @param browseCarouselCard Browse carousel card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder browseCarouselCard(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs> browseCarouselCard) {
            $.browseCarouselCard = browseCarouselCard;
            return this;
        }

        /**
         * @param browseCarouselCard Browse carousel card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder browseCarouselCard(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs browseCarouselCard) {
            return browseCarouselCard(Output.of(browseCarouselCard));
        }

        /**
         * @param card Displays a card.
         * 
         * @return builder
         * 
         */
        public Builder card(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageCardArgs> card) {
            $.card = card;
            return this;
        }

        /**
         * @param card Displays a card.
         * 
         * @return builder
         * 
         */
        public Builder card(GoogleCloudDialogflowV2beta1IntentMessageCardArgs card) {
            return card(Output.of(card));
        }

        /**
         * @param carouselSelect Displays a carousel card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder carouselSelect(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs> carouselSelect) {
            $.carouselSelect = carouselSelect;
            return this;
        }

        /**
         * @param carouselSelect Displays a carousel card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder carouselSelect(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs carouselSelect) {
            return carouselSelect(Output.of(carouselSelect));
        }

        /**
         * @param image Displays an image.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Displays an image.
         * 
         * @return builder
         * 
         */
        public Builder image(GoogleCloudDialogflowV2beta1IntentMessageImageArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param linkOutSuggestion Displays a link out suggestion chip for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder linkOutSuggestion(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs> linkOutSuggestion) {
            $.linkOutSuggestion = linkOutSuggestion;
            return this;
        }

        /**
         * @param linkOutSuggestion Displays a link out suggestion chip for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder linkOutSuggestion(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs linkOutSuggestion) {
            return linkOutSuggestion(Output.of(linkOutSuggestion));
        }

        /**
         * @param listSelect Displays a list card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder listSelect(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs> listSelect) {
            $.listSelect = listSelect;
            return this;
        }

        /**
         * @param listSelect Displays a list card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder listSelect(GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs listSelect) {
            return listSelect(Output.of(listSelect));
        }

        /**
         * @param mediaContent The media content card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder mediaContent(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageMediaContentArgs> mediaContent) {
            $.mediaContent = mediaContent;
            return this;
        }

        /**
         * @param mediaContent The media content card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder mediaContent(GoogleCloudDialogflowV2beta1IntentMessageMediaContentArgs mediaContent) {
            return mediaContent(Output.of(mediaContent));
        }

        /**
         * @param payload A custom platform-specific response.
         * 
         * @return builder
         * 
         */
        public Builder payload(@Nullable Output<Map<String,String>> payload) {
            $.payload = payload;
            return this;
        }

        /**
         * @param payload A custom platform-specific response.
         * 
         * @return builder
         * 
         */
        public Builder payload(Map<String,String> payload) {
            return payload(Output.of(payload));
        }

        /**
         * @param platform Optional. The platform that this message is intended for.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessagePlatform> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform Optional. The platform that this message is intended for.
         * 
         * @return builder
         * 
         */
        public Builder platform(GoogleCloudDialogflowV2beta1IntentMessagePlatform platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param quickReplies Displays quick replies.
         * 
         * @return builder
         * 
         */
        public Builder quickReplies(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs> quickReplies) {
            $.quickReplies = quickReplies;
            return this;
        }

        /**
         * @param quickReplies Displays quick replies.
         * 
         * @return builder
         * 
         */
        public Builder quickReplies(GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs quickReplies) {
            return quickReplies(Output.of(quickReplies));
        }

        /**
         * @param rbmCarouselRichCard Rich Business Messaging (RBM) carousel rich card response.
         * 
         * @return builder
         * 
         */
        public Builder rbmCarouselRichCard(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs> rbmCarouselRichCard) {
            $.rbmCarouselRichCard = rbmCarouselRichCard;
            return this;
        }

        /**
         * @param rbmCarouselRichCard Rich Business Messaging (RBM) carousel rich card response.
         * 
         * @return builder
         * 
         */
        public Builder rbmCarouselRichCard(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs rbmCarouselRichCard) {
            return rbmCarouselRichCard(Output.of(rbmCarouselRichCard));
        }

        /**
         * @param rbmStandaloneRichCard Standalone Rich Business Messaging (RBM) rich card response.
         * 
         * @return builder
         * 
         */
        public Builder rbmStandaloneRichCard(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs> rbmStandaloneRichCard) {
            $.rbmStandaloneRichCard = rbmStandaloneRichCard;
            return this;
        }

        /**
         * @param rbmStandaloneRichCard Standalone Rich Business Messaging (RBM) rich card response.
         * 
         * @return builder
         * 
         */
        public Builder rbmStandaloneRichCard(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs rbmStandaloneRichCard) {
            return rbmStandaloneRichCard(Output.of(rbmStandaloneRichCard));
        }

        /**
         * @param rbmText Rich Business Messaging (RBM) text response. RBM allows businesses to send enriched and branded versions of SMS. See https://jibe.google.com/business-messaging.
         * 
         * @return builder
         * 
         */
        public Builder rbmText(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmTextArgs> rbmText) {
            $.rbmText = rbmText;
            return this;
        }

        /**
         * @param rbmText Rich Business Messaging (RBM) text response. RBM allows businesses to send enriched and branded versions of SMS. See https://jibe.google.com/business-messaging.
         * 
         * @return builder
         * 
         */
        public Builder rbmText(GoogleCloudDialogflowV2beta1IntentMessageRbmTextArgs rbmText) {
            return rbmText(Output.of(rbmText));
        }

        /**
         * @param simpleResponses Returns a voice or text-only response for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder simpleResponses(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs> simpleResponses) {
            $.simpleResponses = simpleResponses;
            return this;
        }

        /**
         * @param simpleResponses Returns a voice or text-only response for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder simpleResponses(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs simpleResponses) {
            return simpleResponses(Output.of(simpleResponses));
        }

        /**
         * @param suggestions Displays suggestion chips for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs> suggestions) {
            $.suggestions = suggestions;
            return this;
        }

        /**
         * @param suggestions Displays suggestion chips for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs suggestions) {
            return suggestions(Output.of(suggestions));
        }

        /**
         * @param tableCard Table card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder tableCard(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs> tableCard) {
            $.tableCard = tableCard;
            return this;
        }

        /**
         * @param tableCard Table card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder tableCard(GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs tableCard) {
            return tableCard(Output.of(tableCard));
        }

        /**
         * @param telephonyPlayAudio Plays audio from a file in Telephony Gateway.
         * 
         * @return builder
         * 
         */
        public Builder telephonyPlayAudio(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs> telephonyPlayAudio) {
            $.telephonyPlayAudio = telephonyPlayAudio;
            return this;
        }

        /**
         * @param telephonyPlayAudio Plays audio from a file in Telephony Gateway.
         * 
         * @return builder
         * 
         */
        public Builder telephonyPlayAudio(GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs telephonyPlayAudio) {
            return telephonyPlayAudio(Output.of(telephonyPlayAudio));
        }

        /**
         * @param telephonySynthesizeSpeech Synthesizes speech in Telephony Gateway.
         * 
         * @return builder
         * 
         */
        public Builder telephonySynthesizeSpeech(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs> telephonySynthesizeSpeech) {
            $.telephonySynthesizeSpeech = telephonySynthesizeSpeech;
            return this;
        }

        /**
         * @param telephonySynthesizeSpeech Synthesizes speech in Telephony Gateway.
         * 
         * @return builder
         * 
         */
        public Builder telephonySynthesizeSpeech(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs telephonySynthesizeSpeech) {
            return telephonySynthesizeSpeech(Output.of(telephonySynthesizeSpeech));
        }

        /**
         * @param telephonyTransferCall Transfers the call in Telephony Gateway.
         * 
         * @return builder
         * 
         */
        public Builder telephonyTransferCall(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs> telephonyTransferCall) {
            $.telephonyTransferCall = telephonyTransferCall;
            return this;
        }

        /**
         * @param telephonyTransferCall Transfers the call in Telephony Gateway.
         * 
         * @return builder
         * 
         */
        public Builder telephonyTransferCall(GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs telephonyTransferCall) {
            return telephonyTransferCall(Output.of(telephonyTransferCall));
        }

        /**
         * @param text Returns a text response.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageTextArgs> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text Returns a text response.
         * 
         * @return builder
         * 
         */
        public Builder text(GoogleCloudDialogflowV2beta1IntentMessageTextArgs text) {
            return text(Output.of(text));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageArgs build() {
            return $;
        }
    }

}
