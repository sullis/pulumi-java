// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParquetFormatResponse {
    /**
     * @return Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object deserializer;
    /**
     * @return Serializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object serializer;
    /**
     * @return Type of dataset storage format.
     * Expected value is &#39;ParquetFormat&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ParquetFormatResponse(
        @CustomType.Parameter("deserializer") @Nullable Object deserializer,
        @CustomType.Parameter("serializer") @Nullable Object serializer,
        @CustomType.Parameter("type") String type) {
        this.deserializer = deserializer;
        this.serializer = serializer;
        this.type = type;
    }

    /**
     * @return Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> deserializer() {
        return Optional.ofNullable(this.deserializer);
    }
    /**
     * @return Serializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> serializer() {
        return Optional.ofNullable(this.serializer);
    }
    /**
     * @return Type of dataset storage format.
     * Expected value is &#39;ParquetFormat&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deserializer;
        private @Nullable Object serializer;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
    	      this.serializer = defaults.serializer;
    	      this.type = defaults.type;
        }

        public Builder deserializer(@Nullable Object deserializer) {
            this.deserializer = deserializer;
            return this;
        }
        public Builder serializer(@Nullable Object serializer) {
            this.serializer = serializer;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ParquetFormatResponse build() {
            return new ParquetFormatResponse(deserializer, serializer, type);
        }
    }
}
