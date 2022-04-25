// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws;

import com.pulumi.aws.inputs.ProviderAssumeRoleArgs;
import com.pulumi.aws.inputs.ProviderDefaultTagsArgs;
import com.pulumi.aws.inputs.ProviderEndpointArgs;
import com.pulumi.aws.inputs.ProviderIgnoreTagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The access key for API operations. You can retrieve this from the &#39;Security &amp; Credentials&#39; section of the AWS console.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return The access key for API operations. You can retrieve this from the &#39;Security &amp; Credentials&#39; section of the AWS console.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    @Import(name="allowedAccountIds", json=true)
    private @Nullable Output<List<String>> allowedAccountIds;

    public Optional<Output<List<String>>> allowedAccountIds() {
        return Optional.ofNullable(this.allowedAccountIds);
    }

    @Import(name="assumeRole", json=true)
    private @Nullable Output<ProviderAssumeRoleArgs> assumeRole;

    public Optional<Output<ProviderAssumeRoleArgs>> assumeRole() {
        return Optional.ofNullable(this.assumeRole);
    }

    /**
     * Configuration block with settings to default resource tags across all resources.
     * 
     */
    @Import(name="defaultTags", json=true)
    private @Nullable Output<ProviderDefaultTagsArgs> defaultTags;

    /**
     * @return Configuration block with settings to default resource tags across all resources.
     * 
     */
    public Optional<Output<ProviderDefaultTagsArgs>> defaultTags() {
        return Optional.ofNullable(this.defaultTags);
    }

    @Import(name="endpoints", json=true)
    private @Nullable Output<List<ProviderEndpointArgs>> endpoints;

    public Optional<Output<List<ProviderEndpointArgs>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    @Import(name="forbiddenAccountIds", json=true)
    private @Nullable Output<List<String>> forbiddenAccountIds;

    public Optional<Output<List<String>>> forbiddenAccountIds() {
        return Optional.ofNullable(this.forbiddenAccountIds);
    }

    /**
     * The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
     * `HTTPS_PROXY` environment variables.
     * 
     */
    @Import(name="httpProxy")
    private @Nullable Output<String> httpProxy;

    /**
     * @return The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
     * `HTTPS_PROXY` environment variables.
     * 
     */
    public Optional<Output<String>> httpProxy() {
        return Optional.ofNullable(this.httpProxy);
    }

    /**
     * Configuration block with settings to ignore resource tags across all resources.
     * 
     */
    @Import(name="ignoreTags", json=true)
    private @Nullable Output<ProviderIgnoreTagsArgs> ignoreTags;

    /**
     * @return Configuration block with settings to ignore resource tags across all resources.
     * 
     */
    public Optional<Output<ProviderIgnoreTagsArgs>> ignoreTags() {
        return Optional.ofNullable(this.ignoreTags);
    }

    /**
     * Explicitly allow the provider to perform &#34;insecure&#34; SSL requests. If omitted, default value is `false`
     * 
     */
    @Import(name="insecure", json=true)
    private @Nullable Output<Boolean> insecure;

    /**
     * @return Explicitly allow the provider to perform &#34;insecure&#34; SSL requests. If omitted, default value is `false`
     * 
     */
    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    /**
     * The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
     * 
     */
    @Import(name="maxRetries", json=true)
    private @Nullable Output<Integer> maxRetries;

    /**
     * @return The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
     * 
     */
    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    /**
     * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
     * 
     */
    @Import(name="profile")
    private @Nullable Output<String> profile;

    /**
     * @return The profile for API operations. If not set, the default profile created with `aws configure` will be used.
     * 
     */
    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    /**
     * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
     * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
     * Specific to the Amazon S3 service.
     * 
     */
    @Import(name="s3ForcePathStyle", json=true)
    private @Nullable Output<Boolean> s3ForcePathStyle;

    /**
     * @return Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
     * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
     * Specific to the Amazon S3 service.
     * 
     */
    public Optional<Output<Boolean>> s3ForcePathStyle() {
        return Optional.ofNullable(this.s3ForcePathStyle);
    }

    /**
     * The secret key for API operations. You can retrieve this from the &#39;Security &amp; Credentials&#39; section of the AWS console.
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return The secret key for API operations. You can retrieve this from the &#39;Security &amp; Credentials&#39; section of the AWS console.
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
     * 
     */
    @Import(name="sharedCredentialsFile")
    private @Nullable Output<String> sharedCredentialsFile;

    /**
     * @return The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
     * 
     */
    public Optional<Output<String>> sharedCredentialsFile() {
        return Optional.ofNullable(this.sharedCredentialsFile);
    }

    /**
     * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
     * available/implemented.
     * 
     */
    @Import(name="skipCredentialsValidation", json=true)
    private @Nullable Output<Boolean> skipCredentialsValidation;

    /**
     * @return Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
     * available/implemented.
     * 
     */
    public Optional<Output<Boolean>> skipCredentialsValidation() {
        return Optional.ofNullable(this.skipCredentialsValidation);
    }

    /**
     * Skip getting the supported EC2 platforms. Used by users that don&#39;t have ec2:DescribeAccountAttributes permissions.
     * 
     */
    @Import(name="skipGetEc2Platforms", json=true)
    private @Nullable Output<Boolean> skipGetEc2Platforms;

    /**
     * @return Skip getting the supported EC2 platforms. Used by users that don&#39;t have ec2:DescribeAccountAttributes permissions.
     * 
     */
    public Optional<Output<Boolean>> skipGetEc2Platforms() {
        return Optional.ofNullable(this.skipGetEc2Platforms);
    }

    @Import(name="skipMetadataApiCheck", json=true)
    private @Nullable Output<Boolean> skipMetadataApiCheck;

    public Optional<Output<Boolean>> skipMetadataApiCheck() {
        return Optional.ofNullable(this.skipMetadataApiCheck);
    }

    /**
     * Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
     * not public (yet).
     * 
     */
    @Import(name="skipRegionValidation", json=true)
    private @Nullable Output<Boolean> skipRegionValidation;

    /**
     * @return Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
     * not public (yet).
     * 
     */
    public Optional<Output<Boolean>> skipRegionValidation() {
        return Optional.ofNullable(this.skipRegionValidation);
    }

    /**
     * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
     * 
     */
    @Import(name="skipRequestingAccountId", json=true)
    private @Nullable Output<Boolean> skipRequestingAccountId;

    /**
     * @return Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
     * 
     */
    public Optional<Output<Boolean>> skipRequestingAccountId() {
        return Optional.ofNullable(this.skipRequestingAccountId);
    }

    /**
     * session token. A session token is only required if you are using temporary security credentials.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return session token. A session token is only required if you are using temporary security credentials.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.accessKey = $.accessKey;
        this.allowedAccountIds = $.allowedAccountIds;
        this.assumeRole = $.assumeRole;
        this.defaultTags = $.defaultTags;
        this.endpoints = $.endpoints;
        this.forbiddenAccountIds = $.forbiddenAccountIds;
        this.httpProxy = $.httpProxy;
        this.ignoreTags = $.ignoreTags;
        this.insecure = $.insecure;
        this.maxRetries = $.maxRetries;
        this.profile = $.profile;
        this.region = $.region;
        this.s3ForcePathStyle = $.s3ForcePathStyle;
        this.secretKey = $.secretKey;
        this.sharedCredentialsFile = $.sharedCredentialsFile;
        this.skipCredentialsValidation = $.skipCredentialsValidation;
        this.skipGetEc2Platforms = $.skipGetEc2Platforms;
        this.skipMetadataApiCheck = $.skipMetadataApiCheck;
        this.skipRegionValidation = $.skipRegionValidation;
        this.skipRequestingAccountId = $.skipRequestingAccountId;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The access key for API operations. You can retrieve this from the &#39;Security &amp; Credentials&#39; section of the AWS console.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The access key for API operations. You can retrieve this from the &#39;Security &amp; Credentials&#39; section of the AWS console.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        public Builder allowedAccountIds(@Nullable Output<List<String>> allowedAccountIds) {
            $.allowedAccountIds = allowedAccountIds;
            return this;
        }

        public Builder allowedAccountIds(List<String> allowedAccountIds) {
            return allowedAccountIds(Output.of(allowedAccountIds));
        }

        public Builder allowedAccountIds(String... allowedAccountIds) {
            return allowedAccountIds(List.of(allowedAccountIds));
        }

        public Builder assumeRole(@Nullable Output<ProviderAssumeRoleArgs> assumeRole) {
            $.assumeRole = assumeRole;
            return this;
        }

        public Builder assumeRole(ProviderAssumeRoleArgs assumeRole) {
            return assumeRole(Output.of(assumeRole));
        }

        /**
         * @param defaultTags Configuration block with settings to default resource tags across all resources.
         * 
         * @return builder
         * 
         */
        public Builder defaultTags(@Nullable Output<ProviderDefaultTagsArgs> defaultTags) {
            $.defaultTags = defaultTags;
            return this;
        }

        /**
         * @param defaultTags Configuration block with settings to default resource tags across all resources.
         * 
         * @return builder
         * 
         */
        public Builder defaultTags(ProviderDefaultTagsArgs defaultTags) {
            return defaultTags(Output.of(defaultTags));
        }

        public Builder endpoints(@Nullable Output<List<ProviderEndpointArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(List<ProviderEndpointArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        public Builder endpoints(ProviderEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        public Builder forbiddenAccountIds(@Nullable Output<List<String>> forbiddenAccountIds) {
            $.forbiddenAccountIds = forbiddenAccountIds;
            return this;
        }

        public Builder forbiddenAccountIds(List<String> forbiddenAccountIds) {
            return forbiddenAccountIds(Output.of(forbiddenAccountIds));
        }

        public Builder forbiddenAccountIds(String... forbiddenAccountIds) {
            return forbiddenAccountIds(List.of(forbiddenAccountIds));
        }

        /**
         * @param httpProxy The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
         * `HTTPS_PROXY` environment variables.
         * 
         * @return builder
         * 
         */
        public Builder httpProxy(@Nullable Output<String> httpProxy) {
            $.httpProxy = httpProxy;
            return this;
        }

        /**
         * @param httpProxy The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
         * `HTTPS_PROXY` environment variables.
         * 
         * @return builder
         * 
         */
        public Builder httpProxy(String httpProxy) {
            return httpProxy(Output.of(httpProxy));
        }

        /**
         * @param ignoreTags Configuration block with settings to ignore resource tags across all resources.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTags(@Nullable Output<ProviderIgnoreTagsArgs> ignoreTags) {
            $.ignoreTags = ignoreTags;
            return this;
        }

        /**
         * @param ignoreTags Configuration block with settings to ignore resource tags across all resources.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTags(ProviderIgnoreTagsArgs ignoreTags) {
            return ignoreTags(Output.of(ignoreTags));
        }

        /**
         * @param insecure Explicitly allow the provider to perform &#34;insecure&#34; SSL requests. If omitted, default value is `false`
         * 
         * @return builder
         * 
         */
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Explicitly allow the provider to perform &#34;insecure&#34; SSL requests. If omitted, default value is `false`
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param maxRetries The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param maxRetries The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        /**
         * @param profile The profile for API operations. If not set, the default profile created with `aws configure` will be used.
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile The profile for API operations. If not set, the default profile created with `aws configure` will be used.
         * 
         * @return builder
         * 
         */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        /**
         * @param region The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param s3ForcePathStyle Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
         * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
         * Specific to the Amazon S3 service.
         * 
         * @return builder
         * 
         */
        public Builder s3ForcePathStyle(@Nullable Output<Boolean> s3ForcePathStyle) {
            $.s3ForcePathStyle = s3ForcePathStyle;
            return this;
        }

        /**
         * @param s3ForcePathStyle Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
         * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
         * Specific to the Amazon S3 service.
         * 
         * @return builder
         * 
         */
        public Builder s3ForcePathStyle(Boolean s3ForcePathStyle) {
            return s3ForcePathStyle(Output.of(s3ForcePathStyle));
        }

        /**
         * @param secretKey The secret key for API operations. You can retrieve this from the &#39;Security &amp; Credentials&#39; section of the AWS console.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The secret key for API operations. You can retrieve this from the &#39;Security &amp; Credentials&#39; section of the AWS console.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param sharedCredentialsFile The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
         * 
         * @return builder
         * 
         */
        public Builder sharedCredentialsFile(@Nullable Output<String> sharedCredentialsFile) {
            $.sharedCredentialsFile = sharedCredentialsFile;
            return this;
        }

        /**
         * @param sharedCredentialsFile The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
         * 
         * @return builder
         * 
         */
        public Builder sharedCredentialsFile(String sharedCredentialsFile) {
            return sharedCredentialsFile(Output.of(sharedCredentialsFile));
        }

        /**
         * @param skipCredentialsValidation Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
         * available/implemented.
         * 
         * @return builder
         * 
         */
        public Builder skipCredentialsValidation(@Nullable Output<Boolean> skipCredentialsValidation) {
            $.skipCredentialsValidation = skipCredentialsValidation;
            return this;
        }

        /**
         * @param skipCredentialsValidation Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
         * available/implemented.
         * 
         * @return builder
         * 
         */
        public Builder skipCredentialsValidation(Boolean skipCredentialsValidation) {
            return skipCredentialsValidation(Output.of(skipCredentialsValidation));
        }

        /**
         * @param skipGetEc2Platforms Skip getting the supported EC2 platforms. Used by users that don&#39;t have ec2:DescribeAccountAttributes permissions.
         * 
         * @return builder
         * 
         */
        public Builder skipGetEc2Platforms(@Nullable Output<Boolean> skipGetEc2Platforms) {
            $.skipGetEc2Platforms = skipGetEc2Platforms;
            return this;
        }

        /**
         * @param skipGetEc2Platforms Skip getting the supported EC2 platforms. Used by users that don&#39;t have ec2:DescribeAccountAttributes permissions.
         * 
         * @return builder
         * 
         */
        public Builder skipGetEc2Platforms(Boolean skipGetEc2Platforms) {
            return skipGetEc2Platforms(Output.of(skipGetEc2Platforms));
        }

        public Builder skipMetadataApiCheck(@Nullable Output<Boolean> skipMetadataApiCheck) {
            $.skipMetadataApiCheck = skipMetadataApiCheck;
            return this;
        }

        public Builder skipMetadataApiCheck(Boolean skipMetadataApiCheck) {
            return skipMetadataApiCheck(Output.of(skipMetadataApiCheck));
        }

        /**
         * @param skipRegionValidation Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
         * not public (yet).
         * 
         * @return builder
         * 
         */
        public Builder skipRegionValidation(@Nullable Output<Boolean> skipRegionValidation) {
            $.skipRegionValidation = skipRegionValidation;
            return this;
        }

        /**
         * @param skipRegionValidation Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
         * not public (yet).
         * 
         * @return builder
         * 
         */
        public Builder skipRegionValidation(Boolean skipRegionValidation) {
            return skipRegionValidation(Output.of(skipRegionValidation));
        }

        /**
         * @param skipRequestingAccountId Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
         * 
         * @return builder
         * 
         */
        public Builder skipRequestingAccountId(@Nullable Output<Boolean> skipRequestingAccountId) {
            $.skipRequestingAccountId = skipRequestingAccountId;
            return this;
        }

        /**
         * @param skipRequestingAccountId Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
         * 
         * @return builder
         * 
         */
        public Builder skipRequestingAccountId(Boolean skipRequestingAccountId) {
            return skipRequestingAccountId(Output.of(skipRequestingAccountId));
        }

        /**
         * @param token session token. A session token is only required if you are using temporary security credentials.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token session token. A session token is only required if you are using temporary security credentials.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public ProviderArgs build() {
            $.profile = Codegen.stringProp("profile").output().arg($.profile).env("AWS_PROFILE").getNullable();
            $.region = Codegen.stringProp("region").output().arg($.region).env("AWS_REGION", "AWS_DEFAULT_REGION").getNullable();
            $.skipCredentialsValidation = Codegen.booleanProp("skipCredentialsValidation").output().arg($.skipCredentialsValidation).def(true).getNullable();
            $.skipGetEc2Platforms = Codegen.booleanProp("skipGetEc2Platforms").output().arg($.skipGetEc2Platforms).def(true).getNullable();
            $.skipMetadataApiCheck = Codegen.booleanProp("skipMetadataApiCheck").output().arg($.skipMetadataApiCheck).def(true).getNullable();
            $.skipRegionValidation = Codegen.booleanProp("skipRegionValidation").output().arg($.skipRegionValidation).def(true).getNullable();
            return $;
        }
    }

}
