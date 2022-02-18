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
public final class HttpServerLocationResponse {
    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileName;
    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object folderPath;
    /**
     * Specify the relativeUrl of http server. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object relativeUrl;
    /**
     * Type of dataset storage location.
     * Expected value is 'HttpServerLocation'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"fileName","folderPath","relativeUrl","type"})
    private HttpServerLocationResponse(
        @Nullable Object fileName,
        @Nullable Object folderPath,
        @Nullable Object relativeUrl,
        String type) {
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.relativeUrl = relativeUrl;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getFileName() {
        return Optional.ofNullable(this.fileName);
    }
    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Object> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * Specify the relativeUrl of http server. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Object> getRelativeUrl() {
        return Optional.ofNullable(this.relativeUrl);
    }
    /**
     * Type of dataset storage location.
     * Expected value is 'HttpServerLocation'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpServerLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileName;
        private @Nullable Object folderPath;
        private @Nullable Object relativeUrl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpServerLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.relativeUrl = defaults.relativeUrl;
    	      this.type = defaults.type;
        }

        public Builder setFileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setRelativeUrl(@Nullable Object relativeUrl) {
            this.relativeUrl = relativeUrl;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public HttpServerLocationResponse build() {
            return new HttpServerLocationResponse(fileName, folderPath, relativeUrl, type);
        }
    }
}
