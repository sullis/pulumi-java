// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudsearch_v1.outputs.SourceCrowdingConfigResponse;
import io.pulumi.googlenative.cloudsearch_v1.outputs.SourceResponse;
import io.pulumi.googlenative.cloudsearch_v1.outputs.SourceScoringConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class SourceConfigResponse {
    /**
     * The crowding configuration for the source.
     * 
     */
    private final SourceCrowdingConfigResponse crowdingConfig;
    /**
     * The scoring configuration for the source.
     * 
     */
    private final SourceScoringConfigResponse scoringConfig;
    /**
     * The source for which this configuration is to be used.
     * 
     */
    private final SourceResponse source;

    @OutputCustomType.Constructor({"crowdingConfig","scoringConfig","source"})
    private SourceConfigResponse(
        SourceCrowdingConfigResponse crowdingConfig,
        SourceScoringConfigResponse scoringConfig,
        SourceResponse source) {
        this.crowdingConfig = Objects.requireNonNull(crowdingConfig);
        this.scoringConfig = Objects.requireNonNull(scoringConfig);
        this.source = Objects.requireNonNull(source);
    }

    /**
     * The crowding configuration for the source.
     * 
    */
    public SourceCrowdingConfigResponse getCrowdingConfig() {
        return this.crowdingConfig;
    }
    /**
     * The scoring configuration for the source.
     * 
    */
    public SourceScoringConfigResponse getScoringConfig() {
        return this.scoringConfig;
    }
    /**
     * The source for which this configuration is to be used.
     * 
    */
    public SourceResponse getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceCrowdingConfigResponse crowdingConfig;
        private SourceScoringConfigResponse scoringConfig;
        private SourceResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crowdingConfig = defaults.crowdingConfig;
    	      this.scoringConfig = defaults.scoringConfig;
    	      this.source = defaults.source;
        }

        public Builder setCrowdingConfig(SourceCrowdingConfigResponse crowdingConfig) {
            this.crowdingConfig = Objects.requireNonNull(crowdingConfig);
            return this;
        }

        public Builder setScoringConfig(SourceScoringConfigResponse scoringConfig) {
            this.scoringConfig = Objects.requireNonNull(scoringConfig);
            return this;
        }

        public Builder setSource(SourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public SourceConfigResponse build() {
            return new SourceConfigResponse(crowdingConfig, scoringConfig, source);
        }
    }
}