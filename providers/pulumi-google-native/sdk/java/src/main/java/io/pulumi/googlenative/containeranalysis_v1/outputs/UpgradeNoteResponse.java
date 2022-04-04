// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.UpgradeDistributionResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.VersionResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.WindowsUpdateResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UpgradeNoteResponse {
    /**
     * Metadata about the upgrade for each specific operating system.
     * 
     */
    private final List<UpgradeDistributionResponse> distributions;
    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
     */
    private final String package_;
    /**
     * Required for non-Windows OS. The version of the package in machine + human readable form.
     * 
     */
    private final VersionResponse version;
    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
     */
    private final WindowsUpdateResponse windowsUpdate;

    @CustomType.Constructor
    private UpgradeNoteResponse(
        @CustomType.Parameter("distributions") List<UpgradeDistributionResponse> distributions,
        @CustomType.Parameter("package") String package_,
        @CustomType.Parameter("version") VersionResponse version,
        @CustomType.Parameter("windowsUpdate") WindowsUpdateResponse windowsUpdate) {
        this.distributions = distributions;
        this.package_ = package_;
        this.version = version;
        this.windowsUpdate = windowsUpdate;
    }

    /**
     * Metadata about the upgrade for each specific operating system.
     * 
    */
    public List<UpgradeDistributionResponse> getDistributions() {
        return this.distributions;
    }
    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
    */
    public String getPackage_() {
        return this.package_;
    }
    /**
     * Required for non-Windows OS. The version of the package in machine + human readable form.
     * 
    */
    public VersionResponse getVersion() {
        return this.version;
    }
    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
    */
    public WindowsUpdateResponse getWindowsUpdate() {
        return this.windowsUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<UpgradeDistributionResponse> distributions;
        private String package_;
        private VersionResponse version;
        private WindowsUpdateResponse windowsUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributions = defaults.distributions;
    	      this.package_ = defaults.package_;
    	      this.version = defaults.version;
    	      this.windowsUpdate = defaults.windowsUpdate;
        }

        public Builder distributions(List<UpgradeDistributionResponse> distributions) {
            this.distributions = Objects.requireNonNull(distributions);
            return this;
        }
        public Builder distributions(UpgradeDistributionResponse... distributions) {
            return distributions(List.of(distributions));
        }
        public Builder package_(String package_) {
            this.package_ = Objects.requireNonNull(package_);
            return this;
        }
        public Builder version(VersionResponse version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder windowsUpdate(WindowsUpdateResponse windowsUpdate) {
            this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
            return this;
        }        public UpgradeNoteResponse build() {
            return new UpgradeNoteResponse(distributions, package_, version, windowsUpdate);
        }
    }
}
