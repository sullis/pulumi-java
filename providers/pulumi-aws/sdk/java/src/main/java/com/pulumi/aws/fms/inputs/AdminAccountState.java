// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdminAccountState extends com.pulumi.resources.ResourceArgs {

    public static final AdminAccountState Empty = new AdminAccountState();

    /**
     * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    private AdminAccountState() {}

    private AdminAccountState(AdminAccountState $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdminAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdminAccountState $;

        public Builder() {
            $ = new AdminAccountState();
        }

        public Builder(AdminAccountState defaults) {
            $ = new AdminAccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public AdminAccountState build() {
            return $;
        }
    }

}
