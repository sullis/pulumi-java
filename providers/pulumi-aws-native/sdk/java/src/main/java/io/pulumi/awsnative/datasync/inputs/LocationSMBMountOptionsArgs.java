// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.awsnative.datasync.enums.LocationSMBMountOptionsVersion;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The mount options used by DataSync to access the SMB server.
 * 
 */
public final class LocationSMBMountOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationSMBMountOptionsArgs Empty = new LocationSMBMountOptionsArgs();

    /**
     * The specific SMB version that you want DataSync to use to mount your SMB share.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<LocationSMBMountOptionsVersion> version;

    public Output<LocationSMBMountOptionsVersion> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public LocationSMBMountOptionsArgs(@Nullable Output<LocationSMBMountOptionsVersion> version) {
        this.version = version;
    }

    private LocationSMBMountOptionsArgs() {
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationSMBMountOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LocationSMBMountOptionsVersion> version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationSMBMountOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(@Nullable Output<LocationSMBMountOptionsVersion> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable LocationSMBMountOptionsVersion version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public LocationSMBMountOptionsArgs build() {
            return new LocationSMBMountOptionsArgs(version);
        }
    }
}
