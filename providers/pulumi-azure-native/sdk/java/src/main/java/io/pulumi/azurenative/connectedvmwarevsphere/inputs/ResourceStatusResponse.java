// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The resource status information.
 * 
 */
public final class ResourceStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceStatusResponse Empty = new ResourceStatusResponse();

    /**
     * The last update time for this condition.
     * 
     */
    @InputImport(name="lastUpdatedAt", required=true)
      private final String lastUpdatedAt;

    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * A human readable message indicating details about the status.
     * 
     */
    @InputImport(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * The reason for the condition's status.
     * 
     */
    @InputImport(name="reason", required=true)
      private final String reason;

    public String getReason() {
        return this.reason;
    }

    /**
     * Severity with which to treat failures of this type of condition.
     * 
     */
    @InputImport(name="severity", required=true)
      private final String severity;

    public String getSeverity() {
        return this.severity;
    }

    /**
     * Status of the condition.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * The type of the condition.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ResourceStatusResponse(
        String lastUpdatedAt,
        String message,
        String reason,
        String severity,
        String status,
        String type) {
        this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "expected parameter 'lastUpdatedAt' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ResourceStatusResponse() {
        this.lastUpdatedAt = null;
        this.message = null;
        this.reason = null;
        this.severity = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastUpdatedAt;
        private String message;
        private String reason;
        private String severity;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdatedAt = defaults.lastUpdatedAt;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResourceStatusResponse build() {
            return new ResourceStatusResponse(lastUpdatedAt, message, reason, severity, status, type);
        }
    }
}