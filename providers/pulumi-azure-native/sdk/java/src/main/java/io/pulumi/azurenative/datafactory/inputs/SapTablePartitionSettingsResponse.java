// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings that will be leveraged for SAP table source partitioning.
 * 
 */
public final class SapTablePartitionSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SapTablePartitionSettingsResponse Empty = new SapTablePartitionSettingsResponse();

    /**
     * The maximum value of partitions the table will be split into. Type: integer (or Expression with resultType string).
     * 
     */
    @InputImport(name="maxPartitionsNumber")
    private final @Nullable Object maxPartitionsNumber;

    public Optional<Object> getMaxPartitionsNumber() {
        return this.maxPartitionsNumber == null ? Optional.empty() : Optional.ofNullable(this.maxPartitionsNumber);
    }

    /**
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionColumnName")
    private final @Nullable Object partitionColumnName;

    public Optional<Object> getPartitionColumnName() {
        return this.partitionColumnName == null ? Optional.empty() : Optional.ofNullable(this.partitionColumnName);
    }

    /**
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionLowerBound")
    private final @Nullable Object partitionLowerBound;

    public Optional<Object> getPartitionLowerBound() {
        return this.partitionLowerBound == null ? Optional.empty() : Optional.ofNullable(this.partitionLowerBound);
    }

    /**
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionUpperBound")
    private final @Nullable Object partitionUpperBound;

    public Optional<Object> getPartitionUpperBound() {
        return this.partitionUpperBound == null ? Optional.empty() : Optional.ofNullable(this.partitionUpperBound);
    }

    public SapTablePartitionSettingsResponse(
        @Nullable Object maxPartitionsNumber,
        @Nullable Object partitionColumnName,
        @Nullable Object partitionLowerBound,
        @Nullable Object partitionUpperBound) {
        this.maxPartitionsNumber = maxPartitionsNumber;
        this.partitionColumnName = partitionColumnName;
        this.partitionLowerBound = partitionLowerBound;
        this.partitionUpperBound = partitionUpperBound;
    }

    private SapTablePartitionSettingsResponse() {
        this.maxPartitionsNumber = null;
        this.partitionColumnName = null;
        this.partitionLowerBound = null;
        this.partitionUpperBound = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTablePartitionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object maxPartitionsNumber;
        private @Nullable Object partitionColumnName;
        private @Nullable Object partitionLowerBound;
        private @Nullable Object partitionUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTablePartitionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPartitionsNumber = defaults.maxPartitionsNumber;
    	      this.partitionColumnName = defaults.partitionColumnName;
    	      this.partitionLowerBound = defaults.partitionLowerBound;
    	      this.partitionUpperBound = defaults.partitionUpperBound;
        }

        public Builder setMaxPartitionsNumber(@Nullable Object maxPartitionsNumber) {
            this.maxPartitionsNumber = maxPartitionsNumber;
            return this;
        }

        public Builder setPartitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }

        public Builder setPartitionLowerBound(@Nullable Object partitionLowerBound) {
            this.partitionLowerBound = partitionLowerBound;
            return this;
        }

        public Builder setPartitionUpperBound(@Nullable Object partitionUpperBound) {
            this.partitionUpperBound = partitionUpperBound;
            return this;
        }

        public SapTablePartitionSettingsResponse build() {
            return new SapTablePartitionSettingsResponse(maxPartitionsNumber, partitionColumnName, partitionLowerBound, partitionUpperBound);
        }
    }
}
