// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.RCranPackageArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.RGitHubPackageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for a R environment.
 * 
 */
public final class ModelEnvironmentDefinitionRArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelEnvironmentDefinitionRArgs Empty = new ModelEnvironmentDefinitionRArgs();

    /**
     * The packages from Bioconductor.
     * 
     */
    @Import(name="bioConductorPackages")
    private @Nullable Output<List<String>> bioConductorPackages;

    /**
     * @return The packages from Bioconductor.
     * 
     */
    public Optional<Output<List<String>>> bioConductorPackages() {
        return Optional.ofNullable(this.bioConductorPackages);
    }

    /**
     * The CRAN packages to use.
     * 
     */
    @Import(name="cranPackages")
    private @Nullable Output<List<RCranPackageArgs>> cranPackages;

    /**
     * @return The CRAN packages to use.
     * 
     */
    public Optional<Output<List<RCranPackageArgs>>> cranPackages() {
        return Optional.ofNullable(this.cranPackages);
    }

    /**
     * The packages from custom urls.
     * 
     */
    @Import(name="customUrlPackages")
    private @Nullable Output<List<String>> customUrlPackages;

    /**
     * @return The packages from custom urls.
     * 
     */
    public Optional<Output<List<String>>> customUrlPackages() {
        return Optional.ofNullable(this.customUrlPackages);
    }

    /**
     * The packages directly from GitHub.
     * 
     */
    @Import(name="gitHubPackages")
    private @Nullable Output<List<RGitHubPackageArgs>> gitHubPackages;

    /**
     * @return The packages directly from GitHub.
     * 
     */
    public Optional<Output<List<RGitHubPackageArgs>>> gitHubPackages() {
        return Optional.ofNullable(this.gitHubPackages);
    }

    /**
     * The version of R to be installed
     * 
     */
    @Import(name="rVersion")
    private @Nullable Output<String> rVersion;

    /**
     * @return The version of R to be installed
     * 
     */
    public Optional<Output<String>> rVersion() {
        return Optional.ofNullable(this.rVersion);
    }

    /**
     * The Rscript path to use if an environment build is not required.
     * The path specified gets used to call the user script.
     * 
     */
    @Import(name="rscriptPath")
    private @Nullable Output<String> rscriptPath;

    /**
     * @return The Rscript path to use if an environment build is not required.
     * The path specified gets used to call the user script.
     * 
     */
    public Optional<Output<String>> rscriptPath() {
        return Optional.ofNullable(this.rscriptPath);
    }

    /**
     * Date of MRAN snapshot to use in YYYY-MM-DD format, e.g. &#34;2019-04-17&#34;
     * 
     */
    @Import(name="snapshotDate")
    private @Nullable Output<String> snapshotDate;

    /**
     * @return Date of MRAN snapshot to use in YYYY-MM-DD format, e.g. &#34;2019-04-17&#34;
     * 
     */
    public Optional<Output<String>> snapshotDate() {
        return Optional.ofNullable(this.snapshotDate);
    }

    /**
     * Indicates whether the environment is managed by user or by AzureML.
     * 
     */
    @Import(name="userManaged")
    private @Nullable Output<Boolean> userManaged;

    /**
     * @return Indicates whether the environment is managed by user or by AzureML.
     * 
     */
    public Optional<Output<Boolean>> userManaged() {
        return Optional.ofNullable(this.userManaged);
    }

    private ModelEnvironmentDefinitionRArgs() {}

    private ModelEnvironmentDefinitionRArgs(ModelEnvironmentDefinitionRArgs $) {
        this.bioConductorPackages = $.bioConductorPackages;
        this.cranPackages = $.cranPackages;
        this.customUrlPackages = $.customUrlPackages;
        this.gitHubPackages = $.gitHubPackages;
        this.rVersion = $.rVersion;
        this.rscriptPath = $.rscriptPath;
        this.snapshotDate = $.snapshotDate;
        this.userManaged = $.userManaged;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelEnvironmentDefinitionRArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelEnvironmentDefinitionRArgs $;

        public Builder() {
            $ = new ModelEnvironmentDefinitionRArgs();
        }

        public Builder(ModelEnvironmentDefinitionRArgs defaults) {
            $ = new ModelEnvironmentDefinitionRArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bioConductorPackages The packages from Bioconductor.
         * 
         * @return builder
         * 
         */
        public Builder bioConductorPackages(@Nullable Output<List<String>> bioConductorPackages) {
            $.bioConductorPackages = bioConductorPackages;
            return this;
        }

        /**
         * @param bioConductorPackages The packages from Bioconductor.
         * 
         * @return builder
         * 
         */
        public Builder bioConductorPackages(List<String> bioConductorPackages) {
            return bioConductorPackages(Output.of(bioConductorPackages));
        }

        /**
         * @param bioConductorPackages The packages from Bioconductor.
         * 
         * @return builder
         * 
         */
        public Builder bioConductorPackages(String... bioConductorPackages) {
            return bioConductorPackages(List.of(bioConductorPackages));
        }

        /**
         * @param cranPackages The CRAN packages to use.
         * 
         * @return builder
         * 
         */
        public Builder cranPackages(@Nullable Output<List<RCranPackageArgs>> cranPackages) {
            $.cranPackages = cranPackages;
            return this;
        }

        /**
         * @param cranPackages The CRAN packages to use.
         * 
         * @return builder
         * 
         */
        public Builder cranPackages(List<RCranPackageArgs> cranPackages) {
            return cranPackages(Output.of(cranPackages));
        }

        /**
         * @param cranPackages The CRAN packages to use.
         * 
         * @return builder
         * 
         */
        public Builder cranPackages(RCranPackageArgs... cranPackages) {
            return cranPackages(List.of(cranPackages));
        }

        /**
         * @param customUrlPackages The packages from custom urls.
         * 
         * @return builder
         * 
         */
        public Builder customUrlPackages(@Nullable Output<List<String>> customUrlPackages) {
            $.customUrlPackages = customUrlPackages;
            return this;
        }

        /**
         * @param customUrlPackages The packages from custom urls.
         * 
         * @return builder
         * 
         */
        public Builder customUrlPackages(List<String> customUrlPackages) {
            return customUrlPackages(Output.of(customUrlPackages));
        }

        /**
         * @param customUrlPackages The packages from custom urls.
         * 
         * @return builder
         * 
         */
        public Builder customUrlPackages(String... customUrlPackages) {
            return customUrlPackages(List.of(customUrlPackages));
        }

        /**
         * @param gitHubPackages The packages directly from GitHub.
         * 
         * @return builder
         * 
         */
        public Builder gitHubPackages(@Nullable Output<List<RGitHubPackageArgs>> gitHubPackages) {
            $.gitHubPackages = gitHubPackages;
            return this;
        }

        /**
         * @param gitHubPackages The packages directly from GitHub.
         * 
         * @return builder
         * 
         */
        public Builder gitHubPackages(List<RGitHubPackageArgs> gitHubPackages) {
            return gitHubPackages(Output.of(gitHubPackages));
        }

        /**
         * @param gitHubPackages The packages directly from GitHub.
         * 
         * @return builder
         * 
         */
        public Builder gitHubPackages(RGitHubPackageArgs... gitHubPackages) {
            return gitHubPackages(List.of(gitHubPackages));
        }

        /**
         * @param rVersion The version of R to be installed
         * 
         * @return builder
         * 
         */
        public Builder rVersion(@Nullable Output<String> rVersion) {
            $.rVersion = rVersion;
            return this;
        }

        /**
         * @param rVersion The version of R to be installed
         * 
         * @return builder
         * 
         */
        public Builder rVersion(String rVersion) {
            return rVersion(Output.of(rVersion));
        }

        /**
         * @param rscriptPath The Rscript path to use if an environment build is not required.
         * The path specified gets used to call the user script.
         * 
         * @return builder
         * 
         */
        public Builder rscriptPath(@Nullable Output<String> rscriptPath) {
            $.rscriptPath = rscriptPath;
            return this;
        }

        /**
         * @param rscriptPath The Rscript path to use if an environment build is not required.
         * The path specified gets used to call the user script.
         * 
         * @return builder
         * 
         */
        public Builder rscriptPath(String rscriptPath) {
            return rscriptPath(Output.of(rscriptPath));
        }

        /**
         * @param snapshotDate Date of MRAN snapshot to use in YYYY-MM-DD format, e.g. &#34;2019-04-17&#34;
         * 
         * @return builder
         * 
         */
        public Builder snapshotDate(@Nullable Output<String> snapshotDate) {
            $.snapshotDate = snapshotDate;
            return this;
        }

        /**
         * @param snapshotDate Date of MRAN snapshot to use in YYYY-MM-DD format, e.g. &#34;2019-04-17&#34;
         * 
         * @return builder
         * 
         */
        public Builder snapshotDate(String snapshotDate) {
            return snapshotDate(Output.of(snapshotDate));
        }

        /**
         * @param userManaged Indicates whether the environment is managed by user or by AzureML.
         * 
         * @return builder
         * 
         */
        public Builder userManaged(@Nullable Output<Boolean> userManaged) {
            $.userManaged = userManaged;
            return this;
        }

        /**
         * @param userManaged Indicates whether the environment is managed by user or by AzureML.
         * 
         * @return builder
         * 
         */
        public Builder userManaged(Boolean userManaged) {
            return userManaged(Output.of(userManaged));
        }

        public ModelEnvironmentDefinitionRArgs build() {
            return $;
        }
    }

}
