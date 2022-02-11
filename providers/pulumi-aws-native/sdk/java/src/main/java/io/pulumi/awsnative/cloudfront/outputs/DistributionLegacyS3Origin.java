// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionLegacyS3Origin {
    private final String dNSName;
    private final @Nullable String originAccessIdentity;

    @OutputCustomType.Constructor({"dNSName","originAccessIdentity"})
    private DistributionLegacyS3Origin(
        String dNSName,
        @Nullable String originAccessIdentity) {
        this.dNSName = Objects.requireNonNull(dNSName);
        this.originAccessIdentity = originAccessIdentity;
    }

    public String getDNSName() {
        return this.dNSName;
    }
    public Optional<String> getOriginAccessIdentity() {
        return Optional.ofNullable(this.originAccessIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLegacyS3Origin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dNSName;
        private @Nullable String originAccessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLegacyS3Origin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dNSName = defaults.dNSName;
    	      this.originAccessIdentity = defaults.originAccessIdentity;
        }

        public Builder setDNSName(String dNSName) {
            this.dNSName = Objects.requireNonNull(dNSName);
            return this;
        }

        public Builder setOriginAccessIdentity(@Nullable String originAccessIdentity) {
            this.originAccessIdentity = originAccessIdentity;
            return this;
        }

        public DistributionLegacyS3Origin build() {
            return new DistributionLegacyS3Origin(dNSName, originAccessIdentity);
        }
    }
}
