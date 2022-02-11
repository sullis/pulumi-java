// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.awsnative.datasync.enums.LocationNFSMountOptionsVersion;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationNFSMountOptions extends io.pulumi.resources.InvokeArgs {

    public static final LocationNFSMountOptions Empty = new LocationNFSMountOptions();

    @InputImport(name="version")
    private final @Nullable LocationNFSMountOptionsVersion version;

    public Optional<LocationNFSMountOptionsVersion> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public LocationNFSMountOptions(@Nullable LocationNFSMountOptionsVersion version) {
        this.version = version;
    }

    private LocationNFSMountOptions() {
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationNFSMountOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LocationNFSMountOptionsVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationNFSMountOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder setVersion(@Nullable LocationNFSMountOptionsVersion version) {
            this.version = version;
            return this;
        }

        public LocationNFSMountOptions build() {
            return new LocationNFSMountOptions(version);
        }
    }
}
