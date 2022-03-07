// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings that will be leveraged for SAP table source partitioning.
 * 
 */
public final class SapTablePartitionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapTablePartitionSettingsArgs Empty = new SapTablePartitionSettingsArgs();

    /**
     * The maximum value of partitions the table will be split into. Type: integer (or Expression with resultType string).
     * 
     */
    @InputImport(name="maxPartitionsNumber")
      private final @Nullable Input<Object> maxPartitionsNumber;

    public Input<Object> getMaxPartitionsNumber() {
        return this.maxPartitionsNumber == null ? Input.empty() : this.maxPartitionsNumber;
    }

    /**
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionColumnName")
      private final @Nullable Input<Object> partitionColumnName;

    public Input<Object> getPartitionColumnName() {
        return this.partitionColumnName == null ? Input.empty() : this.partitionColumnName;
    }

    /**
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionLowerBound")
      private final @Nullable Input<Object> partitionLowerBound;

    public Input<Object> getPartitionLowerBound() {
        return this.partitionLowerBound == null ? Input.empty() : this.partitionLowerBound;
    }

    /**
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionUpperBound")
      private final @Nullable Input<Object> partitionUpperBound;

    public Input<Object> getPartitionUpperBound() {
        return this.partitionUpperBound == null ? Input.empty() : this.partitionUpperBound;
    }

    public SapTablePartitionSettingsArgs(
        @Nullable Input<Object> maxPartitionsNumber,
        @Nullable Input<Object> partitionColumnName,
        @Nullable Input<Object> partitionLowerBound,
        @Nullable Input<Object> partitionUpperBound) {
        this.maxPartitionsNumber = maxPartitionsNumber;
        this.partitionColumnName = partitionColumnName;
        this.partitionLowerBound = partitionLowerBound;
        this.partitionUpperBound = partitionUpperBound;
    }

    private SapTablePartitionSettingsArgs() {
        this.maxPartitionsNumber = Input.empty();
        this.partitionColumnName = Input.empty();
        this.partitionLowerBound = Input.empty();
        this.partitionUpperBound = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTablePartitionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> maxPartitionsNumber;
        private @Nullable Input<Object> partitionColumnName;
        private @Nullable Input<Object> partitionLowerBound;
        private @Nullable Input<Object> partitionUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTablePartitionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPartitionsNumber = defaults.maxPartitionsNumber;
    	      this.partitionColumnName = defaults.partitionColumnName;
    	      this.partitionLowerBound = defaults.partitionLowerBound;
    	      this.partitionUpperBound = defaults.partitionUpperBound;
        }

        public Builder setMaxPartitionsNumber(@Nullable Input<Object> maxPartitionsNumber) {
            this.maxPartitionsNumber = maxPartitionsNumber;
            return this;
        }

        public Builder setMaxPartitionsNumber(@Nullable Object maxPartitionsNumber) {
            this.maxPartitionsNumber = Input.ofNullable(maxPartitionsNumber);
            return this;
        }

        public Builder setPartitionColumnName(@Nullable Input<Object> partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }

        public Builder setPartitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = Input.ofNullable(partitionColumnName);
            return this;
        }

        public Builder setPartitionLowerBound(@Nullable Input<Object> partitionLowerBound) {
            this.partitionLowerBound = partitionLowerBound;
            return this;
        }

        public Builder setPartitionLowerBound(@Nullable Object partitionLowerBound) {
            this.partitionLowerBound = Input.ofNullable(partitionLowerBound);
            return this;
        }

        public Builder setPartitionUpperBound(@Nullable Input<Object> partitionUpperBound) {
            this.partitionUpperBound = partitionUpperBound;
            return this;
        }

        public Builder setPartitionUpperBound(@Nullable Object partitionUpperBound) {
            this.partitionUpperBound = Input.ofNullable(partitionUpperBound);
            return this;
        }
        public SapTablePartitionSettingsArgs build() {
            return new SapTablePartitionSettingsArgs(maxPartitionsNumber, partitionColumnName, partitionLowerBound, partitionUpperBound);
        }
    }
}