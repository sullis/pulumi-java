// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.NotebookPreparationErrorResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotebookResourceInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotebookResourceInfoResponse Empty = new NotebookResourceInfoResponse();

    @InputImport(name="fqdn")
    private final @Nullable String fqdn;

    public Optional<String> getFqdn() {
        return this.fqdn == null ? Optional.empty() : Optional.ofNullable(this.fqdn);
    }

    /**
     * The error that occurs when preparing notebook.
     * 
     */
    @InputImport(name="notebookPreparationError")
    private final @Nullable NotebookPreparationErrorResponse notebookPreparationError;

    public Optional<NotebookPreparationErrorResponse> getNotebookPreparationError() {
        return this.notebookPreparationError == null ? Optional.empty() : Optional.ofNullable(this.notebookPreparationError);
    }

    /**
     * the data plane resourceId that used to initialize notebook component
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public NotebookResourceInfoResponse(
        @Nullable String fqdn,
        @Nullable NotebookPreparationErrorResponse notebookPreparationError,
        @Nullable String resourceId) {
        this.fqdn = fqdn;
        this.notebookPreparationError = notebookPreparationError;
        this.resourceId = resourceId;
    }

    private NotebookResourceInfoResponse() {
        this.fqdn = null;
        this.notebookPreparationError = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookResourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fqdn;
        private @Nullable NotebookPreparationErrorResponse notebookPreparationError;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookResourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.notebookPreparationError = defaults.notebookPreparationError;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setNotebookPreparationError(@Nullable NotebookPreparationErrorResponse notebookPreparationError) {
            this.notebookPreparationError = notebookPreparationError;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public NotebookResourceInfoResponse build() {
            return new NotebookResourceInfoResponse(fqdn, notebookPreparationError, resourceId);
        }
    }
}
