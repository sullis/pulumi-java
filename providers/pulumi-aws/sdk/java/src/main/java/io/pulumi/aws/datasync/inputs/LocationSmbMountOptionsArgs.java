// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationSmbMountOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationSmbMountOptionsArgs Empty = new LocationSmbMountOptionsArgs();

    /**
     * The specific SMB version that you want DataSync to use for mounting your SMB share. Valid values: `AUTOMATIC`, `SMB2`, and `SMB3`. Default: `AUTOMATIC`
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public LocationSmbMountOptionsArgs(@Nullable Output<String> version) {
        this.version = version;
    }

    private LocationSmbMountOptionsArgs() {
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationSmbMountOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationSmbMountOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public LocationSmbMountOptionsArgs build() {
            return new LocationSmbMountOptionsArgs(version);
        }
    }
}
