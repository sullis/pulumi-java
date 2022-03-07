// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.config.inputs.AssumeRole;
import io.pulumi.aws.config.inputs.DefaultTags;
import io.pulumi.aws.config.inputs.Endpoints;
import io.pulumi.aws.config.inputs.IgnoreTags;
import io.pulumi.core.TypeShape;
import io.pulumi.core.internal.Optionals;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public final class Config {

    private static final io.pulumi.Config config = io.pulumi.Config.of("aws");
/**
 * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
 * 
 */
    public Optional<String> accessKey() {
        return config.getObject("accessKey",TypeShape.<String>builder(String.class).build());
    }
    public Optional<List<String>> allowedAccountIds() {
        return config.getObject("allowedAccountIds",TypeShape.<List<String>>builder(List.class).addParameter(String.class).build());
    }
    public Optional<AssumeRole> assumeRole() {
        return config.getObject("assumeRole",TypeShape.<AssumeRole>builder(AssumeRole.class).build());
    }
/**
 * Configuration block with settings to default resource tags across all resources.
 * 
 */
    public Optional<DefaultTags> defaultTags() {
        return config.getObject("defaultTags",TypeShape.<DefaultTags>builder(DefaultTags.class).build());
    }
    public Optional<List<Endpoints>> endpoints() {
        return config.getObject("endpoints",TypeShape.<List<Endpoints>>builder(List.class).addParameter(Endpoints.class).build());
    }
    public Optional<List<String>> forbiddenAccountIds() {
        return config.getObject("forbiddenAccountIds",TypeShape.<List<String>>builder(List.class).addParameter(String.class).build());
    }
/**
 * The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
 * `HTTPS_PROXY` environment variables.
 * 
 */
    public Optional<String> httpProxy() {
        return config.getObject("httpProxy",TypeShape.<String>builder(String.class).build());
    }
/**
 * Configuration block with settings to ignore resource tags across all resources.
 * 
 */
    public Optional<IgnoreTags> ignoreTags() {
        return config.getObject("ignoreTags",TypeShape.<IgnoreTags>builder(IgnoreTags.class).build());
    }
/**
 * Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`
 * 
 */
    public Optional<Boolean> insecure() {
        return config.getObject("insecure",TypeShape.<Boolean>builder(Boolean.class).build());
    }
/**
 * The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
 * 
 */
    public Optional<Integer> maxRetries() {
        return config.getObject("maxRetries",TypeShape.<Integer>builder(Integer.class).build());
    }
/**
 * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
 * 
 */
    public Optional<String> profile() {
        return Optionals.combine(config.getObject("profile",TypeShape.<String>builder(String.class).build()), Optional.ofNullable(Utilities.getEnv("AWS_PROFILE").orElse(null)));
    }
/**
 * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
 * 
 */
    public String region() {
        return Optionals.combine(config.get("region"), Utilities.getEnv("AWS_REGION", "AWS_DEFAULT_REGION").orElse(null));
    }
/**
 * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
 * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
 * Specific to the Amazon S3 service.
 * 
 */
    public Optional<Boolean> s3ForcePathStyle() {
        return config.getObject("s3ForcePathStyle",TypeShape.<Boolean>builder(Boolean.class).build());
    }
/**
 * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
 * 
 */
    public Optional<String> secretKey() {
        return config.getObject("secretKey",TypeShape.<String>builder(String.class).build());
    }
/**
 * The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
 * 
 */
    public Optional<String> sharedCredentialsFile() {
        return config.getObject("sharedCredentialsFile",TypeShape.<String>builder(String.class).build());
    }
/**
 * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
 * available/implemented.
 * 
 */
    public Optional<Boolean> skipCredentialsValidation() {
        return Optionals.combine(config.getObject("skipCredentialsValidation",TypeShape.<Boolean>builder(Boolean.class).build()), Optional.ofNullable(true));
    }
/**
 * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
 * 
 */
    public Optional<Boolean> skipGetEc2Platforms() {
        return Optionals.combine(config.getObject("skipGetEc2Platforms",TypeShape.<Boolean>builder(Boolean.class).build()), Optional.ofNullable(true));
    }
    public Optional<Boolean> skipMetadataApiCheck() {
        return Optionals.combine(config.getObject("skipMetadataApiCheck",TypeShape.<Boolean>builder(Boolean.class).build()), Optional.ofNullable(true));
    }
/**
 * Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
 * not public (yet).
 * 
 */
    public Optional<Boolean> skipRegionValidation() {
        return Optionals.combine(config.getObject("skipRegionValidation",TypeShape.<Boolean>builder(Boolean.class).build()), Optional.ofNullable(true));
    }
/**
 * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
 * 
 */
    public Optional<Boolean> skipRequestingAccountId() {
        return config.getObject("skipRequestingAccountId",TypeShape.<Boolean>builder(Boolean.class).build());
    }
/**
 * session token. A session token is only required if you are using temporary security credentials.
 * 
 */
    public Optional<String> token() {
        return config.getObject("token",TypeShape.<String>builder(String.class).build());
    }
}