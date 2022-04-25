// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1ConversationParticipantResponse;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1SentimentDataResponse;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A segment of a full transcript.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse Empty = new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse();

    /**
     * For conversations derived from multi-channel audio, this is the channel number corresponding to the audio from that channel. For audioChannelCount = N, its output values can range from &#39;1&#39; to &#39;N&#39;. A channel tag of 0 indicates that the audio is mono.
     * 
     */
    @Import(name="channelTag", required=true)
    private Integer channelTag;

    /**
     * @return For conversations derived from multi-channel audio, this is the channel number corresponding to the audio from that channel. For audioChannelCount = N, its output values can range from &#39;1&#39; to &#39;N&#39;. A channel tag of 0 indicates that the audio is mono.
     * 
     */
    public Integer channelTag() {
        return this.channelTag;
    }

    /**
     * A confidence estimate between 0.0 and 1.0 of the fidelity of this segment. A default value of 0.0 indicates that the value is unset.
     * 
     */
    @Import(name="confidence", required=true)
    private Double confidence;

    /**
     * @return A confidence estimate between 0.0 and 1.0 of the fidelity of this segment. A default value of 0.0 indicates that the value is unset.
     * 
     */
    public Double confidence() {
        return this.confidence;
    }

    /**
     * CCAI metadata relating to the current transcript segment.
     * 
     */
    @Import(name="dialogflowSegmentMetadata", required=true)
    private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse dialogflowSegmentMetadata;

    /**
     * @return CCAI metadata relating to the current transcript segment.
     * 
     */
    public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse dialogflowSegmentMetadata() {
        return this.dialogflowSegmentMetadata;
    }

    /**
     * The language code of this segment as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
     * 
     */
    @Import(name="languageCode", required=true)
    private String languageCode;

    /**
     * @return The language code of this segment as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
     * 
     */
    public String languageCode() {
        return this.languageCode;
    }

    /**
     * The time that the message occurred, if provided.
     * 
     */
    @Import(name="messageTime", required=true)
    private String messageTime;

    /**
     * @return The time that the message occurred, if provided.
     * 
     */
    public String messageTime() {
        return this.messageTime;
    }

    /**
     * The participant of this segment.
     * 
     */
    @Import(name="segmentParticipant", required=true)
    private GoogleCloudContactcenterinsightsV1ConversationParticipantResponse segmentParticipant;

    /**
     * @return The participant of this segment.
     * 
     */
    public GoogleCloudContactcenterinsightsV1ConversationParticipantResponse segmentParticipant() {
        return this.segmentParticipant;
    }

    /**
     * The sentiment for this transcript segment.
     * 
     */
    @Import(name="sentiment", required=true)
    private GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment;

    /**
     * @return The sentiment for this transcript segment.
     * 
     */
    public GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment() {
        return this.sentiment;
    }

    /**
     * The text of this segment.
     * 
     */
    @Import(name="text", required=true)
    private String text;

    /**
     * @return The text of this segment.
     * 
     */
    public String text() {
        return this.text;
    }

    /**
     * A list of the word-specific information for each word in the segment.
     * 
     */
    @Import(name="words", required=true)
    private List<GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse> words;

    /**
     * @return A list of the word-specific information for each word in the segment.
     * 
     */
    public List<GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse> words() {
        return this.words;
    }

    private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse() {}

    private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse $) {
        this.channelTag = $.channelTag;
        this.confidence = $.confidence;
        this.dialogflowSegmentMetadata = $.dialogflowSegmentMetadata;
        this.languageCode = $.languageCode;
        this.messageTime = $.messageTime;
        this.segmentParticipant = $.segmentParticipant;
        this.sentiment = $.sentiment;
        this.text = $.text;
        this.words = $.words;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelTag For conversations derived from multi-channel audio, this is the channel number corresponding to the audio from that channel. For audioChannelCount = N, its output values can range from &#39;1&#39; to &#39;N&#39;. A channel tag of 0 indicates that the audio is mono.
         * 
         * @return builder
         * 
         */
        public Builder channelTag(Integer channelTag) {
            $.channelTag = channelTag;
            return this;
        }

        /**
         * @param confidence A confidence estimate between 0.0 and 1.0 of the fidelity of this segment. A default value of 0.0 indicates that the value is unset.
         * 
         * @return builder
         * 
         */
        public Builder confidence(Double confidence) {
            $.confidence = confidence;
            return this;
        }

        /**
         * @param dialogflowSegmentMetadata CCAI metadata relating to the current transcript segment.
         * 
         * @return builder
         * 
         */
        public Builder dialogflowSegmentMetadata(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse dialogflowSegmentMetadata) {
            $.dialogflowSegmentMetadata = dialogflowSegmentMetadata;
            return this;
        }

        /**
         * @param languageCode The language code of this segment as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param messageTime The time that the message occurred, if provided.
         * 
         * @return builder
         * 
         */
        public Builder messageTime(String messageTime) {
            $.messageTime = messageTime;
            return this;
        }

        /**
         * @param segmentParticipant The participant of this segment.
         * 
         * @return builder
         * 
         */
        public Builder segmentParticipant(GoogleCloudContactcenterinsightsV1ConversationParticipantResponse segmentParticipant) {
            $.segmentParticipant = segmentParticipant;
            return this;
        }

        /**
         * @param sentiment The sentiment for this transcript segment.
         * 
         * @return builder
         * 
         */
        public Builder sentiment(GoogleCloudContactcenterinsightsV1SentimentDataResponse sentiment) {
            $.sentiment = sentiment;
            return this;
        }

        /**
         * @param text The text of this segment.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            $.text = text;
            return this;
        }

        /**
         * @param words A list of the word-specific information for each word in the segment.
         * 
         * @return builder
         * 
         */
        public Builder words(List<GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse> words) {
            $.words = words;
            return this;
        }

        /**
         * @param words A list of the word-specific information for each word in the segment.
         * 
         * @return builder
         * 
         */
        public Builder words(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse... words) {
            return words(List.of(words));
        }

        public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentResponse build() {
            $.channelTag = Objects.requireNonNull($.channelTag, "expected parameter 'channelTag' to be non-null");
            $.confidence = Objects.requireNonNull($.confidence, "expected parameter 'confidence' to be non-null");
            $.dialogflowSegmentMetadata = Objects.requireNonNull($.dialogflowSegmentMetadata, "expected parameter 'dialogflowSegmentMetadata' to be non-null");
            $.languageCode = Objects.requireNonNull($.languageCode, "expected parameter 'languageCode' to be non-null");
            $.messageTime = Objects.requireNonNull($.messageTime, "expected parameter 'messageTime' to be non-null");
            $.segmentParticipant = Objects.requireNonNull($.segmentParticipant, "expected parameter 'segmentParticipant' to be non-null");
            $.sentiment = Objects.requireNonNull($.sentiment, "expected parameter 'sentiment' to be non-null");
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            $.words = Objects.requireNonNull($.words, "expected parameter 'words' to be non-null");
            return $;
        }
    }

}
