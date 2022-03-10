// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.certificatemanager.outputs;

import io.pulumi.awsnative.certificatemanager.outputs.AccountExpiryEventsConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccountResult {
    private final @Nullable String accountId;
    private final @Nullable AccountExpiryEventsConfiguration expiryEventsConfiguration;

    @OutputCustomType.Constructor
    private GetAccountResult(
        @OutputCustomType.Parameter("accountId") @Nullable String accountId,
        @OutputCustomType.Parameter("expiryEventsConfiguration") @Nullable AccountExpiryEventsConfiguration expiryEventsConfiguration) {
        this.accountId = accountId;
        this.expiryEventsConfiguration = expiryEventsConfiguration;
    }

    public Optional<String> getAccountId() {
        return Optional.ofNullable(this.accountId);
    }
    public Optional<AccountExpiryEventsConfiguration> getExpiryEventsConfiguration() {
        return Optional.ofNullable(this.expiryEventsConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable AccountExpiryEventsConfiguration expiryEventsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.expiryEventsConfiguration = defaults.expiryEventsConfiguration;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setExpiryEventsConfiguration(@Nullable AccountExpiryEventsConfiguration expiryEventsConfiguration) {
            this.expiryEventsConfiguration = expiryEventsConfiguration;
            return this;
        }
        public GetAccountResult build() {
            return new GetAccountResult(accountId, expiryEventsConfiguration);
        }
    }
}
