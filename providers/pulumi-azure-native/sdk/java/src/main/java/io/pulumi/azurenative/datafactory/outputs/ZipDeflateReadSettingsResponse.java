// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZipDeflateReadSettingsResponse {
    /**
     * Preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object preserveZipFileNameAsFolder;
    /**
     * The Compression setting type.
     * Expected value is 'ZipDeflateReadSettings'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ZipDeflateReadSettingsResponse(
        @CustomType.Parameter("preserveZipFileNameAsFolder") @Nullable Object preserveZipFileNameAsFolder,
        @CustomType.Parameter("type") String type) {
        this.preserveZipFileNameAsFolder = preserveZipFileNameAsFolder;
        this.type = type;
    }

    /**
     * Preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getPreserveZipFileNameAsFolder() {
        return Optional.ofNullable(this.preserveZipFileNameAsFolder);
    }
    /**
     * The Compression setting type.
     * Expected value is 'ZipDeflateReadSettings'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZipDeflateReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object preserveZipFileNameAsFolder;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ZipDeflateReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preserveZipFileNameAsFolder = defaults.preserveZipFileNameAsFolder;
    	      this.type = defaults.type;
        }

        public Builder preserveZipFileNameAsFolder(@Nullable Object preserveZipFileNameAsFolder) {
            this.preserveZipFileNameAsFolder = preserveZipFileNameAsFolder;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ZipDeflateReadSettingsResponse build() {
            return new ZipDeflateReadSettingsResponse(preserveZipFileNameAsFolder, type);
        }
    }
}
