// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DmlStatisticsResponse {
    /**
     * Number of deleted Rows. populated by DML DELETE, MERGE and TRUNCATE statements.
     * 
     */
    private final String deletedRowCount;
    /**
     * Number of inserted Rows. Populated by DML INSERT and MERGE statements.
     * 
     */
    private final String insertedRowCount;
    /**
     * Number of updated Rows. Populated by DML UPDATE and MERGE statements.
     * 
     */
    private final String updatedRowCount;

    @OutputCustomType.Constructor({"deletedRowCount","insertedRowCount","updatedRowCount"})
    private DmlStatisticsResponse(
        String deletedRowCount,
        String insertedRowCount,
        String updatedRowCount) {
        this.deletedRowCount = Objects.requireNonNull(deletedRowCount);
        this.insertedRowCount = Objects.requireNonNull(insertedRowCount);
        this.updatedRowCount = Objects.requireNonNull(updatedRowCount);
    }

    /**
     * Number of deleted Rows. populated by DML DELETE, MERGE and TRUNCATE statements.
     * 
    */
    public String getDeletedRowCount() {
        return this.deletedRowCount;
    }
    /**
     * Number of inserted Rows. Populated by DML INSERT and MERGE statements.
     * 
    */
    public String getInsertedRowCount() {
        return this.insertedRowCount;
    }
    /**
     * Number of updated Rows. Populated by DML UPDATE and MERGE statements.
     * 
    */
    public String getUpdatedRowCount() {
        return this.updatedRowCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DmlStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deletedRowCount;
        private String insertedRowCount;
        private String updatedRowCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DmlStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletedRowCount = defaults.deletedRowCount;
    	      this.insertedRowCount = defaults.insertedRowCount;
    	      this.updatedRowCount = defaults.updatedRowCount;
        }

        public Builder setDeletedRowCount(String deletedRowCount) {
            this.deletedRowCount = Objects.requireNonNull(deletedRowCount);
            return this;
        }

        public Builder setInsertedRowCount(String insertedRowCount) {
            this.insertedRowCount = Objects.requireNonNull(insertedRowCount);
            return this;
        }

        public Builder setUpdatedRowCount(String updatedRowCount) {
            this.updatedRowCount = Objects.requireNonNull(updatedRowCount);
            return this;
        }
        public DmlStatisticsResponse build() {
            return new DmlStatisticsResponse(deletedRowCount, insertedRowCount, updatedRowCount);
        }
    }
}