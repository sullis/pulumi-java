// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.SparkMavenPackageResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelEnvironmentDefinitionResponseResponseSpark {
    /**
     * @return The Spark packages to use.
     * 
     */
    private final @Nullable List<SparkMavenPackageResponse> packages;
    /**
     * @return Whether to precache the packages.
     * 
     */
    private final @Nullable Boolean precachePackages;
    /**
     * @return The list of spark repositories.
     * 
     */
    private final @Nullable List<String> repositories;

    @CustomType.Constructor
    private ModelEnvironmentDefinitionResponseResponseSpark(
        @CustomType.Parameter("packages") @Nullable List<SparkMavenPackageResponse> packages,
        @CustomType.Parameter("precachePackages") @Nullable Boolean precachePackages,
        @CustomType.Parameter("repositories") @Nullable List<String> repositories) {
        this.packages = packages;
        this.precachePackages = precachePackages;
        this.repositories = repositories;
    }

    /**
     * @return The Spark packages to use.
     * 
     */
    public List<SparkMavenPackageResponse> packages() {
        return this.packages == null ? List.of() : this.packages;
    }
    /**
     * @return Whether to precache the packages.
     * 
     */
    public Optional<Boolean> precachePackages() {
        return Optional.ofNullable(this.precachePackages);
    }
    /**
     * @return The list of spark repositories.
     * 
     */
    public List<String> repositories() {
        return this.repositories == null ? List.of() : this.repositories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionResponseResponseSpark defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SparkMavenPackageResponse> packages;
        private @Nullable Boolean precachePackages;
        private @Nullable List<String> repositories;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionResponseResponseSpark defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packages = defaults.packages;
    	      this.precachePackages = defaults.precachePackages;
    	      this.repositories = defaults.repositories;
        }

        public Builder packages(@Nullable List<SparkMavenPackageResponse> packages) {
            this.packages = packages;
            return this;
        }
        public Builder packages(SparkMavenPackageResponse... packages) {
            return packages(List.of(packages));
        }
        public Builder precachePackages(@Nullable Boolean precachePackages) {
            this.precachePackages = precachePackages;
            return this;
        }
        public Builder repositories(@Nullable List<String> repositories) {
            this.repositories = repositories;
            return this;
        }
        public Builder repositories(String... repositories) {
            return repositories(List.of(repositories));
        }        public ModelEnvironmentDefinitionResponseResponseSpark build() {
            return new ModelEnvironmentDefinitionResponseResponseSpark(packages, precachePackages, repositories);
        }
    }
}
