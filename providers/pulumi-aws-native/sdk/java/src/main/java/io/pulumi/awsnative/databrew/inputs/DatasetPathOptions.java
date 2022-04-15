// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetFilesLimit;
import io.pulumi.awsnative.databrew.inputs.DatasetFilterExpression;
import io.pulumi.awsnative.databrew.inputs.DatasetPathParameter;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Path options for dataset
 * 
 */
public final class DatasetPathOptions extends io.pulumi.resources.InvokeArgs {

    public static final DatasetPathOptions Empty = new DatasetPathOptions();

    @Import(name="filesLimit")
      private final @Nullable DatasetFilesLimit filesLimit;

    public Optional<DatasetFilesLimit> filesLimit() {
        return this.filesLimit == null ? Optional.empty() : Optional.ofNullable(this.filesLimit);
    }

    @Import(name="lastModifiedDateCondition")
      private final @Nullable DatasetFilterExpression lastModifiedDateCondition;

    public Optional<DatasetFilterExpression> lastModifiedDateCondition() {
        return this.lastModifiedDateCondition == null ? Optional.empty() : Optional.ofNullable(this.lastModifiedDateCondition);
    }

    @Import(name="parameters")
      private final @Nullable List<DatasetPathParameter> parameters;

    public List<DatasetPathParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public DatasetPathOptions(
        @Nullable DatasetFilesLimit filesLimit,
        @Nullable DatasetFilterExpression lastModifiedDateCondition,
        @Nullable List<DatasetPathParameter> parameters) {
        this.filesLimit = filesLimit;
        this.lastModifiedDateCondition = lastModifiedDateCondition;
        this.parameters = parameters;
    }

    private DatasetPathOptions() {
        this.filesLimit = null;
        this.lastModifiedDateCondition = null;
        this.parameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetPathOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetFilesLimit filesLimit;
        private @Nullable DatasetFilterExpression lastModifiedDateCondition;
        private @Nullable List<DatasetPathParameter> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetPathOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesLimit = defaults.filesLimit;
    	      this.lastModifiedDateCondition = defaults.lastModifiedDateCondition;
    	      this.parameters = defaults.parameters;
        }

        public Builder filesLimit(@Nullable DatasetFilesLimit filesLimit) {
            this.filesLimit = filesLimit;
            return this;
        }
        public Builder lastModifiedDateCondition(@Nullable DatasetFilterExpression lastModifiedDateCondition) {
            this.lastModifiedDateCondition = lastModifiedDateCondition;
            return this;
        }
        public Builder parameters(@Nullable List<DatasetPathParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(DatasetPathParameter... parameters) {
            return parameters(List.of(parameters));
        }        public DatasetPathOptions build() {
            return new DatasetPathOptions(filesLimit, lastModifiedDateCondition, parameters);
        }
    }
}
