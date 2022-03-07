// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Optional flags used to change how video is published. These are only allowed for topologies where "kind" is set to "live".
 * 
 */
public final class VideoPublishingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoPublishingOptionsArgs Empty = new VideoPublishingOptionsArgs();

    /**
     * When set to 'true' content will not be archived or recorded. This is used, for example, when the topology is used only for low latency video streaming. Default is 'false'.  If set to 'true', then "disableRtspPublishing" must be set to 'false'.
     * 
     */
    @InputImport(name="disableArchive")
      private final @Nullable Input<String> disableArchive;

    public Input<String> getDisableArchive() {
        return this.disableArchive == null ? Input.empty() : this.disableArchive;
    }

    /**
     * When set to 'true' the RTSP playback URL will not be published, disabling low latency streaming. This is used, for example, when the topology is used only for archiving content. Default is 'false'.  If set to 'true', then "disableArchive" must be set to 'false'.
     * 
     */
    @InputImport(name="disableRtspPublishing")
      private final @Nullable Input<String> disableRtspPublishing;

    public Input<String> getDisableRtspPublishing() {
        return this.disableRtspPublishing == null ? Input.empty() : this.disableRtspPublishing;
    }

    public VideoPublishingOptionsArgs(
        @Nullable Input<String> disableArchive,
        @Nullable Input<String> disableRtspPublishing) {
        this.disableArchive = disableArchive;
        this.disableRtspPublishing = disableRtspPublishing;
    }

    private VideoPublishingOptionsArgs() {
        this.disableArchive = Input.empty();
        this.disableRtspPublishing = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoPublishingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> disableArchive;
        private @Nullable Input<String> disableRtspPublishing;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoPublishingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableArchive = defaults.disableArchive;
    	      this.disableRtspPublishing = defaults.disableRtspPublishing;
        }

        public Builder setDisableArchive(@Nullable Input<String> disableArchive) {
            this.disableArchive = disableArchive;
            return this;
        }

        public Builder setDisableArchive(@Nullable String disableArchive) {
            this.disableArchive = Input.ofNullable(disableArchive);
            return this;
        }

        public Builder setDisableRtspPublishing(@Nullable Input<String> disableRtspPublishing) {
            this.disableRtspPublishing = disableRtspPublishing;
            return this;
        }

        public Builder setDisableRtspPublishing(@Nullable String disableRtspPublishing) {
            this.disableRtspPublishing = Input.ofNullable(disableRtspPublishing);
            return this;
        }
        public VideoPublishingOptionsArgs build() {
            return new VideoPublishingOptionsArgs(disableArchive, disableRtspPublishing);
        }
    }
}