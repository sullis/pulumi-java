// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Swagger 2.0 schema for a column within the data table representing a web service input or output. See Swagger specification: http://swagger.io/specification/
 * 
 */
public final class ColumnSpecificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ColumnSpecificationResponse Empty = new ColumnSpecificationResponse();

    /**
     * If the data type is categorical, this provides the list of accepted categories.
     * 
     */
    @InputImport(name="enum")
    private final @Nullable List<Object> $enum;

    public List<Object> get$enum() {
        return this.$enum == null ? List.of() : this.$enum;
    }

    /**
     * Additional format information for the data type.
     * 
     */
    @InputImport(name="format")
    private final @Nullable String format;

    public Optional<String> getFormat() {
        return this.format == null ? Optional.empty() : Optional.ofNullable(this.format);
    }

    /**
     * Data type of the column.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Flag indicating if the type supports null values or not.
     * 
     */
    @InputImport(name="xMsIsnullable")
    private final @Nullable Boolean xMsIsnullable;

    public Optional<Boolean> getXMsIsnullable() {
        return this.xMsIsnullable == null ? Optional.empty() : Optional.ofNullable(this.xMsIsnullable);
    }

    /**
     * Flag indicating whether the categories are treated as an ordered set or not, if this is a categorical column.
     * 
     */
    @InputImport(name="xMsIsordered")
    private final @Nullable Boolean xMsIsordered;

    public Optional<Boolean> getXMsIsordered() {
        return this.xMsIsordered == null ? Optional.empty() : Optional.ofNullable(this.xMsIsordered);
    }

    public ColumnSpecificationResponse(
        @Nullable List<Object> $enum,
        @Nullable String format,
        String type,
        @Nullable Boolean xMsIsnullable,
        @Nullable Boolean xMsIsordered) {
        this.$enum = $enum;
        this.format = format;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.xMsIsnullable = xMsIsnullable;
        this.xMsIsordered = xMsIsordered;
    }

    private ColumnSpecificationResponse() {
        this.$enum = List.of();
        this.format = null;
        this.type = null;
        this.xMsIsnullable = null;
        this.xMsIsordered = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> $enum;
        private @Nullable String format;
        private String type;
        private @Nullable Boolean xMsIsnullable;
        private @Nullable Boolean xMsIsordered;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$enum = defaults.$enum;
    	      this.format = defaults.format;
    	      this.type = defaults.type;
    	      this.xMsIsnullable = defaults.xMsIsnullable;
    	      this.xMsIsordered = defaults.xMsIsordered;
        }

        public Builder set$enum(@Nullable List<Object> $enum) {
            this.$enum = $enum;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setXMsIsnullable(@Nullable Boolean xMsIsnullable) {
            this.xMsIsnullable = xMsIsnullable;
            return this;
        }

        public Builder setXMsIsordered(@Nullable Boolean xMsIsordered) {
            this.xMsIsordered = xMsIsordered;
            return this;
        }

        public ColumnSpecificationResponse build() {
            return new ColumnSpecificationResponse($enum, format, type, xMsIsnullable, xMsIsordered);
        }
    }
}
