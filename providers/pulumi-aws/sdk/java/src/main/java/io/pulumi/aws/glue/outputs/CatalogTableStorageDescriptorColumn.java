// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CatalogTableStorageDescriptorColumn {
    /**
     * Free-form text comment.
     * 
     */
    private final @Nullable String comment;
    /**
     * Name of the target table.
     * 
     */
    private final String name;
    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    private final @Nullable Map<String,String> parameters;
    /**
     * Datatype of data in the Column.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"comment","name","parameters","type"})
    private CatalogTableStorageDescriptorColumn(
        @Nullable String comment,
        String name,
        @Nullable Map<String,String> parameters,
        @Nullable String type) {
        this.comment = comment;
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.type = type;
    }

    /**
     * Free-form text comment.
     * 
    */
    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * Name of the target table.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     * 
    */
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Datatype of data in the Column.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private String name;
        private @Nullable Map<String,String> parameters;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public CatalogTableStorageDescriptorColumn build() {
            return new CatalogTableStorageDescriptorColumn(comment, name, parameters, type);
        }
    }
}