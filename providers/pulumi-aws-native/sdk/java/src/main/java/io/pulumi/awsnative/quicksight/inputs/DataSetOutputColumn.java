// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.DataSetColumnDataType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>Output column.</p>
 * 
 */
public final class DataSetOutputColumn extends io.pulumi.resources.InvokeArgs {

    public static final DataSetOutputColumn Empty = new DataSetOutputColumn();

    /**
     * <p>A description for a column.</p>
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * <p>A display name for the dataset.</p>
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @Import(name="type")
      private final @Nullable DataSetColumnDataType type;

    public Optional<DataSetColumnDataType> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public DataSetOutputColumn(
        @Nullable String description,
        @Nullable String name,
        @Nullable DataSetColumnDataType type) {
        this.description = description;
        this.name = name;
        this.type = type;
    }

    private DataSetOutputColumn() {
        this.description = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetOutputColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String name;
        private @Nullable DataSetColumnDataType type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetOutputColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable DataSetColumnDataType type) {
            this.type = type;
            return this;
        }        public DataSetOutputColumn build() {
            return new DataSetOutputColumn(description, name, type);
        }
    }
}
