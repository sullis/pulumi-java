// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inner Error
 * 
 */
public final class InnerErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final InnerErrorResponse Empty = new InnerErrorResponse();

    /**
     * Any Key value pairs that can be provided to the client for additional  verbose information.
     * 
     */
    @InputImport(name="additionalInfo")
      private final @Nullable Map<String,String> additionalInfo;

    public Map<String,String> getAdditionalInfo() {
        return this.additionalInfo == null ? Map.of() : this.additionalInfo;
    }

    /**
     * Unique code for this error
     * 
     */
    @InputImport(name="code")
      private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * Child Inner Error, to allow Nesting.
     * 
     */
    @InputImport(name="embeddedInnerError")
      private final @Nullable InnerErrorResponse embeddedInnerError;

    public Optional<InnerErrorResponse> getEmbeddedInnerError() {
        return this.embeddedInnerError == null ? Optional.empty() : Optional.ofNullable(this.embeddedInnerError);
    }

    public InnerErrorResponse(
        @Nullable Map<String,String> additionalInfo,
        @Nullable String code,
        @Nullable InnerErrorResponse embeddedInnerError) {
        this.additionalInfo = additionalInfo;
        this.code = code;
        this.embeddedInnerError = embeddedInnerError;
    }

    private InnerErrorResponse() {
        this.additionalInfo = Map.of();
        this.code = null;
        this.embeddedInnerError = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InnerErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> additionalInfo;
        private @Nullable String code;
        private @Nullable InnerErrorResponse embeddedInnerError;

        public Builder() {
    	      // Empty
        }

        public Builder(InnerErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.embeddedInnerError = defaults.embeddedInnerError;
        }

        public Builder setAdditionalInfo(@Nullable Map<String,String> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setEmbeddedInnerError(@Nullable InnerErrorResponse embeddedInnerError) {
            this.embeddedInnerError = embeddedInnerError;
            return this;
        }
        public InnerErrorResponse build() {
            return new InnerErrorResponse(additionalInfo, code, embeddedInnerError);
        }
    }
}