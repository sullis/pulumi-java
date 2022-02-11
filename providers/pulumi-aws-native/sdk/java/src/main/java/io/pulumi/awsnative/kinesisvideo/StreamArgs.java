// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisvideo;

import io.pulumi.awsnative.kinesisvideo.inputs.StreamTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamArgs Empty = new StreamArgs();

    @InputImport(name="dataRetentionInHours")
    private final @Nullable Input<Integer> dataRetentionInHours;

    public Input<Integer> getDataRetentionInHours() {
        return this.dataRetentionInHours == null ? Input.empty() : this.dataRetentionInHours;
    }

    @InputImport(name="deviceName")
    private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    @InputImport(name="mediaType")
    private final @Nullable Input<String> mediaType;

    public Input<String> getMediaType() {
        return this.mediaType == null ? Input.empty() : this.mediaType;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<StreamTagArgs>> tags;

    public Input<List<StreamTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public StreamArgs(
        @Nullable Input<Integer> dataRetentionInHours,
        @Nullable Input<String> deviceName,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> mediaType,
        @Nullable Input<String> name,
        @Nullable Input<List<StreamTagArgs>> tags) {
        this.dataRetentionInHours = dataRetentionInHours;
        this.deviceName = deviceName;
        this.kmsKeyId = kmsKeyId;
        this.mediaType = mediaType;
        this.name = name;
        this.tags = tags;
    }

    private StreamArgs() {
        this.dataRetentionInHours = Input.empty();
        this.deviceName = Input.empty();
        this.kmsKeyId = Input.empty();
        this.mediaType = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> dataRetentionInHours;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> mediaType;
        private @Nullable Input<String> name;
        private @Nullable Input<List<StreamTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRetentionInHours = defaults.dataRetentionInHours;
    	      this.deviceName = defaults.deviceName;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.mediaType = defaults.mediaType;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setDataRetentionInHours(@Nullable Input<Integer> dataRetentionInHours) {
            this.dataRetentionInHours = dataRetentionInHours;
            return this;
        }

        public Builder setDataRetentionInHours(@Nullable Integer dataRetentionInHours) {
            this.dataRetentionInHours = Input.ofNullable(dataRetentionInHours);
            return this;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setMediaType(@Nullable Input<String> mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public Builder setMediaType(@Nullable String mediaType) {
            this.mediaType = Input.ofNullable(mediaType);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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
            return new StreamArgs(dataRetentionInHours, deviceName, kmsKeyId, mediaType, name, tags);
        }
    }
}
