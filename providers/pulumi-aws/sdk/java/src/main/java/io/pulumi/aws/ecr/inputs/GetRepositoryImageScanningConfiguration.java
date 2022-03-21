// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetRepositoryImageScanningConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final GetRepositoryImageScanningConfiguration Empty = new GetRepositoryImageScanningConfiguration();

    /**
     * Indicates whether images are scanned after being pushed to the repository.
     * 
     */
    @Import(name="scanOnPush", required=true)
      private final Boolean scanOnPush;

    public Boolean getScanOnPush() {
        return this.scanOnPush;
    }

    public GetRepositoryImageScanningConfiguration(Boolean scanOnPush) {
        this.scanOnPush = Objects.requireNonNull(scanOnPush, "expected parameter 'scanOnPush' to be non-null");
    }

    private GetRepositoryImageScanningConfiguration() {
        this.scanOnPush = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryImageScanningConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean scanOnPush;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryImageScanningConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scanOnPush = defaults.scanOnPush;
        }

        public Builder scanOnPush(Boolean scanOnPush) {
            this.scanOnPush = Objects.requireNonNull(scanOnPush);
            return this;
        }        public GetRepositoryImageScanningConfiguration build() {
            return new GetRepositoryImageScanningConfiguration(scanOnPush);
        }
    }
}
