// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.AuditLogStatus;
import io.pulumi.azurenative.containerregistry.enums.LogLevel;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The logging properties of the connected registry.
 * 
 */
public final class LoggingPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingPropertiesArgs Empty = new LoggingPropertiesArgs();

    /**
     * Indicates whether audit logs are enabled on the connected registry.
     * 
     */
    @InputImport(name="auditLogStatus")
    private final @Nullable Input<Either<String,AuditLogStatus>> auditLogStatus;

    public Input<Either<String,AuditLogStatus>> getAuditLogStatus() {
        return this.auditLogStatus == null ? Input.empty() : this.auditLogStatus;
    }

    /**
     * The verbosity of logs persisted on the connected registry.
     * 
     */
    @InputImport(name="logLevel")
    private final @Nullable Input<Either<String,LogLevel>> logLevel;

    public Input<Either<String,LogLevel>> getLogLevel() {
        return this.logLevel == null ? Input.empty() : this.logLevel;
    }

    public LoggingPropertiesArgs(
        @Nullable Input<Either<String,AuditLogStatus>> auditLogStatus,
        @Nullable Input<Either<String,LogLevel>> logLevel) {
        this.auditLogStatus = auditLogStatus == null ? Input.ofLeft("Disabled") : auditLogStatus;
        this.logLevel = logLevel == null ? Input.ofLeft("Information") : logLevel;
    }

    private LoggingPropertiesArgs() {
        this.auditLogStatus = Input.empty();
        this.logLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AuditLogStatus>> auditLogStatus;
        private @Nullable Input<Either<String,LogLevel>> logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogStatus = defaults.auditLogStatus;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder setAuditLogStatus(@Nullable Input<Either<String,AuditLogStatus>> auditLogStatus) {
            this.auditLogStatus = auditLogStatus;
            return this;
        }

        public Builder setAuditLogStatus(@Nullable Either<String,AuditLogStatus> auditLogStatus) {
            this.auditLogStatus = Input.ofNullable(auditLogStatus);
            return this;
        }

        public Builder setLogLevel(@Nullable Input<Either<String,LogLevel>> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setLogLevel(@Nullable Either<String,LogLevel> logLevel) {
            this.logLevel = Input.ofNullable(logLevel);
            return this;
        }

        public LoggingPropertiesArgs build() {
            return new LoggingPropertiesArgs(auditLogStatus, logLevel);
        }
    }
}
