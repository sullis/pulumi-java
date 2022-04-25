// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.EnabledProtocolsResponse;
import com.pulumi.azurenative.media.inputs.StreamingPolicyContentKeysResponse;
import com.pulumi.azurenative.media.inputs.TrackSelectionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class for EnvelopeEncryption encryption scheme
 * 
 */
public final class EnvelopeEncryptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvelopeEncryptionResponse Empty = new EnvelopeEncryptionResponse();

    /**
     * Representing which tracks should not be encrypted
     * 
     */
    @Import(name="clearTracks")
    private @Nullable List<TrackSelectionResponse> clearTracks;

    /**
     * @return Representing which tracks should not be encrypted
     * 
     */
    public Optional<List<TrackSelectionResponse>> clearTracks() {
        return Optional.ofNullable(this.clearTracks);
    }

    /**
     * Representing default content key for each encryption scheme and separate content keys for specific tracks
     * 
     */
    @Import(name="contentKeys")
    private @Nullable StreamingPolicyContentKeysResponse contentKeys;

    /**
     * @return Representing default content key for each encryption scheme and separate content keys for specific tracks
     * 
     */
    public Optional<StreamingPolicyContentKeysResponse> contentKeys() {
        return Optional.ofNullable(this.contentKeys);
    }

    /**
     * Template for the URL of the custom service delivering keys to end user players.  Not required when using Azure Media Services for issuing keys.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    @Import(name="customKeyAcquisitionUrlTemplate")
    private @Nullable String customKeyAcquisitionUrlTemplate;

    /**
     * @return Template for the URL of the custom service delivering keys to end user players.  Not required when using Azure Media Services for issuing keys.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    public Optional<String> customKeyAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.customKeyAcquisitionUrlTemplate);
    }

    /**
     * Representing supported protocols
     * 
     */
    @Import(name="enabledProtocols")
    private @Nullable EnabledProtocolsResponse enabledProtocols;

    /**
     * @return Representing supported protocols
     * 
     */
    public Optional<EnabledProtocolsResponse> enabledProtocols() {
        return Optional.ofNullable(this.enabledProtocols);
    }

    private EnvelopeEncryptionResponse() {}

    private EnvelopeEncryptionResponse(EnvelopeEncryptionResponse $) {
        this.clearTracks = $.clearTracks;
        this.contentKeys = $.contentKeys;
        this.customKeyAcquisitionUrlTemplate = $.customKeyAcquisitionUrlTemplate;
        this.enabledProtocols = $.enabledProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvelopeEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvelopeEncryptionResponse $;

        public Builder() {
            $ = new EnvelopeEncryptionResponse();
        }

        public Builder(EnvelopeEncryptionResponse defaults) {
            $ = new EnvelopeEncryptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param clearTracks Representing which tracks should not be encrypted
         * 
         * @return builder
         * 
         */
        public Builder clearTracks(@Nullable List<TrackSelectionResponse> clearTracks) {
            $.clearTracks = clearTracks;
            return this;
        }

        /**
         * @param clearTracks Representing which tracks should not be encrypted
         * 
         * @return builder
         * 
         */
        public Builder clearTracks(TrackSelectionResponse... clearTracks) {
            return clearTracks(List.of(clearTracks));
        }

        /**
         * @param contentKeys Representing default content key for each encryption scheme and separate content keys for specific tracks
         * 
         * @return builder
         * 
         */
        public Builder contentKeys(@Nullable StreamingPolicyContentKeysResponse contentKeys) {
            $.contentKeys = contentKeys;
            return this;
        }

        /**
         * @param customKeyAcquisitionUrlTemplate Template for the URL of the custom service delivering keys to end user players.  Not required when using Azure Media Services for issuing keys.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
         * 
         * @return builder
         * 
         */
        public Builder customKeyAcquisitionUrlTemplate(@Nullable String customKeyAcquisitionUrlTemplate) {
            $.customKeyAcquisitionUrlTemplate = customKeyAcquisitionUrlTemplate;
            return this;
        }

        /**
         * @param enabledProtocols Representing supported protocols
         * 
         * @return builder
         * 
         */
        public Builder enabledProtocols(@Nullable EnabledProtocolsResponse enabledProtocols) {
            $.enabledProtocols = enabledProtocols;
            return this;
        }

        public EnvelopeEncryptionResponse build() {
            return $;
        }
    }

}
