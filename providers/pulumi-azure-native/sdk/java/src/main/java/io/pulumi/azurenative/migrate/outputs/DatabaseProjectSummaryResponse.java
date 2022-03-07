// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseProjectSummaryResponse {
    /**
     * Gets or sets the extended summary.
     * 
     */
    private final @Nullable Map<String,String> extendedSummary;
    /**
     * Gets the Instance type.
     * Expected value is 'Databases'.
     * 
     */
    private final String instanceType;
    /**
     * Gets or sets the time when summary was last refreshed.
     * 
     */
    private final @Nullable String lastSummaryRefreshedTime;
    /**
     * Gets or sets the state of refresh summary.
     * 
     */
    private final @Nullable String refreshSummaryState;

    @OutputCustomType.Constructor({"extendedSummary","instanceType","lastSummaryRefreshedTime","refreshSummaryState"})
    private DatabaseProjectSummaryResponse(
        @Nullable Map<String,String> extendedSummary,
        String instanceType,
        @Nullable String lastSummaryRefreshedTime,
        @Nullable String refreshSummaryState) {
        this.extendedSummary = extendedSummary;
        this.instanceType = Objects.requireNonNull(instanceType);
        this.lastSummaryRefreshedTime = lastSummaryRefreshedTime;
        this.refreshSummaryState = refreshSummaryState;
    }

    /**
     * Gets or sets the extended summary.
     * 
    */
    public Map<String,String> getExtendedSummary() {
        return this.extendedSummary == null ? Map.of() : this.extendedSummary;
    }
    /**
     * Gets the Instance type.
     * Expected value is 'Databases'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * Gets or sets the time when summary was last refreshed.
     * 
    */
    public Optional<String> getLastSummaryRefreshedTime() {
        return Optional.ofNullable(this.lastSummaryRefreshedTime);
    }
    /**
     * Gets or sets the state of refresh summary.
     * 
    */
    public Optional<String> getRefreshSummaryState() {
        return Optional.ofNullable(this.refreshSummaryState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseProjectSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> extendedSummary;
        private String instanceType;
        private @Nullable String lastSummaryRefreshedTime;
        private @Nullable String refreshSummaryState;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseProjectSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedSummary = defaults.extendedSummary;
    	      this.instanceType = defaults.instanceType;
    	      this.lastSummaryRefreshedTime = defaults.lastSummaryRefreshedTime;
    	      this.refreshSummaryState = defaults.refreshSummaryState;
        }

        public Builder setExtendedSummary(@Nullable Map<String,String> extendedSummary) {
            this.extendedSummary = extendedSummary;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setLastSummaryRefreshedTime(@Nullable String lastSummaryRefreshedTime) {
            this.lastSummaryRefreshedTime = lastSummaryRefreshedTime;
            return this;
        }

        public Builder setRefreshSummaryState(@Nullable String refreshSummaryState) {
            this.refreshSummaryState = refreshSummaryState;
            return this;
        }
        public DatabaseProjectSummaryResponse build() {
            return new DatabaseProjectSummaryResponse(extendedSummary, instanceType, lastSummaryRefreshedTime, refreshSummaryState);
        }
    }
}