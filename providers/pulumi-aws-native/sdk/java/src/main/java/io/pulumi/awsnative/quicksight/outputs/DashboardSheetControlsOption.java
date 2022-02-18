// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.DashboardUIState;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DashboardSheetControlsOption {
    private final @Nullable DashboardUIState visibilityState;

    @OutputCustomType.Constructor({"visibilityState"})
    private DashboardSheetControlsOption(@Nullable DashboardUIState visibilityState) {
        this.visibilityState = visibilityState;
    }

    public Optional<DashboardUIState> getVisibilityState() {
        return Optional.ofNullable(this.visibilityState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardSheetControlsOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DashboardUIState visibilityState;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardSheetControlsOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.visibilityState = defaults.visibilityState;
        }

        public Builder setVisibilityState(@Nullable DashboardUIState visibilityState) {
            this.visibilityState = visibilityState;
            return this;
        }

        public DashboardSheetControlsOption build() {
            return new DashboardSheetControlsOption(visibilityState);
        }
    }
}
