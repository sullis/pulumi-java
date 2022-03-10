// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisvideo.outputs;

import io.pulumi.awsnative.kinesisvideo.enums.SignalingChannelType;
import io.pulumi.awsnative.kinesisvideo.outputs.SignalingChannelTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSignalingChannelResult {
    /**
     * The Amazon Resource Name (ARN) of the Kinesis Video Signaling Channel.
     * 
     */
    private final @Nullable String arn;
    /**
     * The period of time a signaling channel retains undelivered messages before they are discarded.
     * 
     */
    private final @Nullable Integer messageTtlSeconds;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<SignalingChannelTag> tags;
    /**
     * The type of the Kinesis Video Signaling Channel to create. Currently, SINGLE_MASTER is the only supported channel type.
     * 
     */
    private final @Nullable SignalingChannelType type;

    @OutputCustomType.Constructor
    private GetSignalingChannelResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("messageTtlSeconds") @Nullable Integer messageTtlSeconds,
        @OutputCustomType.Parameter("tags") @Nullable List<SignalingChannelTag> tags,
        @OutputCustomType.Parameter("type") @Nullable SignalingChannelType type) {
        this.arn = arn;
        this.messageTtlSeconds = messageTtlSeconds;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The Amazon Resource Name (ARN) of the Kinesis Video Signaling Channel.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The period of time a signaling channel retains undelivered messages before they are discarded.
     * 
    */
    public Optional<Integer> getMessageTtlSeconds() {
        return Optional.ofNullable(this.messageTtlSeconds);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<SignalingChannelTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The type of the Kinesis Video Signaling Channel to create. Currently, SINGLE_MASTER is the only supported channel type.
     * 
    */
    public Optional<SignalingChannelType> getType() {
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

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setMessageTtlSeconds(@Nullable Integer messageTtlSeconds) {
            this.messageTtlSeconds = messageTtlSeconds;
            return this;
        }

        public Builder setTags(@Nullable List<SignalingChannelTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(@Nullable SignalingChannelType type) {
            this.type = type;
            return this;
        }
        public GetSignalingChannelResult build() {
            return new GetSignalingChannelResult(arn, messageTtlSeconds, tags, type);
        }
    }
}
