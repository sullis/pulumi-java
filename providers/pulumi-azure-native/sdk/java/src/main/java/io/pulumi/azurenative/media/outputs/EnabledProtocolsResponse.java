// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class EnabledProtocolsResponse {
    /**
     * Enable DASH protocol or not
     * 
     */
    private final Boolean dash;
    /**
     * Enable Download protocol or not
     * 
     */
    private final Boolean download;
    /**
     * Enable HLS protocol or not
     * 
     */
    private final Boolean hls;
    /**
     * Enable SmoothStreaming protocol or not
     * 
     */
    private final Boolean smoothStreaming;

    @OutputCustomType.Constructor({"dash","download","hls","smoothStreaming"})
    private EnabledProtocolsResponse(
        Boolean dash,
        Boolean download,
        Boolean hls,
        Boolean smoothStreaming) {
        this.dash = Objects.requireNonNull(dash);
        this.download = Objects.requireNonNull(download);
        this.hls = Objects.requireNonNull(hls);
        this.smoothStreaming = Objects.requireNonNull(smoothStreaming);
    }

    /**
     * Enable DASH protocol or not
     * 
     */
    public Boolean getDash() {
        return this.dash;
    }
    /**
     * Enable Download protocol or not
     * 
     */
    public Boolean getDownload() {
        return this.download;
    }
    /**
     * Enable HLS protocol or not
     * 
     */
    public Boolean getHls() {
        return this.hls;
    }
    /**
     * Enable SmoothStreaming protocol or not
     * 
     */
    public Boolean getSmoothStreaming() {
        return this.smoothStreaming;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnabledProtocolsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean dash;
        private Boolean download;
        private Boolean hls;
        private Boolean smoothStreaming;

        public Builder() {
    	      // Empty
        }

        public Builder(EnabledProtocolsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dash = defaults.dash;
    	      this.download = defaults.download;
    	      this.hls = defaults.hls;
    	      this.smoothStreaming = defaults.smoothStreaming;
        }

        public Builder setDash(Boolean dash) {
            this.dash = Objects.requireNonNull(dash);
            return this;
        }

        public Builder setDownload(Boolean download) {
            this.download = Objects.requireNonNull(download);
            return this;
        }

        public Builder setHls(Boolean hls) {
            this.hls = Objects.requireNonNull(hls);
            return this;
        }

        public Builder setSmoothStreaming(Boolean smoothStreaming) {
            this.smoothStreaming = Objects.requireNonNull(smoothStreaming);
            return this;
        }

        public EnabledProtocolsResponse build() {
            return new EnabledProtocolsResponse(dash, download, hls, smoothStreaming);
        }
    }
}
