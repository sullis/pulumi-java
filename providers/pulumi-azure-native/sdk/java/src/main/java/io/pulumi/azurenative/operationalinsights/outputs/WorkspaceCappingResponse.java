// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkspaceCappingResponse {
    /**
     * The workspace daily quota for ingestion.
     * 
     */
    private final @Nullable Double dailyQuotaGb;
    /**
     * The status of data ingestion for this workspace.
     * 
     */
    private final String dataIngestionStatus;
    /**
     * The time when the quota will be rest.
     * 
     */
    private final String quotaNextResetTime;

    @OutputCustomType.Constructor({"dailyQuotaGb","dataIngestionStatus","quotaNextResetTime"})
    private WorkspaceCappingResponse(
        @Nullable Double dailyQuotaGb,
        String dataIngestionStatus,
        String quotaNextResetTime) {
        this.dailyQuotaGb = dailyQuotaGb;
        this.dataIngestionStatus = Objects.requireNonNull(dataIngestionStatus);
        this.quotaNextResetTime = Objects.requireNonNull(quotaNextResetTime);
    }

    /**
     * The workspace daily quota for ingestion.
     * 
    */
    public Optional<Double> getDailyQuotaGb() {
        return Optional.ofNullable(this.dailyQuotaGb);
    }
    /**
     * The status of data ingestion for this workspace.
     * 
    */
    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }
    /**
     * The time when the quota will be rest.
     * 
    */
    public String getQuotaNextResetTime() {
        return this.quotaNextResetTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double dailyQuotaGb;
        private String dataIngestionStatus;
        private String quotaNextResetTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyQuotaGb = defaults.dailyQuotaGb;
    	      this.dataIngestionStatus = defaults.dataIngestionStatus;
    	      this.quotaNextResetTime = defaults.quotaNextResetTime;
        }

        public Builder setDailyQuotaGb(@Nullable Double dailyQuotaGb) {
            this.dailyQuotaGb = dailyQuotaGb;
            return this;
        }

        public Builder setDataIngestionStatus(String dataIngestionStatus) {
            this.dataIngestionStatus = Objects.requireNonNull(dataIngestionStatus);
            return this;
        }

        public Builder setQuotaNextResetTime(String quotaNextResetTime) {
            this.quotaNextResetTime = Objects.requireNonNull(quotaNextResetTime);
            return this;
        }
        public WorkspaceCappingResponse build() {
            return new WorkspaceCappingResponse(dailyQuotaGb, dataIngestionStatus, quotaNextResetTime);
        }
    }
}