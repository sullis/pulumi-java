// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkBandwidthArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkBandwidthArgs Empty = new LinkBandwidthArgs();

    @InputImport(name="downloadSpeed")
    private final @Nullable Input<Integer> downloadSpeed;

    public Input<Integer> getDownloadSpeed() {
        return this.downloadSpeed == null ? Input.empty() : this.downloadSpeed;
    }

    @InputImport(name="uploadSpeed")
    private final @Nullable Input<Integer> uploadSpeed;

    public Input<Integer> getUploadSpeed() {
        return this.uploadSpeed == null ? Input.empty() : this.uploadSpeed;
    }

    public LinkBandwidthArgs(
        @Nullable Input<Integer> downloadSpeed,
        @Nullable Input<Integer> uploadSpeed) {
        this.downloadSpeed = downloadSpeed;
        this.uploadSpeed = uploadSpeed;
    }

    private LinkBandwidthArgs() {
        this.downloadSpeed = Input.empty();
        this.uploadSpeed = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkBandwidthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> downloadSpeed;
        private @Nullable Input<Integer> uploadSpeed;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkBandwidthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.downloadSpeed = defaults.downloadSpeed;
    	      this.uploadSpeed = defaults.uploadSpeed;
        }

        public Builder setDownloadSpeed(@Nullable Input<Integer> downloadSpeed) {
            this.downloadSpeed = downloadSpeed;
            return this;
        }

        public Builder setDownloadSpeed(@Nullable Integer downloadSpeed) {
            this.downloadSpeed = Input.ofNullable(downloadSpeed);
            return this;
        }

        public Builder setUploadSpeed(@Nullable Input<Integer> uploadSpeed) {
            this.uploadSpeed = uploadSpeed;
            return this;
        }

        public Builder setUploadSpeed(@Nullable Integer uploadSpeed) {
            this.uploadSpeed = Input.ofNullable(uploadSpeed);
            return this;
        }

        public LinkBandwidthArgs build() {
            return new LinkBandwidthArgs(downloadSpeed, uploadSpeed);
        }
    }
}
