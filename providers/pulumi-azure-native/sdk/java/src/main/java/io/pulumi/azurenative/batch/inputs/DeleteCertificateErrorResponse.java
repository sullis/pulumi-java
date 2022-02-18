// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An error response from the Batch service.
 * 
 */
public final class DeleteCertificateErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeleteCertificateErrorResponse Empty = new DeleteCertificateErrorResponse();

    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
     */
    @InputImport(name="code", required=true)
    private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * A list of additional details about the error.
     * 
     */
    @InputImport(name="details")
    private final @Nullable List<DeleteCertificateErrorResponse> details;

    public List<DeleteCertificateErrorResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }

    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
     */
    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * The target of the particular error. For example, the name of the property in error.
     * 
     */
    @InputImport(name="target")
    private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public DeleteCertificateErrorResponse(
        String code,
        @Nullable List<DeleteCertificateErrorResponse> details,
        String message,
        @Nullable String target) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.details = details;
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.target = target;
    }

    private DeleteCertificateErrorResponse() {
        this.code = null;
        this.details = List.of();
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeleteCertificateErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<DeleteCertificateErrorResponse> details;
        private String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(DeleteCertificateErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(@Nullable List<DeleteCertificateErrorResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public DeleteCertificateErrorResponse build() {
            return new DeleteCertificateErrorResponse(code, details, message, target);
        }
    }
}
