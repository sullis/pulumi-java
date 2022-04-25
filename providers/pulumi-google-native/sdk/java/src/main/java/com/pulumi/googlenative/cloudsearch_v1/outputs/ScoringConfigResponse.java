// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ScoringConfigResponse {
    /**
     * @return Whether to use freshness as a ranking signal. By default, freshness is used as a ranking signal. Note that this setting is not available in the Admin UI.
     * 
     */
    private final Boolean disableFreshness;
    /**
     * @return Whether to personalize the results. By default, personal signals will be used to boost results.
     * 
     */
    private final Boolean disablePersonalization;

    @CustomType.Constructor
    private ScoringConfigResponse(
        @CustomType.Parameter("disableFreshness") Boolean disableFreshness,
        @CustomType.Parameter("disablePersonalization") Boolean disablePersonalization) {
        this.disableFreshness = disableFreshness;
        this.disablePersonalization = disablePersonalization;
    }

    /**
     * @return Whether to use freshness as a ranking signal. By default, freshness is used as a ranking signal. Note that this setting is not available in the Admin UI.
     * 
     */
    public Boolean disableFreshness() {
        return this.disableFreshness;
    }
    /**
     * @return Whether to personalize the results. By default, personal signals will be used to boost results.
     * 
     */
    public Boolean disablePersonalization() {
        return this.disablePersonalization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScoringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableFreshness;
        private Boolean disablePersonalization;

        public Builder() {
    	      // Empty
        }

        public Builder(ScoringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableFreshness = defaults.disableFreshness;
    	      this.disablePersonalization = defaults.disablePersonalization;
        }

        public Builder disableFreshness(Boolean disableFreshness) {
            this.disableFreshness = Objects.requireNonNull(disableFreshness);
            return this;
        }
        public Builder disablePersonalization(Boolean disablePersonalization) {
            this.disablePersonalization = Objects.requireNonNull(disablePersonalization);
            return this;
        }        public ScoringConfigResponse build() {
            return new ScoringConfigResponse(disableFreshness, disablePersonalization);
        }
    }
}
