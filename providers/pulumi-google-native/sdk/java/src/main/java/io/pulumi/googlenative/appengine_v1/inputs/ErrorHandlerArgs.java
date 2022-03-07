// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1.enums.ErrorHandlerErrorCode;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom static error page to be served when an error occurs.
 * 
 */
public final class ErrorHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ErrorHandlerArgs Empty = new ErrorHandlerArgs();

    /**
     * Error condition this handler applies to.
     * 
     */
    @InputImport(name="errorCode")
      private final @Nullable Input<ErrorHandlerErrorCode> errorCode;

    public Input<ErrorHandlerErrorCode> getErrorCode() {
        return this.errorCode == null ? Input.empty() : this.errorCode;
    }

    /**
     * MIME type of file. Defaults to text/html.
     * 
     */
    @InputImport(name="mimeType")
      private final @Nullable Input<String> mimeType;

    public Input<String> getMimeType() {
        return this.mimeType == null ? Input.empty() : this.mimeType;
    }

    /**
     * Static file content to be served for this error.
     * 
     */
    @InputImport(name="staticFile")
      private final @Nullable Input<String> staticFile;

    public Input<String> getStaticFile() {
        return this.staticFile == null ? Input.empty() : this.staticFile;
    }

    public ErrorHandlerArgs(
        @Nullable Input<ErrorHandlerErrorCode> errorCode,
        @Nullable Input<String> mimeType,
        @Nullable Input<String> staticFile) {
        this.errorCode = errorCode;
        this.mimeType = mimeType;
        this.staticFile = staticFile;
    }

    private ErrorHandlerArgs() {
        this.errorCode = Input.empty();
        this.mimeType = Input.empty();
        this.staticFile = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ErrorHandlerErrorCode> errorCode;
        private @Nullable Input<String> mimeType;
        private @Nullable Input<String> staticFile;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.mimeType = defaults.mimeType;
    	      this.staticFile = defaults.staticFile;
        }

        public Builder setErrorCode(@Nullable Input<ErrorHandlerErrorCode> errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder setErrorCode(@Nullable ErrorHandlerErrorCode errorCode) {
            this.errorCode = Input.ofNullable(errorCode);
            return this;
        }

        public Builder setMimeType(@Nullable Input<String> mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder setMimeType(@Nullable String mimeType) {
            this.mimeType = Input.ofNullable(mimeType);
            return this;
        }

        public Builder setStaticFile(@Nullable Input<String> staticFile) {
            this.staticFile = staticFile;
            return this;
        }

        public Builder setStaticFile(@Nullable String staticFile) {
            this.staticFile = Input.ofNullable(staticFile);
            return this;
        }
        public ErrorHandlerArgs build() {
            return new ErrorHandlerArgs(errorCode, mimeType, staticFile);
        }
    }
}