// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.DistributionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PackageNoteResponse {
    /**
     * The various channels by which a package is distributed.
     * 
     */
    private final List<DistributionResponse> distribution;
    /**
     * Immutable. The name of the package.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"distribution","name"})
    private PackageNoteResponse(
        List<DistributionResponse> distribution,
        String name) {
        this.distribution = Objects.requireNonNull(distribution);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The various channels by which a package is distributed.
     * 
    */
    public List<DistributionResponse> getDistribution() {
        return this.distribution;
    }
    /**
     * Immutable. The name of the package.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DistributionResponse> distribution;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.name = defaults.name;
        }

        public Builder setDistribution(List<DistributionResponse> distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PackageNoteResponse build() {
            return new PackageNoteResponse(distribution, name);
        }
    }
}