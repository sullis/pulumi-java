// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.DistributionConfigurationDistribution;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDistributionConfigurationResult {
    /**
     * The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    private final @Nullable String arn;
    /**
     * The description of the distribution configuration.
     * 
     */
    private final @Nullable String description;
    /**
     * The distributions of the distribution configuration.
     * 
     */
    private final @Nullable List<DistributionConfigurationDistribution> distributions;
    /**
     * The tags associated with the component.
     * 
     */
    private final @Nullable Object tags;

    @CustomType.Constructor
    private GetDistributionConfigurationResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("distributions") @Nullable List<DistributionConfigurationDistribution> distributions,
        @CustomType.Parameter("tags") @Nullable Object tags) {
        this.arn = arn;
        this.description = description;
        this.distributions = distributions;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration.
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The description of the distribution configuration.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The distributions of the distribution configuration.
     * 
    */
    public List<DistributionConfigurationDistribution> distributions() {
        return this.distributions == null ? List.of() : this.distributions;
    }
    /**
     * The tags associated with the component.
     * 
    */
    public Optional<Object> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable List<DistributionConfigurationDistribution> distributions;
        private @Nullable Object tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.distributions = defaults.distributions;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder distributions(@Nullable List<DistributionConfigurationDistribution> distributions) {
            this.distributions = distributions;
            return this;
        }
        public Builder distributions(DistributionConfigurationDistribution... distributions) {
            return distributions(List.of(distributions));
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }        public GetDistributionConfigurationResult build() {
            return new GetDistributionConfigurationResult(arn, description, distributions, tags);
        }
    }
}
