// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisvideo.outputs;

import com.pulumi.awsnative.kinesisvideo.enums.SignalingChannelType;
import com.pulumi.awsnative.kinesisvideo.outputs.SignalingChannelTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSignalingChannelResult {
    /**
     * @return The Amazon Resource Name (ARN) of the Kinesis Video Signaling Channel.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return The period of time a signaling channel retains undelivered messages before they are discarded.
     * 
     */
    private final @Nullable Integer messageTtlSeconds;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<SignalingChannelTag> tags;
    /**
     * @return The type of the Kinesis Video Signaling Channel to create. Currently, SINGLE_MASTER is the only supported channel type.
     * 
     */
    private final @Nullable SignalingChannelType type;

    @CustomType.Constructor
    private GetSignalingChannelResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("messageTtlSeconds") @Nullable Integer messageTtlSeconds,
        @CustomType.Parameter("tags") @Nullable List<SignalingChannelTag> tags,
        @CustomType.Parameter("type") @Nullable SignalingChannelType type) {
        this.arn = arn;
        this.messageTtlSeconds = messageTtlSeconds;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the Kinesis Video Signaling Channel.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The period of time a signaling channel retains undelivered messages before they are discarded.
     * 
     */
    public Optional<Integer> messageTtlSeconds() {
        return Optional.ofNullable(this.messageTtlSeconds);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public List<SignalingChannelTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The type of the Kinesis Video Signaling Channel to create. Currently, SINGLE_MASTER is the only supported channel type.
     * 
     */
    public Optional<SignalingChannelType> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSignalingChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Integer messageTtlSeconds;
        private @Nullable List<SignalingChannelTag> tags;
        private @Nullable SignalingChannelType type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSignalingChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.messageTtlSeconds = defaults.messageTtlSeconds;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder messageTtlSeconds(@Nullable Integer messageTtlSeconds) {
            this.messageTtlSeconds = messageTtlSeconds;
            return this;
        }
        public Builder tags(@Nullable List<SignalingChannelTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(SignalingChannelTag... tags) {
            return tags(List.of(tags));
        }
        public Builder type(@Nullable SignalingChannelType type) {
            this.type = type;
            return this;
        }        public GetSignalingChannelResult build() {
            return new GetSignalingChannelResult(arn, messageTtlSeconds, tags, type);
        }
    }
}
