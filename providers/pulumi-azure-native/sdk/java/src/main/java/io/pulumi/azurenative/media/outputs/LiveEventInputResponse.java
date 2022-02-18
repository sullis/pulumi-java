// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.LiveEventEndpointResponse;
import io.pulumi.azurenative.media.outputs.LiveEventInputAccessControlResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LiveEventInputResponse {
    /**
     * Access control for live event input.
     * 
     */
    private final @Nullable LiveEventInputAccessControlResponse accessControl;
    /**
     * A UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * The input endpoints for the live event.
     * 
     */
    private final @Nullable List<LiveEventEndpointResponse> endpoints;
    /**
     * ISO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     * 
     */
    private final @Nullable String keyFrameIntervalDuration;
    /**
     * The input protocol for the live event. This is specified at creation time and cannot be updated.
     * 
     */
    private final String streamingProtocol;

    @OutputCustomType.Constructor({"accessControl","accessToken","endpoints","keyFrameIntervalDuration","streamingProtocol"})
    private LiveEventInputResponse(
        @Nullable LiveEventInputAccessControlResponse accessControl,
        @Nullable String accessToken,
        @Nullable List<LiveEventEndpointResponse> endpoints,
        @Nullable String keyFrameIntervalDuration,
        String streamingProtocol) {
        this.accessControl = accessControl;
        this.accessToken = accessToken;
        this.endpoints = endpoints;
        this.keyFrameIntervalDuration = keyFrameIntervalDuration;
        this.streamingProtocol = Objects.requireNonNull(streamingProtocol);
    }

    /**
     * Access control for live event input.
     * 
     */
    public Optional<LiveEventInputAccessControlResponse> getAccessControl() {
        return Optional.ofNullable(this.accessControl);
    }
    /**
     * A UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     * 
     */
    public Optional<String> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * The input endpoints for the live event.
     * 
     */
    public List<LiveEventEndpointResponse> getEndpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * ISO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     * 
     */
    public Optional<String> getKeyFrameIntervalDuration() {
        return Optional.ofNullable(this.keyFrameIntervalDuration);
    }
    /**
     * The input protocol for the live event. This is specified at creation time and cannot be updated.
     * 
     */
    public String getStreamingProtocol() {
        return this.streamingProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LiveEventInputAccessControlResponse accessControl;
        private @Nullable String accessToken;
        private @Nullable List<LiveEventEndpointResponse> endpoints;
        private @Nullable String keyFrameIntervalDuration;
        private String streamingProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.accessToken = defaults.accessToken;
    	      this.endpoints = defaults.endpoints;
    	      this.keyFrameIntervalDuration = defaults.keyFrameIntervalDuration;
    	      this.streamingProtocol = defaults.streamingProtocol;
        }

        public Builder setAccessControl(@Nullable LiveEventInputAccessControlResponse accessControl) {
            this.accessControl = accessControl;
            return this;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setEndpoints(@Nullable List<LiveEventEndpointResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setKeyFrameIntervalDuration(@Nullable String keyFrameIntervalDuration) {
            this.keyFrameIntervalDuration = keyFrameIntervalDuration;
            return this;
        }

        public Builder setStreamingProtocol(String streamingProtocol) {
            this.streamingProtocol = Objects.requireNonNull(streamingProtocol);
            return this;
        }

        public LiveEventInputResponse build() {
            return new LiveEventInputResponse(accessControl, accessToken, endpoints, keyFrameIntervalDuration, streamingProtocol);
        }
    }
}
