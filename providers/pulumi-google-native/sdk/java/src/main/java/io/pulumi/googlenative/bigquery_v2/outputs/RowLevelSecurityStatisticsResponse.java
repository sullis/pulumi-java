// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class RowLevelSecurityStatisticsResponse {
    /**
     * [Preview] Whether any accessed data was protected by row access policies.
     * 
     */
    private final Boolean rowLevelSecurityApplied;

    @OutputCustomType.Constructor({"rowLevelSecurityApplied"})
    private RowLevelSecurityStatisticsResponse(Boolean rowLevelSecurityApplied) {
        this.rowLevelSecurityApplied = Objects.requireNonNull(rowLevelSecurityApplied);
    }

    /**
     * [Preview] Whether any accessed data was protected by row access policies.
     * 
    */
    public Boolean getRowLevelSecurityApplied() {
        return this.rowLevelSecurityApplied;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RowLevelSecurityStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean rowLevelSecurityApplied;

        public Builder() {
    	      // Empty
        }

        public Builder(RowLevelSecurityStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rowLevelSecurityApplied = defaults.rowLevelSecurityApplied;
        }

        public Builder setRowLevelSecurityApplied(Boolean rowLevelSecurityApplied) {
            this.rowLevelSecurityApplied = Objects.requireNonNull(rowLevelSecurityApplied);
            return this;
        }
        public RowLevelSecurityStatisticsResponse build() {
            return new RowLevelSecurityStatisticsResponse(rowLevelSecurityApplied);
        }
    }
}