// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager;

import com.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs;
import com.pulumi.aws.secretsmanager.inputs.SecretRotationRulesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * Description of the secret.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the secret.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
     * 
     */
    @Import(name="forceOverwriteReplicaSecret")
    private @Nullable Output<Boolean> forceOverwriteReplicaSecret;

    /**
     * @return Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
     * 
     */
    public Optional<Output<Boolean>> forceOverwriteReplicaSecret() {
        return Optional.ofNullable(this.forceOverwriteReplicaSecret);
    }

    /**
     * ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account&#39;s default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account&#39;s default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `name_prefix`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `name_prefix`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.secretsmanager.SecretPolicy`. To delete the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.secretsmanager.SecretPolicy`. To delete the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
     * 
     */
    @Import(name="recoveryWindowInDays")
    private @Nullable Output<Integer> recoveryWindowInDays;

    /**
     * @return Number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
     * 
     */
    public Optional<Output<Integer>> recoveryWindowInDays() {
        return Optional.ofNullable(this.recoveryWindowInDays);
    }

    /**
     * Configuration block to support secret replication. See details below.
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<List<SecretReplicaArgs>> replicas;

    /**
     * @return Configuration block to support secret replication. See details below.
     * 
     */
    public Optional<Output<List<SecretReplicaArgs>>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     * @deprecated
     * Use the aws_secretsmanager_secret_rotation resource instead
     * 
     */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    @Import(name="rotationLambdaArn")
    private @Nullable Output<String> rotationLambdaArn;

    /**
     * @return ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     * @deprecated
     * Use the aws_secretsmanager_secret_rotation resource instead
     * 
     */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    public Optional<Output<String>> rotationLambdaArn() {
        return Optional.ofNullable(this.rotationLambdaArn);
    }

    /**
     * Configuration block for the rotation configuration of this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     * @deprecated
     * Use the aws_secretsmanager_secret_rotation resource instead
     * 
     */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    @Import(name="rotationRules")
    private @Nullable Output<SecretRotationRulesArgs> rotationRules;

    /**
     * @return Configuration block for the rotation configuration of this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     * @deprecated
     * Use the aws_secretsmanager_secret_rotation resource instead
     * 
     */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    public Optional<Output<SecretRotationRulesArgs>> rotationRules() {
        return Optional.ofNullable(this.rotationRules);
    }

    /**
     * Key-value map of user-defined tags that are attached to the secret. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of user-defined tags that are attached to the secret. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SecretArgs() {}

    private SecretArgs(SecretArgs $) {
        this.description = $.description;
        this.forceOverwriteReplicaSecret = $.forceOverwriteReplicaSecret;
        this.kmsKeyId = $.kmsKeyId;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.policy = $.policy;
        this.recoveryWindowInDays = $.recoveryWindowInDays;
        this.replicas = $.replicas;
        this.rotationLambdaArn = $.rotationLambdaArn;
        this.rotationRules = $.rotationRules;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretArgs $;

        public Builder() {
            $ = new SecretArgs();
        }

        public Builder(SecretArgs defaults) {
            $ = new SecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the secret.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the secret.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param forceOverwriteReplicaSecret Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
         * 
         * @return builder
         * 
         */
        public Builder forceOverwriteReplicaSecret(@Nullable Output<Boolean> forceOverwriteReplicaSecret) {
            $.forceOverwriteReplicaSecret = forceOverwriteReplicaSecret;
            return this;
        }

        /**
         * @param forceOverwriteReplicaSecret Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
         * 
         * @return builder
         * 
         */
        public Builder forceOverwriteReplicaSecret(Boolean forceOverwriteReplicaSecret) {
            return forceOverwriteReplicaSecret(Output.of(forceOverwriteReplicaSecret));
        }

        /**
         * @param kmsKeyId ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account&#39;s default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account&#39;s default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param name Friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `name_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `name_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param policy Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.secretsmanager.SecretPolicy`. To delete the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.secretsmanager.SecretPolicy`. To delete the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param recoveryWindowInDays Number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
         * 
         * @return builder
         * 
         */
        public Builder recoveryWindowInDays(@Nullable Output<Integer> recoveryWindowInDays) {
            $.recoveryWindowInDays = recoveryWindowInDays;
            return this;
        }

        /**
         * @param recoveryWindowInDays Number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
         * 
         * @return builder
         * 
         */
        public Builder recoveryWindowInDays(Integer recoveryWindowInDays) {
            return recoveryWindowInDays(Output.of(recoveryWindowInDays));
        }

        /**
         * @param replicas Configuration block to support secret replication. See details below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(@Nullable Output<List<SecretReplicaArgs>> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas Configuration block to support secret replication. See details below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(List<SecretReplicaArgs> replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param replicas Configuration block to support secret replication. See details below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(SecretReplicaArgs... replicas) {
            return replicas(List.of(replicas));
        }

        /**
         * @param rotationLambdaArn ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_secretsmanager_secret_rotation resource instead
         * 
         */
        @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
        public Builder rotationLambdaArn(@Nullable Output<String> rotationLambdaArn) {
            $.rotationLambdaArn = rotationLambdaArn;
            return this;
        }

        /**
         * @param rotationLambdaArn ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_secretsmanager_secret_rotation resource instead
         * 
         */
        @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
        public Builder rotationLambdaArn(String rotationLambdaArn) {
            return rotationLambdaArn(Output.of(rotationLambdaArn));
        }

        /**
         * @param rotationRules Configuration block for the rotation configuration of this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_secretsmanager_secret_rotation resource instead
         * 
         */
        @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
        public Builder rotationRules(@Nullable Output<SecretRotationRulesArgs> rotationRules) {
            $.rotationRules = rotationRules;
            return this;
        }

        /**
         * @param rotationRules Configuration block for the rotation configuration of this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_secretsmanager_secret_rotation resource instead
         * 
         */
        @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
        public Builder rotationRules(SecretRotationRulesArgs rotationRules) {
            return rotationRules(Output.of(rotationRules));
        }

        /**
         * @param tags Key-value map of user-defined tags that are attached to the secret. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of user-defined tags that are attached to the secret. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SecretArgs build() {
            return $;
        }
    }

}
