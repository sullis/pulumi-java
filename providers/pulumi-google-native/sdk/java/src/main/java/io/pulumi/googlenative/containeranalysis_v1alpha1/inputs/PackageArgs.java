// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DistributionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This represents a particular package that is distributed over various channels. e.g. glibc (aka libc6) is distributed by many, at various versions.
 * 
 */
public final class PackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageArgs Empty = new PackageArgs();

    /**
     * The various channels by which a package is distributed.
     * 
     */
    @InputImport(name="distribution")
      private final @Nullable Input<List<DistributionArgs>> distribution;

    public Input<List<DistributionArgs>> getDistribution() {
        return this.distribution == null ? Input.empty() : this.distribution;
    }

    /**
     * The name of the package.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public PackageArgs(
        @Nullable Input<List<DistributionArgs>> distribution,
        @Nullable Input<String> name) {
        this.distribution = distribution;
        this.name = name;
    }

    private PackageArgs() {
        this.distribution = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DistributionArgs>> distribution;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.name = defaults.name;
        }

        public Builder setDistribution(@Nullable Input<List<DistributionArgs>> distribution) {
            this.distribution = distribution;
            return this;
        }

        public Builder setDistribution(@Nullable List<DistributionArgs> distribution) {
            this.distribution = Input.ofNullable(distribution);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public PackageArgs build() {
            return new PackageArgs(distribution, name);
        }
    }
}