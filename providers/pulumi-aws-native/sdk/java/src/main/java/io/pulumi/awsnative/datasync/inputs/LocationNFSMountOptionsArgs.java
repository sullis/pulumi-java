// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.awsnative.datasync.enums.LocationNFSMountOptionsVersion;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationNFSMountOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationNFSMountOptionsArgs Empty = new LocationNFSMountOptionsArgs();

    @InputImport(name="version")
    private final @Nullable Input<LocationNFSMountOptionsVersion> version;

    public Input<LocationNFSMountOptionsVersion> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public LocationNFSMountOptionsArgs(@Nullable Input<LocationNFSMountOptionsVersion> version) {
        this.version = version;
    }

    private LocationNFSMountOptionsArgs() {
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationNFSMountOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LocationNFSMountOptionsVersion> version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationNFSMountOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder setVersion(@Nullable Input<LocationNFSMountOptionsVersion> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable LocationNFSMountOptionsVersion version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public LocationNFSMountOptionsArgs build() {
            return new LocationNFSMountOptionsArgs(version);
        }
    }
}
