// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Class to specify which protocols are enabled
 * 
 */
public final class EnabledProtocolsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnabledProtocolsResponse Empty = new EnabledProtocolsResponse();

    /**
     * Enable DASH protocol or not
     * 
     */
    @InputImport(name="dash", required=true)
    private final Boolean dash;

    public Boolean getDash() {
        return this.dash;
    }

    /**
     * Enable Download protocol or not
     * 
     */
    @InputImport(name="download", required=true)
    private final Boolean download;

    public Boolean getDownload() {
        return this.download;
    }

    /**
     * Enable HLS protocol or not
     * 
     */
    @InputImport(name="hls", required=true)
    private final Boolean hls;

    public Boolean getHls() {
        return this.hls;
    }

    /**
     * Enable SmoothStreaming protocol or not
     * 
     */
    @InputImport(name="smoothStreaming", required=true)
    private final Boolean smoothStreaming;

    public Boolean getSmoothStreaming() {
        return this.smoothStreaming;
    }

    public EnabledProtocolsResponse(
        Boolean dash,
        Boolean download,
        Boolean hls,
        Boolean smoothStreaming) {
        this.dash = Objects.requireNonNull(dash, "expected parameter 'dash' to be non-null");
        this.download = Objects.requireNonNull(download, "expected parameter 'download' to be non-null");
        this.hls = Objects.requireNonNull(hls, "expected parameter 'hls' to be non-null");
        this.smoothStreaming = Objects.requireNonNull(smoothStreaming, "expected parameter 'smoothStreaming' to be non-null");
    }

    private EnabledProtocolsResponse() {
        this.dash = null;
        this.download = null;
        this.hls = null;
        this.smoothStreaming = null;
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
