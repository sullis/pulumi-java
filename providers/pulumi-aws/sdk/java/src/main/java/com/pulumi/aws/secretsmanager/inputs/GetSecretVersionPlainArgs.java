// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretVersionPlainArgs Empty = new GetSecretVersionPlainArgs();

    /**
     * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
     * 
     */
    @Import(name="secretId", required=true)
    private String secretId;

    /**
     * @return Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
     * 
     */
    public String secretId() {
        return this.secretId;
    }

    /**
     * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `version_stage`.
     * 
     */
    @Import(name="versionId")
    private @Nullable String versionId;

    /**
     * @return Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `version_stage`.
     * 
     */
    public Optional<String> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    /**
     * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
     * 
     */
    @Import(name="versionStage")
    private @Nullable String versionStage;

    /**
     * @return Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
     * 
     */
    public Optional<String> versionStage() {
        return Optional.ofNullable(this.versionStage);
    }

    private GetSecretVersionPlainArgs() {}

    private GetSecretVersionPlainArgs(GetSecretVersionPlainArgs $) {
        this.secretId = $.secretId;
        this.versionId = $.versionId;
        this.versionStage = $.versionStage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretVersionPlainArgs $;

        public Builder() {
            $ = new GetSecretVersionPlainArgs();
        }

        public Builder(GetSecretVersionPlainArgs defaults) {
            $ = new GetSecretVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretId Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param versionId Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `version_stage`.
         * 
         * @return builder
         * 
         */
        public Builder versionId(@Nullable String versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionStage Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
         * 
         * @return builder
         * 
         */
        public Builder versionStage(@Nullable String versionStage) {
            $.versionStage = versionStage;
            return this;
        }

        public GetSecretVersionPlainArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
