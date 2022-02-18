// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RegionalReplicationStatusResponse {
    /**
     * The details of the replication status.
     * 
     */
    private final String details;
    /**
     * It indicates progress of the replication job.
     * 
     */
    private final Integer progress;
    /**
     * The region to which the gallery image version is being replicated to.
     * 
     */
    private final String region;
    /**
     * This is the regional replication state.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"details","progress","region","state"})
    private RegionalReplicationStatusResponse(
        String details,
        Integer progress,
        String region,
        String state) {
        this.details = Objects.requireNonNull(details);
        this.progress = Objects.requireNonNull(progress);
        this.region = Objects.requireNonNull(region);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The details of the replication status.
     * 
     */
    public String getDetails() {
        return this.details;
    }
    /**
     * It indicates progress of the replication job.
     * 
     */
    public Integer getProgress() {
        return this.progress;
    }
    /**
     * The region to which the gallery image version is being replicated to.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * This is the regional replication state.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionalReplicationStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String details;
        private Integer progress;
        private String region;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionalReplicationStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.progress = defaults.progress;
    	      this.region = defaults.region;
    	      this.state = defaults.state;
        }

        public Builder setDetails(String details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setProgress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public RegionalReplicationStatusResponse build() {
            return new RegionalReplicationStatusResponse(details, progress, region, state);
        }
    }
}
