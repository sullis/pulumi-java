// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingSessionStorageMode;
import io.pulumi.awsnative.nimblestudio.inputs.LaunchProfileStreamingSessionStorageRoot;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The configuration for a streaming session’s upload storage.</p>
 * 
 */
public final class LaunchProfileStreamConfigurationSessionStorage extends io.pulumi.resources.InvokeArgs {

    public static final LaunchProfileStreamConfigurationSessionStorage Empty = new LaunchProfileStreamConfigurationSessionStorage();

    /**
     * <p>Allows artists to upload files to their workstations. The only valid option is
     *                 <code>UPLOAD</code>.</p>
     * 
     */
    @InputImport(name="mode")
    private final @Nullable List<LaunchProfileStreamingSessionStorageMode> mode;

    public List<LaunchProfileStreamingSessionStorageMode> getMode() {
        return this.mode == null ? List.of() : this.mode;
    }

    @InputImport(name="root")
    private final @Nullable LaunchProfileStreamingSessionStorageRoot root;

    public Optional<LaunchProfileStreamingSessionStorageRoot> getRoot() {
        return this.root == null ? Optional.empty() : Optional.ofNullable(this.root);
    }

    public LaunchProfileStreamConfigurationSessionStorage(
        @Nullable List<LaunchProfileStreamingSessionStorageMode> mode,
        @Nullable LaunchProfileStreamingSessionStorageRoot root) {
        this.mode = mode;
        this.root = root;
    }

    private LaunchProfileStreamConfigurationSessionStorage() {
        this.mode = List.of();
        this.root = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamConfigurationSessionStorage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LaunchProfileStreamingSessionStorageMode> mode;
        private @Nullable LaunchProfileStreamingSessionStorageRoot root;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamConfigurationSessionStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.root = defaults.root;
        }

        public Builder setMode(@Nullable List<LaunchProfileStreamingSessionStorageMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setRoot(@Nullable LaunchProfileStreamingSessionStorageRoot root) {
            this.root = root;
            return this;
        }

        public LaunchProfileStreamConfigurationSessionStorage build() {
            return new LaunchProfileStreamConfigurationSessionStorage(mode, root);
        }
    }
}
