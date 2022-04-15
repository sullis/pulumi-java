// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.outputs;

import io.pulumi.aws.secretsmanager.outputs.GetSecretRotationRule;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSecretResult {
    /**
     * The Amazon Resource Name (ARN) of the secret.
     * 
     */
    private final String arn;
    /**
     * A description of the secret.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The Key Management Service (KMS) Customer Master Key (CMK) associated with the secret.
     * 
     */
    private final String kmsKeyId;
    private final String name;
    /**
     * The resource-based policy document that's attached to the secret.
     * 
     */
    private final String policy;
    /**
     * Whether rotation is enabled or not.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation data source instead
     * 
     */
        @Deprecated /* Use the aws_secretsmanager_secret_rotation data source instead */
    private final Boolean rotationEnabled;
    /**
     * Rotation Lambda function Amazon Resource Name (ARN) if rotation is enabled.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation data source instead
     * 
     */
        @Deprecated /* Use the aws_secretsmanager_secret_rotation data source instead */
    private final String rotationLambdaArn;
    /**
     * Rotation rules if rotation is enabled.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation data source instead
     * 
     */
        @Deprecated /* Use the aws_secretsmanager_secret_rotation data source instead */
    private final List<GetSecretRotationRule> rotationRules;
    /**
     * Tags of the secret.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetSecretResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") String policy,
        @CustomType.Parameter("rotationEnabled") Boolean rotationEnabled,
        @CustomType.Parameter("rotationLambdaArn") String rotationLambdaArn,
        @CustomType.Parameter("rotationRules") List<GetSecretRotationRule> rotationRules,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.policy = policy;
        this.rotationEnabled = rotationEnabled;
        this.rotationLambdaArn = rotationLambdaArn;
        this.rotationRules = rotationRules;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the secret.
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * A description of the secret.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The Key Management Service (KMS) Customer Master Key (CMK) associated with the secret.
     * 
    */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    public String name() {
        return this.name;
    }
    /**
     * The resource-based policy document that's attached to the secret.
     * 
    */
    public String policy() {
        return this.policy;
    }
    /**
     * Whether rotation is enabled or not.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation data source instead
     * 
    */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation data source instead */
    public Boolean rotationEnabled() {
        return this.rotationEnabled;
    }
    /**
     * Rotation Lambda function Amazon Resource Name (ARN) if rotation is enabled.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation data source instead
     * 
    */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation data source instead */
    public String rotationLambdaArn() {
        return this.rotationLambdaArn;
    }
    /**
     * Rotation rules if rotation is enabled.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation data source instead
     * 
    */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation data source instead */
    public List<GetSecretRotationRule> rotationRules() {
        return this.rotationRules;
    }
    /**
     * Tags of the secret.
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private String kmsKeyId;
        private String name;
        private String policy;
        private Boolean rotationEnabled;
        private String rotationLambdaArn;
        private List<GetSecretRotationRule> rotationRules;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.rotationEnabled = defaults.rotationEnabled;
    	      this.rotationLambdaArn = defaults.rotationLambdaArn;
    	      this.rotationRules = defaults.rotationRules;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder rotationEnabled(Boolean rotationEnabled) {
            this.rotationEnabled = Objects.requireNonNull(rotationEnabled);
            return this;
        }
        public Builder rotationLambdaArn(String rotationLambdaArn) {
            this.rotationLambdaArn = Objects.requireNonNull(rotationLambdaArn);
            return this;
        }
        public Builder rotationRules(List<GetSecretRotationRule> rotationRules) {
            this.rotationRules = Objects.requireNonNull(rotationRules);
            return this;
        }
        public Builder rotationRules(GetSecretRotationRule... rotationRules) {
            return rotationRules(List.of(rotationRules));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetSecretResult build() {
            return new GetSecretResult(arn, description, id, kmsKeyId, name, policy, rotationEnabled, rotationLambdaArn, rotationRules, tags);
        }
    }
}
