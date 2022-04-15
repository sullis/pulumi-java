// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetExcelOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetExcelOptionsArgs Empty = new DatasetExcelOptionsArgs();

    @Import(name="headerRow")
      private final @Nullable Output<Boolean> headerRow;

    public Output<Boolean> headerRow() {
        return this.headerRow == null ? Codegen.empty() : this.headerRow;
    }

    @Import(name="sheetIndexes")
      private final @Nullable Output<List<Integer>> sheetIndexes;

    public Output<List<Integer>> sheetIndexes() {
        return this.sheetIndexes == null ? Codegen.empty() : this.sheetIndexes;
    }

    @Import(name="sheetNames")
      private final @Nullable Output<List<String>> sheetNames;

    public Output<List<String>> sheetNames() {
        return this.sheetNames == null ? Codegen.empty() : this.sheetNames;
    }

    public DatasetExcelOptionsArgs(
        @Nullable Output<Boolean> headerRow,
        @Nullable Output<List<Integer>> sheetIndexes,
        @Nullable Output<List<String>> sheetNames) {
        this.headerRow = headerRow;
        this.sheetIndexes = sheetIndexes;
        this.sheetNames = sheetNames;
    }

    private DatasetExcelOptionsArgs() {
        this.headerRow = Codegen.empty();
        this.sheetIndexes = Codegen.empty();
        this.sheetNames = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetExcelOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> headerRow;
        private @Nullable Output<List<Integer>> sheetIndexes;
        private @Nullable Output<List<String>> sheetNames;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetExcelOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerRow = defaults.headerRow;
    	      this.sheetIndexes = defaults.sheetIndexes;
    	      this.sheetNames = defaults.sheetNames;
        }

        public Builder headerRow(@Nullable Output<Boolean> headerRow) {
            this.headerRow = headerRow;
            return this;
        }
        public Builder headerRow(@Nullable Boolean headerRow) {
            this.headerRow = Codegen.ofNullable(headerRow);
            return this;
        }
        public Builder sheetIndexes(@Nullable Output<List<Integer>> sheetIndexes) {
            this.sheetIndexes = sheetIndexes;
            return this;
        }
        public Builder sheetIndexes(@Nullable List<Integer> sheetIndexes) {
            this.sheetIndexes = Codegen.ofNullable(sheetIndexes);
            return this;
        }
        public Builder sheetIndexes(Integer... sheetIndexes) {
            return sheetIndexes(List.of(sheetIndexes));
        }
        public Builder sheetNames(@Nullable Output<List<String>> sheetNames) {
            this.sheetNames = sheetNames;
            return this;
        }
        public Builder sheetNames(@Nullable List<String> sheetNames) {
            this.sheetNames = Codegen.ofNullable(sheetNames);
            return this;
        }
        public Builder sheetNames(String... sheetNames) {
            return sheetNames(List.of(sheetNames));
        }        public DatasetExcelOptionsArgs build() {
            return new DatasetExcelOptionsArgs(headerRow, sheetIndexes, sheetNames);
        }
    }
}
