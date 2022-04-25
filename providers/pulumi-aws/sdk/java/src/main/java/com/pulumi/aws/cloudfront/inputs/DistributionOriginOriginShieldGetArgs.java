// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginOriginShieldGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOriginOriginShieldGetArgs Empty = new DistributionOriginOriginShieldGetArgs();

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return A flag that specifies whether Origin Shield is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The AWS Region for Origin Shield. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2.
     * 
     */
    @Import(name="originShieldRegion", required=true)
    private Output<String> originShieldRegion;

    /**
     * @return The AWS Region for Origin Shield. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2.
     * 
     */
    public Output<String> originShieldRegion() {
        return this.originShieldRegion;
    }

    private DistributionOriginOriginShieldGetArgs() {}

    private DistributionOriginOriginShieldGetArgs(DistributionOriginOriginShieldGetArgs $) {
        this.enabled = $.enabled;
        this.originShieldRegion = $.originShieldRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginOriginShieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginOriginShieldGetArgs $;

        public Builder() {
            $ = new DistributionOriginOriginShieldGetArgs();
        }

        public Builder(DistributionOriginOriginShieldGetArgs defaults) {
            $ = new DistributionOriginOriginShieldGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled A flag that specifies whether Origin Shield is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled A flag that specifies whether Origin Shield is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param originShieldRegion The AWS Region for Origin Shield. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2.
         * 
         * @return builder
         * 
         */
        public Builder originShieldRegion(Output<String> originShieldRegion) {
            $.originShieldRegion = originShieldRegion;
            return this;
        }

        /**
         * @param originShieldRegion The AWS Region for Origin Shield. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2.
         * 
         * @return builder
         * 
         */
        public Builder originShieldRegion(String originShieldRegion) {
            return originShieldRegion(Output.of(originShieldRegion));
        }

        public DistributionOriginOriginShieldGetArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.originShieldRegion = Objects.requireNonNull($.originShieldRegion, "expected parameter 'originShieldRegion' to be non-null");
            return $;
        }
    }

}
