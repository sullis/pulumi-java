// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketIntelligentTieringConfigurationTiering {
    /**
     * S3 Intelligent-Tiering access tier. Valid values: `ARCHIVE_CONFIGURATION`, `DEEP_ARCHIVE_CONFIGURATION`.
     * 
     */
    private final String accessTier;
    /**
     * The number of consecutive days of no access after which an object will be eligible to be transitioned to the corresponding tier.
     * 
     */
    private final Integer days;

    @CustomType.Constructor
    private BucketIntelligentTieringConfigurationTiering(
        @CustomType.Parameter("accessTier") String accessTier,
        @CustomType.Parameter("days") Integer days) {
        this.accessTier = accessTier;
        this.days = days;
    }

    /**
     * S3 Intelligent-Tiering access tier. Valid values: `ARCHIVE_CONFIGURATION`, `DEEP_ARCHIVE_CONFIGURATION`.
     * 
    */
    public String getAccessTier() {
        return this.accessTier;
    }
    /**
     * The number of consecutive days of no access after which an object will be eligible to be transitioned to the corresponding tier.
     * 
    */
    public Integer getDays() {
        return this.days;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfigurationTiering defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessTier;
        private Integer days;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfigurationTiering defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.days = defaults.days;
        }

        public Builder accessTier(String accessTier) {
            this.accessTier = Objects.requireNonNull(accessTier);
            return this;
        }
        public Builder days(Integer days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }        public BucketIntelligentTieringConfigurationTiering build() {
            return new BucketIntelligentTieringConfigurationTiering(accessTier, days);
        }
    }
}
