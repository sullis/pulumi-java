// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationAggregatorOrganizationAggregationSource extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationAggregatorOrganizationAggregationSource Empty = new ConfigurationAggregatorOrganizationAggregationSource();

    @InputImport(name="allAwsRegions")
    private final @Nullable Boolean allAwsRegions;

    public Optional<Boolean> getAllAwsRegions() {
        return this.allAwsRegions == null ? Optional.empty() : Optional.ofNullable(this.allAwsRegions);
    }

    @InputImport(name="awsRegions")
    private final @Nullable List<String> awsRegions;

    public List<String> getAwsRegions() {
        return this.awsRegions == null ? List.of() : this.awsRegions;
    }

    @InputImport(name="roleArn", required=true)
    private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    public ConfigurationAggregatorOrganizationAggregationSource(
        @Nullable Boolean allAwsRegions,
        @Nullable List<String> awsRegions,
        String roleArn) {
        this.allAwsRegions = allAwsRegions;
        this.awsRegions = awsRegions;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private ConfigurationAggregatorOrganizationAggregationSource() {
        this.allAwsRegions = null;
        this.awsRegions = List.of();
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorOrganizationAggregationSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allAwsRegions;
        private @Nullable List<String> awsRegions;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorOrganizationAggregationSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAwsRegions = defaults.allAwsRegions;
    	      this.awsRegions = defaults.awsRegions;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setAllAwsRegions(@Nullable Boolean allAwsRegions) {
            this.allAwsRegions = allAwsRegions;
            return this;
        }

        public Builder setAwsRegions(@Nullable List<String> awsRegions) {
            this.awsRegions = awsRegions;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public ConfigurationAggregatorOrganizationAggregationSource build() {
            return new ConfigurationAggregatorOrganizationAggregationSource(allAwsRegions, awsRegions, roleArn);
        }
    }
}
