// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountAuditConfigurationAuditNotificationTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountAuditConfigurationAuditNotificationTargetArgs Empty = new AccountAuditConfigurationAuditNotificationTargetArgs();

    /**
     * True if notifications to the target are enabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The ARN of the role that grants permission to send notifications to the target.
     * 
     */
    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * The ARN of the target (SNS topic) to which audit notifications are sent.
     * 
     */
    @InputImport(name="targetArn")
    private final @Nullable Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn == null ? Input.empty() : this.targetArn;
    }

    public AccountAuditConfigurationAuditNotificationTargetArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> roleArn,
        @Nullable Input<String> targetArn) {
        this.enabled = enabled;
        this.roleArn = roleArn;
        this.targetArn = targetArn;
    }

    private AccountAuditConfigurationAuditNotificationTargetArgs() {
        this.enabled = Input.empty();
        this.roleArn = Input.empty();
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAuditConfigurationAuditNotificationTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAuditConfigurationAuditNotificationTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder setTargetArn(@Nullable Input<String> targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        public Builder setTargetArn(@Nullable String targetArn) {
            this.targetArn = Input.ofNullable(targetArn);
            return this;
        }

        public AccountAuditConfigurationAuditNotificationTargetArgs build() {
            return new AccountAuditConfigurationAuditNotificationTargetArgs(enabled, roleArn, targetArn);
        }
    }
}
