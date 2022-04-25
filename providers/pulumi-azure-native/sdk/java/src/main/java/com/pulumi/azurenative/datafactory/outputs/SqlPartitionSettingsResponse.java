// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlPartitionSettingsResponse {
    /**
     * @return The name of the column in integer or datetime type that will be used for proceeding partitioning. If not specified, the primary key of the table is auto-detected and used as the partition column. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionColumnName;
    /**
     * @return The minimum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionLowerBound;
    /**
     * @return The maximum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionUpperBound;

    @CustomType.Constructor
    private SqlPartitionSettingsResponse(
        @CustomType.Parameter("partitionColumnName") @Nullable Object partitionColumnName,
        @CustomType.Parameter("partitionLowerBound") @Nullable Object partitionLowerBound,
        @CustomType.Parameter("partitionUpperBound") @Nullable Object partitionUpperBound) {
        this.partitionColumnName = partitionColumnName;
        this.partitionLowerBound = partitionLowerBound;
        this.partitionUpperBound = partitionUpperBound;
    }

    /**
     * @return The name of the column in integer or datetime type that will be used for proceeding partitioning. If not specified, the primary key of the table is auto-detected and used as the partition column. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionColumnName() {
        return Optional.ofNullable(this.partitionColumnName);
    }
    /**
     * @return The minimum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionLowerBound() {
        return Optional.ofNullable(this.partitionLowerBound);
    }
    /**
     * @return The maximum value of the partition column for partition range splitting. This value is used to decide the partition stride, not for filtering the rows in table. All rows in the table or query result will be partitioned and copied. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionUpperBound() {
        return Optional.ofNullable(this.partitionUpperBound);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlPartitionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object partitionColumnName;
        private @Nullable Object partitionLowerBound;
        private @Nullable Object partitionUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlPartitionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionColumnName = defaults.partitionColumnName;
    	      this.partitionLowerBound = defaults.partitionLowerBound;
    	      this.partitionUpperBound = defaults.partitionUpperBound;
        }

        public Builder partitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }
        public Builder partitionLowerBound(@Nullable Object partitionLowerBound) {
            this.partitionLowerBound = partitionLowerBound;
            return this;
        }
        public Builder partitionUpperBound(@Nullable Object partitionUpperBound) {
            this.partitionUpperBound = partitionUpperBound;
            return this;
        }        public SqlPartitionSettingsResponse build() {
            return new SqlPartitionSettingsResponse(partitionColumnName, partitionLowerBound, partitionUpperBound);
        }
    }
}
