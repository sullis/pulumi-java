// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AvroFormatResponse {
    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object deserializer;
    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object serializer;
    /**
     * Type of dataset storage format.
     * Expected value is 'AvroFormat'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"deserializer","serializer","type"})
    private AvroFormatResponse(
        @Nullable Object deserializer,
        @Nullable Object serializer,
        String type) {
        this.deserializer = deserializer;
        this.serializer = serializer;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getDeserializer() {
        return Optional.ofNullable(this.deserializer);
    }
    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSerializer() {
        return Optional.ofNullable(this.serializer);
    }
    /**
     * Type of dataset storage format.
     * Expected value is 'AvroFormat'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deserializer;
        private @Nullable Object serializer;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
    	      this.serializer = defaults.serializer;
    	      this.type = defaults.type;
        }

        public Builder setDeserializer(@Nullable Object deserializer) {
            this.deserializer = deserializer;
            return this;
        }

        public Builder setSerializer(@Nullable Object serializer) {
            this.serializer = serializer;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AvroFormatResponse build() {
            return new AvroFormatResponse(deserializer, serializer, type);
        }
    }
}
