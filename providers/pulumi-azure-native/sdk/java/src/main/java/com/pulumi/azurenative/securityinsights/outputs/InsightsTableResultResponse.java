// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.azurenative.securityinsights.outputs.InsightsTableResultResponseColumns;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InsightsTableResultResponse {
    /**
     * @return Columns Metadata of the table
     * 
     */
    private final @Nullable List<InsightsTableResultResponseColumns> columns;
    /**
     * @return Rows data of the table
     * 
     */
    private final @Nullable List<List<String>> rows;

    @CustomType.Constructor
    private InsightsTableResultResponse(
        @CustomType.Parameter("columns") @Nullable List<InsightsTableResultResponseColumns> columns,
        @CustomType.Parameter("rows") @Nullable List<List<String>> rows) {
        this.columns = columns;
        this.rows = rows;
    }

    /**
     * @return Columns Metadata of the table
     * 
     */
    public List<InsightsTableResultResponseColumns> columns() {
        return this.columns == null ? List.of() : this.columns;
    }
    /**
     * @return Rows data of the table
     * 
     */
    public List<List<String>> rows() {
        return this.rows == null ? List.of() : this.rows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightsTableResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InsightsTableResultResponseColumns> columns;
        private @Nullable List<List<String>> rows;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightsTableResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.rows = defaults.rows;
        }

        public Builder columns(@Nullable List<InsightsTableResultResponseColumns> columns) {
            this.columns = columns;
            return this;
        }
        public Builder columns(InsightsTableResultResponseColumns... columns) {
            return columns(List.of(columns));
        }
        public Builder rows(@Nullable List<List<String>> rows) {
            this.rows = rows;
            return this;
        }        public InsightsTableResultResponse build() {
            return new InsightsTableResultResponse(columns, rows);
        }
    }
}
