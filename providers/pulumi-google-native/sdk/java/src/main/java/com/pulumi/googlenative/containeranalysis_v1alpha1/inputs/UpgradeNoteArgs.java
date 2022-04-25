// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.UpgradeDistributionArgs;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.VersionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Upgrade Note represents a potential upgrade of a package to a given version. For each package version combination (i.e. bash 4.0, bash 4.1, bash 4.1.2), there will be a Upgrade Note.
 * 
 */
public final class UpgradeNoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final UpgradeNoteArgs Empty = new UpgradeNoteArgs();

    /**
     * Metadata about the upgrade for each specific operating system.
     * 
     */
    @Import(name="distributions")
    private @Nullable Output<List<UpgradeDistributionArgs>> distributions;

    /**
     * @return Metadata about the upgrade for each specific operating system.
     * 
     */
    public Optional<Output<List<UpgradeDistributionArgs>>> distributions() {
        return Optional.ofNullable(this.distributions);
    }

    /**
     * Required - The package this Upgrade is for.
     * 
     */
    @Import(name="package")
    private @Nullable Output<String> package_;

    /**
     * @return Required - The package this Upgrade is for.
     * 
     */
    public Optional<Output<String>> package_() {
        return Optional.ofNullable(this.package_);
    }

    /**
     * Required - The version of the package in machine + human readable form.
     * 
     */
    @Import(name="version")
    private @Nullable Output<VersionArgs> version;

    /**
     * @return Required - The version of the package in machine + human readable form.
     * 
     */
    public Optional<Output<VersionArgs>> version() {
        return Optional.ofNullable(this.version);
    }

    private UpgradeNoteArgs() {}

    private UpgradeNoteArgs(UpgradeNoteArgs $) {
        this.distributions = $.distributions;
        this.package_ = $.package_;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpgradeNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeNoteArgs $;

        public Builder() {
            $ = new UpgradeNoteArgs();
        }

        public Builder(UpgradeNoteArgs defaults) {
            $ = new UpgradeNoteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param distributions Metadata about the upgrade for each specific operating system.
         * 
         * @return builder
         * 
         */
        public Builder distributions(@Nullable Output<List<UpgradeDistributionArgs>> distributions) {
            $.distributions = distributions;
            return this;
        }

        /**
         * @param distributions Metadata about the upgrade for each specific operating system.
         * 
         * @return builder
         * 
         */
        public Builder distributions(List<UpgradeDistributionArgs> distributions) {
            return distributions(Output.of(distributions));
        }

        /**
         * @param distributions Metadata about the upgrade for each specific operating system.
         * 
         * @return builder
         * 
         */
        public Builder distributions(UpgradeDistributionArgs... distributions) {
            return distributions(List.of(distributions));
        }

        /**
         * @param package_ Required - The package this Upgrade is for.
         * 
         * @return builder
         * 
         */
        public Builder package_(@Nullable Output<String> package_) {
            $.package_ = package_;
            return this;
        }

        /**
         * @param package_ Required - The package this Upgrade is for.
         * 
         * @return builder
         * 
         */
        public Builder package_(String package_) {
            return package_(Output.of(package_));
        }

        /**
         * @param version Required - The version of the package in machine + human readable form.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<VersionArgs> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Required - The version of the package in machine + human readable form.
         * 
         * @return builder
         * 
         */
        public Builder version(VersionArgs version) {
            return version(Output.of(version));
        }

        public UpgradeNoteArgs build() {
            return $;
        }
    }

}
