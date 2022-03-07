// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TarGZipReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.TarReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.ZipDeflateReadSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Delimited text read settings.
 * 
 */
public final class DelimitedTextReadSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelimitedTextReadSettingsArgs Empty = new DelimitedTextReadSettingsArgs();

    /**
     * Compression settings.
     * 
     */
    @InputImport(name="compressionProperties")
      private final @Nullable Input<Object> compressionProperties;

    public Input<Object> getCompressionProperties() {
        return this.compressionProperties == null ? Input.empty() : this.compressionProperties;
    }

    /**
     * Indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="skipLineCount")
      private final @Nullable Input<Object> skipLineCount;

    public Input<Object> getSkipLineCount() {
        return this.skipLineCount == null ? Input.empty() : this.skipLineCount;
    }

    /**
     * The read setting type.
     * Expected value is 'DelimitedTextReadSettings'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public DelimitedTextReadSettingsArgs(
        @Nullable Input<Object> compressionProperties,
        @Nullable Input<Object> skipLineCount,
        Input<String> type) {
        this.compressionProperties = compressionProperties;
        this.skipLineCount = skipLineCount;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DelimitedTextReadSettingsArgs() {
        this.compressionProperties = Input.empty();
        this.skipLineCount = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelimitedTextReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> compressionProperties;
        private @Nullable Input<Object> skipLineCount;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextReadSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionProperties = defaults.compressionProperties;
    	      this.skipLineCount = defaults.skipLineCount;
    	      this.type = defaults.type;
        }

        public Builder setCompressionProperties(@Nullable Input<Object> compressionProperties) {
            this.compressionProperties = compressionProperties;
            return this;
        }

        public Builder setCompressionProperties(@Nullable Object compressionProperties) {
            this.compressionProperties = Input.ofNullable(compressionProperties);
            return this;
        }

        public Builder setSkipLineCount(@Nullable Input<Object> skipLineCount) {
            this.skipLineCount = skipLineCount;
            return this;
        }

        public Builder setSkipLineCount(@Nullable Object skipLineCount) {
            this.skipLineCount = Input.ofNullable(skipLineCount);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public DelimitedTextReadSettingsArgs build() {
            return new DelimitedTextReadSettingsArgs(compressionProperties, skipLineCount, type);
        }
    }
}