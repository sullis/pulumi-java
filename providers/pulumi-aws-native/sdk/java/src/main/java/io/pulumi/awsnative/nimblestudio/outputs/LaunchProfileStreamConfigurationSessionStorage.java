// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingSessionStorageMode;
import io.pulumi.awsnative.nimblestudio.outputs.LaunchProfileStreamingSessionStorageRoot;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchProfileStreamConfigurationSessionStorage {
    /**
     * <p>Allows artists to upload files to their workstations. The only valid option is
     *                 <code>UPLOAD</code>.</p>
     * 
     */
    private final @Nullable List<LaunchProfileStreamingSessionStorageMode> mode;
    private final @Nullable LaunchProfileStreamingSessionStorageRoot root;

    @CustomType.Constructor
    private LaunchProfileStreamConfigurationSessionStorage(
        @CustomType.Parameter("mode") @Nullable List<LaunchProfileStreamingSessionStorageMode> mode,
        @CustomType.Parameter("root") @Nullable LaunchProfileStreamingSessionStorageRoot root) {
        this.mode = mode;
        this.root = root;
    }

    /**
     * <p>Allows artists to upload files to their workstations. The only valid option is
     *                 <code>UPLOAD</code>.</p>
     * 
    */
    public List<LaunchProfileStreamingSessionStorageMode> mode() {
        return this.mode == null ? List.of() : this.mode;
    }
    public Optional<LaunchProfileStreamingSessionStorageRoot> root() {
        return Optional.ofNullable(this.root);
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

        public Builder mode(@Nullable List<LaunchProfileStreamingSessionStorageMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(LaunchProfileStreamingSessionStorageMode... mode) {
            return mode(List.of(mode));
        }
        public Builder root(@Nullable LaunchProfileStreamingSessionStorageRoot root) {
            this.root = root;
            return this;
        }        public LaunchProfileStreamConfigurationSessionStorage build() {
            return new LaunchProfileStreamConfigurationSessionStorage(mode, root);
        }
    }
}
