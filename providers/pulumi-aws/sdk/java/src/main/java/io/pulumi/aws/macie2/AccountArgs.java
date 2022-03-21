// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). Valid values are `FIFTEEN_MINUTES`, `ONE_HOUR` or `SIX_HOURS`.
     * 
     */
    @Import(name="findingPublishingFrequency")
      private final @Nullable Output<String> findingPublishingFrequency;

    public Output<String> getFindingPublishingFrequency() {
        return this.findingPublishingFrequency == null ? Output.empty() : this.findingPublishingFrequency;
    }

    /**
     * Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public AccountArgs(
        @Nullable Output<String> findingPublishingFrequency,
        @Nullable Output<String> status) {
        this.findingPublishingFrequency = findingPublishingFrequency;
        this.status = status;
    }

    private AccountArgs() {
        this.findingPublishingFrequency = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> findingPublishingFrequency;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.findingPublishingFrequency = defaults.findingPublishingFrequency;
    	      this.status = defaults.status;
        }

        public Builder findingPublishingFrequency(@Nullable Output<String> findingPublishingFrequency) {
            this.findingPublishingFrequency = findingPublishingFrequency;
            return this;
        }
        public Builder findingPublishingFrequency(@Nullable String findingPublishingFrequency) {
            this.findingPublishingFrequency = Output.ofNullable(findingPublishingFrequency);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public AccountArgs build() {
            return new AccountArgs(findingPublishingFrequency, status);
        }
    }
}
