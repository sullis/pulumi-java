// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.certificatemanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountExpiryEventsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountExpiryEventsConfigurationArgs Empty = new AccountExpiryEventsConfigurationArgs();

    @Import(name="daysBeforeExpiry")
      private final @Nullable Output<Integer> daysBeforeExpiry;

    public Output<Integer> daysBeforeExpiry() {
        return this.daysBeforeExpiry == null ? Codegen.empty() : this.daysBeforeExpiry;
    }

    public AccountExpiryEventsConfigurationArgs(@Nullable Output<Integer> daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
    }

    private AccountExpiryEventsConfigurationArgs() {
        this.daysBeforeExpiry = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountExpiryEventsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> daysBeforeExpiry;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountExpiryEventsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysBeforeExpiry = defaults.daysBeforeExpiry;
        }

        public Builder daysBeforeExpiry(@Nullable Output<Integer> daysBeforeExpiry) {
            this.daysBeforeExpiry = daysBeforeExpiry;
            return this;
        }
        public Builder daysBeforeExpiry(@Nullable Integer daysBeforeExpiry) {
            this.daysBeforeExpiry = Codegen.ofNullable(daysBeforeExpiry);
            return this;
        }        public AccountExpiryEventsConfigurationArgs build() {
            return new AccountExpiryEventsConfigurationArgs(daysBeforeExpiry);
        }
    }
}
