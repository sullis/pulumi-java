// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation;

import com.pulumi.awsnative.cloudformation.enums.TypeActivationType;
import com.pulumi.awsnative.cloudformation.enums.TypeActivationVersionBump;
import com.pulumi.awsnative.cloudformation.inputs.TypeActivationLoggingConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TypeActivationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TypeActivationArgs Empty = new TypeActivationArgs();

    /**
     * Whether to automatically update the extension in this account and region when a new minor version is published by the extension publisher. Major versions released by the publisher must be manually updated.
     * 
     */
    @Import(name="autoUpdate")
    private @Nullable Output<Boolean> autoUpdate;

    /**
     * @return Whether to automatically update the extension in this account and region when a new minor version is published by the extension publisher. Major versions released by the publisher must be manually updated.
     * 
     */
    public Optional<Output<Boolean>> autoUpdate() {
        return Optional.ofNullable(this.autoUpdate);
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM execution role to use to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
     * 
     */
    @Import(name="executionRoleArn")
    private @Nullable Output<String> executionRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM execution role to use to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
     * 
     */
    public Optional<Output<String>> executionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }

    /**
     * Specifies logging configuration information for a type.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<TypeActivationLoggingConfigArgs> loggingConfig;

    /**
     * @return Specifies logging configuration information for a type.
     * 
     */
    public Optional<Output<TypeActivationLoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * The Major Version of the type you want to enable
     * 
     */
    @Import(name="majorVersion")
    private @Nullable Output<String> majorVersion;

    /**
     * @return The Major Version of the type you want to enable
     * 
     */
    public Optional<Output<String>> majorVersion() {
        return Optional.ofNullable(this.majorVersion);
    }

    /**
     * The Amazon Resource Number (ARN) assigned to the public extension upon publication
     * 
     */
    @Import(name="publicTypeArn")
    private @Nullable Output<String> publicTypeArn;

    /**
     * @return The Amazon Resource Number (ARN) assigned to the public extension upon publication
     * 
     */
    public Optional<Output<String>> publicTypeArn() {
        return Optional.ofNullable(this.publicTypeArn);
    }

    /**
     * The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    @Import(name="publisherId")
    private @Nullable Output<String> publisherId;

    /**
     * @return The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    public Optional<Output<String>> publisherId() {
        return Optional.ofNullable(this.publisherId);
    }

    /**
     * The kind of extension
     * 
     */
    @Import(name="type")
    private @Nullable Output<TypeActivationType> type;

    /**
     * @return The kind of extension
     * 
     */
    public Optional<Output<TypeActivationType>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    @Import(name="typeName")
    private @Nullable Output<String> typeName;

    /**
     * @return The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    public Optional<Output<String>> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    /**
     * An alias to assign to the public extension in this account and region. If you specify an alias for the extension, you must then use the alias to refer to the extension in your templates.
     * 
     */
    @Import(name="typeNameAlias")
    private @Nullable Output<String> typeNameAlias;

    /**
     * @return An alias to assign to the public extension in this account and region. If you specify an alias for the extension, you must then use the alias to refer to the extension in your templates.
     * 
     */
    public Optional<Output<String>> typeNameAlias() {
        return Optional.ofNullable(this.typeNameAlias);
    }

    /**
     * Manually updates a previously-enabled type to a new major or minor version, if available. You can also use this parameter to update the value of AutoUpdateEnabled
     * 
     */
    @Import(name="versionBump")
    private @Nullable Output<TypeActivationVersionBump> versionBump;

    /**
     * @return Manually updates a previously-enabled type to a new major or minor version, if available. You can also use this parameter to update the value of AutoUpdateEnabled
     * 
     */
    public Optional<Output<TypeActivationVersionBump>> versionBump() {
        return Optional.ofNullable(this.versionBump);
    }

    private TypeActivationArgs() {}

    private TypeActivationArgs(TypeActivationArgs $) {
        this.autoUpdate = $.autoUpdate;
        this.executionRoleArn = $.executionRoleArn;
        this.loggingConfig = $.loggingConfig;
        this.majorVersion = $.majorVersion;
        this.publicTypeArn = $.publicTypeArn;
        this.publisherId = $.publisherId;
        this.type = $.type;
        this.typeName = $.typeName;
        this.typeNameAlias = $.typeNameAlias;
        this.versionBump = $.versionBump;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypeActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypeActivationArgs $;

        public Builder() {
            $ = new TypeActivationArgs();
        }

        public Builder(TypeActivationArgs defaults) {
            $ = new TypeActivationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpdate Whether to automatically update the extension in this account and region when a new minor version is published by the extension publisher. Major versions released by the publisher must be manually updated.
         * 
         * @return builder
         * 
         */
        public Builder autoUpdate(@Nullable Output<Boolean> autoUpdate) {
            $.autoUpdate = autoUpdate;
            return this;
        }

        /**
         * @param autoUpdate Whether to automatically update the extension in this account and region when a new minor version is published by the extension publisher. Major versions released by the publisher must be manually updated.
         * 
         * @return builder
         * 
         */
        public Builder autoUpdate(Boolean autoUpdate) {
            return autoUpdate(Output.of(autoUpdate));
        }

        /**
         * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM execution role to use to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
         * 
         * @return builder
         * 
         */
        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM execution role to use to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
         * 
         * @return builder
         * 
         */
        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        /**
         * @param loggingConfig Specifies logging configuration information for a type.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(@Nullable Output<TypeActivationLoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param loggingConfig Specifies logging configuration information for a type.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(TypeActivationLoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param majorVersion The Major Version of the type you want to enable
         * 
         * @return builder
         * 
         */
        public Builder majorVersion(@Nullable Output<String> majorVersion) {
            $.majorVersion = majorVersion;
            return this;
        }

        /**
         * @param majorVersion The Major Version of the type you want to enable
         * 
         * @return builder
         * 
         */
        public Builder majorVersion(String majorVersion) {
            return majorVersion(Output.of(majorVersion));
        }

        /**
         * @param publicTypeArn The Amazon Resource Number (ARN) assigned to the public extension upon publication
         * 
         * @return builder
         * 
         */
        public Builder publicTypeArn(@Nullable Output<String> publicTypeArn) {
            $.publicTypeArn = publicTypeArn;
            return this;
        }

        /**
         * @param publicTypeArn The Amazon Resource Number (ARN) assigned to the public extension upon publication
         * 
         * @return builder
         * 
         */
        public Builder publicTypeArn(String publicTypeArn) {
            return publicTypeArn(Output.of(publicTypeArn));
        }

        /**
         * @param publisherId The publisher id assigned by CloudFormation for publishing in this region.
         * 
         * @return builder
         * 
         */
        public Builder publisherId(@Nullable Output<String> publisherId) {
            $.publisherId = publisherId;
            return this;
        }

        /**
         * @param publisherId The publisher id assigned by CloudFormation for publishing in this region.
         * 
         * @return builder
         * 
         */
        public Builder publisherId(String publisherId) {
            return publisherId(Output.of(publisherId));
        }

        /**
         * @param type The kind of extension
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<TypeActivationType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The kind of extension
         * 
         * @return builder
         * 
         */
        public Builder type(TypeActivationType type) {
            return type(Output.of(type));
        }

        /**
         * @param typeName The name of the type being registered.
         * 
         * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
         * 
         * @return builder
         * 
         */
        public Builder typeName(@Nullable Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        /**
         * @param typeName The name of the type being registered.
         * 
         * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
         * 
         * @return builder
         * 
         */
        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        /**
         * @param typeNameAlias An alias to assign to the public extension in this account and region. If you specify an alias for the extension, you must then use the alias to refer to the extension in your templates.
         * 
         * @return builder
         * 
         */
        public Builder typeNameAlias(@Nullable Output<String> typeNameAlias) {
            $.typeNameAlias = typeNameAlias;
            return this;
        }

        /**
         * @param typeNameAlias An alias to assign to the public extension in this account and region. If you specify an alias for the extension, you must then use the alias to refer to the extension in your templates.
         * 
         * @return builder
         * 
         */
        public Builder typeNameAlias(String typeNameAlias) {
            return typeNameAlias(Output.of(typeNameAlias));
        }

        /**
         * @param versionBump Manually updates a previously-enabled type to a new major or minor version, if available. You can also use this parameter to update the value of AutoUpdateEnabled
         * 
         * @return builder
         * 
         */
        public Builder versionBump(@Nullable Output<TypeActivationVersionBump> versionBump) {
            $.versionBump = versionBump;
            return this;
        }

        /**
         * @param versionBump Manually updates a previously-enabled type to a new major or minor version, if available. You can also use this parameter to update the value of AutoUpdateEnabled
         * 
         * @return builder
         * 
         */
        public Builder versionBump(TypeActivationVersionBump versionBump) {
            return versionBump(Output.of(versionBump));
        }

        public TypeActivationArgs build() {
            return $;
        }
    }

}
