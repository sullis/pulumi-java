// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.enums.ScheduledQueryMultiMeasureAttributeMappingMeasureValueType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An attribute mapping to be used for mapping query results to ingest data for multi-measure attributes.
 * 
 */
public final class ScheduledQueryMultiMeasureAttributeMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryMultiMeasureAttributeMappingArgs Empty = new ScheduledQueryMultiMeasureAttributeMappingArgs();

    @InputImport(name="measureValueType", required=true)
    private final Input<ScheduledQueryMultiMeasureAttributeMappingMeasureValueType> measureValueType;

    public Input<ScheduledQueryMultiMeasureAttributeMappingMeasureValueType> getMeasureValueType() {
        return this.measureValueType;
    }

    @InputImport(name="sourceColumn", required=true)
    private final Input<String> sourceColumn;

    public Input<String> getSourceColumn() {
        return this.sourceColumn;
    }

    @InputImport(name="targetMultiMeasureAttributeName")
    private final @Nullable Input<String> targetMultiMeasureAttributeName;

    public Input<String> getTargetMultiMeasureAttributeName() {
        return this.targetMultiMeasureAttributeName == null ? Input.empty() : this.targetMultiMeasureAttributeName;
    }

    public ScheduledQueryMultiMeasureAttributeMappingArgs(
        Input<ScheduledQueryMultiMeasureAttributeMappingMeasureValueType> measureValueType,
        Input<String> sourceColumn,
        @Nullable Input<String> targetMultiMeasureAttributeName) {
        this.measureValueType = Objects.requireNonNull(measureValueType, "expected parameter 'measureValueType' to be non-null");
        this.sourceColumn = Objects.requireNonNull(sourceColumn, "expected parameter 'sourceColumn' to be non-null");
        this.targetMultiMeasureAttributeName = targetMultiMeasureAttributeName;
    }

    private ScheduledQueryMultiMeasureAttributeMappingArgs() {
        this.measureValueType = Input.empty();
        this.sourceColumn = Input.empty();
        this.targetMultiMeasureAttributeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryMultiMeasureAttributeMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ScheduledQueryMultiMeasureAttributeMappingMeasureValueType> measureValueType;
        private Input<String> sourceColumn;
        private @Nullable Input<String> targetMultiMeasureAttributeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryMultiMeasureAttributeMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.measureValueType = defaults.measureValueType;
    	      this.sourceColumn = defaults.sourceColumn;
    	      this.targetMultiMeasureAttributeName = defaults.targetMultiMeasureAttributeName;
        }

        public Builder setMeasureValueType(Input<ScheduledQueryMultiMeasureAttributeMappingMeasureValueType> measureValueType) {
            this.measureValueType = Objects.requireNonNull(measureValueType);
            return this;
        }

        public Builder setMeasureValueType(ScheduledQueryMultiMeasureAttributeMappingMeasureValueType measureValueType) {
            this.measureValueType = Input.of(Objects.requireNonNull(measureValueType));
            return this;
        }

        public Builder setSourceColumn(Input<String> sourceColumn) {
            this.sourceColumn = Objects.requireNonNull(sourceColumn);
            return this;
        }

        public Builder setSourceColumn(String sourceColumn) {
            this.sourceColumn = Input.of(Objects.requireNonNull(sourceColumn));
            return this;
        }

        public Builder setTargetMultiMeasureAttributeName(@Nullable Input<String> targetMultiMeasureAttributeName) {
            this.targetMultiMeasureAttributeName = targetMultiMeasureAttributeName;
            return this;
        }

        public Builder setTargetMultiMeasureAttributeName(@Nullable String targetMultiMeasureAttributeName) {
            this.targetMultiMeasureAttributeName = Input.ofNullable(targetMultiMeasureAttributeName);
            return this;
        }

        public ScheduledQueryMultiMeasureAttributeMappingArgs build() {
            return new ScheduledQueryMultiMeasureAttributeMappingArgs(measureValueType, sourceColumn, targetMultiMeasureAttributeName);
        }
    }
}
