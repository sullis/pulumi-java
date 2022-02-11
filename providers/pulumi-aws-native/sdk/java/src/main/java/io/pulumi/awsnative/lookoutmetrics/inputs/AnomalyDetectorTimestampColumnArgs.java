// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomalyDetectorTimestampColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorTimestampColumnArgs Empty = new AnomalyDetectorTimestampColumnArgs();

    @InputImport(name="columnFormat")
    private final @Nullable Input<String> columnFormat;

    public Input<String> getColumnFormat() {
        return this.columnFormat == null ? Input.empty() : this.columnFormat;
    }

    @InputImport(name="columnName")
    private final @Nullable Input<String> columnName;

    public Input<String> getColumnName() {
        return this.columnName == null ? Input.empty() : this.columnName;
    }

    public AnomalyDetectorTimestampColumnArgs(
        @Nullable Input<String> columnFormat,
        @Nullable Input<String> columnName) {
        this.columnFormat = columnFormat;
        this.columnName = columnName;
    }

    private AnomalyDetectorTimestampColumnArgs() {
        this.columnFormat = Input.empty();
        this.columnName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorTimestampColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> columnFormat;
        private @Nullable Input<String> columnName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorTimestampColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnFormat = defaults.columnFormat;
    	      this.columnName = defaults.columnName;
        }

        public Builder setColumnFormat(@Nullable Input<String> columnFormat) {
            this.columnFormat = columnFormat;
            return this;
        }

        public Builder setColumnFormat(@Nullable String columnFormat) {
            this.columnFormat = Input.ofNullable(columnFormat);
            return this;
        }

        public Builder setColumnName(@Nullable Input<String> columnName) {
            this.columnName = columnName;
            return this;
        }

        public Builder setColumnName(@Nullable String columnName) {
            this.columnName = Input.ofNullable(columnName);
            return this;
        }

        public AnomalyDetectorTimestampColumnArgs build() {
            return new AnomalyDetectorTimestampColumnArgs(columnFormat, columnName);
        }
    }
}
