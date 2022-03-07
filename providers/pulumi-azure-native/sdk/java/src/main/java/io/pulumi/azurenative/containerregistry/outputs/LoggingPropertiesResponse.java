// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoggingPropertiesResponse {
    /**
     * Indicates whether audit logs are enabled on the connected registry.
     * 
     */
    private final @Nullable String auditLogStatus;
    /**
     * The verbosity of logs persisted on the connected registry.
     * 
     */
    private final @Nullable String logLevel;

    @OutputCustomType.Constructor({"auditLogStatus","logLevel"})
    private LoggingPropertiesResponse(
        @Nullable String auditLogStatus,
        @Nullable String logLevel) {
        this.auditLogStatus = auditLogStatus;
        this.logLevel = logLevel;
    }

    /**
     * Indicates whether audit logs are enabled on the connected registry.
     * 
    */
    public Optional<String> getAuditLogStatus() {
        return Optional.ofNullable(this.auditLogStatus);
    }
    /**
     * The verbosity of logs persisted on the connected registry.
     * 
    */
    public Optional<String> getLogLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String auditLogStatus;
        private @Nullable String logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogStatus = defaults.auditLogStatus;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder setAuditLogStatus(@Nullable String auditLogStatus) {
            this.auditLogStatus = auditLogStatus;
            return this;
        }

        public Builder setLogLevel(@Nullable String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public LoggingPropertiesResponse build() {
            return new LoggingPropertiesResponse(auditLogStatus, logLevel);
        }
    }
}