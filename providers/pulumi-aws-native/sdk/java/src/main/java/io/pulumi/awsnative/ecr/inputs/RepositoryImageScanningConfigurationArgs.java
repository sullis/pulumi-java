// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The image scanning configuration for the repository. This setting determines whether images are scanned for known vulnerabilities after being pushed to the repository.
 * 
 */
public final class RepositoryImageScanningConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryImageScanningConfigurationArgs Empty = new RepositoryImageScanningConfigurationArgs();

    @InputImport(name="scanOnPush")
    private final @Nullable Input<Boolean> scanOnPush;

    public Input<Boolean> getScanOnPush() {
        return this.scanOnPush == null ? Input.empty() : this.scanOnPush;
    }

    public RepositoryImageScanningConfigurationArgs(@Nullable Input<Boolean> scanOnPush) {
        this.scanOnPush = scanOnPush;
    }

    private RepositoryImageScanningConfigurationArgs() {
        this.scanOnPush = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryImageScanningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> scanOnPush;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryImageScanningConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scanOnPush = defaults.scanOnPush;
        }

        public Builder setScanOnPush(@Nullable Input<Boolean> scanOnPush) {
            this.scanOnPush = scanOnPush;
            return this;
        }

        public Builder setScanOnPush(@Nullable Boolean scanOnPush) {
            this.scanOnPush = Input.ofNullable(scanOnPush);
            return this;
        }

        public RepositoryImageScanningConfigurationArgs build() {
            return new RepositoryImageScanningConfigurationArgs(scanOnPush);
        }
    }
}
