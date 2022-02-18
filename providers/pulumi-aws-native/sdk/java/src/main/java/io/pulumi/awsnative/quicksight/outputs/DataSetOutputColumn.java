// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.DataSetColumnDataType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSetOutputColumn {
    /**
     * <p>A description for a column.</p>
     * 
     */
    private final @Nullable String description;
    /**
     * <p>A display name for the dataset.</p>
     * 
     */
    private final @Nullable String name;
    private final @Nullable DataSetColumnDataType type;

    @OutputCustomType.Constructor({"description","name","type"})
    private DataSetOutputColumn(
        @Nullable String description,
        @Nullable String name,
        @Nullable DataSetColumnDataType type) {
        this.description = description;
        this.name = name;
        this.type = type;
    }

    /**
     * <p>A description for a column.</p>
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * <p>A display name for the dataset.</p>
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<DataSetColumnDataType> getType() {
        return Optional.ofNullable(this.type);
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

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable DataSetColumnDataType type) {
            this.type = type;
            return this;
        }

        public DataSetOutputColumn build() {
            return new DataSetOutputColumn(description, name, type);
        }
    }
}
