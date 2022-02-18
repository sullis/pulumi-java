// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.RegionalReplicationStatusResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This is the replication status of the gallery image version.
 * 
 */
public final class ReplicationStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReplicationStatusResponse Empty = new ReplicationStatusResponse();

    /**
     * This is the aggregated replication status based on all the regional replication status flags.
     * 
     */
    @InputImport(name="aggregatedState", required=true)
    private final String aggregatedState;

    public String getAggregatedState() {
        return this.aggregatedState;
    }

    /**
     * This is a summary of replication status for each region.
     * 
     */
    @InputImport(name="summary", required=true)
    private final List<RegionalReplicationStatusResponse> summary;

    public List<RegionalReplicationStatusResponse> getSummary() {
        return this.summary;
    }

    public ReplicationStatusResponse(
        String aggregatedState,
        List<RegionalReplicationStatusResponse> summary) {
        this.aggregatedState = Objects.requireNonNull(aggregatedState, "expected parameter 'aggregatedState' to be non-null");
        this.summary = Objects.requireNonNull(summary, "expected parameter 'summary' to be non-null");
    }

    private ReplicationStatusResponse() {
        this.aggregatedState = null;
        this.summary = List.of();
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
