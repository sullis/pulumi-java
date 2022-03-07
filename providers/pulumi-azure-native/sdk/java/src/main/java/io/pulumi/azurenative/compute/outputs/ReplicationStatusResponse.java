// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.RegionalReplicationStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ReplicationStatusResponse {
    /**
     * This is the aggregated replication status based on all the regional replication status flags.
     * 
     */
    private final String aggregatedState;
    /**
     * This is a summary of replication status for each region.
     * 
     */
    private final List<RegionalReplicationStatusResponse> summary;

    @OutputCustomType.Constructor({"aggregatedState","summary"})
    private ReplicationStatusResponse(
        String aggregatedState,
        List<RegionalReplicationStatusResponse> summary) {
        this.aggregatedState = Objects.requireNonNull(aggregatedState);
        this.summary = Objects.requireNonNull(summary);
    }

    /**
     * This is the aggregated replication status based on all the regional replication status flags.
     * 
    */
    public String getAggregatedState() {
        return this.aggregatedState;
    }
    /**
     * This is a summary of replication status for each region.
     * 
    */
    public List<RegionalReplicationStatusResponse> getSummary() {
        return this.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregatedState;
        private List<RegionalReplicationStatusResponse> summary;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregatedState = defaults.aggregatedState;
    	      this.summary = defaults.summary;
        }

        public Builder setAggregatedState(String aggregatedState) {
            this.aggregatedState = Objects.requireNonNull(aggregatedState);
            return this;
        }

        public Builder setSummary(List<RegionalReplicationStatusResponse> summary) {
            this.summary = Objects.requireNonNull(summary);
            return this;
        }
        public ReplicationStatusResponse build() {
            return new ReplicationStatusResponse(aggregatedState, summary);
        }
    }
}