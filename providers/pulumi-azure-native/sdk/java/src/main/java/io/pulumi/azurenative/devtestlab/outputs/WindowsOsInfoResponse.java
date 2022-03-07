// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WindowsOsInfoResponse {
    /**
     * The state of the Windows OS (i.e. NonSysprepped, SysprepRequested, SysprepApplied).
     * 
     */
    private final @Nullable String windowsOsState;

    @OutputCustomType.Constructor({"windowsOsState"})
    private WindowsOsInfoResponse(@Nullable String windowsOsState) {
        this.windowsOsState = windowsOsState;
    }

    /**
     * The state of the Windows OS (i.e. NonSysprepped, SysprepRequested, SysprepApplied).
     * 
    */
    public Optional<String> getWindowsOsState() {
        return Optional.ofNullable(this.windowsOsState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsOsInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String windowsOsState;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsOsInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowsOsState = defaults.windowsOsState;
        }

        public Builder setWindowsOsState(@Nullable String windowsOsState) {
            this.windowsOsState = windowsOsState;
            return this;
        }
        public WindowsOsInfoResponse build() {
            return new WindowsOsInfoResponse(windowsOsState);
        }
    }
}