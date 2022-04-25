// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InsightFiltersNetworkDestinationPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersNetworkDestinationPortArgs Empty = new InsightFiltersNetworkDestinationPortArgs();

    /**
     * The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @Import(name="eq")
    private @Nullable Output<String> eq;

    /**
     * @return The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<Output<String>> eq() {
        return Optional.ofNullable(this.eq);
    }

    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @Import(name="gte")
    private @Nullable Output<String> gte;

    /**
     * @return The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<Output<String>> gte() {
        return Optional.ofNullable(this.gte);
    }

    /**
     * The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @Import(name="lte")
    private @Nullable Output<String> lte;

    /**
     * @return The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<Output<String>> lte() {
        return Optional.ofNullable(this.lte);
    }

    private InsightFiltersNetworkDestinationPortArgs() {}

    private InsightFiltersNetworkDestinationPortArgs(InsightFiltersNetworkDestinationPortArgs $) {
        this.eq = $.eq;
        this.gte = $.gte;
        this.lte = $.lte;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersNetworkDestinationPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersNetworkDestinationPortArgs $;

        public Builder() {
            $ = new InsightFiltersNetworkDestinationPortArgs();
        }

        public Builder(InsightFiltersNetworkDestinationPortArgs defaults) {
            $ = new InsightFiltersNetworkDestinationPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eq The equal-to condition to be applied to a single field when querying for findings, provided as a String.
         * 
         * @return builder
         * 
         */
        public Builder eq(@Nullable Output<String> eq) {
            $.eq = eq;
            return this;
        }

        /**
         * @param eq The equal-to condition to be applied to a single field when querying for findings, provided as a String.
         * 
         * @return builder
         * 
         */
        public Builder eq(String eq) {
            return eq(Output.of(eq));
        }

        /**
         * @param gte The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
         * 
         * @return builder
         * 
         */
        public Builder gte(@Nullable Output<String> gte) {
            $.gte = gte;
            return this;
        }

        /**
         * @param gte The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
         * 
         * @return builder
         * 
         */
        public Builder gte(String gte) {
            return gte(Output.of(gte));
        }

        /**
         * @param lte The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
         * 
         * @return builder
         * 
         */
        public Builder lte(@Nullable Output<String> lte) {
            $.lte = lte;
            return this;
        }

        /**
         * @param lte The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
         * 
         * @return builder
         * 
         */
        public Builder lte(String lte) {
            return lte(Output.of(lte));
        }

        public InsightFiltersNetworkDestinationPortArgs build() {
            return $;
        }
    }

}
