// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceToIndexFieldMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceToIndexFieldMappingArgs Empty = new DataSourceToIndexFieldMappingArgs();

    @Import(name="dataSourceFieldName", required=true)
      private final Output<String> dataSourceFieldName;

    public Output<String> dataSourceFieldName() {
        return this.dataSourceFieldName;
    }

    @Import(name="dateFieldFormat")
      private final @Nullable Output<String> dateFieldFormat;

    public Output<String> dateFieldFormat() {
        return this.dateFieldFormat == null ? Codegen.empty() : this.dateFieldFormat;
    }

    @Import(name="indexFieldName", required=true)
      private final Output<String> indexFieldName;

    public Output<String> indexFieldName() {
        return this.indexFieldName;
    }

    public DataSourceToIndexFieldMappingArgs(
        Output<String> dataSourceFieldName,
        @Nullable Output<String> dateFieldFormat,
        Output<String> indexFieldName) {
        this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName, "expected parameter 'dataSourceFieldName' to be non-null");
        this.dateFieldFormat = dateFieldFormat;
        this.indexFieldName = Objects.requireNonNull(indexFieldName, "expected parameter 'indexFieldName' to be non-null");
    }

    private DataSourceToIndexFieldMappingArgs() {
        this.dataSourceFieldName = Codegen.empty();
        this.dateFieldFormat = Codegen.empty();
        this.indexFieldName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceToIndexFieldMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataSourceFieldName;
        private @Nullable Output<String> dateFieldFormat;
        private Output<String> indexFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceToIndexFieldMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceFieldName = defaults.dataSourceFieldName;
    	      this.dateFieldFormat = defaults.dateFieldFormat;
    	      this.indexFieldName = defaults.indexFieldName;
        }

        public Builder dataSourceFieldName(Output<String> dataSourceFieldName) {
            this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName);
            return this;
        }
        public Builder dataSourceFieldName(String dataSourceFieldName) {
            this.dataSourceFieldName = Output.of(Objects.requireNonNull(dataSourceFieldName));
            return this;
        }
        public Builder dateFieldFormat(@Nullable Output<String> dateFieldFormat) {
            this.dateFieldFormat = dateFieldFormat;
            return this;
        }
        public Builder dateFieldFormat(@Nullable String dateFieldFormat) {
            this.dateFieldFormat = Codegen.ofNullable(dateFieldFormat);
            return this;
        }
        public Builder indexFieldName(Output<String> indexFieldName) {
            this.indexFieldName = Objects.requireNonNull(indexFieldName);
            return this;
        }
        public Builder indexFieldName(String indexFieldName) {
            this.indexFieldName = Output.of(Objects.requireNonNull(indexFieldName));
            return this;
        }        public DataSourceToIndexFieldMappingArgs build() {
            return new DataSourceToIndexFieldMappingArgs(dataSourceFieldName, dateFieldFormat, indexFieldName);
        }
    }
}
