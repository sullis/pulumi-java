// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.DashboardAdHocFilteringOption;
import io.pulumi.awsnative.quicksight.outputs.DashboardExportToCSVOption;
import io.pulumi.awsnative.quicksight.outputs.DashboardSheetControlsOption;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DashboardPublishOptions {
    private final @Nullable DashboardAdHocFilteringOption adHocFilteringOption;
    private final @Nullable DashboardExportToCSVOption exportToCSVOption;
    private final @Nullable DashboardSheetControlsOption sheetControlsOption;

    @OutputCustomType.Constructor({"adHocFilteringOption","exportToCSVOption","sheetControlsOption"})
    private DashboardPublishOptions(
        @Nullable DashboardAdHocFilteringOption adHocFilteringOption,
        @Nullable DashboardExportToCSVOption exportToCSVOption,
        @Nullable DashboardSheetControlsOption sheetControlsOption) {
        this.adHocFilteringOption = adHocFilteringOption;
        this.exportToCSVOption = exportToCSVOption;
        this.sheetControlsOption = sheetControlsOption;
    }

    public Optional<DashboardAdHocFilteringOption> getAdHocFilteringOption() {
        return Optional.ofNullable(this.adHocFilteringOption);
    }
    public Optional<DashboardExportToCSVOption> getExportToCSVOption() {
        return Optional.ofNullable(this.exportToCSVOption);
    }
    public Optional<DashboardSheetControlsOption> getSheetControlsOption() {
        return Optional.ofNullable(this.sheetControlsOption);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPublishOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DashboardAdHocFilteringOption adHocFilteringOption;
        private @Nullable DashboardExportToCSVOption exportToCSVOption;
        private @Nullable DashboardSheetControlsOption sheetControlsOption;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPublishOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adHocFilteringOption = defaults.adHocFilteringOption;
    	      this.exportToCSVOption = defaults.exportToCSVOption;
    	      this.sheetControlsOption = defaults.sheetControlsOption;
        }

        public Builder setAdHocFilteringOption(@Nullable DashboardAdHocFilteringOption adHocFilteringOption) {
            this.adHocFilteringOption = adHocFilteringOption;
            return this;
        }

        public Builder setExportToCSVOption(@Nullable DashboardExportToCSVOption exportToCSVOption) {
            this.exportToCSVOption = exportToCSVOption;
            return this;
        }

        public Builder setSheetControlsOption(@Nullable DashboardSheetControlsOption sheetControlsOption) {
            this.sheetControlsOption = sheetControlsOption;
            return this;
        }

        public DashboardPublishOptions build() {
            return new DashboardPublishOptions(adHocFilteringOption, exportToCSVOption, sheetControlsOption);
        }
    }
}
