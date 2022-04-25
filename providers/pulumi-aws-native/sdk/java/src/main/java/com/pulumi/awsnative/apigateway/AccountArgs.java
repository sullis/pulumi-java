// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The Amazon Resource Name (ARN) of an IAM role that has write access to CloudWatch Logs in your account.
     * 
     */
    @Import(name="cloudWatchRoleArn")
    private @Nullable Output<String> cloudWatchRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that has write access to CloudWatch Logs in your account.
     * 
     */
    public Optional<Output<String>> cloudWatchRoleArn() {
        return Optional.ofNullable(this.cloudWatchRoleArn);
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.cloudWatchRoleArn = $.cloudWatchRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudWatchRoleArn The Amazon Resource Name (ARN) of an IAM role that has write access to CloudWatch Logs in your account.
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchRoleArn(@Nullable Output<String> cloudWatchRoleArn) {
            $.cloudWatchRoleArn = cloudWatchRoleArn;
            return this;
        }

        /**
         * @param cloudWatchRoleArn The Amazon Resource Name (ARN) of an IAM role that has write access to CloudWatch Logs in your account.
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchRoleArn(String cloudWatchRoleArn) {
            return cloudWatchRoleArn(Output.of(cloudWatchRoleArn));
        }

        public AccountArgs build() {
            return $;
        }
    }

}
