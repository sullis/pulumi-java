// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Timeline Query Errors.
 * 
 */
public final class TimelineErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimelineErrorResponse Empty = new TimelineErrorResponse();

    /**
     * the error message
     * 
     */
    @InputImport(name="errorMessage", required=true)
      private final String errorMessage;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * the query kind
     * 
     */
    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * the query id
     * 
     */
    @InputImport(name="queryId")
      private final @Nullable String queryId;

    public Optional<String> getQueryId() {
        return this.queryId == null ? Optional.empty() : Optional.ofNullable(this.queryId);
    }

    public TimelineErrorResponse(
        String errorMessage,
        String kind,
        @Nullable String queryId) {
        this.errorMessage = Objects.requireNonNull(errorMessage, "expected parameter 'errorMessage' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.queryId = queryId;
    }

    private TimelineErrorResponse() {
        this.errorMessage = null;
        this.kind = null;
        this.queryId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimelineErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorMessage;
        private String kind;
        private @Nullable String queryId;

        public Builder() {
    	      // Empty
        }

        public Builder(TimelineErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.kind = defaults.kind;
    	      this.queryId = defaults.queryId;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setQueryId(@Nullable String queryId) {
            this.queryId = queryId;
            return this;
        }
        public TimelineErrorResponse build() {
            return new TimelineErrorResponse(errorMessage, kind, queryId);
        }
    }
}