// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountPublicAccessBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountPublicAccessBlockArgs Empty = new AccountPublicAccessBlockArgs();

    /**
     * AWS account ID to configure. Defaults to automatically determined account ID of the this provider AWS provider.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return AWS account ID to configure. Defaults to automatically determined account ID of the this provider AWS provider.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
     * * PUT Object calls fail if the request includes a public ACL.
     * 
     */
    @Import(name="blockPublicAcls")
    private @Nullable Output<Boolean> blockPublicAcls;

    /**
     * @return Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
     * * PUT Object calls fail if the request includes a public ACL.
     * 
     */
    public Optional<Output<Boolean>> blockPublicAcls() {
        return Optional.ofNullable(this.blockPublicAcls);
    }

    /**
     * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    @Import(name="blockPublicPolicy")
    private @Nullable Output<Boolean> blockPublicPolicy;

    /**
     * @return Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    public Optional<Output<Boolean>> blockPublicPolicy() {
        return Optional.ofNullable(this.blockPublicPolicy);
    }

    /**
     * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore all public ACLs on buckets in this account and any objects that they contain.
     * 
     */
    @Import(name="ignorePublicAcls")
    private @Nullable Output<Boolean> ignorePublicAcls;

    /**
     * @return Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore all public ACLs on buckets in this account and any objects that they contain.
     * 
     */
    public Optional<Output<Boolean>> ignorePublicAcls() {
        return Optional.ofNullable(this.ignorePublicAcls);
    }

    /**
     * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access buckets with public policies.
     * 
     */
    @Import(name="restrictPublicBuckets")
    private @Nullable Output<Boolean> restrictPublicBuckets;

    /**
     * @return Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access buckets with public policies.
     * 
     */
    public Optional<Output<Boolean>> restrictPublicBuckets() {
        return Optional.ofNullable(this.restrictPublicBuckets);
    }

    private AccountPublicAccessBlockArgs() {}

    private AccountPublicAccessBlockArgs(AccountPublicAccessBlockArgs $) {
        this.accountId = $.accountId;
        this.blockPublicAcls = $.blockPublicAcls;
        this.blockPublicPolicy = $.blockPublicPolicy;
        this.ignorePublicAcls = $.ignorePublicAcls;
        this.restrictPublicBuckets = $.restrictPublicBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountPublicAccessBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountPublicAccessBlockArgs $;

        public Builder() {
            $ = new AccountPublicAccessBlockArgs();
        }

        public Builder(AccountPublicAccessBlockArgs defaults) {
            $ = new AccountPublicAccessBlockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId AWS account ID to configure. Defaults to automatically determined account ID of the this provider AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId AWS account ID to configure. Defaults to automatically determined account ID of the this provider AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param blockPublicAcls Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
         * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
         * * PUT Object calls fail if the request includes a public ACL.
         * 
         * @return builder
         * 
         */
        public Builder blockPublicAcls(@Nullable Output<Boolean> blockPublicAcls) {
            $.blockPublicAcls = blockPublicAcls;
            return this;
        }

        /**
         * @param blockPublicAcls Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
         * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
         * * PUT Object calls fail if the request includes a public ACL.
         * 
         * @return builder
         * 
         */
        public Builder blockPublicAcls(Boolean blockPublicAcls) {
            return blockPublicAcls(Output.of(blockPublicAcls));
        }

        /**
         * @param blockPublicPolicy Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
         * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
         * 
         * @return builder
         * 
         */
        public Builder blockPublicPolicy(@Nullable Output<Boolean> blockPublicPolicy) {
            $.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * @param blockPublicPolicy Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
         * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
         * 
         * @return builder
         * 
         */
        public Builder blockPublicPolicy(Boolean blockPublicPolicy) {
            return blockPublicPolicy(Output.of(blockPublicPolicy));
        }

        /**
         * @param ignorePublicAcls Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
         * * Ignore all public ACLs on buckets in this account and any objects that they contain.
         * 
         * @return builder
         * 
         */
        public Builder ignorePublicAcls(@Nullable Output<Boolean> ignorePublicAcls) {
            $.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        /**
         * @param ignorePublicAcls Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
         * * Ignore all public ACLs on buckets in this account and any objects that they contain.
         * 
         * @return builder
         * 
         */
        public Builder ignorePublicAcls(Boolean ignorePublicAcls) {
            return ignorePublicAcls(Output.of(ignorePublicAcls));
        }

        /**
         * @param restrictPublicBuckets Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
         * * Only the bucket owner and AWS Services can access buckets with public policies.
         * 
         * @return builder
         * 
         */
        public Builder restrictPublicBuckets(@Nullable Output<Boolean> restrictPublicBuckets) {
            $.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        /**
         * @param restrictPublicBuckets Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
         * * Only the bucket owner and AWS Services can access buckets with public policies.
         * 
         * @return builder
         * 
         */
        public Builder restrictPublicBuckets(Boolean restrictPublicBuckets) {
            return restrictPublicBuckets(Output.of(restrictPublicBuckets));
        }

        public AccountPublicAccessBlockArgs build() {
            return $;
        }
    }

}
