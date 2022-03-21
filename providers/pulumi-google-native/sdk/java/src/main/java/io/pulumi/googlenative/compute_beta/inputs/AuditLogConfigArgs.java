// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.enums.AuditLogConfigLogType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides the configuration for logging a type of permissions. Example: { "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose@example.com" ] }, { "log_type": "DATA_WRITE" } ] } This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class AuditLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuditLogConfigArgs Empty = new AuditLogConfigArgs();

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    @Import(name="exemptedMembers")
      private final @Nullable Output<List<String>> exemptedMembers;

    public Output<List<String>> getExemptedMembers() {
        return this.exemptedMembers == null ? Output.empty() : this.exemptedMembers;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="ignoreChildExemptions")
      private final @Nullable Output<Boolean> ignoreChildExemptions;

    public Output<Boolean> getIgnoreChildExemptions() {
        return this.ignoreChildExemptions == null ? Output.empty() : this.ignoreChildExemptions;
    }

    /**
     * The log type that this config enables.
     * 
     */
    @Import(name="logType")
      private final @Nullable Output<AuditLogConfigLogType> logType;

    public Output<AuditLogConfigLogType> getLogType() {
        return this.logType == null ? Output.empty() : this.logType;
    }

    public AuditLogConfigArgs(
        @Nullable Output<List<String>> exemptedMembers,
        @Nullable Output<Boolean> ignoreChildExemptions,
        @Nullable Output<AuditLogConfigLogType> logType) {
        this.exemptedMembers = exemptedMembers;
        this.ignoreChildExemptions = ignoreChildExemptions;
        this.logType = logType;
    }

    private AuditLogConfigArgs() {
        this.exemptedMembers = Output.empty();
        this.ignoreChildExemptions = Output.empty();
        this.logType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> exemptedMembers;
        private @Nullable Output<Boolean> ignoreChildExemptions;
        private @Nullable Output<AuditLogConfigLogType> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.ignoreChildExemptions = defaults.ignoreChildExemptions;
    	      this.logType = defaults.logType;
        }

        public Builder exemptedMembers(@Nullable Output<List<String>> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }
        public Builder exemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = Output.ofNullable(exemptedMembers);
            return this;
        }
        public Builder exemptedMembers(String... exemptedMembers) {
            return exemptedMembers(List.of(exemptedMembers));
        }
        public Builder ignoreChildExemptions(@Nullable Output<Boolean> ignoreChildExemptions) {
            this.ignoreChildExemptions = ignoreChildExemptions;
            return this;
        }
        public Builder ignoreChildExemptions(@Nullable Boolean ignoreChildExemptions) {
            this.ignoreChildExemptions = Output.ofNullable(ignoreChildExemptions);
            return this;
        }
        public Builder logType(@Nullable Output<AuditLogConfigLogType> logType) {
            this.logType = logType;
            return this;
        }
        public Builder logType(@Nullable AuditLogConfigLogType logType) {
            this.logType = Output.ofNullable(logType);
            return this;
        }        public AuditLogConfigArgs build() {
            return new AuditLogConfigArgs(exemptedMembers, ignoreChildExemptions, logType);
        }
    }
}
