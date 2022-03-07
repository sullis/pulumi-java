// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamCopyCommandArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamCopyCommandArgs Empty = new DeliveryStreamCopyCommandArgs();

    @InputImport(name="copyOptions")
      private final @Nullable Input<String> copyOptions;

    public Input<String> getCopyOptions() {
        return this.copyOptions == null ? Input.empty() : this.copyOptions;
    }

    @InputImport(name="dataTableColumns")
      private final @Nullable Input<String> dataTableColumns;

    public Input<String> getDataTableColumns() {
        return this.dataTableColumns == null ? Input.empty() : this.dataTableColumns;
    }

    @InputImport(name="dataTableName", required=true)
      private final Input<String> dataTableName;

    public Input<String> getDataTableName() {
        return this.dataTableName;
    }

    public DeliveryStreamCopyCommandArgs(
        @Nullable Input<String> copyOptions,
        @Nullable Input<String> dataTableColumns,
        Input<String> dataTableName) {
        this.copyOptions = copyOptions;
        this.dataTableColumns = dataTableColumns;
        this.dataTableName = Objects.requireNonNull(dataTableName, "expected parameter 'dataTableName' to be non-null");
    }

    private DeliveryStreamCopyCommandArgs() {
        this.copyOptions = Input.empty();
        this.dataTableColumns = Input.empty();
        this.dataTableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamCopyCommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> copyOptions;
        private @Nullable Input<String> dataTableColumns;
        private Input<String> dataTableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamCopyCommandArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyOptions = defaults.copyOptions;
    	      this.dataTableColumns = defaults.dataTableColumns;
    	      this.dataTableName = defaults.dataTableName;
        }

        public Builder setCopyOptions(@Nullable Input<String> copyOptions) {
            this.copyOptions = copyOptions;
            return this;
        }

        public Builder setCopyOptions(@Nullable String copyOptions) {
            this.copyOptions = Input.ofNullable(copyOptions);
            return this;
        }

        public Builder setDataTableColumns(@Nullable Input<String> dataTableColumns) {
            this.dataTableColumns = dataTableColumns;
            return this;
        }

        public Builder setDataTableColumns(@Nullable String dataTableColumns) {
            this.dataTableColumns = Input.ofNullable(dataTableColumns);
            return this;
        }

        public Builder setDataTableName(Input<String> dataTableName) {
            this.dataTableName = Objects.requireNonNull(dataTableName);
            return this;
        }

        public Builder setDataTableName(String dataTableName) {
            this.dataTableName = Input.of(Objects.requireNonNull(dataTableName));
            return this;
        }
        public DeliveryStreamCopyCommandArgs build() {
            return new DeliveryStreamCopyCommandArgs(copyOptions, dataTableColumns, dataTableName);
        }
    }
}