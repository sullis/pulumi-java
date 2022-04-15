// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamCopyCommand extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamCopyCommand Empty = new DeliveryStreamCopyCommand();

    @Import(name="copyOptions")
      private final @Nullable String copyOptions;

    public Optional<String> copyOptions() {
        return this.copyOptions == null ? Optional.empty() : Optional.ofNullable(this.copyOptions);
    }

    @Import(name="dataTableColumns")
      private final @Nullable String dataTableColumns;

    public Optional<String> dataTableColumns() {
        return this.dataTableColumns == null ? Optional.empty() : Optional.ofNullable(this.dataTableColumns);
    }

    @Import(name="dataTableName", required=true)
      private final String dataTableName;

    public String dataTableName() {
        return this.dataTableName;
    }

    public DeliveryStreamCopyCommand(
        @Nullable String copyOptions,
        @Nullable String dataTableColumns,
        String dataTableName) {
        this.copyOptions = copyOptions;
        this.dataTableColumns = dataTableColumns;
        this.dataTableName = Objects.requireNonNull(dataTableName, "expected parameter 'dataTableName' to be non-null");
    }

    private DeliveryStreamCopyCommand() {
        this.copyOptions = null;
        this.dataTableColumns = null;
        this.dataTableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamCopyCommand defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String copyOptions;
        private @Nullable String dataTableColumns;
        private String dataTableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamCopyCommand defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyOptions = defaults.copyOptions;
    	      this.dataTableColumns = defaults.dataTableColumns;
    	      this.dataTableName = defaults.dataTableName;
        }

        public Builder copyOptions(@Nullable String copyOptions) {
            this.copyOptions = copyOptions;
            return this;
        }
        public Builder dataTableColumns(@Nullable String dataTableColumns) {
            this.dataTableColumns = dataTableColumns;
            return this;
        }
        public Builder dataTableName(String dataTableName) {
            this.dataTableName = Objects.requireNonNull(dataTableName);
            return this;
        }        public DeliveryStreamCopyCommand build() {
            return new DeliveryStreamCopyCommand(copyOptions, dataTableColumns, dataTableName);
        }
    }
}
