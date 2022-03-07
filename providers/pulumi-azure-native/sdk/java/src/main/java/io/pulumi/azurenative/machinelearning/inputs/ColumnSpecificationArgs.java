// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.enums.ColumnFormat;
import io.pulumi.azurenative.machinelearning.enums.ColumnType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Swagger 2.0 schema for a column within the data table representing a web service input or output. See Swagger specification: http://swagger.io/specification/
 * 
 */
public final class ColumnSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ColumnSpecificationArgs Empty = new ColumnSpecificationArgs();

    /**
     * If the data type is categorical, this provides the list of accepted categories.
     * 
     */
    @InputImport(name="enum")
      private final @Nullable Input<List<Object>> $enum;

    public Input<List<Object>> get$enum() {
        return this.$enum == null ? Input.empty() : this.$enum;
    }

    /**
     * Additional format information for the data type.
     * 
     */
    @InputImport(name="format")
      private final @Nullable Input<Either<String,ColumnFormat>> format;

    public Input<Either<String,ColumnFormat>> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    /**
     * Data type of the column.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<Either<String,ColumnType>> type;

    public Input<Either<String,ColumnType>> getType() {
        return this.type;
    }

    /**
     * Flag indicating if the type supports null values or not.
     * 
     */
    @InputImport(name="xMsIsnullable")
      private final @Nullable Input<Boolean> xMsIsnullable;

    public Input<Boolean> getXMsIsnullable() {
        return this.xMsIsnullable == null ? Input.empty() : this.xMsIsnullable;
    }

    /**
     * Flag indicating whether the categories are treated as an ordered set or not, if this is a categorical column.
     * 
     */
    @InputImport(name="xMsIsordered")
      private final @Nullable Input<Boolean> xMsIsordered;

    public Input<Boolean> getXMsIsordered() {
        return this.xMsIsordered == null ? Input.empty() : this.xMsIsordered;
    }

    public ColumnSpecificationArgs(
        @Nullable Input<List<Object>> $enum,
        @Nullable Input<Either<String,ColumnFormat>> format,
        Input<Either<String,ColumnType>> type,
        @Nullable Input<Boolean> xMsIsnullable,
        @Nullable Input<Boolean> xMsIsordered) {
        this.$enum = $enum;
        this.format = format;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.xMsIsnullable = xMsIsnullable;
        this.xMsIsordered = xMsIsordered;
    }

    private ColumnSpecificationArgs() {
        this.$enum = Input.empty();
        this.format = Input.empty();
        this.type = Input.empty();
        this.xMsIsnullable = Input.empty();
        this.xMsIsordered = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> $enum;
        private @Nullable Input<Either<String,ColumnFormat>> format;
        private Input<Either<String,ColumnType>> type;
        private @Nullable Input<Boolean> xMsIsnullable;
        private @Nullable Input<Boolean> xMsIsordered;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$enum = defaults.$enum;
    	      this.format = defaults.format;
    	      this.type = defaults.type;
    	      this.xMsIsnullable = defaults.xMsIsnullable;
    	      this.xMsIsordered = defaults.xMsIsordered;
        }

        public Builder set$enum(@Nullable Input<List<Object>> $enum) {
            this.$enum = $enum;
            return this;
        }

        public Builder set$enum(@Nullable List<Object> $enum) {
            this.$enum = Input.ofNullable($enum);
            return this;
        }

        public Builder setFormat(@Nullable Input<Either<String,ColumnFormat>> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable Either<String,ColumnFormat> format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setType(Input<Either<String,ColumnType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,ColumnType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setXMsIsnullable(@Nullable Input<Boolean> xMsIsnullable) {
            this.xMsIsnullable = xMsIsnullable;
            return this;
        }

        public Builder setXMsIsnullable(@Nullable Boolean xMsIsnullable) {
            this.xMsIsnullable = Input.ofNullable(xMsIsnullable);
            return this;
        }

        public Builder setXMsIsordered(@Nullable Input<Boolean> xMsIsordered) {
            this.xMsIsordered = xMsIsordered;
            return this;
        }

        public Builder setXMsIsordered(@Nullable Boolean xMsIsordered) {
            this.xMsIsordered = Input.ofNullable(xMsIsordered);
            return this;
        }
        public ColumnSpecificationArgs build() {
            return new ColumnSpecificationArgs($enum, format, type, xMsIsnullable, xMsIsordered);
        }
    }
}