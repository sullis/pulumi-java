// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationStreamSelectionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Microsoft Smooth Streaming (MSS) manifest configuration.
 * 
 */
public final class PackagingConfigurationMssManifestArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationMssManifestArgs Empty = new PackagingConfigurationMssManifestArgs();

    @InputImport(name="manifestName")
    private final @Nullable Input<String> manifestName;

    public Input<String> getManifestName() {
        return this.manifestName == null ? Input.empty() : this.manifestName;
    }

    @InputImport(name="streamSelection")
    private final @Nullable Input<PackagingConfigurationStreamSelectionArgs> streamSelection;

    public Input<PackagingConfigurationStreamSelectionArgs> getStreamSelection() {
        return this.streamSelection == null ? Input.empty() : this.streamSelection;
    }

    public PackagingConfigurationMssManifestArgs(
        @Nullable Input<String> manifestName,
        @Nullable Input<PackagingConfigurationStreamSelectionArgs> streamSelection) {
        this.manifestName = manifestName;
        this.streamSelection = streamSelection;
    }

    private PackagingConfigurationMssManifestArgs() {
        this.manifestName = Input.empty();
        this.streamSelection = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationMssManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> manifestName;
        private @Nullable Input<PackagingConfigurationStreamSelectionArgs> streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationMssManifestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manifestName = defaults.manifestName;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder setManifestName(@Nullable Input<String> manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder setManifestName(@Nullable String manifestName) {
            this.manifestName = Input.ofNullable(manifestName);
            return this;
        }

        public Builder setStreamSelection(@Nullable Input<PackagingConfigurationStreamSelectionArgs> streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public Builder setStreamSelection(@Nullable PackagingConfigurationStreamSelectionArgs streamSelection) {
            this.streamSelection = Input.ofNullable(streamSelection);
            return this;
        }

        public PackagingConfigurationMssManifestArgs build() {
            return new PackagingConfigurationMssManifestArgs(manifestName, streamSelection);
        }
    }
}
