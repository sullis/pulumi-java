// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings that will be leveraged for teradata source partitioning.
 * 
 */
public final class TeradataPartitionSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final TeradataPartitionSettingsResponse Empty = new TeradataPartitionSettingsResponse();

    /**
     * The name of the column that will be used for proceeding range or hash partitioning. Type: string (or Expression with resultType string).
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

    public TeradataPartitionSettingsResponse(
        @Nullable Object partitionColumnName,
        @Nullable Object partitionLowerBound,
        @Nullable Object partitionUpperBound) {
        this.partitionColumnName = partitionColumnName;
        this.partitionLowerBound = partitionLowerBound;
        this.partitionUpperBound = partitionUpperBound;
    }

    private TeradataPartitionSettingsResponse() {
        this.partitionColumnName = null;
        this.partitionLowerBound = null;
        this.partitionUpperBound = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeradataPartitionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object partitionColumnName;
        private @Nullable Object partitionLowerBound;
        private @Nullable Object partitionUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(TeradataPartitionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionColumnName = defaults.partitionColumnName;
    	      this.partitionLowerBound = defaults.partitionLowerBound;
    	      this.partitionUpperBound = defaults.partitionUpperBound;
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
        public TeradataPartitionSettingsResponse build() {
            return new TeradataPartitionSettingsResponse(partitionColumnName, partitionLowerBound, partitionUpperBound);
        }
    }
}