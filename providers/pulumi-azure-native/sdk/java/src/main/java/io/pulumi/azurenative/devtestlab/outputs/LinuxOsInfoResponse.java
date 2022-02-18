// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LinuxOsInfoResponse {
    /**
     * The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied).
     * 
     */
    private final @Nullable String linuxOsState;

    @OutputCustomType.Constructor({"linuxOsState"})
    private LinuxOsInfoResponse(@Nullable String linuxOsState) {
        this.linuxOsState = linuxOsState;
    }

    /**
     * The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied).
     * 
     */
    public Optional<String> getLinuxOsState() {
        return Optional.ofNullable(this.linuxOsState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxOsInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linuxOsState;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxOsInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxOsState = defaults.linuxOsState;
        }

        public Builder setLinuxOsState(@Nullable String linuxOsState) {
            this.linuxOsState = linuxOsState;
            return this;
        }

        public LinuxOsInfoResponse build() {
            return new LinuxOsInfoResponse(linuxOsState);
        }
    }
}
