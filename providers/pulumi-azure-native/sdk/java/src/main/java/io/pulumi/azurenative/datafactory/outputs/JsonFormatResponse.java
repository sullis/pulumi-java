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
public final class JsonFormatResponse {
    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object deserializer;
    /**
     * The code page name of the preferred encoding. If not provided, the default value is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values can be found in the 'Name' column of the table of encodings in the following reference: https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encodingName;
    /**
     * File pattern of JSON. To be more specific, the way of separating a collection of JSON objects. The default value is 'setOfObjects'. It is case-sensitive.
     * 
     */
    private final @Nullable Object filePattern;
    /**
     * The JSONPath of the JSON array element to be flattened. Example: "$.ArrayPath". Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object jsonNodeReference;
    /**
     * The JSONPath definition for each column mapping with a customized column name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path", "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     * 
     */
    private final @Nullable Object jsonPathDefinition;
    /**
     * The character used to separate nesting levels. Default value is '.' (dot). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object nestingSeparator;
    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object serializer;
    /**
     * Type of dataset storage format.
     * Expected value is 'JsonFormat'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"deserializer","encodingName","filePattern","jsonNodeReference","jsonPathDefinition","nestingSeparator","serializer","type"})
    private JsonFormatResponse(
        @Nullable Object deserializer,
        @Nullable Object encodingName,
        @Nullable Object filePattern,
        @Nullable Object jsonNodeReference,
        @Nullable Object jsonPathDefinition,
        @Nullable Object nestingSeparator,
        @Nullable Object serializer,
        String type) {
        this.deserializer = deserializer;
        this.encodingName = encodingName;
        this.filePattern = filePattern;
        this.jsonNodeReference = jsonNodeReference;
        this.jsonPathDefinition = jsonPathDefinition;
        this.nestingSeparator = nestingSeparator;
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
     * The code page name of the preferred encoding. If not provided, the default value is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values can be found in the 'Name' column of the table of encodings in the following reference: https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEncodingName() {
        return Optional.ofNullable(this.encodingName);
    }
    /**
     * File pattern of JSON. To be more specific, the way of separating a collection of JSON objects. The default value is 'setOfObjects'. It is case-sensitive.
     * 
     */
    public Optional<Object> getFilePattern() {
        return Optional.ofNullable(this.filePattern);
    }
    /**
     * The JSONPath of the JSON array element to be flattened. Example: "$.ArrayPath". Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getJsonNodeReference() {
        return Optional.ofNullable(this.jsonNodeReference);
    }
    /**
     * The JSONPath definition for each column mapping with a customized column name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path", "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     * 
     */
    public Optional<Object> getJsonPathDefinition() {
        return Optional.ofNullable(this.jsonPathDefinition);
    }
    /**
     * The character used to separate nesting levels. Default value is '.' (dot). Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getNestingSeparator() {
        return Optional.ofNullable(this.nestingSeparator);
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
     * Expected value is 'JsonFormat'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deserializer;
        private @Nullable Object encodingName;
        private @Nullable Object filePattern;
        private @Nullable Object jsonNodeReference;
        private @Nullable Object jsonPathDefinition;
        private @Nullable Object nestingSeparator;
        private @Nullable Object serializer;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
    	      this.encodingName = defaults.encodingName;
    	      this.filePattern = defaults.filePattern;
    	      this.jsonNodeReference = defaults.jsonNodeReference;
    	      this.jsonPathDefinition = defaults.jsonPathDefinition;
    	      this.nestingSeparator = defaults.nestingSeparator;
    	      this.serializer = defaults.serializer;
    	      this.type = defaults.type;
        }

        public Builder setDeserializer(@Nullable Object deserializer) {
            this.deserializer = deserializer;
            return this;
        }

        public Builder setEncodingName(@Nullable Object encodingName) {
            this.encodingName = encodingName;
            return this;
        }

        public Builder setFilePattern(@Nullable Object filePattern) {
            this.filePattern = filePattern;
            return this;
        }

        public Builder setJsonNodeReference(@Nullable Object jsonNodeReference) {
            this.jsonNodeReference = jsonNodeReference;
            return this;
        }

        public Builder setJsonPathDefinition(@Nullable Object jsonPathDefinition) {
            this.jsonPathDefinition = jsonPathDefinition;
            return this;
        }

        public Builder setNestingSeparator(@Nullable Object nestingSeparator) {
            this.nestingSeparator = nestingSeparator;
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

        public JsonFormatResponse build() {
            return new JsonFormatResponse(deserializer, encodingName, filePattern, jsonNodeReference, jsonPathDefinition, nestingSeparator, serializer, type);
        }
    }
}
