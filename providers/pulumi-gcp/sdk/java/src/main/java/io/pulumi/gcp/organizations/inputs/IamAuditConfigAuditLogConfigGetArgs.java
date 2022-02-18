// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IamAuditConfigAuditLogConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IamAuditConfigAuditLogConfigGetArgs Empty = new IamAuditConfigAuditLogConfigGetArgs();

    /**
     * Identities that do not cause logging for this type of permission.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    @InputImport(name="exemptedMembers")
    private final @Nullable Input<List<String>> exemptedMembers;

    public Input<List<String>> getExemptedMembers() {
        return this.exemptedMembers == null ? Input.empty() : this.exemptedMembers;
    }

    /**
     * Permission type for which logging is to be configured.  Must be one of `DATA_READ`, `DATA_WRITE`, or `ADMIN_READ`.
     * 
     */
    @InputImport(name="logType", required=true)
    private final Input<String> logType;

    public Input<String> getLogType() {
        return this.logType;
    }

    public IamAuditConfigAuditLogConfigGetArgs(
        @Nullable Input<List<String>> exemptedMembers,
        Input<String> logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private IamAuditConfigAuditLogConfigGetArgs() {
        this.exemptedMembers = Input.empty();
        this.logType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamAuditConfigAuditLogConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> exemptedMembers;
        private Input<String> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(IamAuditConfigAuditLogConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder setExemptedMembers(@Nullable Input<List<String>> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }

        public Builder setExemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = Input.ofNullable(exemptedMembers);
            return this;
        }

        public Builder setLogType(Input<String> logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Input.of(Objects.requireNonNull(logType));
            return this;
        }

        public IamAuditConfigAuditLogConfigGetArgs build() {
            return new IamAuditConfigAuditLogConfigGetArgs(exemptedMembers, logType);
        }
    }
}
