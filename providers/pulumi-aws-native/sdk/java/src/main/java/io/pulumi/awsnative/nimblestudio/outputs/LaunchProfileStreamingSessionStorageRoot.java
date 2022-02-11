// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LaunchProfileStreamingSessionStorageRoot {
    private final @Nullable String linux;
    private final @Nullable String windows;

    @OutputCustomType.Constructor({"linux","windows"})
    private LaunchProfileStreamingSessionStorageRoot(
        @Nullable String linux,
        @Nullable String windows) {
        this.linux = linux;
        this.windows = windows;
    }

    public Optional<String> getLinux() {
        return Optional.ofNullable(this.linux);
    }
    public Optional<String> getWindows() {
        return Optional.ofNullable(this.windows);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamingSessionStorageRoot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linux;
        private @Nullable String windows;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamingSessionStorageRoot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linux = defaults.linux;
    	      this.windows = defaults.windows;
        }

        public Builder setLinux(@Nullable String linux) {
            this.linux = linux;
            return this;
        }

        public Builder setWindows(@Nullable String windows) {
            this.windows = windows;
            return this;
        }

        public LaunchProfileStreamingSessionStorageRoot build() {
            return new LaunchProfileStreamingSessionStorageRoot(linux, windows);
        }
    }
}
