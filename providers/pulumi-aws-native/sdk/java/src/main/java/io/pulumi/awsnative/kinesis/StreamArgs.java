// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesis;

import io.pulumi.awsnative.kinesis.inputs.StreamEncryptionArgs;
import io.pulumi.awsnative.kinesis.inputs.StreamModeDetailsArgs;
import io.pulumi.awsnative.kinesis.inputs.StreamTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamArgs Empty = new StreamArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="retentionPeriodHours")
    private final @Nullable Input<Integer> retentionPeriodHours;

    public Input<Integer> getRetentionPeriodHours() {
        return this.retentionPeriodHours == null ? Input.empty() : this.retentionPeriodHours;
    }

    @InputImport(name="shardCount")
    private final @Nullable Input<Integer> shardCount;

    public Input<Integer> getShardCount() {
        return this.shardCount == null ? Input.empty() : this.shardCount;
    }

    @InputImport(name="streamEncryption")
    private final @Nullable Input<StreamEncryptionArgs> streamEncryption;

    public Input<StreamEncryptionArgs> getStreamEncryption() {
        return this.streamEncryption == null ? Input.empty() : this.streamEncryption;
    }

    @InputImport(name="streamModeDetails")
    private final @Nullable Input<StreamModeDetailsArgs> streamModeDetails;

    public Input<StreamModeDetailsArgs> getStreamModeDetails() {
        return this.streamModeDetails == null ? Input.empty() : this.streamModeDetails;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<StreamTagArgs>> tags;

    public Input<List<StreamTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public StreamArgs(
        @Nullable Input<String> name,
        @Nullable Input<Integer> retentionPeriodHours,
        @Nullable Input<Integer> shardCount,
        @Nullable Input<StreamEncryptionArgs> streamEncryption,
        @Nullable Input<StreamModeDetailsArgs> streamModeDetails,
        @Nullable Input<List<StreamTagArgs>> tags) {
        this.name = name;
        this.retentionPeriodHours = retentionPeriodHours;
        this.shardCount = shardCount;
        this.streamEncryption = streamEncryption;
        this.streamModeDetails = streamModeDetails;
        this.tags = tags;
    }

    private StreamArgs() {
        this.name = Input.empty();
        this.retentionPeriodHours = Input.empty();
        this.shardCount = Input.empty();
        this.streamEncryption = Input.empty();
        this.streamModeDetails = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> retentionPeriodHours;
        private @Nullable Input<Integer> shardCount;
        private @Nullable Input<StreamEncryptionArgs> streamEncryption;
        private @Nullable Input<StreamModeDetailsArgs> streamModeDetails;
        private @Nullable Input<List<StreamTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.retentionPeriodHours = defaults.retentionPeriodHours;
    	      this.shardCount = defaults.shardCount;
    	      this.streamEncryption = defaults.streamEncryption;
    	      this.streamModeDetails = defaults.streamModeDetails;
    	      this.tags = defaults.tags;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRetentionPeriodHours(@Nullable Input<Integer> retentionPeriodHours) {
            this.retentionPeriodHours = retentionPeriodHours;
            return this;
        }

        public Builder setRetentionPeriodHours(@Nullable Integer retentionPeriodHours) {
            this.retentionPeriodHours = Input.ofNullable(retentionPeriodHours);
            return this;
        }

        public Builder setShardCount(@Nullable Input<Integer> shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        public Builder setShardCount(@Nullable Integer shardCount) {
            this.shardCount = Input.ofNullable(shardCount);
            return this;
        }

        public Builder setStreamEncryption(@Nullable Input<StreamEncryptionArgs> streamEncryption) {
            this.streamEncryption = streamEncryption;
            return this;
        }

        public Builder setStreamEncryption(@Nullable StreamEncryptionArgs streamEncryption) {
            this.streamEncryption = Input.ofNullable(streamEncryption);
            return this;
        }

        public Builder setStreamModeDetails(@Nullable Input<StreamModeDetailsArgs> streamModeDetails) {
            this.streamModeDetails = streamModeDetails;
            return this;
        }

        public Builder setStreamModeDetails(@Nullable StreamModeDetailsArgs streamModeDetails) {
            this.streamModeDetails = Input.ofNullable(streamModeDetails);
            return this;
        }

        public Builder setTags(@Nullable Input<List<StreamTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<StreamTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public StreamArgs build() {
            return new StreamArgs(name, retentionPeriodHours, shardCount, streamEncryption, streamModeDetails, tags);
        }
    }
}
