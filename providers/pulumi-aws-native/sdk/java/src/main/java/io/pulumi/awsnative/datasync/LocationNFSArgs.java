// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.inputs.LocationNFSMountOptionsArgs;
import io.pulumi.awsnative.datasync.inputs.LocationNFSOnPremConfigArgs;
import io.pulumi.awsnative.datasync.inputs.LocationNFSTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationNFSArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationNFSArgs Empty = new LocationNFSArgs();

    @InputImport(name="mountOptions")
    private final @Nullable Input<LocationNFSMountOptionsArgs> mountOptions;

    public Input<LocationNFSMountOptionsArgs> getMountOptions() {
        return this.mountOptions == null ? Input.empty() : this.mountOptions;
    }

    @InputImport(name="onPremConfig", required=true)
    private final Input<LocationNFSOnPremConfigArgs> onPremConfig;

    public Input<LocationNFSOnPremConfigArgs> getOnPremConfig() {
        return this.onPremConfig;
    }

    @InputImport(name="serverHostname", required=true)
    private final Input<String> serverHostname;

    public Input<String> getServerHostname() {
        return this.serverHostname;
    }

    @InputImport(name="subdirectory", required=true)
    private final Input<String> subdirectory;

    public Input<String> getSubdirectory() {
        return this.subdirectory;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<LocationNFSTagArgs>> tags;

    public Input<List<LocationNFSTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LocationNFSArgs(
        @Nullable Input<LocationNFSMountOptionsArgs> mountOptions,
        Input<LocationNFSOnPremConfigArgs> onPremConfig,
        Input<String> serverHostname,
        Input<String> subdirectory,
        @Nullable Input<List<LocationNFSTagArgs>> tags) {
        this.mountOptions = mountOptions;
        this.onPremConfig = Objects.requireNonNull(onPremConfig, "expected parameter 'onPremConfig' to be non-null");
        this.serverHostname = Objects.requireNonNull(serverHostname, "expected parameter 'serverHostname' to be non-null");
        this.subdirectory = Objects.requireNonNull(subdirectory, "expected parameter 'subdirectory' to be non-null");
        this.tags = tags;
    }

    private LocationNFSArgs() {
        this.mountOptions = Input.empty();
        this.onPremConfig = Input.empty();
        this.serverHostname = Input.empty();
        this.subdirectory = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationNFSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LocationNFSMountOptionsArgs> mountOptions;
        private Input<LocationNFSOnPremConfigArgs> onPremConfig;
        private Input<String> serverHostname;
        private Input<String> subdirectory;
        private @Nullable Input<List<LocationNFSTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationNFSArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountOptions = defaults.mountOptions;
    	      this.onPremConfig = defaults.onPremConfig;
    	      this.serverHostname = defaults.serverHostname;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
        }

        public Builder setMountOptions(@Nullable Input<LocationNFSMountOptionsArgs> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setMountOptions(@Nullable LocationNFSMountOptionsArgs mountOptions) {
            this.mountOptions = Input.ofNullable(mountOptions);
            return this;
        }

        public Builder setOnPremConfig(Input<LocationNFSOnPremConfigArgs> onPremConfig) {
            this.onPremConfig = Objects.requireNonNull(onPremConfig);
            return this;
        }

        public Builder setOnPremConfig(LocationNFSOnPremConfigArgs onPremConfig) {
            this.onPremConfig = Input.of(Objects.requireNonNull(onPremConfig));
            return this;
        }

        public Builder setServerHostname(Input<String> serverHostname) {
            this.serverHostname = Objects.requireNonNull(serverHostname);
            return this;
        }

        public Builder setServerHostname(String serverHostname) {
            this.serverHostname = Input.of(Objects.requireNonNull(serverHostname));
            return this;
        }

        public Builder setSubdirectory(Input<String> subdirectory) {
            this.subdirectory = Objects.requireNonNull(subdirectory);
            return this;
        }

        public Builder setSubdirectory(String subdirectory) {
            this.subdirectory = Input.of(Objects.requireNonNull(subdirectory));
            return this;
        }

        public Builder setTags(@Nullable Input<List<LocationNFSTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<LocationNFSTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public LocationNFSArgs build() {
            return new LocationNFSArgs(mountOptions, onPremConfig, serverHostname, subdirectory, tags);
        }
    }
}
