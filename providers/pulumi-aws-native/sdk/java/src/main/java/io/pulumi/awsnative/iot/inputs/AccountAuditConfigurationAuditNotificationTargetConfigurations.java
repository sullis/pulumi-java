// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.AccountAuditConfigurationAuditNotificationTarget;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the targets to which audit notifications are sent.
 * 
 */
public final class AccountAuditConfigurationAuditNotificationTargetConfigurations extends io.pulumi.resources.InvokeArgs {

    public static final AccountAuditConfigurationAuditNotificationTargetConfigurations Empty = new AccountAuditConfigurationAuditNotificationTargetConfigurations();

    @InputImport(name="sns")
    private final @Nullable AccountAuditConfigurationAuditNotificationTarget sns;

    public Optional<AccountAuditConfigurationAuditNotificationTarget> getSns() {
        return this.sns == null ? Optional.empty() : Optional.ofNullable(this.sns);
    }

    public AccountAuditConfigurationAuditNotificationTargetConfigurations(@Nullable AccountAuditConfigurationAuditNotificationTarget sns) {
        this.sns = sns;
    }

    private AccountAuditConfigurationAuditNotificationTargetConfigurations() {
        this.sns = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAuditConfigurationAuditNotificationTargetConfigurations defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccountAuditConfigurationAuditNotificationTarget sns;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAuditConfigurationAuditNotificationTargetConfigurations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sns = defaults.sns;
        }

        public Builder setSns(@Nullable AccountAuditConfigurationAuditNotificationTarget sns) {
            this.sns = sns;
            return this;
        }

        public AccountAuditConfigurationAuditNotificationTargetConfigurations build() {
            return new AccountAuditConfigurationAuditNotificationTargetConfigurations(sns);
        }
    }
}
