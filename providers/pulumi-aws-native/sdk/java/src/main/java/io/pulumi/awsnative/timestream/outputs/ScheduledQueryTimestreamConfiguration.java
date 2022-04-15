// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.awsnative.timestream.outputs.ScheduledQueryDimensionMapping;
import io.pulumi.awsnative.timestream.outputs.ScheduledQueryMixedMeasureMapping;
import io.pulumi.awsnative.timestream.outputs.ScheduledQueryMultiMeasureMappings;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduledQueryTimestreamConfiguration {
    private final String databaseName;
    private final List<ScheduledQueryDimensionMapping> dimensionMappings;
    private final @Nullable String measureNameColumn;
    private final @Nullable List<ScheduledQueryMixedMeasureMapping> mixedMeasureMappings;
    private final @Nullable ScheduledQueryMultiMeasureMappings multiMeasureMappings;
    private final String tableName;
    private final String timeColumn;

    @CustomType.Constructor
    private ScheduledQueryTimestreamConfiguration(
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("dimensionMappings") List<ScheduledQueryDimensionMapping> dimensionMappings,
        @CustomType.Parameter("measureNameColumn") @Nullable String measureNameColumn,
        @CustomType.Parameter("mixedMeasureMappings") @Nullable List<ScheduledQueryMixedMeasureMapping> mixedMeasureMappings,
        @CustomType.Parameter("multiMeasureMappings") @Nullable ScheduledQueryMultiMeasureMappings multiMeasureMappings,
        @CustomType.Parameter("tableName") String tableName,
        @CustomType.Parameter("timeColumn") String timeColumn) {
        this.databaseName = databaseName;
        this.dimensionMappings = dimensionMappings;
        this.measureNameColumn = measureNameColumn;
        this.mixedMeasureMappings = mixedMeasureMappings;
        this.multiMeasureMappings = multiMeasureMappings;
        this.tableName = tableName;
        this.timeColumn = timeColumn;
    }

    public String databaseName() {
        return this.databaseName;
    }
    public List<ScheduledQueryDimensionMapping> dimensionMappings() {
        return this.dimensionMappings;
    }
    public Optional<String> measureNameColumn() {
        return Optional.ofNullable(this.measureNameColumn);
    }
    public List<ScheduledQueryMixedMeasureMapping> mixedMeasureMappings() {
        return this.mixedMeasureMappings == null ? List.of() : this.mixedMeasureMappings;
    }
    public Optional<ScheduledQueryMultiMeasureMappings> multiMeasureMappings() {
        return Optional.ofNullable(this.multiMeasureMappings);
    }
    public String tableName() {
        return this.tableName;
    }
    public String timeColumn() {
        return this.timeColumn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryTimestreamConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private List<ScheduledQueryDimensionMapping> dimensionMappings;
        private @Nullable String measureNameColumn;
        private @Nullable List<ScheduledQueryMixedMeasureMapping> mixedMeasureMappings;
        private @Nullable ScheduledQueryMultiMeasureMappings multiMeasureMappings;
        private String tableName;
        private String timeColumn;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryTimestreamConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.dimensionMappings = defaults.dimensionMappings;
    	      this.measureNameColumn = defaults.measureNameColumn;
    	      this.mixedMeasureMappings = defaults.mixedMeasureMappings;
    	      this.multiMeasureMappings = defaults.multiMeasureMappings;
    	      this.tableName = defaults.tableName;
    	      this.timeColumn = defaults.timeColumn;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder dimensionMappings(List<ScheduledQueryDimensionMapping> dimensionMappings) {
            this.dimensionMappings = Objects.requireNonNull(dimensionMappings);
            return this;
        }
        public Builder dimensionMappings(ScheduledQueryDimensionMapping... dimensionMappings) {
            return dimensionMappings(List.of(dimensionMappings));
        }
        public Builder measureNameColumn(@Nullable String measureNameColumn) {
            this.measureNameColumn = measureNameColumn;
            return this;
        }
        public Builder mixedMeasureMappings(@Nullable List<ScheduledQueryMixedMeasureMapping> mixedMeasureMappings) {
            this.mixedMeasureMappings = mixedMeasureMappings;
            return this;
        }
        public Builder mixedMeasureMappings(ScheduledQueryMixedMeasureMapping... mixedMeasureMappings) {
            return mixedMeasureMappings(List.of(mixedMeasureMappings));
        }
        public Builder multiMeasureMappings(@Nullable ScheduledQueryMultiMeasureMappings multiMeasureMappings) {
            this.multiMeasureMappings = multiMeasureMappings;
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder timeColumn(String timeColumn) {
            this.timeColumn = Objects.requireNonNull(timeColumn);
            return this;
        }        public ScheduledQueryTimestreamConfiguration build() {
            return new ScheduledQueryTimestreamConfiguration(databaseName, dimensionMappings, measureNameColumn, mixedMeasureMappings, multiMeasureMappings, tableName, timeColumn);
        }
    }
}
