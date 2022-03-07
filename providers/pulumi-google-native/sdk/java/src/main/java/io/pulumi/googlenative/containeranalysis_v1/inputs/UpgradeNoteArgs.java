// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.UpgradeDistributionArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.VersionArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.WindowsUpdateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Upgrade Note represents a potential upgrade of a package to a given version. For each package version combination (i.e. bash 4.0, bash 4.1, bash 4.1.2), there will be an Upgrade Note. For Windows, windows_update field represents the information related to the update.
 * 
 */
public final class UpgradeNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final UpgradeNoteArgs Empty = new UpgradeNoteArgs();

    /**
     * Metadata about the upgrade for each specific operating system.
     * 
     */
    @InputImport(name="distributions")
      private final @Nullable Input<List<UpgradeDistributionArgs>> distributions;

    public Input<List<UpgradeDistributionArgs>> getDistributions() {
        return this.distributions == null ? Input.empty() : this.distributions;
    }

    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
     */
    @InputImport(name="package")
      private final @Nullable Input<String> $package;

    public Input<String> get$package() {
        return this.$package == null ? Input.empty() : this.$package;
    }

    /**
     * Required for non-Windows OS. The version of the package in machine + human readable form.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<VersionArgs> version;

    public Input<VersionArgs> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
     */
    @InputImport(name="windowsUpdate")
      private final @Nullable Input<WindowsUpdateArgs> windowsUpdate;

    public Input<WindowsUpdateArgs> getWindowsUpdate() {
        return this.windowsUpdate == null ? Input.empty() : this.windowsUpdate;
    }

    public UpgradeNoteArgs(
        @Nullable Input<List<UpgradeDistributionArgs>> distributions,
        @Nullable Input<String> $package,
        @Nullable Input<VersionArgs> version,
        @Nullable Input<WindowsUpdateArgs> windowsUpdate) {
        this.distributions = distributions;
        this.$package = $package;
        this.version = version;
        this.windowsUpdate = windowsUpdate;
    }

    private UpgradeNoteArgs() {
        this.distributions = Input.empty();
        this.$package = Input.empty();
        this.version = Input.empty();
        this.windowsUpdate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<UpgradeDistributionArgs>> distributions;
        private @Nullable Input<String> $package;
        private @Nullable Input<VersionArgs> version;
        private @Nullable Input<WindowsUpdateArgs> windowsUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributions = defaults.distributions;
    	      this.$package = defaults.$package;
    	      this.version = defaults.version;
    	      this.windowsUpdate = defaults.windowsUpdate;
        }

        public Builder setDistributions(@Nullable Input<List<UpgradeDistributionArgs>> distributions) {
            this.distributions = distributions;
            return this;
        }

        public Builder setDistributions(@Nullable List<UpgradeDistributionArgs> distributions) {
            this.distributions = Input.ofNullable(distributions);
            return this;
        }

        public Builder set$package(@Nullable Input<String> $package) {
            this.$package = $package;
            return this;
        }

        public Builder set$package(@Nullable String $package) {
            this.$package = Input.ofNullable($package);
            return this;
        }

        public Builder setVersion(@Nullable Input<VersionArgs> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable VersionArgs version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setWindowsUpdate(@Nullable Input<WindowsUpdateArgs> windowsUpdate) {
            this.windowsUpdate = windowsUpdate;
            return this;
        }

        public Builder setWindowsUpdate(@Nullable WindowsUpdateArgs windowsUpdate) {
            this.windowsUpdate = Input.ofNullable(windowsUpdate);
            return this;
        }
        public UpgradeNoteArgs build() {
            return new UpgradeNoteArgs(distributions, $package, version, windowsUpdate);
        }
    }
}