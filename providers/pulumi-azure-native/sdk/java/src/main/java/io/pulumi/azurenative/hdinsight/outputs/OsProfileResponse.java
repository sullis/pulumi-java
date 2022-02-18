// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.LinuxOperatingSystemProfileResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsProfileResponse {
    /**
     * The Linux OS profile.
     * 
     */
    private final @Nullable LinuxOperatingSystemProfileResponse linuxOperatingSystemProfile;

    @OutputCustomType.Constructor({"linuxOperatingSystemProfile"})
    private OsProfileResponse(@Nullable LinuxOperatingSystemProfileResponse linuxOperatingSystemProfile) {
        this.linuxOperatingSystemProfile = linuxOperatingSystemProfile;
    }

    /**
     * The Linux OS profile.
     * 
     */
    public Optional<LinuxOperatingSystemProfileResponse> getLinuxOperatingSystemProfile() {
        return Optional.ofNullable(this.linuxOperatingSystemProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinuxOperatingSystemProfileResponse linuxOperatingSystemProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(OsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxOperatingSystemProfile = defaults.linuxOperatingSystemProfile;
        }

        public Builder setLinuxOperatingSystemProfile(@Nullable LinuxOperatingSystemProfileResponse linuxOperatingSystemProfile) {
            this.linuxOperatingSystemProfile = linuxOperatingSystemProfile;
            return this;
        }

        public OsProfileResponse build() {
            return new OsProfileResponse(linuxOperatingSystemProfile);
        }
    }
}
