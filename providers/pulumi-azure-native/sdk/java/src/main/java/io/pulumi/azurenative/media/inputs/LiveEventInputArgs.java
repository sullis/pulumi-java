// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.LiveEventInputProtocol;
import io.pulumi.azurenative.media.inputs.LiveEventEndpointArgs;
import io.pulumi.azurenative.media.inputs.LiveEventInputAccessControlArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The live event input.
 * 
 */
public final class LiveEventInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiveEventInputArgs Empty = new LiveEventInputArgs();

    /**
     * Access control for live event input.
     * 
     */
    @InputImport(name="accessControl")
      private final @Nullable Input<LiveEventInputAccessControlArgs> accessControl;

    public Input<LiveEventInputAccessControlArgs> getAccessControl() {
        return this.accessControl == null ? Input.empty() : this.accessControl;
    }

    /**
     * A UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     * 
     */
    @InputImport(name="accessToken")
      private final @Nullable Input<String> accessToken;

    public Input<String> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    /**
     * The input endpoints for the live event.
     * 
     */
    @InputImport(name="endpoints")
      private final @Nullable Input<List<LiveEventEndpointArgs>> endpoints;

    public Input<List<LiveEventEndpointArgs>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    /**
     * ISO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     * 
     */
    @InputImport(name="keyFrameIntervalDuration")
      private final @Nullable Input<String> keyFrameIntervalDuration;

    public Input<String> getKeyFrameIntervalDuration() {
        return this.keyFrameIntervalDuration == null ? Input.empty() : this.keyFrameIntervalDuration;
    }

    /**
     * The input protocol for the live event. This is specified at creation time and cannot be updated.
     * 
     */
    @InputImport(name="streamingProtocol", required=true)
      private final Input<Either<String,LiveEventInputProtocol>> streamingProtocol;

    public Input<Either<String,LiveEventInputProtocol>> getStreamingProtocol() {
        return this.streamingProtocol;
    }

    public LiveEventInputArgs(
        @Nullable Input<LiveEventInputAccessControlArgs> accessControl,
        @Nullable Input<String> accessToken,
        @Nullable Input<List<LiveEventEndpointArgs>> endpoints,
        @Nullable Input<String> keyFrameIntervalDuration,
        Input<Either<String,LiveEventInputProtocol>> streamingProtocol) {
        this.accessControl = accessControl;
        this.accessToken = accessToken;
        this.endpoints = endpoints;
        this.keyFrameIntervalDuration = keyFrameIntervalDuration;
        this.streamingProtocol = Objects.requireNonNull(streamingProtocol, "expected parameter 'streamingProtocol' to be non-null");
    }

    private LiveEventInputArgs() {
        this.accessControl = Input.empty();
        this.accessToken = Input.empty();
        this.endpoints = Input.empty();
        this.keyFrameIntervalDuration = Input.empty();
        this.streamingProtocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LiveEventInputAccessControlArgs> accessControl;
        private @Nullable Input<String> accessToken;
        private @Nullable Input<List<LiveEventEndpointArgs>> endpoints;
        private @Nullable Input<String> keyFrameIntervalDuration;
        private Input<Either<String,LiveEventInputProtocol>> streamingProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.accessToken = defaults.accessToken;
    	      this.endpoints = defaults.endpoints;
    	      this.keyFrameIntervalDuration = defaults.keyFrameIntervalDuration;
    	      this.streamingProtocol = defaults.streamingProtocol;
        }

        public Builder setAccessControl(@Nullable Input<LiveEventInputAccessControlArgs> accessControl) {
            this.accessControl = accessControl;
            return this;
        }

        public Builder setAccessControl(@Nullable LiveEventInputAccessControlArgs accessControl) {
            this.accessControl = Input.ofNullable(accessControl);
            return this;
        }

        public Builder setAccessToken(@Nullable Input<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
            return this;
        }

        public Builder setEndpoints(@Nullable Input<List<LiveEventEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEndpoints(@Nullable List<LiveEventEndpointArgs> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder setKeyFrameIntervalDuration(@Nullable Input<String> keyFrameIntervalDuration) {
            this.keyFrameIntervalDuration = keyFrameIntervalDuration;
            return this;
        }

        public Builder setKeyFrameIntervalDuration(@Nullable String keyFrameIntervalDuration) {
            this.keyFrameIntervalDuration = Input.ofNullable(keyFrameIntervalDuration);
            return this;
        }

        public Builder setStreamingProtocol(Input<Either<String,LiveEventInputProtocol>> streamingProtocol) {
            this.streamingProtocol = Objects.requireNonNull(streamingProtocol);
            return this;
        }

        public Builder setStreamingProtocol(Either<String,LiveEventInputProtocol> streamingProtocol) {
            this.streamingProtocol = Input.of(Objects.requireNonNull(streamingProtocol));
            return this;
        }
        public LiveEventInputArgs build() {
            return new LiveEventInputArgs(accessControl, accessToken, endpoints, keyFrameIntervalDuration, streamingProtocol);
        }
    }
}